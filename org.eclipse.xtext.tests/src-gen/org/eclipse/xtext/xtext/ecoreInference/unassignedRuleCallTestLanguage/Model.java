/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.ecoreInference.unassignedRuleCallTestLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtext.ecoreInference.unassignedRuleCallTestLanguage.Model#getModelFeatures <em>Model Features</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xtext.ecoreInference.unassignedRuleCallTestLanguage.UnassignedRuleCallTestLanguagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Features</em>' containment reference.
   * @see #setModelFeatures(ModelFeatures)
   * @see org.eclipse.xtext.xtext.ecoreInference.unassignedRuleCallTestLanguage.UnassignedRuleCallTestLanguagePackage#getModel_ModelFeatures()
   * @model containment="true"
   * @generated
   */
  ModelFeatures getModelFeatures();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtext.ecoreInference.unassignedRuleCallTestLanguage.Model#getModelFeatures <em>Model Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Features</em>' containment reference.
   * @see #getModelFeatures()
   * @generated
   */
  void setModelFeatures(ModelFeatures value);

} // Model
