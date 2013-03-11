/**
 */
package org.xtext.example.task1.langExample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.Function#getDef <em>Def</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.Function#getDef2 <em>Def2</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.Function#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Type
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(VarDef)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getFunction_Def()
   * @model containment="true"
   * @generated
   */
  VarDef getDef();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.Function#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(VarDef value);

  /**
   * Returns the value of the '<em><b>Def2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def2</em>' containment reference.
   * @see #setDef2(VarDef)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getFunction_Def2()
   * @model containment="true"
   * @generated
   */
  VarDef getDef2();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.Function#getDef2 <em>Def2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def2</em>' containment reference.
   * @see #getDef2()
   * @generated
   */
  void setDef2(VarDef value);

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.task1.langExample.SeqStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getFunction_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<SeqStatement> getStmts();

} // Function
