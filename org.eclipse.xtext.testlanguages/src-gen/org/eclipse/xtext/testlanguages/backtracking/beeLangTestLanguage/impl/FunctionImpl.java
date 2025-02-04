/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.TypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl#getFuncExpr <em>Func Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ExpressionImpl implements Function
{
  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final String VISIBILITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected String visibility = VISIBILITY_EDEFAULT;

  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected TypeRef returnType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterDeclaration> parameters;

  /**
   * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArgs()
   * @generated
   * @ordered
   */
  protected static final boolean VAR_ARGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArgs()
   * @generated
   * @ordered
   */
  protected boolean varArgs = VAR_ARGS_EDEFAULT;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected GuardExpression guard;

  /**
   * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncExpr()
   * @generated
   * @ordered
   */
  protected Expression funcExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return BeeLangTestLanguagePackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisibility(String newVisibility)
  {
    String oldVisibility = visibility;
    visibility = newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeRef getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(TypeRef newReturnType, NotificationChain msgs)
  {
    TypeRef oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
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
  public void setReturnType(TypeRef newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ParameterDeclaration> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, BeeLangTestLanguagePackage.FUNCTION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isVarArgs()
  {
    return varArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarArgs(boolean newVarArgs)
  {
    boolean oldVarArgs = varArgs;
    varArgs = newVarArgs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__VAR_ARGS, oldVarArgs, varArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GuardExpression getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(GuardExpression newGuard, NotificationChain msgs)
  {
    GuardExpression oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__GUARD, oldGuard, newGuard);
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
  public void setGuard(GuardExpression newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FUNCTION__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FUNCTION__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getFuncExpr()
  {
    return funcExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncExpr(Expression newFuncExpr, NotificationChain msgs)
  {
    Expression oldFuncExpr = funcExpr;
    funcExpr = newFuncExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR, oldFuncExpr, newFuncExpr);
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
  public void setFuncExpr(Expression newFuncExpr)
  {
    if (newFuncExpr != funcExpr)
    {
      NotificationChain msgs = null;
      if (funcExpr != null)
        msgs = ((InternalEObject)funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR, null, msgs);
      if (newFuncExpr != null)
        msgs = ((InternalEObject)newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR, null, msgs);
      msgs = basicSetFuncExpr(newFuncExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR, newFuncExpr, newFuncExpr));
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
      case BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case BeeLangTestLanguagePackage.FUNCTION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case BeeLangTestLanguagePackage.FUNCTION__GUARD:
        return basicSetGuard(null, msgs);
      case BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR:
        return basicSetFuncExpr(null, msgs);
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
      case BeeLangTestLanguagePackage.FUNCTION__DOCUMENTATION:
        return getDocumentation();
      case BeeLangTestLanguagePackage.FUNCTION__VISIBILITY:
        return getVisibility();
      case BeeLangTestLanguagePackage.FUNCTION__FINAL:
        return isFinal();
      case BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE:
        return getReturnType();
      case BeeLangTestLanguagePackage.FUNCTION__NAME:
        return getName();
      case BeeLangTestLanguagePackage.FUNCTION__PARAMETERS:
        return getParameters();
      case BeeLangTestLanguagePackage.FUNCTION__VAR_ARGS:
        return isVarArgs();
      case BeeLangTestLanguagePackage.FUNCTION__GUARD:
        return getGuard();
      case BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR:
        return getFuncExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.FUNCTION__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__VISIBILITY:
        setVisibility((String)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__FINAL:
        setFinal((Boolean)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE:
        setReturnType((TypeRef)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__NAME:
        setName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterDeclaration>)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__VAR_ARGS:
        setVarArgs((Boolean)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__GUARD:
        setGuard((GuardExpression)newValue);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR:
        setFuncExpr((Expression)newValue);
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
      case BeeLangTestLanguagePackage.FUNCTION__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE:
        setReturnType((TypeRef)null);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__PARAMETERS:
        getParameters().clear();
        return;
      case BeeLangTestLanguagePackage.FUNCTION__VAR_ARGS:
        setVarArgs(VAR_ARGS_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__GUARD:
        setGuard((GuardExpression)null);
        return;
      case BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR:
        setFuncExpr((Expression)null);
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
      case BeeLangTestLanguagePackage.FUNCTION__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case BeeLangTestLanguagePackage.FUNCTION__VISIBILITY:
        return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
      case BeeLangTestLanguagePackage.FUNCTION__FINAL:
        return final_ != FINAL_EDEFAULT;
      case BeeLangTestLanguagePackage.FUNCTION__RETURN_TYPE:
        return returnType != null;
      case BeeLangTestLanguagePackage.FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BeeLangTestLanguagePackage.FUNCTION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case BeeLangTestLanguagePackage.FUNCTION__VAR_ARGS:
        return varArgs != VAR_ARGS_EDEFAULT;
      case BeeLangTestLanguagePackage.FUNCTION__GUARD:
        return guard != null;
      case BeeLangTestLanguagePackage.FUNCTION__FUNC_EXPR:
        return funcExpr != null;
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
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(", final: ");
    result.append(final_);
    result.append(", name: ");
    result.append(name);
    result.append(", varArgs: ");
    result.append(varArgs);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
