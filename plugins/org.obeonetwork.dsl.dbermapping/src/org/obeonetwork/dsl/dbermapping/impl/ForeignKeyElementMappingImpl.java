/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.database.ForeignKeyElement;

import org.obeonetwork.dsl.dbermapping.DbermappingPackage;
import org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping;

import org.obeonetwork.dsl.entityrelation.Join;
import org.obeonetwork.dsl.entityrelation.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl#getForeignKeyElement <em>Foreign Key Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyElementMappingImpl extends EObjectImpl implements ForeignKeyElementMapping {
	/**
	 * The cached value of the '{@link #getForeignKeyElement() <em>Foreign Key Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyElement()
	 * @generated
	 * @ordered
	 */
	protected ForeignKeyElement foreignKeyElement;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected Join join;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbermappingPackage.Literals.FOREIGN_KEY_ELEMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyElement getForeignKeyElement() {
		if (foreignKeyElement != null && foreignKeyElement.eIsProxy()) {
			InternalEObject oldForeignKeyElement = (InternalEObject)foreignKeyElement;
			foreignKeyElement = (ForeignKeyElement)eResolveProxy(oldForeignKeyElement);
			if (foreignKeyElement != oldForeignKeyElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT, oldForeignKeyElement, foreignKeyElement));
			}
		}
		return foreignKeyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyElement basicGetForeignKeyElement() {
		return foreignKeyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyElement(ForeignKeyElement newForeignKeyElement) {
		ForeignKeyElement oldForeignKeyElement = foreignKeyElement;
		foreignKeyElement = newForeignKeyElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT, oldForeignKeyElement, foreignKeyElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getJoin() {
		if (join != null && join.eIsProxy()) {
			InternalEObject oldJoin = (InternalEObject)join;
			join = (Join)eResolveProxy(oldJoin);
			if (join != oldJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__JOIN, oldJoin, join));
			}
		}
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join basicGetJoin() {
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(Join newJoin) {
		Join oldJoin = join;
		join = newJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__JOIN, oldJoin, join));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				if (resolve) return getForeignKeyElement();
				return basicGetForeignKeyElement();
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__JOIN:
				if (resolve) return getJoin();
				return basicGetJoin();
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				setForeignKeyElement((ForeignKeyElement)newValue);
				return;
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__JOIN:
				setJoin((Join)newValue);
				return;
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__ROLE:
				setRole((Role)newValue);
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
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				setForeignKeyElement((ForeignKeyElement)null);
				return;
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__JOIN:
				setJoin((Join)null);
				return;
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__ROLE:
				setRole((Role)null);
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
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				return foreignKeyElement != null;
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__JOIN:
				return join != null;
			case DbermappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyElementMappingImpl
