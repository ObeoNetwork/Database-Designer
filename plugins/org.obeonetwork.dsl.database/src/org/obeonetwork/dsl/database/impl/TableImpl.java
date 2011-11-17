/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.database.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.database.Constraint;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.ForeignKey;
import org.obeonetwork.dsl.database.Index;
import org.obeonetwork.dsl.database.PrimaryKey;
import org.obeonetwork.dsl.database.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.TableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.TableImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.TableImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends AbstractTableImpl implements Table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;
	/**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignKeys;
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;
	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, DatabasePackage.PRIMARY_KEY__OWNER, PrimaryKey.class, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, DatabasePackage.PRIMARY_KEY__OWNER, PrimaryKey.class, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new EObjectContainmentWithInverseEList<ForeignKey>(ForeignKey.class, this, DatabasePackage.TABLE__FOREIGN_KEYS, DatabasePackage.FOREIGN_KEY__OWNER);
		}
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, DatabasePackage.TABLE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndex() {
		if (index == null) {
			index = new EObjectContainmentWithInverseEList<Index>(Index.class, this, DatabasePackage.TABLE__INDEX, DatabasePackage.INDEX__OWNER);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.TABLE__PRIMARY_KEY:
				if (primaryKey != null)
					msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.TABLE__PRIMARY_KEY, null, msgs);
				return basicSetPrimaryKey((PrimaryKey)otherEnd, msgs);
			case DatabasePackage.TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case DatabasePackage.TABLE__INDEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndex()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.TABLE__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case DatabasePackage.TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case DatabasePackage.TABLE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case DatabasePackage.TABLE__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.TABLE__PRIMARY_KEY:
				return getPrimaryKey();
			case DatabasePackage.TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case DatabasePackage.TABLE__CONSTRAINTS:
				return getConstraints();
			case DatabasePackage.TABLE__INDEX:
				return getIndex();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case DatabasePackage.TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case DatabasePackage.TABLE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case DatabasePackage.TABLE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Index>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatabasePackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case DatabasePackage.TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case DatabasePackage.TABLE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case DatabasePackage.TABLE__INDEX:
				getIndex().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabasePackage.TABLE__PRIMARY_KEY:
				return primaryKey != null;
			case DatabasePackage.TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case DatabasePackage.TABLE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case DatabasePackage.TABLE__INDEX:
				return index != null && !index.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
