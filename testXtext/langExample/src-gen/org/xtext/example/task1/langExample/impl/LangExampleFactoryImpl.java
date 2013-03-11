/**
 */
package org.xtext.example.task1.langExample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.task1.langExample.Assign;
import org.xtext.example.task1.langExample.BinExpression;
import org.xtext.example.task1.langExample.Expression;
import org.xtext.example.task1.langExample.Function;
import org.xtext.example.task1.langExample.If;
import org.xtext.example.task1.langExample.LangExampleFactory;
import org.xtext.example.task1.langExample.LangExamplePackage;
import org.xtext.example.task1.langExample.Model;
import org.xtext.example.task1.langExample.SeqStatement;
import org.xtext.example.task1.langExample.SimpleExpression;
import org.xtext.example.task1.langExample.Statement;
import org.xtext.example.task1.langExample.Trait;
import org.xtext.example.task1.langExample.Type;
import org.xtext.example.task1.langExample.TypeName;
import org.xtext.example.task1.langExample.VarDef;
import org.xtext.example.task1.langExample.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LangExampleFactoryImpl extends EFactoryImpl implements LangExampleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LangExampleFactory init()
  {
    try
    {
      LangExampleFactory theLangExampleFactory = (LangExampleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/task1/LangExample"); 
      if (theLangExampleFactory != null)
      {
        return theLangExampleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LangExampleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangExampleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LangExamplePackage.MODEL: return createModel();
      case LangExamplePackage.TYPE: return createType();
      case LangExamplePackage.FUNCTION: return createFunction();
      case LangExamplePackage.VAR_DEF: return createVarDef();
      case LangExamplePackage.TYPE_NAME: return createTypeName();
      case LangExamplePackage.CLASS: return createClass();
      case LangExamplePackage.TRAIT: return createTrait();
      case LangExamplePackage.SEQ_STATEMENT: return createSeqStatement();
      case LangExamplePackage.STATEMENT: return createStatement();
      case LangExamplePackage.ASSIGN: return createAssign();
      case LangExamplePackage.IF: return createIf();
      case LangExamplePackage.WHILE: return createWhile();
      case LangExamplePackage.EXPRESSION: return createExpression();
      case LangExamplePackage.BIN_EXPRESSION: return createBinExpression();
      case LangExamplePackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDef createVarDef()
  {
    VarDefImpl varDef = new VarDefImpl();
    return varDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName createTypeName()
  {
    TypeNameImpl typeName = new TypeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.task1.langExample.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait createTrait()
  {
    TraitImpl trait = new TraitImpl();
    return trait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqStatement createSeqStatement()
  {
    SeqStatementImpl seqStatement = new SeqStatementImpl();
    return seqStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinExpression createBinExpression()
  {
    BinExpressionImpl binExpression = new BinExpressionImpl();
    return binExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangExamplePackage getLangExamplePackage()
  {
    return (LangExamplePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LangExamplePackage getPackage()
  {
    return LangExamplePackage.eINSTANCE;
  }

} //LangExampleFactoryImpl
