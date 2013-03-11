/**
 */
package org.xtext.example.task1.langExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.While#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.While#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Statement
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getWhile_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.While#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(SeqStatement)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getWhile_Stmt()
   * @model containment="true"
   * @generated
   */
  SeqStatement getStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.While#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(SeqStatement value);

} // While
