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

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AtExpressionImpl#getObjExpr <em>Obj Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AtExpressionImpl#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtExpressionImpl extends ExpressionImpl implements AtExpression
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
   * The cached value of the '{@link #getIndexExpr() <em>Index Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexExpr()
   * @generated
   * @ordered
   */
  protected Expression indexExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtExpressionImpl()
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
    return BeeLangTestLanguagePackage.Literals.AT_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR, oldObjExpr, newObjExpr);
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
        msgs = ((InternalEObject)objExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR, null, msgs);
      if (newObjExpr != null)
        msgs = ((InternalEObject)newObjExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR, null, msgs);
      msgs = basicSetObjExpr(newObjExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR, newObjExpr, newObjExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getIndexExpr()
  {
    return indexExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexExpr(Expression newIndexExpr, NotificationChain msgs)
  {
    Expression oldIndexExpr = indexExpr;
    indexExpr = newIndexExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR, oldIndexExpr, newIndexExpr);
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
  public void setIndexExpr(Expression newIndexExpr)
  {
    if (newIndexExpr != indexExpr)
    {
      NotificationChain msgs = null;
      if (indexExpr != null)
        msgs = ((InternalEObject)indexExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR, null, msgs);
      if (newIndexExpr != null)
        msgs = ((InternalEObject)newIndexExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR, null, msgs);
      msgs = basicSetIndexExpr(newIndexExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR, newIndexExpr, newIndexExpr));
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
      case BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR:
        return basicSetObjExpr(null, msgs);
      case BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR:
        return basicSetIndexExpr(null, msgs);
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
      case BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR:
        return getObjExpr();
      case BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR:
        return getIndexExpr();
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
      case BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR:
        setObjExpr((Expression)newValue);
        return;
      case BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR:
        setIndexExpr((Expression)newValue);
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
      case BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR:
        setObjExpr((Expression)null);
        return;
      case BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR:
        setIndexExpr((Expression)null);
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
      case BeeLangTestLanguagePackage.AT_EXPRESSION__OBJ_EXPR:
        return objExpr != null;
      case BeeLangTestLanguagePackage.AT_EXPRESSION__INDEX_EXPR:
        return indexExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //AtExpressionImpl
