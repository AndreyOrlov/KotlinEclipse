/**
 */
package org.xtext.example.task1.langExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.VarDef#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getVarDef()
 * @model
 * @generated
 */
public interface VarDef extends Type, Statement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeName)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getVarDef_Type()
   * @model containment="true"
   * @generated
   */
  TypeName getType();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.VarDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeName value);

} // VarDef
