/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parsetree.reconstr.serializationerror.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.parsetree.reconstr.serializationerror.SerializationerrorPackage;
import org.eclipse.xtext.parsetree.reconstr.serializationerror.TwoRequired;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Required</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parsetree.reconstr.serializationerror.impl.TwoRequiredImpl#getOne <em>One</em>}</li>
 *   <li>{@link org.eclipse.xtext.parsetree.reconstr.serializationerror.impl.TwoRequiredImpl#getTwo <em>Two</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwoRequiredImpl extends TestImpl implements TwoRequired
{
  /**
   * The default value of the '{@link #getOne() <em>One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOne()
   * @generated
   * @ordered
   */
  protected static final String ONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOne() <em>One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOne()
   * @generated
   * @ordered
   */
  protected String one = ONE_EDEFAULT;

  /**
   * The default value of the '{@link #getTwo() <em>Two</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwo()
   * @generated
   * @ordered
   */
  protected static final String TWO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTwo() <em>Two</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwo()
   * @generated
   * @ordered
   */
  protected String two = TWO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TwoRequiredImpl()
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
    return SerializationerrorPackage.Literals.TWO_REQUIRED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOne()
  {
    return one;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOne(String newOne)
  {
    String oldOne = one;
    one = newOne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SerializationerrorPackage.TWO_REQUIRED__ONE, oldOne, one));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTwo()
  {
    return two;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTwo(String newTwo)
  {
    String oldTwo = two;
    two = newTwo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SerializationerrorPackage.TWO_REQUIRED__TWO, oldTwo, two));
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
      case SerializationerrorPackage.TWO_REQUIRED__ONE:
        return getOne();
      case SerializationerrorPackage.TWO_REQUIRED__TWO:
        return getTwo();
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
      case SerializationerrorPackage.TWO_REQUIRED__ONE:
        setOne((String)newValue);
        return;
      case SerializationerrorPackage.TWO_REQUIRED__TWO:
        setTwo((String)newValue);
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
      case SerializationerrorPackage.TWO_REQUIRED__ONE:
        setOne(ONE_EDEFAULT);
        return;
      case SerializationerrorPackage.TWO_REQUIRED__TWO:
        setTwo(TWO_EDEFAULT);
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
      case SerializationerrorPackage.TWO_REQUIRED__ONE:
        return ONE_EDEFAULT == null ? one != null : !ONE_EDEFAULT.equals(one);
      case SerializationerrorPackage.TWO_REQUIRED__TWO:
        return TWO_EDEFAULT == null ? two != null : !TWO_EDEFAULT.equals(two);
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
    result.append(" (one: ");
    result.append(one);
    result.append(", two: ");
    result.append(two);
    result.append(')');
    return result.toString();
  }

} //TwoRequiredImpl
