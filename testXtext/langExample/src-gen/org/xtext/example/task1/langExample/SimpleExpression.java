/**
 */
package org.xtext.example.task1.langExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.SimpleExpression#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getSimpleExpression()
 * @model
 * @generated
 */
public interface SimpleExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VarDef)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getSimpleExpression_Var()
   * @model
   * @generated
   */
  VarDef getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.SimpleExpression#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VarDef value);

} // SimpleExpression
