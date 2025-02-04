/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.contextFinderTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.serializer.contextFinderTest.AttributeExclusionTest;
import org.eclipse.xtext.serializer.contextFinderTest.ContextFinderTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Exclusion Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.contextFinderTest.impl.AttributeExclusionTestImpl#getAttr1 <em>Attr1</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.contextFinderTest.impl.AttributeExclusionTestImpl#getAttr2 <em>Attr2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeExclusionTestImpl extends MinimalEObjectImpl.Container implements AttributeExclusionTest
{
  /**
   * The default value of the '{@link #getAttr1() <em>Attr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr1()
   * @generated
   * @ordered
   */
  protected static final String ATTR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttr1() <em>Attr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr1()
   * @generated
   * @ordered
   */
  protected String attr1 = ATTR1_EDEFAULT;

  /**
   * The default value of the '{@link #getAttr2() <em>Attr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr2()
   * @generated
   * @ordered
   */
  protected static final String ATTR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttr2() <em>Attr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr2()
   * @generated
   * @ordered
   */
  protected String attr2 = ATTR2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeExclusionTestImpl()
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
    return ContextFinderTestPackage.Literals.ATTRIBUTE_EXCLUSION_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAttr1()
  {
    return attr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttr1(String newAttr1)
  {
    String oldAttr1 = attr1;
    attr1 = newAttr1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR1, oldAttr1, attr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAttr2()
  {
    return attr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttr2(String newAttr2)
  {
    String oldAttr2 = attr2;
    attr2 = newAttr2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR2, oldAttr2, attr2));
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
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR1:
        return getAttr1();
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR2:
        return getAttr2();
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
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR1:
        setAttr1((String)newValue);
        return;
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR2:
        setAttr2((String)newValue);
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
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR1:
        setAttr1(ATTR1_EDEFAULT);
        return;
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR2:
        setAttr2(ATTR2_EDEFAULT);
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
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR1:
        return ATTR1_EDEFAULT == null ? attr1 != null : !ATTR1_EDEFAULT.equals(attr1);
      case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST__ATTR2:
        return ATTR2_EDEFAULT == null ? attr2 != null : !ATTR2_EDEFAULT.equals(attr2);
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
    result.append(" (attr1: ");
    result.append(attr1);
    result.append(", attr2: ");
    result.append(attr2);
    result.append(')');
    return result.toString();
  }

} //AttributeExclusionTestImpl
