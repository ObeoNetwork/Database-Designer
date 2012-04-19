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
package org.obeonetwork.dsl.typeslibrary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryKind;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.UserDefinedType;
import org.obeonetwork.dsl.typeslibrary.UserDefinedTypesLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Types Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.UserDefinedTypesLibraryImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.UserDefinedTypesLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.UserDefinedTypesLibraryImpl#getUserDefinedTypes <em>User Defined Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDefinedTypesLibraryImpl extends CDOObjectImpl implements UserDefinedTypesLibrary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TypesLibraryKind KIND_EDEFAULT = TypesLibraryKind.LOGICAL_TYPES;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TypesLibraryKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserDefinedTypes() <em>User Defined Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserDefinedType> userDefinedTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedTypesLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesLibraryPackage.Literals.USER_DEFINED_TYPES_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibraryKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TypesLibraryKind newKind) {
		TypesLibraryKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserDefinedType> getUserDefinedTypes() {
		if (userDefinedTypes == null) {
			userDefinedTypes = new EObjectContainmentEList<UserDefinedType>(UserDefinedType.class, this, TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__USER_DEFINED_TYPES);
		}
		return userDefinedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__USER_DEFINED_TYPES:
				return ((InternalEList<?>)getUserDefinedTypes()).basicRemove(otherEnd, msgs);
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
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__KIND:
				return getKind();
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__NAME:
				return getName();
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__USER_DEFINED_TYPES:
				return getUserDefinedTypes();
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
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__KIND:
				setKind((TypesLibraryKind)newValue);
				return;
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__NAME:
				setName((String)newValue);
				return;
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__USER_DEFINED_TYPES:
				getUserDefinedTypes().clear();
				getUserDefinedTypes().addAll((Collection<? extends UserDefinedType>)newValue);
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
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__USER_DEFINED_TYPES:
				getUserDefinedTypes().clear();
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
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__KIND:
				return kind != KIND_EDEFAULT;
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesLibraryPackage.USER_DEFINED_TYPES_LIBRARY__USER_DEFINED_TYPES:
				return userDefinedTypes != null && !userDefinedTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UserDefinedTypesLibraryImpl
