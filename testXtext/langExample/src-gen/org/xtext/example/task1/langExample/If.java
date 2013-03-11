/**
 */
package org.xtext.example.task1.langExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.If#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.If#getStmt1 <em>Stmt1</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.If#getStmt2 <em>Stmt2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement
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
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getIf_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.If#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Stmt1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt1</em>' containment reference.
   * @see #setStmt1(SeqStatement)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getIf_Stmt1()
   * @model containment="true"
   * @generated
   */
  SeqStatement getStmt1();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.If#getStmt1 <em>Stmt1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt1</em>' containment reference.
   * @see #getStmt1()
   * @generated
   */
  void setStmt1(SeqStatement value);

  /**
   * Returns the value of the '<em><b>Stmt2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt2</em>' containment reference.
   * @see #setStmt2(SeqStatement)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getIf_Stmt2()
   * @model containment="true"
   * @generated
   */
  SeqStatement getStmt2();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.If#getStmt2 <em>Stmt2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt2</em>' containment reference.
   * @see #getStmt2()
   * @generated
   */
  void setStmt2(SeqStatement value);

} // If
