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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.task1.langExample.LangExamplePackage;
import org.xtext.example.task1.langExample.SeqStatement;
import org.xtext.example.task1.langExample.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.task1.langExample.impl.SeqStatementImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.example.task1.langExample.impl.SeqStatementImpl#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeqStatementImpl extends MinimalEObjectImpl.Container implements SeqStatement
{
  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected Statement stmt;

  /**
   * The cached value of the '{@link #getStmts() <em>Stmts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmts()
   * @generated
   * @ordered
   */
  protected EList<Statement> stmts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeqStatementImpl()
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
    return LangExamplePackage.Literals.SEQ_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(Statement newStmt, NotificationChain msgs)
  {
    Statement oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangExamplePackage.SEQ_STATEMENT__STMT, oldStmt, newStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt(Statement newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.SEQ_STATEMENT__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangExamplePackage.SEQ_STATEMENT__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangExamplePackage.SEQ_STATEMENT__STMT, newStmt, newStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStmts()
  {
    if (stmts == null)
    {
      stmts = new EObjectContainmentEList<Statement>(Statement.class, this, LangExamplePackage.SEQ_STATEMENT__STMTS);
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
      case LangExamplePackage.SEQ_STATEMENT__STMT:
        return basicSetStmt(null, msgs);
      case LangExamplePackage.SEQ_STATEMENT__STMTS:
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
      case LangExamplePackage.SEQ_STATEMENT__STMT:
        return getStmt();
      case LangExamplePackage.SEQ_STATEMENT__STMTS:
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
      case LangExamplePackage.SEQ_STATEMENT__STMT:
        setStmt((Statement)newValue);
        return;
      case LangExamplePackage.SEQ_STATEMENT__STMTS:
        getStmts().clear();
        getStmts().addAll((Collection<? extends Statement>)newValue);
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
      case LangExamplePackage.SEQ_STATEMENT__STMT:
        setStmt((Statement)null);
        return;
      case LangExamplePackage.SEQ_STATEMENT__STMTS:
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
      case LangExamplePackage.SEQ_STATEMENT__STMT:
        return stmt != null;
      case LangExamplePackage.SEQ_STATEMENT__STMTS:
        return stmts != null && !stmts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SeqStatementImpl
