/**
 */
package org.xtext.example.task1.langExample;

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
 * @see org.xtext.example.task1.langExample.LangExampleFactory
 * @model kind="package"
 * @generated
 */
public interface LangExamplePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "langExample";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/task1/LangExample";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "langExample";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LangExamplePackage eINSTANCE = org.xtext.example.task1.langExample.impl.LangExamplePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.ModelImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.TypeImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.FunctionImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DEF = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Def2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DEF2 = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__STMTS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.VarDefImpl <em>Var Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.VarDefImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getVarDef()
   * @generated
   */
  int VAR_DEF = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DEF__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DEF__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DEF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.TypeNameImpl <em>Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.TypeNameImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getTypeName()
   * @generated
   */
  int TYPE_NAME = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.ClassImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getClass_()
   * @generated
   */
  int CLASS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ELEMENTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.TraitImpl <em>Trait</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.TraitImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getTrait()
   * @generated
   */
  int TRAIT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__CLASS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valid Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__VALID_ID = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.SeqStatementImpl <em>Seq Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.SeqStatementImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getSeqStatement()
   * @generated
   */
  int SEQ_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_STATEMENT__STMT = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_STATEMENT__STMTS = 1;

  /**
   * The number of structural features of the '<em>Seq Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.StatementImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 8;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.AssignImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 9;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VAR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__EXPR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.IfImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getIf()
   * @generated
   */
  int IF = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmt1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__STMT1 = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__STMT2 = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.WhileImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getWhile()
   * @generated
   */
  int WHILE = 11;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__STMT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.ExpressionImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 12;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.BinExpressionImpl <em>Bin Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.BinExpressionImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getBinExpression()
   * @generated
   */
  int BIN_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_EXPRESSION__EXPR1 = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bin Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.task1.langExample.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.task1.langExample.impl.SimpleExpressionImpl
   * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getSimpleExpression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.task1.langExample.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.task1.langExample.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.task1.langExample.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.task1.langExample.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.task1.langExample.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.task1.langExample.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.task1.langExample.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.Function#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see org.xtext.example.task1.langExample.Function#getDef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Def();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.Function#getDef2 <em>Def2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def2</em>'.
   * @see org.xtext.example.task1.langExample.Function#getDef2()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Def2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.task1.langExample.Function#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.task1.langExample.Function#getStmts()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Stmts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.VarDef <em>Var Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Def</em>'.
   * @see org.xtext.example.task1.langExample.VarDef
   * @generated
   */
  EClass getVarDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.VarDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.task1.langExample.VarDef#getType()
   * @see #getVarDef()
   * @generated
   */
  EReference getVarDef_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name</em>'.
   * @see org.xtext.example.task1.langExample.TypeName
   * @generated
   */
  EClass getTypeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.task1.langExample.TypeName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.task1.langExample.TypeName#getName()
   * @see #getTypeName()
   * @generated
   */
  EAttribute getTypeName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.example.task1.langExample.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.task1.langExample.Class#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.task1.langExample.Class#getElements()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Trait <em>Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait</em>'.
   * @see org.xtext.example.task1.langExample.Trait
   * @generated
   */
  EClass getTrait();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.task1.langExample.Trait#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see org.xtext.example.task1.langExample.Trait#getClass_()
   * @see #getTrait()
   * @generated
   */
  EReference getTrait_Class();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.task1.langExample.Trait#getValidId <em>Valid Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valid Id</em>'.
   * @see org.xtext.example.task1.langExample.Trait#getValidId()
   * @see #getTrait()
   * @generated
   */
  EAttribute getTrait_ValidId();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.SeqStatement <em>Seq Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Statement</em>'.
   * @see org.xtext.example.task1.langExample.SeqStatement
   * @generated
   */
  EClass getSeqStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.SeqStatement#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.example.task1.langExample.SeqStatement#getStmt()
   * @see #getSeqStatement()
   * @generated
   */
  EReference getSeqStatement_Stmt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.task1.langExample.SeqStatement#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.task1.langExample.SeqStatement#getStmts()
   * @see #getSeqStatement()
   * @generated
   */
  EReference getSeqStatement_Stmts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.example.task1.langExample.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see org.xtext.example.task1.langExample.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.task1.langExample.Assign#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.example.task1.langExample.Assign#getVar()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.Assign#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.task1.langExample.Assign#getExpr()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.xtext.example.task1.langExample.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.If#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.task1.langExample.If#getExpr()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.If#getStmt1 <em>Stmt1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt1</em>'.
   * @see org.xtext.example.task1.langExample.If#getStmt1()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Stmt1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.If#getStmt2 <em>Stmt2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt2</em>'.
   * @see org.xtext.example.task1.langExample.If#getStmt2()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Stmt2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.xtext.example.task1.langExample.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.While#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.task1.langExample.While#getExpr()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.While#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.example.task1.langExample.While#getStmt()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.task1.langExample.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.BinExpression <em>Bin Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bin Expression</em>'.
   * @see org.xtext.example.task1.langExample.BinExpression
   * @generated
   */
  EClass getBinExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.BinExpression#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr1</em>'.
   * @see org.xtext.example.task1.langExample.BinExpression#getExpr1()
   * @see #getBinExpression()
   * @generated
   */
  EReference getBinExpression_Expr1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.task1.langExample.BinExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.task1.langExample.BinExpression#getExpr()
   * @see #getBinExpression()
   * @generated
   */
  EReference getBinExpression_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.task1.langExample.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expression</em>'.
   * @see org.xtext.example.task1.langExample.SimpleExpression
   * @generated
   */
  EClass getSimpleExpression();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.task1.langExample.SimpleExpression#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.example.task1.langExample.SimpleExpression#getVar()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Var();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LangExampleFactory getLangExampleFactory();

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
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.ModelImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.TypeImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.FunctionImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DEF = eINSTANCE.getFunction_Def();

    /**
     * The meta object literal for the '<em><b>Def2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DEF2 = eINSTANCE.getFunction_Def2();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__STMTS = eINSTANCE.getFunction_Stmts();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.VarDefImpl <em>Var Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.VarDefImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getVarDef()
     * @generated
     */
    EClass VAR_DEF = eINSTANCE.getVarDef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DEF__TYPE = eINSTANCE.getVarDef_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.TypeNameImpl <em>Type Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.TypeNameImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getTypeName()
     * @generated
     */
    EClass TYPE_NAME = eINSTANCE.getTypeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_NAME__NAME = eINSTANCE.getTypeName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.ClassImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__ELEMENTS = eINSTANCE.getClass_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.TraitImpl <em>Trait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.TraitImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getTrait()
     * @generated
     */
    EClass TRAIT = eINSTANCE.getTrait();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT__CLASS = eINSTANCE.getTrait_Class();

    /**
     * The meta object literal for the '<em><b>Valid Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAIT__VALID_ID = eINSTANCE.getTrait_ValidId();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.SeqStatementImpl <em>Seq Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.SeqStatementImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getSeqStatement()
     * @generated
     */
    EClass SEQ_STATEMENT = eINSTANCE.getSeqStatement();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_STATEMENT__STMT = eINSTANCE.getSeqStatement_Stmt();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_STATEMENT__STMTS = eINSTANCE.getSeqStatement_Stmts();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.StatementImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.AssignImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VAR = eINSTANCE.getAssign_Var();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__EXPR = eINSTANCE.getAssign_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.IfImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__EXPR = eINSTANCE.getIf_Expr();

    /**
     * The meta object literal for the '<em><b>Stmt1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__STMT1 = eINSTANCE.getIf_Stmt1();

    /**
     * The meta object literal for the '<em><b>Stmt2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__STMT2 = eINSTANCE.getIf_Stmt2();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.WhileImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EXPR = eINSTANCE.getWhile_Expr();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__STMT = eINSTANCE.getWhile_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.ExpressionImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.BinExpressionImpl <em>Bin Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.BinExpressionImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getBinExpression()
     * @generated
     */
    EClass BIN_EXPRESSION = eINSTANCE.getBinExpression();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_EXPRESSION__EXPR1 = eINSTANCE.getBinExpression_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_EXPRESSION__EXPR = eINSTANCE.getBinExpression_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.task1.langExample.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.task1.langExample.impl.SimpleExpressionImpl
     * @see org.xtext.example.task1.langExample.impl.LangExamplePackageImpl#getSimpleExpression()
     * @generated
     */
    EClass SIMPLE_EXPRESSION = eINSTANCE.getSimpleExpression();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__VAR = eINSTANCE.getSimpleExpression_Var();

  }

} //LangExamplePackage
