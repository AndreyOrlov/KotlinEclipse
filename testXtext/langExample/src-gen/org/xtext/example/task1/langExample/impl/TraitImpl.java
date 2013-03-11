/**
 */
package org.xtext.example.task1.langExample.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.task1.langExample.LangExamplePackage;
import org.xtext.example.task1.langExample.Trait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.impl.TraitImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.TraitImpl#getValidId <em>Valid Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitImpl extends TypeImpl implements Trait
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected org.xtext.example.task1.langExample.Class class_;

  /**
   * The default value of the '{@link #getValidId() <em>Valid Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidId()
   * @generated
   * @ordered
   */
  protected static final String VALID_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValidId() <em>Valid Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidId()
   * @generated
   * @ordered
   */
  protected String validId = VALID_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraitImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LangExamplePackage.Literals.TRAIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.task1.langExample.Class getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (org.xtext.example.task1.langExample.Class)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LangExamplePackage.TRAIT__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.task1.langExample.Class basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(org.xtext.example.task1.langExample.Class newClass)
  {
    org.xtext.example.task1.langExample.Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.TRAIT__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValidId()
  {
    return validId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidId(String newValidId)
  {
    String oldValidId = validId;
    validId = newValidId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.TRAIT__VALID_ID, oldValidId, validId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LangExamplePackage.TRAIT__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case LangExamplePackage.TRAIT__VALID_ID:
        return getValidId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LangExamplePackage.TRAIT__CLASS:
        setClass((org.xtext.example.task1.langExample.Class)newValue);
        return;
      case LangExamplePackage.TRAIT__VALID_ID:
        setValidId((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LangExamplePackage.TRAIT__CLASS:
        setClass((org.xtext.example.task1.langExample.Class)null);
        return;
      case LangExamplePackage.TRAIT__VALID_ID:
        setValidId(VALID_ID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LangExamplePackage.TRAIT__CLASS:
        return class_ != null;
      case LangExamplePackage.TRAIT__VALID_ID:
        return VALID_ID_EDEFAULT == null ? validId != null : !VALID_ID_EDEFAULT.equals(validId);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (validId: ");
    result.append(validId);
    result.append(')');
    return result.toString();
  }

} //TraitImpl
