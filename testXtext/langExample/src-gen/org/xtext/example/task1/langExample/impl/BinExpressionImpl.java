/**
 */
package org.xtext.example.task1.langExample.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.task1.langExample.BinExpression;
import org.xtext.example.task1.langExample.LangExamplePackage;
import org.xtext.example.task1.langExample.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.impl.BinExpressionImpl#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.BinExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinExpressionImpl extends ExpressionImpl implements BinExpression
{
  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected SimpleExpression expr1;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected SimpleExpression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinExpressionImpl()
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
    return LangExamplePackage.Literals.BIN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr1(SimpleExpression newExpr1, NotificationChain msgs)
  {
    SimpleExpression oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.BIN_EXPRESSION__EXPR1, oldExpr1, newExpr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr1(SimpleExpression newExpr1)
  {
    if (newExpr1 != expr1)
    {
      NotificationChain msgs = null;
      if (expr1 != null)
        msgs = ((InternalEObject)expr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.BIN_EXPRESSION__EXPR1, null, msgs);
      if (newExpr1 != null)
        msgs = ((InternalEObject)newExpr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.BIN_EXPRESSION__EXPR1, null, msgs);
      msgs = basicSetExpr1(newExpr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.BIN_EXPRESSION__EXPR1, newExpr1, newExpr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(SimpleExpression newExpr, NotificationChain msgs)
  {
    SimpleExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.BIN_EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(SimpleExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.BIN_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.BIN_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.BIN_EXPRESSION__EXPR, newExpr, newExpr));
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
      case LangExamplePackage.BIN_EXPRESSION__EXPR1:
        return basicSetExpr1(null, msgs);
      case LangExamplePackage.BIN_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
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
      case LangExamplePackage.BIN_EXPRESSION__EXPR1:
        return getExpr1();
      case LangExamplePackage.BIN_EXPRESSION__EXPR:
        return getExpr();
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
      case LangExamplePackage.BIN_EXPRESSION__EXPR1:
        setExpr1((SimpleExpression)newValue);
        return;
      case LangExamplePackage.BIN_EXPRESSION__EXPR:
        setExpr((SimpleExpression)newValue);
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
      case LangExamplePackage.BIN_EXPRESSION__EXPR1:
        setExpr1((SimpleExpression)null);
        return;
      case LangExamplePackage.BIN_EXPRESSION__EXPR:
        setExpr((SimpleExpression)null);
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
      case LangExamplePackage.BIN_EXPRESSION__EXPR1:
        return expr1 != null;
      case LangExamplePackage.BIN_EXPRESSION__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //BinExpressionImpl
