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
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Op Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryOpExpressionImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryOpExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryOpExpressionImpl extends ExpressionImpl implements UnaryOpExpression
{
  /**
   * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected String functionName = FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryOpExpressionImpl()
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
    return BeeLangTestLanguagePackage.Literals.UNARY_OP_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunctionName(String newFunctionName)
  {
    String oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR, oldExpr, newExpr);
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
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR, newExpr, newExpr));
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
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
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
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__FUNCTION_NAME:
        return getFunctionName();
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR:
        return getExpr();
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
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__FUNCTION_NAME:
        setFunctionName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR:
        setExpr((Expression)newValue);
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
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__FUNCTION_NAME:
        setFunctionName(FUNCTION_NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR:
        setExpr((Expression)null);
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
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__FUNCTION_NAME:
        return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION__EXPR:
        return expr != null;
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
    result.append(" (functionName: ");
    result.append(functionName);
    result.append(')');
    return result.toString();
  }

} //UnaryOpExpressionImpl
