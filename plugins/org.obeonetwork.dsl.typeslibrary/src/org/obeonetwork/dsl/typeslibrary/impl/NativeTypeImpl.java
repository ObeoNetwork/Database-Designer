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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.NativeTypeKind;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Native Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.NativeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.NativeTypeImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NativeTypeImpl extends EObjectImpl implements NativeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

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
	 * The default value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected static final NativeTypeKind SPEC_EDEFAULT = NativeTypeKind.SIMPLE;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected NativeTypeKind spec = SPEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesLibraryPackage.Literals.NATIVE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.NATIVE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeTypeKind getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(NativeTypeKind newSpec) {
		NativeTypeKind oldSpec = spec;
		spec = newSpec == null ? SPEC_EDEFAULT : newSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.NATIVE_TYPE__SPEC, oldSpec, spec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesLibraryPackage.NATIVE_TYPE__NAME:
				return getName();
			case TypesLibraryPackage.NATIVE_TYPE__SPEC:
				return getSpec();
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
			case TypesLibraryPackage.NATIVE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesLibraryPackage.NATIVE_TYPE__SPEC:
				setSpec((NativeTypeKind)newValue);
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
			case TypesLibraryPackage.NATIVE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesLibraryPackage.NATIVE_TYPE__SPEC:
				setSpec(SPEC_EDEFAULT);
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
			case TypesLibraryPackage.NATIVE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesLibraryPackage.NATIVE_TYPE__SPEC:
				return spec != SPEC_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", spec: ");
		result.append(spec);
		result.append(')');
		return result.toString();
	}

} //NativeTypeImpl
