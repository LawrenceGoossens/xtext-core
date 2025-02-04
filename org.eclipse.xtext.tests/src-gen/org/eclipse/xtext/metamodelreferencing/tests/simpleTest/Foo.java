/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.metamodelreferencing.tests.simpleTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.metamodelreferencing.tests.otherTest.FooBar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.metamodelreferencing.tests.simpleTest.Foo#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.metamodelreferencing.tests.simpleTest.Foo#getNameRefs <em>Name Refs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestPackage#getFoo()
 * @model
 * @generated
 */
public interface Foo extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestPackage#getFoo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.metamodelreferencing.tests.simpleTest.Foo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Name Refs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.metamodelreferencing.tests.otherTest.FooBar}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Refs</em>' containment reference list.
   * @see org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestPackage#getFoo_NameRefs()
   * @model containment="true"
   * @generated
   */
  EList<FooBar> getNameRefs();

} // Foo
