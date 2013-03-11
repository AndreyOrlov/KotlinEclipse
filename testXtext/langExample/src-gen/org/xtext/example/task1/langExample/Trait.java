/**
 */
package org.xtext.example.task1.langExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.Trait#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.Trait#getValidId <em>Valid Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.task1.langExample.LangExamplePackage#getTrait()
 * @model
 * @generated
 */
public interface Trait extends Type
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(org.xtext.example.task1.langExample.Class)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getTrait_Class()
   * @model
   * @generated
   */
  org.xtext.example.task1.langExample.Class getClass_();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.Trait#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(org.xtext.example.task1.langExample.Class value);

  /**
   * Returns the value of the '<em><b>Valid Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valid Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid Id</em>' attribute.
   * @see #setValidId(String)
   * @see org.xtext.example.task1.langExample.LangExamplePackage#getTrait_ValidId()
   * @model
   * @generated
   */
  String getValidId();

  /**
   * Sets the value of the '{@link org.xtext.example.task1.langExample.Trait#getValidId <em>Valid Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid Id</em>' attribute.
   * @see #getValidId()
   * @generated
   */
  void setValidId(String value);

} // Trait
