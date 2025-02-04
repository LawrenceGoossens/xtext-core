/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FeatureExpressionImpl#getObjExpr <em>Obj Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FeatureExpressionImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureExpressionImpl extends ExpressionImpl implements FeatureExpression
{
  /**
   * The cached value of the '{@link #getObjExpr() <em>Obj Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjExpr()
   * @generated
   * @ordered
   */
  protected Expression objExpr;

  /**
   * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureName()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureName()
   * @generated
   * @ordered
   */
  protected String featureName = FEATURE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BeeLangTestLanguagePackage.Literals.FEATURE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getObjExpr()
  {
    return objExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjExpr(Expression newObjExpr, NotificationChain msgs)
  {
    Expression oldObjExpr = objExpr;
    objExpr = newObjExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR, oldObjExpr, newObjExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjExpr(Expression newObjExpr)
  {
    if (newObjExpr != objExpr)
    {
      NotificationChain msgs = null;
      if (objExpr != null)
        msgs = ((InternalEObject)objExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR, null, msgs);
      if (newObjExpr != null)
        msgs = ((InternalEObject)newObjExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR, null, msgs);
      msgs = basicSetObjExpr(newObjExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR, newObjExpr, newObjExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFeatureName()
  {
    return featureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFeatureName(String newFeatureName)
  {
    String oldFeatureName = featureName;
    featureName = newFeatureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FEATURE_EXPRESSION__FEATURE_NAME, oldFeatureName, featureName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR:
        return basicSetObjExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR:
        return getObjExpr();
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__FEATURE_NAME:
        return getFeatureName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR:
        setObjExpr((Expression)newValue);
        return;
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__FEATURE_NAME:
        setFeatureName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR:
        setObjExpr((Expression)null);
        return;
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__FEATURE_NAME:
        setFeatureName(FEATURE_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__OBJ_EXPR:
        return objExpr != null;
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION__FEATURE_NAME:
        return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (featureName: ");
    result.append(featureName);
    result.append(')');
    return result.toString();
  }

} //FeatureExpressionImpl
