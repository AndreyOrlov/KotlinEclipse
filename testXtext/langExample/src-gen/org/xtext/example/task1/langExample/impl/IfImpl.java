/**
 */
package org.xtext.example.task1.langExample.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.task1.langExample.Expression;
import org.xtext.example.task1.langExample.If;
import org.xtext.example.task1.langExample.LangExamplePackage;
import org.xtext.example.task1.langExample.SeqStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.impl.IfImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.IfImpl#getStmt1 <em>Stmt1</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.IfImpl#getStmt2 <em>Stmt2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getStmt1() <em>Stmt1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt1()
   * @generated
   * @ordered
   */
  protected SeqStatement stmt1;

  /**
   * The cached value of the '{@link #getStmt2() <em>Stmt2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt2()
   * @generated
   * @ordered
   */
  protected SeqStatement stmt2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
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
    return LangExamplePackage.Literals.IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.IF__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.IF__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.IF__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.IF__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqStatement getStmt1()
  {
    return stmt1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt1(SeqStatement newStmt1, NotificationChain msgs)
  {
    SeqStatement oldStmt1 = stmt1;
    stmt1 = newStmt1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.IF__STMT1, oldStmt1, newStmt1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt1(SeqStatement newStmt1)
  {
    if (newStmt1 != stmt1)
    {
      NotificationChain msgs = null;
      if (stmt1 != null)
        msgs = ((InternalEObject)stmt1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.IF__STMT1, null, msgs);
      if (newStmt1 != null)
        msgs = ((InternalEObject)newStmt1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.IF__STMT1, null, msgs);
      msgs = basicSetStmt1(newStmt1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.IF__STMT1, newStmt1, newStmt1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqStatement getStmt2()
  {
    return stmt2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt2(SeqStatement newStmt2, NotificationChain msgs)
  {
    SeqStatement oldStmt2 = stmt2;
    stmt2 = newStmt2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.IF__STMT2, oldStmt2, newStmt2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt2(SeqStatement newStmt2)
  {
    if (newStmt2 != stmt2)
    {
      NotificationChain msgs = null;
      if (stmt2 != null)
        msgs = ((InternalEObject)stmt2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.IF__STMT2, null, msgs);
      if (newStmt2 != null)
        msgs = ((InternalEObject)newStmt2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.IF__STMT2, null, msgs);
      msgs = basicSetStmt2(newStmt2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.IF__STMT2, newStmt2, newStmt2));
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
      case LangExamplePackage.IF__EXPR:
        return basicSetExpr(null, msgs);
      case LangExamplePackage.IF__STMT1:
        return basicSetStmt1(null, msgs);
      case LangExamplePackage.IF__STMT2:
        return basicSetStmt2(null, msgs);
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
      case LangExamplePackage.IF__EXPR:
        return getExpr();
      case LangExamplePackage.IF__STMT1:
        return getStmt1();
      case LangExamplePackage.IF__STMT2:
        return getStmt2();
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
      case LangExamplePackage.IF__EXPR:
        setExpr((Expression)newValue);
        return;
      case LangExamplePackage.IF__STMT1:
        setStmt1((SeqStatement)newValue);
        return;
      case LangExamplePackage.IF__STMT2:
        setStmt2((SeqStatement)newValue);
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
      case LangExamplePackage.IF__EXPR:
        setExpr((Expression)null);
        return;
      case LangExamplePackage.IF__STMT1:
        setStmt1((SeqStatement)null);
        return;
      case LangExamplePackage.IF__STMT2:
        setStmt2((SeqStatement)null);
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
      case LangExamplePackage.IF__EXPR:
        return expr != null;
      case LangExamplePackage.IF__STMT1:
        return stmt1 != null;
      case LangExamplePackage.IF__STMT2:
        return stmt2 != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
