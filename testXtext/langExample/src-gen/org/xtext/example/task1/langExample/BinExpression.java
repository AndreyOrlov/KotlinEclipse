/**
 */
package org.xtext.example.task1.langExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.BinExpression#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.BinExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getBinExpression()
 * @model
 * @generated
 */
public interface BinExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr1</em>' containment reference.
   * @see #setExpr1(SimpleExpression)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getBinExpression_Expr1()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getExpr1();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.BinExpression#getExpr1 <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr1</em>' containment reference.
   * @see #getExpr1()
   * @generated
   */
  void setExpr1(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(SimpleExpression)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getBinExpression_Expr()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.BinExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(SimpleExpression value);

} // BinExpression
