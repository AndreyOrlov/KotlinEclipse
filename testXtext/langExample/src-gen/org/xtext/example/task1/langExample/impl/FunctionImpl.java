/**
 */
package org.xtext.example.task1.langExample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.task1.langExample.Function;
import org.xtext.example.task1.langExample.LangExamplePackage;
import org.xtext.example.task1.langExample.SeqStatement;
import org.xtext.example.task1.langExample.VarDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.impl.FunctionImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.FunctionImpl#getDef2 <em>Def2</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.FunctionImpl#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends TypeImpl implements Function
{
  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected VarDef def;

  /**
   * The cached value of the '{@link #getDef2() <em>Def2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef2()
   * @generated
   * @ordered
   */
  protected VarDef def2;

  /**
   * The cached value of the '{@link #getStmts() <em>Stmts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmts()
   * @generated
   * @ordered
   */
  protected EList<SeqStatement> stmts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return LangExamplePackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDef getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(VarDef newDef, NotificationChain msgs)
  {
    VarDef oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.FUNCTION__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(VarDef newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.FUNCTION__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.FUNCTION__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.FUNCTION__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDef getDef2()
  {
    return def2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef2(VarDef newDef2, NotificationChain msgs)
  {
    VarDef oldDef2 = def2;
    def2 = newDef2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.FUNCTION__DEF2, oldDef2, newDef2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef2(VarDef newDef2)
  {
    if (newDef2 != def2)
    {
      NotificationChain msgs = null;
      if (def2 != null)
        msgs = ((InternalEObject)def2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.FUNCTION__DEF2, null, msgs);
      if (newDef2 != null)
        msgs = ((InternalEObject)newDef2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.FUNCTION__DEF2, null, msgs);
      msgs = basicSetDef2(newDef2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.FUNCTION__DEF2, newDef2, newDef2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SeqStatement> getStmts()
  {
    if (stmts == null)
    {
      stmts = new EObjectContainmentEList<SeqStatement>(SeqStatement.class, this, LangExamplePackage.FUNCTION__STMTS);
    }
    return stmts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LangExamplePackage.FUNCTION__DEF:
        return basicSetDef(null, msgs);
      case LangExamplePackage.FUNCTION__DEF2:
        return basicSetDef2(null, msgs);
      case LangExamplePackage.FUNCTION__STMTS:
        return ((InternalEList<?>)getStmts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LangExamplePackage.FUNCTION__DEF:
        return getDef();
      case LangExamplePackage.FUNCTION__DEF2:
        return getDef2();
      case LangExamplePackage.FUNCTION__STMTS:
        return getStmts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LangExamplePackage.FUNCTION__DEF:
        setDef((VarDef)newValue);
        return;
      case LangExamplePackage.FUNCTION__DEF2:
        setDef2((VarDef)newValue);
        return;
      case LangExamplePackage.FUNCTION__STMTS:
        getStmts().clear();
        getStmts().addAll((Collection<? extends SeqStatement>)newValue);
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
      case LangExamplePackage.FUNCTION__DEF:
        setDef((VarDef)null);
        return;
      case LangExamplePackage.FUNCTION__DEF2:
        setDef2((VarDef)null);
        return;
      case LangExamplePackage.FUNCTION__STMTS:
        getStmts().clear();
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
      case LangExamplePackage.FUNCTION__DEF:
        return def != null;
      case LangExamplePackage.FUNCTION__DEF2:
        return def2 != null;
      case LangExamplePackage.FUNCTION__STMTS:
        return stmts != null && !stmts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionImpl
