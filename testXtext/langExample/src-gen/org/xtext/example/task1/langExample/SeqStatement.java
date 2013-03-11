/**
 */
package org.xtext.example.task1.langExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.SeqStatement#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.SeqStatement#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getSeqStatement()
 * @model
 * @generated
 */
public interface SeqStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(Statement)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getSeqStatement_Stmt()
   * @model containment="true"
   * @generated
   */
  Statement getStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.SeqStatement#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(Statement value);

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.task1.langExample.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getSeqStatement_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStmts();

} // SeqStatement
