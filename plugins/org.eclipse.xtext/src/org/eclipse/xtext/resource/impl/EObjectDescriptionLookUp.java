/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.resource.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Sven Efftinge
 */
public class EObjectDescriptionLookUp implements ISelectable {
	
	private volatile Multimap<QualifiedName, IEObjectDescription> nameToObjects;
	
	private volatile List<IEObjectDescription> allDescriptions;

	public EObjectDescriptionLookUp(List<IEObjectDescription> allDescriptions) {
		setExportedObjects(allDescriptions);
	}
	
	public boolean isEmpty() {
		return allDescriptions.isEmpty();
	}
	
	public Iterable<IEObjectDescription> getExportedObjectsByType(final EClass type) {
		if (allDescriptions.isEmpty())
			return Collections.emptyList();
		return Iterables.filter(allDescriptions, new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return EcoreUtil2.isAssignableFrom(type, input.getEClass());
			}
		});
	}
	
	public Iterable<IEObjectDescription> getExportedObjectsByObject(final EObject object) {
		if (allDescriptions.isEmpty())
			return Collections.emptyList();
		final URI uri = EcoreUtil.getURI(object);
		return Iterables.filter(allDescriptions, new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				if (input.getEObjectOrProxy() == object)
					return true;
				if (uri.equals(input.getEObjectURI())) {
					return true;
				}
				return false;
			}
		});
	}
	
	public Iterable<IEObjectDescription> getExportedObjects(final EClass type, final QualifiedName name, boolean ignoreCase) {
		if (allDescriptions.isEmpty())
			return Collections.emptyList();
		QualifiedName lowerCase = name.toLowerCase();
		if (getNameToObjects().containsKey(lowerCase)) {
			Predicate<IEObjectDescription> predicate = ignoreCase 
				?	new Predicate<IEObjectDescription>() {
						public boolean apply(IEObjectDescription input) {
							return EcoreUtil2.isAssignableFrom(type, input.getEClass());
						}
					}
				:	new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						return name.equals(input.getName()) && EcoreUtil2.isAssignableFrom(type, input.getEClass());
					}
				};
			return Iterables.filter(getNameToObjects().get(lowerCase), predicate);
		} else
			return Collections.emptyList();
	}
	
	public Iterable<IEObjectDescription> getExportedObjects() {
		return allDescriptions;
	}

	public void setExportedObjects(List<IEObjectDescription> allDescriptions) {
		synchronized (this) {
			this.allDescriptions = allDescriptions;
			this.nameToObjects = null;			
		}
	}

	protected Multimap<QualifiedName, IEObjectDescription> getNameToObjects() {
		if (nameToObjects == null) {
			synchronized (this) {
				if (nameToObjects == null) {
					this.nameToObjects  = Multimaps.index(allDescriptions, new Function<IEObjectDescription, QualifiedName>() {
						public QualifiedName apply(IEObjectDescription from) {
							return from.getName().toLowerCase();
						}
					});
				}
			}
		}
		return nameToObjects;
	}
}
