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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.ForeignKeyElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ForeignKeyElementImpl#getFkColumn <em>Fk Column</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ForeignKeyElementImpl#getPkColumn <em>Pk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyElementImpl extends DatabaseElementImpl implements ForeignKeyElement {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getFkColumn() <em>Fk Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFkColumn()
	 * @generated
	 * @ordered
	 */
	protected Column fkColumn;

	/**
	 * The cached value of the '{@link #getPkColumn() <em>Pk Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkColumn()
	 * @generated
	 * @ordered
	 */
	protected Column pkColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.FOREIGN_KEY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getFkColumn() {
		if (fkColumn != null && ((EObject)fkColumn).eIsProxy()) {
			InternalEObject oldFkColumn = (InternalEObject)fkColumn;
			fkColumn = (Column)eResolveProxy(oldFkColumn);
			if (fkColumn != oldFkColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN, oldFkColumn, fkColumn));
			}
		}
		return fkColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetFkColumn() {
		return fkColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFkColumn(Column newFkColumn, NotificationChain msgs) {
		Column oldFkColumn = fkColumn;
		fkColumn = newFkColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN, oldFkColumn, newFkColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFkColumn(Column newFkColumn) {
		if (newFkColumn != fkColumn) {
			NotificationChain msgs = null;
			if (fkColumn != null)
				msgs = ((InternalEObject)fkColumn).eInverseRemove(this, DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS, Column.class, msgs);
			if (newFkColumn != null)
				msgs = ((InternalEObject)newFkColumn).eInverseAdd(this, DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS, Column.class, msgs);
			msgs = basicSetFkColumn(newFkColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN, newFkColumn, newFkColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getPkColumn() {
		if (pkColumn != null && ((EObject)pkColumn).eIsProxy()) {
			InternalEObject oldPkColumn = (InternalEObject)pkColumn;
			pkColumn = (Column)eResolveProxy(oldPkColumn);
			if (pkColumn != oldPkColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.FOREIGN_KEY_ELEMENT__PK_COLUMN, oldPkColumn, pkColumn));
			}
		}
		return pkColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetPkColumn() {
		return pkColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkColumn(Column newPkColumn) {
		Column oldPkColumn = pkColumn;
		pkColumn = newPkColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.FOREIGN_KEY_ELEMENT__PK_COLUMN, oldPkColumn, pkColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN:
				if (fkColumn != null)
					msgs = ((InternalEObject)fkColumn).eInverseRemove(this, DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS, Column.class, msgs);
				return basicSetFkColumn((Column)otherEnd, msgs);
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
			case DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN:
				return basicSetFkColumn(null, msgs);
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
			case DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN:
				if (resolve) return getFkColumn();
				return basicGetFkColumn();
			case DatabasePackage.FOREIGN_KEY_ELEMENT__PK_COLUMN:
				if (resolve) return getPkColumn();
				return basicGetPkColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN:
				setFkColumn((Column)newValue);
				return;
			case DatabasePackage.FOREIGN_KEY_ELEMENT__PK_COLUMN:
				setPkColumn((Column)newValue);
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
			case DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN:
				setFkColumn((Column)null);
				return;
			case DatabasePackage.FOREIGN_KEY_ELEMENT__PK_COLUMN:
				setPkColumn((Column)null);
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
			case DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN:
				return fkColumn != null;
			case DatabasePackage.FOREIGN_KEY_ELEMENT__PK_COLUMN:
				return pkColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyElementImpl
