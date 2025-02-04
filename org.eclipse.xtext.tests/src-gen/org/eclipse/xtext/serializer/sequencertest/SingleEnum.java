/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.sequencertest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.SingleEnum#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.serializer.sequencertest.SequencertestPackage#getSingleEnum()
 * @model
 * @generated
 */
public interface SingleEnum extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.serializer.sequencertest.DefEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see org.eclipse.xtext.serializer.sequencertest.DefEnum
   * @see #setVal(DefEnum)
   * @see org.eclipse.xtext.serializer.sequencertest.SequencertestPackage#getSingleEnum_Val()
   * @model
   * @generated
   */
  DefEnum getVal();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.sequencertest.SingleEnum#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see org.eclipse.xtext.serializer.sequencertest.DefEnum
   * @see #getVal()
   * @generated
   */
  void setVal(DefEnum value);

} // SingleEnum
