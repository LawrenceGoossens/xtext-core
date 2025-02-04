/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage;

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
 * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface BeeLangTestLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "beeLangTestLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/2010/tmf/xtext/beeLangTestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "beeLangTestLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BeeLangTestLanguagePackage eINSTANCE = org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ModelImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__UNITS = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnit()
   * @generated
   */
  int UNIT = 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__NAME = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__VERSION = 2;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__IMPLEMENTS = 3;

  /**
   * The feature id for the '<em><b>Source Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__SOURCE_LOCATION = 4;

  /**
   * The feature id for the '<em><b>Output Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__OUTPUT_LOCATION = 5;

  /**
   * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__PROVIDED_CAPABILITIES = 6;

  /**
   * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__REQUIRED_CAPABILITIES = 7;

  /**
   * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__META_REQUIRED_CAPABILITIES = 8;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT__FUNCTIONS = 9;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getProvidedCapability()
   * @generated
   */
  int PROVIDED_CAPABILITY = 2;

  /**
   * The feature id for the '<em><b>Name Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY__NAME_SPACE = 0;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY__COND_EXPR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY__NAME = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY__VERSION = 3;

  /**
   * The number of structural features of the '<em>Provided Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AliasedRequiredCapabilityImpl <em>Aliased Required Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AliasedRequiredCapabilityImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAliasedRequiredCapability()
   * @generated
   */
  int ALIASED_REQUIRED_CAPABILITY = 3;

  /**
   * The feature id for the '<em><b>Name Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__NAME_SPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__NAME = 1;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__ALIAS = 2;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__COND_EXPR = 3;

  /**
   * The feature id for the '<em><b>Greedy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__GREEDY = 4;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__MIN = 5;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__MAX = 6;

  /**
   * The feature id for the '<em><b>Version Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY__VERSION_RANGE = 7;

  /**
   * The number of structural features of the '<em>Aliased Required Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_REQUIRED_CAPABILITY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getRequiredCapability()
   * @generated
   */
  int REQUIRED_CAPABILITY = 4;

  /**
   * The feature id for the '<em><b>Name Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__NAME_SPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__NAME = 1;

  /**
   * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__COND_EXPR = 2;

  /**
   * The feature id for the '<em><b>Greedy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__GREEDY = 3;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__MIN = 4;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__MAX = 5;

  /**
   * The feature id for the '<em><b>Version Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__VERSION_RANGE = 6;

  /**
   * The number of structural features of the '<em>Required Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterListImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EXPR = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureParameterImpl <em>Closure Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureParameterImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getClosureParameter()
   * @generated
   */
  int CLOSURE_PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSURE_PARAMETER__EXPR = PARAMETER__EXPR;

  /**
   * The number of structural features of the '<em>Closure Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSURE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterDeclarationImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getParameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 9;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DOCUMENTATION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VISIBILITY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FINAL = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_TYPE = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Var Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VAR_ARGS = EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__GUARD = EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUNC_EXPR = EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.GuardExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getGuardExpression()
   * @generated
   */
  int GUARD_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Guard Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_EXPRESSION__GUARD_EXPR = 0;

  /**
   * The number of structural features of the '<em>Guard Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.TypeRefImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 12;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.SimpleTypeRefImpl <em>Simple Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.SimpleTypeRefImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getSimpleTypeRef()
   * @generated
   */
  int SIMPLE_TYPE_REF = 13;

  /**
   * The feature id for the '<em><b>Raw Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_REF__RAW_TYPE = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actual Arguments List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl <em>Closure Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getClosureTypeRef()
   * @generated
   */
  int CLOSURE_TYPE_REF = 14;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSURE_TYPE_REF__PARAMETER_TYPES = TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSURE_TYPE_REF__VAR_ARGS = TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSURE_TYPE_REF__RETURN_TYPE = TYPE_REF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Closure Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSURE_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithExpressionImpl <em>With Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getWithExpression()
   * @generated
   */
  int WITH_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Referenced Advice</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_EXPRESSION__REFERENCED_ADVICE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_EXPRESSION__FUNC_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>With Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithContextExpressionImpl <em>With Context Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithContextExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getWithContextExpression()
   * @generated
   */
  int WITH_CONTEXT_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CONTEXT_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CONTEXT_EXPRESSION__ALIAS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Context Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>With Context Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CONTEXT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallExpressionImpl <em>Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallExpression()
   * @generated
   */
  int CALL_EXPRESSION = 17;

  /**
   * The number of structural features of the '<em>Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ValueLiteralImpl <em>Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ValueLiteralImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getValueLiteral()
   * @generated
   */
  int VALUE_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAssignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl <em>Def Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getDefValue()
   * @generated
   */
  int DEF_VALUE = 20;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_VALUE__FINAL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_VALUE__TYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_VALUE__NAME = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_VALUE__VALUE_EXPR = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_VALUE__IMMUTABLE = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Def Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CachedExpressionImpl <em>Cached Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CachedExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCachedExpression()
   * @generated
   */
  int CACHED_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHED_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cached Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.OrExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AndExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BinaryOpExpressionImpl <em>Binary Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BinaryOpExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getBinaryOpExpression()
   * @generated
   */
  int BINARY_OP_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_EXPRESSION__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryOpExpressionImpl <em>Unary Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryOpExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnaryOpExpression()
   * @generated
   */
  int UNARY_OP_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPreOpExpressionImpl <em>Unary Pre Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPreOpExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnaryPreOpExpression()
   * @generated
   */
  int UNARY_PRE_OP_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRE_OP_EXPRESSION__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRE_OP_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Pre Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRE_OP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPostOpExpressionImpl <em>Unary Post Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPostOpExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnaryPostOpExpression()
   * @generated
   */
  int UNARY_POST_OP_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_POST_OP_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_POST_OP_EXPRESSION__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Post Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_POST_OP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFeatureImpl <em>Call Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFeatureImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallFeature()
   * @generated
   */
  int CALL_FEATURE = 28;

  /**
   * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE__FUNC_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE__NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE__PARAMETER_LIST = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Call Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AtExpressionImpl <em>At Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AtExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAtExpression()
   * @generated
   */
  int AT_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Obj Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_EXPRESSION__OBJ_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_EXPRESSION__INDEX_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>At Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FeatureExpressionImpl <em>Feature Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FeatureExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getFeatureExpression()
   * @generated
   */
  int FEATURE_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Obj Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPRESSION__OBJ_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPRESSION__FEATURE_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFunctionImpl <em>Call Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFunctionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallFunction()
   * @generated
   */
  int CALL_FUNCTION = 31;

  /**
   * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FUNCTION__FUNC_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FUNCTION__PARAMETER_LIST = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ChainedExpressionImpl <em>Chained Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ChainedExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getChainedExpression()
   * @generated
   */
  int CHAINED_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAINED_EXPRESSION__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Chained Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAINED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.VariableExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getVariableExpression()
   * @generated
   */
  int VARIABLE_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallNamedFunctionImpl <em>Call Named Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallNamedFunctionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallNamedFunction()
   * @generated
   */
  int CALL_NAMED_FUNCTION = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NAMED_FUNCTION__NAME = CALL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NAMED_FUNCTION__PARAMETER_LIST = CALL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call Named Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_NAMED_FUNCTION_FEATURE_COUNT = CALL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl <em>Create Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCreateExpression()
   * @generated
   */
  int CREATE_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Type Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXPRESSION__TYPE_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXPRESSION__PARAMETER_LIST = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXPRESSION__ALIAS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Context Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXPRESSION__CONTEXT_BLOCK = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Create Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Units</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model#getUnits()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Units();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model#getFunctions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Functions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getDocumentation()
   * @see #getUnit()
   * @generated
   */
  EAttribute getUnit_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getName()
   * @see #getUnit()
   * @generated
   */
  EAttribute getUnit_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getVersion()
   * @see #getUnit()
   * @generated
   */
  EAttribute getUnit_Version();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getImplements()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Implements();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getSourceLocation <em>Source Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Location</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getSourceLocation()
   * @see #getUnit()
   * @generated
   */
  EAttribute getUnit_SourceLocation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getOutputLocation <em>Output Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Location</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getOutputLocation()
   * @see #getUnit()
   * @generated
   */
  EAttribute getUnit_OutputLocation();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getProvidedCapabilities <em>Provided Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getProvidedCapabilities()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_ProvidedCapabilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getRequiredCapabilities <em>Required Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getRequiredCapabilities()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_RequiredCapabilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Required Capabilities</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getMetaRequiredCapabilities()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_MetaRequiredCapabilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getFunctions()
   * @see #getUnit()
   * @generated
   */
  EReference getUnit_Functions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability <em>Provided Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Capability</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability
   * @generated
   */
  EClass getProvidedCapability();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getNameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Space</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getNameSpace()
   * @see #getProvidedCapability()
   * @generated
   */
  EAttribute getProvidedCapability_NameSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getCondExpr <em>Cond Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getCondExpr()
   * @see #getProvidedCapability()
   * @generated
   */
  EReference getProvidedCapability_CondExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getName()
   * @see #getProvidedCapability()
   * @generated
   */
  EAttribute getProvidedCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability#getVersion()
   * @see #getProvidedCapability()
   * @generated
   */
  EAttribute getProvidedCapability_Version();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability <em>Aliased Required Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aliased Required Capability</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability
   * @generated
   */
  EClass getAliasedRequiredCapability();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getNameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Space</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getNameSpace()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_NameSpace();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getName()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getAlias()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_Alias();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getCondExpr <em>Cond Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getCondExpr()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EReference getAliasedRequiredCapability_CondExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#isGreedy <em>Greedy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greedy</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#isGreedy()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_Greedy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getMin()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_Min();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getMax()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_Max();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getVersionRange <em>Version Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Range</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability#getVersionRange()
   * @see #getAliasedRequiredCapability()
   * @generated
   */
  EAttribute getAliasedRequiredCapability_VersionRange();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability <em>Required Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Capability</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability
   * @generated
   */
  EClass getRequiredCapability();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getNameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Space</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getNameSpace()
   * @see #getRequiredCapability()
   * @generated
   */
  EAttribute getRequiredCapability_NameSpace();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getName()
   * @see #getRequiredCapability()
   * @generated
   */
  EAttribute getRequiredCapability_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getCondExpr <em>Cond Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getCondExpr()
   * @see #getRequiredCapability()
   * @generated
   */
  EReference getRequiredCapability_CondExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#isGreedy <em>Greedy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greedy</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#isGreedy()
   * @see #getRequiredCapability()
   * @generated
   */
  EAttribute getRequiredCapability_Greedy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getMin()
   * @see #getRequiredCapability()
   * @generated
   */
  EAttribute getRequiredCapability_Min();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getMax()
   * @see #getRequiredCapability()
   * @generated
   */
  EAttribute getRequiredCapability_Max();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getVersionRange <em>Version Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Range</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability#getVersionRange()
   * @see #getRequiredCapability()
   * @generated
   */
  EAttribute getRequiredCapability_VersionRange();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList#getParameters()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Parameters();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Parameter#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Parameter#getExpr()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureParameter <em>Closure Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closure Parameter</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureParameter
   * @generated
   */
  EClass getClosureParameter();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration
   * @generated
   */
  EClass getParameterDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration#getType()
   * @see #getParameterDeclaration()
   * @generated
   */
  EReference getParameterDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration#getName()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getDocumentation()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getVisibility()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Visibility();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#isFinal()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Final();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getReturnType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#isVarArgs <em>Var Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Args</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#isVarArgs()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_VarArgs();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getGuard()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getFuncExpr <em>Func Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function#getFuncExpr()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_FuncExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression <em>Guard Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression
   * @generated
   */
  EClass getGuardExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression#getGuardExpr <em>Guard Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression#getGuardExpr()
   * @see #getGuardExpression()
   * @generated
   */
  EReference getGuardExpression_GuardExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef <em>Simple Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type Ref</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef
   * @generated
   */
  EClass getSimpleTypeRef();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef#getRawType <em>Raw Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Raw Type</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef#getRawType()
   * @see #getSimpleTypeRef()
   * @generated
   */
  EAttribute getSimpleTypeRef_RawType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef#getActualArgumentsList <em>Actual Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Actual Arguments List</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef#getActualArgumentsList()
   * @see #getSimpleTypeRef()
   * @generated
   */
  EAttribute getSimpleTypeRef_ActualArgumentsList();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef <em>Closure Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closure Type Ref</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef
   * @generated
   */
  EClass getClosureTypeRef();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter Types</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef#getParameterTypes()
   * @see #getClosureTypeRef()
   * @generated
   */
  EAttribute getClosureTypeRef_ParameterTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef#isVarArgs <em>Var Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Args</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef#isVarArgs()
   * @see #getClosureTypeRef()
   * @generated
   */
  EAttribute getClosureTypeRef_VarArgs();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef#getReturnType()
   * @see #getClosureTypeRef()
   * @generated
   */
  EAttribute getClosureTypeRef_ReturnType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression <em>With Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression
   * @generated
   */
  EClass getWithExpression();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression#getReferencedAdvice <em>Referenced Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Referenced Advice</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression#getReferencedAdvice()
   * @see #getWithExpression()
   * @generated
   */
  EAttribute getWithExpression_ReferencedAdvice();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression#getFuncExpr <em>Func Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression#getFuncExpr()
   * @see #getWithExpression()
   * @generated
   */
  EReference getWithExpression_FuncExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression <em>With Context Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Context Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression
   * @generated
   */
  EClass getWithContextExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression#getExpr()
   * @see #getWithContextExpression()
   * @generated
   */
  EReference getWithContextExpression_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression#getAlias()
   * @see #getWithContextExpression()
   * @generated
   */
  EAttribute getWithContextExpression_Alias();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression#getContextBlock <em>Context Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Block</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression#getContextBlock()
   * @see #getWithContextExpression()
   * @generated
   */
  EReference getWithContextExpression_ContextBlock();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallExpression <em>Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallExpression
   * @generated
   */
  EClass getCallExpression();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ValueLiteral <em>Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Literal</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ValueLiteral
   * @generated
   */
  EClass getValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ValueLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ValueLiteral#getValue()
   * @see #getValueLiteral()
   * @generated
   */
  EAttribute getValueLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression
   * @generated
   */
  EClass getAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression#getLeftExpr()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_LeftExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression#getFunctionName()
   * @see #getAssignmentExpression()
   * @generated
   */
  EAttribute getAssignmentExpression_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression#getRightExpr()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue <em>Def Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Value</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue
   * @generated
   */
  EClass getDefValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#isFinal()
   * @see #getDefValue()
   * @generated
   */
  EAttribute getDefValue_Final();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#getType()
   * @see #getDefValue()
   * @generated
   */
  EReference getDefValue_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#getName()
   * @see #getDefValue()
   * @generated
   */
  EAttribute getDefValue_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#getValueExpr()
   * @see #getDefValue()
   * @generated
   */
  EReference getDefValue_ValueExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#isImmutable <em>Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immutable</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue#isImmutable()
   * @see #getDefValue()
   * @generated
   */
  EAttribute getDefValue_Immutable();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CachedExpression <em>Cached Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cached Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CachedExpression
   * @generated
   */
  EClass getCachedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CachedExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CachedExpression#getExpr()
   * @see #getCachedExpression()
   * @generated
   */
  EReference getCachedExpression_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression#getLeftExpr()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression#getRightExpr()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression#getLeftExpr()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression#getRightExpr()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression <em>Binary Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Op Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression
   * @generated
   */
  EClass getBinaryOpExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression#getLeftExpr()
   * @see #getBinaryOpExpression()
   * @generated
   */
  EReference getBinaryOpExpression_LeftExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression#getFunctionName()
   * @see #getBinaryOpExpression()
   * @generated
   */
  EAttribute getBinaryOpExpression_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression#getRightExpr()
   * @see #getBinaryOpExpression()
   * @generated
   */
  EReference getBinaryOpExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression <em>Unary Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Op Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression
   * @generated
   */
  EClass getUnaryOpExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression#getFunctionName()
   * @see #getUnaryOpExpression()
   * @generated
   */
  EAttribute getUnaryOpExpression_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression#getExpr()
   * @see #getUnaryOpExpression()
   * @generated
   */
  EReference getUnaryOpExpression_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression <em>Unary Pre Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Pre Op Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression
   * @generated
   */
  EClass getUnaryPreOpExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression#getFunctionName()
   * @see #getUnaryPreOpExpression()
   * @generated
   */
  EAttribute getUnaryPreOpExpression_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression#getExpr()
   * @see #getUnaryPreOpExpression()
   * @generated
   */
  EReference getUnaryPreOpExpression_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression <em>Unary Post Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Post Op Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression
   * @generated
   */
  EClass getUnaryPostOpExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression#getExpr()
   * @see #getUnaryPostOpExpression()
   * @generated
   */
  EReference getUnaryPostOpExpression_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression#getFunctionName()
   * @see #getUnaryPostOpExpression()
   * @generated
   */
  EAttribute getUnaryPostOpExpression_FunctionName();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature <em>Call Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Feature</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature
   * @generated
   */
  EClass getCallFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature#getFuncExpr <em>Func Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature#getFuncExpr()
   * @see #getCallFeature()
   * @generated
   */
  EReference getCallFeature_FuncExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature#getName()
   * @see #getCallFeature()
   * @generated
   */
  EAttribute getCallFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature#getParameterList()
   * @see #getCallFeature()
   * @generated
   */
  EReference getCallFeature_ParameterList();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression <em>At Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression
   * @generated
   */
  EClass getAtExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression#getObjExpr <em>Obj Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression#getObjExpr()
   * @see #getAtExpression()
   * @generated
   */
  EReference getAtExpression_ObjExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression#getIndexExpr <em>Index Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression#getIndexExpr()
   * @see #getAtExpression()
   * @generated
   */
  EReference getAtExpression_IndexExpr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression <em>Feature Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression
   * @generated
   */
  EClass getFeatureExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression#getObjExpr <em>Obj Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression#getObjExpr()
   * @see #getFeatureExpression()
   * @generated
   */
  EReference getFeatureExpression_ObjExpr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression#getFeatureName <em>Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression#getFeatureName()
   * @see #getFeatureExpression()
   * @generated
   */
  EAttribute getFeatureExpression_FeatureName();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction <em>Call Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Function</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction
   * @generated
   */
  EClass getCallFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction#getFuncExpr <em>Func Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction#getFuncExpr()
   * @see #getCallFunction()
   * @generated
   */
  EReference getCallFunction_FuncExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction#getParameterList()
   * @see #getCallFunction()
   * @generated
   */
  EReference getCallFunction_ParameterList();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ChainedExpression <em>Chained Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chained Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ChainedExpression
   * @generated
   */
  EClass getChainedExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ChainedExpression#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ChainedExpression#getExpressions()
   * @see #getChainedExpression()
   * @generated
   */
  EReference getChainedExpression_Expressions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.VariableExpression <em>Variable Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.VariableExpression
   * @generated
   */
  EClass getVariableExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.VariableExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.VariableExpression#getName()
   * @see #getVariableExpression()
   * @generated
   */
  EAttribute getVariableExpression_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction <em>Call Named Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Named Function</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction
   * @generated
   */
  EClass getCallNamedFunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction#getName()
   * @see #getCallNamedFunction()
   * @generated
   */
  EAttribute getCallNamedFunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction#getParameterList()
   * @see #getCallNamedFunction()
   * @generated
   */
  EReference getCallNamedFunction_ParameterList();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression <em>Create Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Expression</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression
   * @generated
   */
  EClass getCreateExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getTypeExpr <em>Type Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Expr</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getTypeExpr()
   * @see #getCreateExpression()
   * @generated
   */
  EAttribute getCreateExpression_TypeExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getParameterList()
   * @see #getCreateExpression()
   * @generated
   */
  EReference getCreateExpression_ParameterList();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getAlias()
   * @see #getCreateExpression()
   * @generated
   */
  EAttribute getCreateExpression_Alias();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getContextBlock <em>Context Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Block</em>'.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression#getContextBlock()
   * @see #getCreateExpression()
   * @generated
   */
  EReference getCreateExpression_ContextBlock();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BeeLangTestLanguageFactory getBeeLangTestLanguageFactory();

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
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ModelImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__UNITS = eINSTANCE.getModel_Units();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTIONS = eINSTANCE.getModel_Functions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl <em>Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnit()
     * @generated
     */
    EClass UNIT = eINSTANCE.getUnit();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__DOCUMENTATION = eINSTANCE.getUnit_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__VERSION = eINSTANCE.getUnit_Version();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__IMPLEMENTS = eINSTANCE.getUnit_Implements();

    /**
     * The meta object literal for the '<em><b>Source Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__SOURCE_LOCATION = eINSTANCE.getUnit_SourceLocation();

    /**
     * The meta object literal for the '<em><b>Output Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT__OUTPUT_LOCATION = eINSTANCE.getUnit_OutputLocation();

    /**
     * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__PROVIDED_CAPABILITIES = eINSTANCE.getUnit_ProvidedCapabilities();

    /**
     * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__REQUIRED_CAPABILITIES = eINSTANCE.getUnit_RequiredCapabilities();

    /**
     * The meta object literal for the '<em><b>Meta Required Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__META_REQUIRED_CAPABILITIES = eINSTANCE.getUnit_MetaRequiredCapabilities();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT__FUNCTIONS = eINSTANCE.getUnit_Functions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getProvidedCapability()
     * @generated
     */
    EClass PROVIDED_CAPABILITY = eINSTANCE.getProvidedCapability();

    /**
     * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_CAPABILITY__NAME_SPACE = eINSTANCE.getProvidedCapability_NameSpace();

    /**
     * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_CAPABILITY__COND_EXPR = eINSTANCE.getProvidedCapability_CondExpr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_CAPABILITY__NAME = eINSTANCE.getProvidedCapability_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_CAPABILITY__VERSION = eINSTANCE.getProvidedCapability_Version();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AliasedRequiredCapabilityImpl <em>Aliased Required Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AliasedRequiredCapabilityImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAliasedRequiredCapability()
     * @generated
     */
    EClass ALIASED_REQUIRED_CAPABILITY = eINSTANCE.getAliasedRequiredCapability();

    /**
     * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__NAME_SPACE = eINSTANCE.getAliasedRequiredCapability_NameSpace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__NAME = eINSTANCE.getAliasedRequiredCapability_Name();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__ALIAS = eINSTANCE.getAliasedRequiredCapability_Alias();

    /**
     * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIASED_REQUIRED_CAPABILITY__COND_EXPR = eINSTANCE.getAliasedRequiredCapability_CondExpr();

    /**
     * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__GREEDY = eINSTANCE.getAliasedRequiredCapability_Greedy();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__MIN = eINSTANCE.getAliasedRequiredCapability_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__MAX = eINSTANCE.getAliasedRequiredCapability_Max();

    /**
     * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASED_REQUIRED_CAPABILITY__VERSION_RANGE = eINSTANCE.getAliasedRequiredCapability_VersionRange();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getRequiredCapability()
     * @generated
     */
    EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

    /**
     * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_CAPABILITY__NAME_SPACE = eINSTANCE.getRequiredCapability_NameSpace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_CAPABILITY__NAME = eINSTANCE.getRequiredCapability_Name();

    /**
     * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_CAPABILITY__COND_EXPR = eINSTANCE.getRequiredCapability_CondExpr();

    /**
     * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_CAPABILITY__GREEDY = eINSTANCE.getRequiredCapability_Greedy();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_CAPABILITY__MIN = eINSTANCE.getRequiredCapability_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_CAPABILITY__MAX = eINSTANCE.getRequiredCapability_Max();

    /**
     * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_CAPABILITY__VERSION_RANGE = eINSTANCE.getRequiredCapability_VersionRange();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterListImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EXPR = eINSTANCE.getParameter_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureParameterImpl <em>Closure Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureParameterImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getClosureParameter()
     * @generated
     */
    EClass CLOSURE_PARAMETER = eINSTANCE.getClosureParameter();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ParameterDeclarationImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getParameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION__TYPE = eINSTANCE.getParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__NAME = eINSTANCE.getParameterDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FunctionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__DOCUMENTATION = eINSTANCE.getFunction_Documentation();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__VISIBILITY = eINSTANCE.getFunction_Visibility();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__FINAL = eINSTANCE.getFunction_Final();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__VAR_ARGS = eINSTANCE.getFunction_VarArgs();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__GUARD = eINSTANCE.getFunction_Guard();

    /**
     * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__FUNC_EXPR = eINSTANCE.getFunction_FuncExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.GuardExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getGuardExpression()
     * @generated
     */
    EClass GUARD_EXPRESSION = eINSTANCE.getGuardExpression();

    /**
     * The meta object literal for the '<em><b>Guard Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD_EXPRESSION__GUARD_EXPR = eINSTANCE.getGuardExpression_GuardExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.TypeRefImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.SimpleTypeRefImpl <em>Simple Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.SimpleTypeRefImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getSimpleTypeRef()
     * @generated
     */
    EClass SIMPLE_TYPE_REF = eINSTANCE.getSimpleTypeRef();

    /**
     * The meta object literal for the '<em><b>Raw Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE_REF__RAW_TYPE = eINSTANCE.getSimpleTypeRef_RawType();

    /**
     * The meta object literal for the '<em><b>Actual Arguments List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST = eINSTANCE.getSimpleTypeRef_ActualArgumentsList();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl <em>Closure Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getClosureTypeRef()
     * @generated
     */
    EClass CLOSURE_TYPE_REF = eINSTANCE.getClosureTypeRef();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSURE_TYPE_REF__PARAMETER_TYPES = eINSTANCE.getClosureTypeRef_ParameterTypes();

    /**
     * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSURE_TYPE_REF__VAR_ARGS = eINSTANCE.getClosureTypeRef_VarArgs();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSURE_TYPE_REF__RETURN_TYPE = eINSTANCE.getClosureTypeRef_ReturnType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithExpressionImpl <em>With Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getWithExpression()
     * @generated
     */
    EClass WITH_EXPRESSION = eINSTANCE.getWithExpression();

    /**
     * The meta object literal for the '<em><b>Referenced Advice</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WITH_EXPRESSION__REFERENCED_ADVICE = eINSTANCE.getWithExpression_ReferencedAdvice();

    /**
     * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_EXPRESSION__FUNC_EXPR = eINSTANCE.getWithExpression_FuncExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithContextExpressionImpl <em>With Context Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithContextExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getWithContextExpression()
     * @generated
     */
    EClass WITH_CONTEXT_EXPRESSION = eINSTANCE.getWithContextExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_CONTEXT_EXPRESSION__EXPR = eINSTANCE.getWithContextExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WITH_CONTEXT_EXPRESSION__ALIAS = eINSTANCE.getWithContextExpression_Alias();

    /**
     * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK = eINSTANCE.getWithContextExpression_ContextBlock();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallExpressionImpl <em>Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallExpression()
     * @generated
     */
    EClass CALL_EXPRESSION = eINSTANCE.getCallExpression();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ValueLiteralImpl <em>Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ValueLiteralImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getValueLiteral()
     * @generated
     */
    EClass VALUE_LITERAL = eINSTANCE.getValueLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_LITERAL__VALUE = eINSTANCE.getValueLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAssignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__LEFT_EXPR = eINSTANCE.getAssignmentExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_EXPRESSION__FUNCTION_NAME = eINSTANCE.getAssignmentExpression_FunctionName();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__RIGHT_EXPR = eINSTANCE.getAssignmentExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl <em>Def Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getDefValue()
     * @generated
     */
    EClass DEF_VALUE = eINSTANCE.getDefValue();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_VALUE__FINAL = eINSTANCE.getDefValue_Final();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_VALUE__TYPE = eINSTANCE.getDefValue_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_VALUE__NAME = eINSTANCE.getDefValue_Name();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_VALUE__VALUE_EXPR = eINSTANCE.getDefValue_ValueExpr();

    /**
     * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_VALUE__IMMUTABLE = eINSTANCE.getDefValue_Immutable();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CachedExpressionImpl <em>Cached Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CachedExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCachedExpression()
     * @generated
     */
    EClass CACHED_EXPRESSION = eINSTANCE.getCachedExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CACHED_EXPRESSION__EXPR = eINSTANCE.getCachedExpression_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.OrExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT_EXPR = eINSTANCE.getOrExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT_EXPR = eINSTANCE.getOrExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AndExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT_EXPR = eINSTANCE.getAndExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT_EXPR = eINSTANCE.getAndExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BinaryOpExpressionImpl <em>Binary Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BinaryOpExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getBinaryOpExpression()
     * @generated
     */
    EClass BINARY_OP_EXPRESSION = eINSTANCE.getBinaryOpExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OP_EXPRESSION__LEFT_EXPR = eINSTANCE.getBinaryOpExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_OP_EXPRESSION__FUNCTION_NAME = eINSTANCE.getBinaryOpExpression_FunctionName();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OP_EXPRESSION__RIGHT_EXPR = eINSTANCE.getBinaryOpExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryOpExpressionImpl <em>Unary Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryOpExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnaryOpExpression()
     * @generated
     */
    EClass UNARY_OP_EXPRESSION = eINSTANCE.getUnaryOpExpression();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_OP_EXPRESSION__FUNCTION_NAME = eINSTANCE.getUnaryOpExpression_FunctionName();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OP_EXPRESSION__EXPR = eINSTANCE.getUnaryOpExpression_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPreOpExpressionImpl <em>Unary Pre Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPreOpExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnaryPreOpExpression()
     * @generated
     */
    EClass UNARY_PRE_OP_EXPRESSION = eINSTANCE.getUnaryPreOpExpression();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_PRE_OP_EXPRESSION__FUNCTION_NAME = eINSTANCE.getUnaryPreOpExpression_FunctionName();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_PRE_OP_EXPRESSION__EXPR = eINSTANCE.getUnaryPreOpExpression_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPostOpExpressionImpl <em>Unary Post Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnaryPostOpExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getUnaryPostOpExpression()
     * @generated
     */
    EClass UNARY_POST_OP_EXPRESSION = eINSTANCE.getUnaryPostOpExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_POST_OP_EXPRESSION__EXPR = eINSTANCE.getUnaryPostOpExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_POST_OP_EXPRESSION__FUNCTION_NAME = eINSTANCE.getUnaryPostOpExpression_FunctionName();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFeatureImpl <em>Call Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFeatureImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallFeature()
     * @generated
     */
    EClass CALL_FEATURE = eINSTANCE.getCallFeature();

    /**
     * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_FEATURE__FUNC_EXPR = eINSTANCE.getCallFeature_FuncExpr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_FEATURE__NAME = eINSTANCE.getCallFeature_Name();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_FEATURE__PARAMETER_LIST = eINSTANCE.getCallFeature_ParameterList();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AtExpressionImpl <em>At Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AtExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getAtExpression()
     * @generated
     */
    EClass AT_EXPRESSION = eINSTANCE.getAtExpression();

    /**
     * The meta object literal for the '<em><b>Obj Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_EXPRESSION__OBJ_EXPR = eINSTANCE.getAtExpression_ObjExpr();

    /**
     * The meta object literal for the '<em><b>Index Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_EXPRESSION__INDEX_EXPR = eINSTANCE.getAtExpression_IndexExpr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FeatureExpressionImpl <em>Feature Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.FeatureExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getFeatureExpression()
     * @generated
     */
    EClass FEATURE_EXPRESSION = eINSTANCE.getFeatureExpression();

    /**
     * The meta object literal for the '<em><b>Obj Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_EXPRESSION__OBJ_EXPR = eINSTANCE.getFeatureExpression_ObjExpr();

    /**
     * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_EXPRESSION__FEATURE_NAME = eINSTANCE.getFeatureExpression_FeatureName();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFunctionImpl <em>Call Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallFunctionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallFunction()
     * @generated
     */
    EClass CALL_FUNCTION = eINSTANCE.getCallFunction();

    /**
     * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_FUNCTION__FUNC_EXPR = eINSTANCE.getCallFunction_FuncExpr();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_FUNCTION__PARAMETER_LIST = eINSTANCE.getCallFunction_ParameterList();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ChainedExpressionImpl <em>Chained Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ChainedExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getChainedExpression()
     * @generated
     */
    EClass CHAINED_EXPRESSION = eINSTANCE.getChainedExpression();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHAINED_EXPRESSION__EXPRESSIONS = eINSTANCE.getChainedExpression_Expressions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.VariableExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getVariableExpression()
     * @generated
     */
    EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_EXPRESSION__NAME = eINSTANCE.getVariableExpression_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallNamedFunctionImpl <em>Call Named Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CallNamedFunctionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCallNamedFunction()
     * @generated
     */
    EClass CALL_NAMED_FUNCTION = eINSTANCE.getCallNamedFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_NAMED_FUNCTION__NAME = eINSTANCE.getCallNamedFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_NAMED_FUNCTION__PARAMETER_LIST = eINSTANCE.getCallNamedFunction_ParameterList();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl <em>Create Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.CreateExpressionImpl
     * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.BeeLangTestLanguagePackageImpl#getCreateExpression()
     * @generated
     */
    EClass CREATE_EXPRESSION = eINSTANCE.getCreateExpression();

    /**
     * The meta object literal for the '<em><b>Type Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EXPRESSION__TYPE_EXPR = eINSTANCE.getCreateExpression_TypeExpr();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EXPRESSION__PARAMETER_LIST = eINSTANCE.getCreateExpression_ParameterList();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EXPRESSION__ALIAS = eINSTANCE.getCreateExpression_Alias();

    /**
     * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EXPRESSION__CONTEXT_BLOCK = eINSTANCE.getCreateExpression_ContextBlock();

  }

} //BeeLangTestLanguagePackage
