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
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl#getTypeExpr <em>Type Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateExpressionImpl extends ExpressionImpl implements CreateExpression
{
  /**
   * The default value of the '{@link #getTypeExpr() <em>Type Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeExpr()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeExpr() <em>Type Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeExpr()
   * @generated
   * @ordered
   */
  protected String typeExpr = TYPE_EXPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected ParameterList parameterList;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getContextBlock() <em>Context Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextBlock()
   * @generated
   * @ordered
   */
  protected Expression contextBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateExpressionImpl()
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
    return BeeLangTestLanguagePackage.Literals.CREATE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTypeExpr()
  {
    return typeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTypeExpr(String newTypeExpr)
  {
    String oldTypeExpr = typeExpr;
    typeExpr = newTypeExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CREATE_EXPRESSION__TYPE_EXPR, oldTypeExpr, typeExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterList getParameterList()
  {
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs)
  {
    ParameterList oldParameterList = parameterList;
    parameterList = newParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST, oldParameterList, newParameterList);
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
  public void setParameterList(ParameterList newParameterList)
  {
    if (newParameterList != parameterList)
    {
      NotificationChain msgs = null;
      if (parameterList != null)
        msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST, null, msgs);
      if (newParameterList != null)
        msgs = ((InternalEObject)newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameterList(newParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST, newParameterList, newParameterList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CREATE_EXPRESSION__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getContextBlock()
  {
    return contextBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextBlock(Expression newContextBlock, NotificationChain msgs)
  {
    Expression oldContextBlock = contextBlock;
    contextBlock = newContextBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK, oldContextBlock, newContextBlock);
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
  public void setContextBlock(Expression newContextBlock)
  {
    if (newContextBlock != contextBlock)
    {
      NotificationChain msgs = null;
      if (contextBlock != null)
        msgs = ((InternalEObject)contextBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK, null, msgs);
      if (newContextBlock != null)
        msgs = ((InternalEObject)newContextBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK, null, msgs);
      msgs = basicSetContextBlock(newContextBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK, newContextBlock, newContextBlock));
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
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST:
        return basicSetParameterList(null, msgs);
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK:
        return basicSetContextBlock(null, msgs);
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
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__TYPE_EXPR:
        return getTypeExpr();
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST:
        return getParameterList();
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__ALIAS:
        return getAlias();
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK:
        return getContextBlock();
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
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__TYPE_EXPR:
        setTypeExpr((String)newValue);
        return;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST:
        setParameterList((ParameterList)newValue);
        return;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__ALIAS:
        setAlias((String)newValue);
        return;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK:
        setContextBlock((Expression)newValue);
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
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__TYPE_EXPR:
        setTypeExpr(TYPE_EXPR_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST:
        setParameterList((ParameterList)null);
        return;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK:
        setContextBlock((Expression)null);
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
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__TYPE_EXPR:
        return TYPE_EXPR_EDEFAULT == null ? typeExpr != null : !TYPE_EXPR_EDEFAULT.equals(typeExpr);
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__PARAMETER_LIST:
        return parameterList != null;
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION__CONTEXT_BLOCK:
        return contextBlock != null;
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
    result.append(" (typeExpr: ");
    result.append(typeExpr);
    result.append(", alias: ");
    result.append(alias);
    result.append(')');
    return result.toString();
  }

} //CreateExpressionImpl
