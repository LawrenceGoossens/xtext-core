/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.sequencertest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.serializer.sequencertest.AlternativeMultiplicities;
import org.eclipse.xtext.serializer.sequencertest.SequencertestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Multiplicities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.impl.AlternativeMultiplicitiesImpl#getVal2 <em>Val2</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.impl.AlternativeMultiplicitiesImpl#getVal3 <em>Val3</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.impl.AlternativeMultiplicitiesImpl#getVal4 <em>Val4</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.impl.AlternativeMultiplicitiesImpl#getVal5 <em>Val5</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.impl.AlternativeMultiplicitiesImpl#getVal6 <em>Val6</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.impl.AlternativeMultiplicitiesImpl#getVal7 <em>Val7</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeMultiplicitiesImpl extends MinimalEObjectImpl.Container implements AlternativeMultiplicities
{
  /**
   * The default value of the '{@link #getVal2() <em>Val2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2()
   * @generated
   * @ordered
   */
  protected static final String VAL2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal2() <em>Val2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2()
   * @generated
   * @ordered
   */
  protected String val2 = VAL2_EDEFAULT;

  /**
   * The default value of the '{@link #getVal3() <em>Val3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal3()
   * @generated
   * @ordered
   */
  protected static final String VAL3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal3() <em>Val3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal3()
   * @generated
   * @ordered
   */
  protected String val3 = VAL3_EDEFAULT;

  /**
   * The cached value of the '{@link #getVal4() <em>Val4</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal4()
   * @generated
   * @ordered
   */
  protected EList<String> val4;

  /**
   * The cached value of the '{@link #getVal5() <em>Val5</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal5()
   * @generated
   * @ordered
   */
  protected EList<String> val5;

  /**
   * The cached value of the '{@link #getVal6() <em>Val6</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal6()
   * @generated
   * @ordered
   */
  protected EList<String> val6;

  /**
   * The cached value of the '{@link #getVal7() <em>Val7</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal7()
   * @generated
   * @ordered
   */
  protected EList<String> val7;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternativeMultiplicitiesImpl()
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
    return SequencertestPackage.Literals.ALTERNATIVE_MULTIPLICITIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVal2()
  {
    return val2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal2(String newVal2)
  {
    String oldVal2 = val2;
    val2 = newVal2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL2, oldVal2, val2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVal3()
  {
    return val3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal3(String newVal3)
  {
    String oldVal3 = val3;
    val3 = newVal3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL3, oldVal3, val3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVal4()
  {
    if (val4 == null)
    {
      val4 = new EDataTypeEList<String>(String.class, this, SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL4);
    }
    return val4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVal5()
  {
    if (val5 == null)
    {
      val5 = new EDataTypeEList<String>(String.class, this, SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL5);
    }
    return val5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVal6()
  {
    if (val6 == null)
    {
      val6 = new EDataTypeEList<String>(String.class, this, SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL6);
    }
    return val6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVal7()
  {
    if (val7 == null)
    {
      val7 = new EDataTypeEList<String>(String.class, this, SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL7);
    }
    return val7;
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
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL2:
        return getVal2();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL3:
        return getVal3();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL4:
        return getVal4();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL5:
        return getVal5();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL6:
        return getVal6();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL7:
        return getVal7();
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
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL2:
        setVal2((String)newValue);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL3:
        setVal3((String)newValue);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL4:
        getVal4().clear();
        getVal4().addAll((Collection<? extends String>)newValue);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL5:
        getVal5().clear();
        getVal5().addAll((Collection<? extends String>)newValue);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL6:
        getVal6().clear();
        getVal6().addAll((Collection<? extends String>)newValue);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL7:
        getVal7().clear();
        getVal7().addAll((Collection<? extends String>)newValue);
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
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL2:
        setVal2(VAL2_EDEFAULT);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL3:
        setVal3(VAL3_EDEFAULT);
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL4:
        getVal4().clear();
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL5:
        getVal5().clear();
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL6:
        getVal6().clear();
        return;
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL7:
        getVal7().clear();
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
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL2:
        return VAL2_EDEFAULT == null ? val2 != null : !VAL2_EDEFAULT.equals(val2);
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL3:
        return VAL3_EDEFAULT == null ? val3 != null : !VAL3_EDEFAULT.equals(val3);
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL4:
        return val4 != null && !val4.isEmpty();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL5:
        return val5 != null && !val5.isEmpty();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL6:
        return val6 != null && !val6.isEmpty();
      case SequencertestPackage.ALTERNATIVE_MULTIPLICITIES__VAL7:
        return val7 != null && !val7.isEmpty();
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
    result.append(" (val2: ");
    result.append(val2);
    result.append(", val3: ");
    result.append(val3);
    result.append(", val4: ");
    result.append(val4);
    result.append(", val5: ");
    result.append(val5);
    result.append(", val6: ");
    result.append(val6);
    result.append(", val7: ");
    result.append(val7);
    result.append(')');
    return result.toString();
  }

} //AlternativeMultiplicitiesImpl
