/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.NestedRefsFactory
 * @model kind="package"
 * @generated
 */
public interface NestedRefsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "nestedRefs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/testlanguage/NestedRefs";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "nestedRefs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NestedRefsPackage eINSTANCE = org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.NestedRefsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.DocImpl <em>Doc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.DocImpl
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.NestedRefsPackageImpl#getDoc()
   * @generated
   */
  int DOC = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Doc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.SelfReferingDeclImpl <em>Self Refering Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.SelfReferingDeclImpl
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.NestedRefsPackageImpl#getSelfReferingDecl()
   * @generated
   */
  int SELF_REFERING_DECL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERING_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Self Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERING_DECL__SELF_REF = 1;

  /**
   * The number of structural features of the '<em>Self Refering Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERING_DECL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.Doc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc</em>'.
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.Doc
   * @generated
   */
  EClass getDoc();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.Doc#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.Doc#getDeclarations()
   * @see #getDoc()
   * @generated
   */
  EReference getDoc_Declarations();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl <em>Self Refering Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Refering Decl</em>'.
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl
   * @generated
   */
  EClass getSelfReferingDecl();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl#getName()
   * @see #getSelfReferingDecl()
   * @generated
   */
  EAttribute getSelfReferingDecl_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl#getSelfRef <em>Self Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Self Ref</em>'.
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl#getSelfRef()
   * @see #getSelfReferingDecl()
   * @generated
   */
  EReference getSelfReferingDecl_SelfRef();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NestedRefsFactory getNestedRefsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.DocImpl <em>Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.DocImpl
     * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.NestedRefsPackageImpl#getDoc()
     * @generated
     */
    EClass DOC = eINSTANCE.getDoc();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOC__DECLARATIONS = eINSTANCE.getDoc_Declarations();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.SelfReferingDeclImpl <em>Self Refering Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.SelfReferingDeclImpl
     * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.NestedRefsPackageImpl#getSelfReferingDecl()
     * @generated
     */
    EClass SELF_REFERING_DECL = eINSTANCE.getSelfReferingDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_REFERING_DECL__NAME = eINSTANCE.getSelfReferingDecl_Name();

    /**
     * The meta object literal for the '<em><b>Self Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_REFERING_DECL__SELF_REF = eINSTANCE.getSelfReferingDecl_SelfRef();

  }

} //NestedRefsPackage
