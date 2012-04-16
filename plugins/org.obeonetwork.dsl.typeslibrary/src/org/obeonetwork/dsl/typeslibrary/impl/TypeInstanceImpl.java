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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.TypeInstance;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.TypeInstanceImpl#getNativeType <em>Native Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.TypeInstanceImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.TypeInstanceImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.typeslibrary.impl.TypeInstanceImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeInstanceImpl extends TypeImpl implements TypeInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getNativeType() <em>Native Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeType()
	 * @generated
	 * @ordered
	 */
	protected NativeType nativeType;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> literals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesLibraryPackage.Literals.TYPE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeType getNativeType() {
		if (nativeType != null && nativeType.eIsProxy()) {
			InternalEObject oldNativeType = (InternalEObject)nativeType;
			nativeType = (NativeType)eResolveProxy(oldNativeType);
			if (nativeType != oldNativeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesLibraryPackage.TYPE_INSTANCE__NATIVE_TYPE, oldNativeType, nativeType));
			}
		}
		return nativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeType basicGetNativeType() {
		return nativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeType(NativeType newNativeType) {
		NativeType oldNativeType = nativeType;
		nativeType = newNativeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.TYPE_INSTANCE__NATIVE_TYPE, oldNativeType, nativeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.TYPE_INSTANCE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesLibraryPackage.TYPE_INSTANCE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLiterals() {
		if (literals == null) {
			literals = new EDataTypeUniqueEList<String>(String.class, this, TypesLibraryPackage.TYPE_INSTANCE__LITERALS);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesLibraryPackage.TYPE_INSTANCE__NATIVE_TYPE:
				if (resolve) return getNativeType();
				return basicGetNativeType();
			case TypesLibraryPackage.TYPE_INSTANCE__LENGTH:
				return getLength();
			case TypesLibraryPackage.TYPE_INSTANCE__PRECISION:
				return getPrecision();
			case TypesLibraryPackage.TYPE_INSTANCE__LITERALS:
				return getLiterals();
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
			case TypesLibraryPackage.TYPE_INSTANCE__NATIVE_TYPE:
				setNativeType((NativeType)newValue);
				return;
			case TypesLibraryPackage.TYPE_INSTANCE__LENGTH:
				setLength((Integer)newValue);
				return;
			case TypesLibraryPackage.TYPE_INSTANCE__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case TypesLibraryPackage.TYPE_INSTANCE__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends String>)newValue);
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
			case TypesLibraryPackage.TYPE_INSTANCE__NATIVE_TYPE:
				setNativeType((NativeType)null);
				return;
			case TypesLibraryPackage.TYPE_INSTANCE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case TypesLibraryPackage.TYPE_INSTANCE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case TypesLibraryPackage.TYPE_INSTANCE__LITERALS:
				getLiterals().clear();
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
			case TypesLibraryPackage.TYPE_INSTANCE__NATIVE_TYPE:
				return nativeType != null;
			case TypesLibraryPackage.TYPE_INSTANCE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case TypesLibraryPackage.TYPE_INSTANCE__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case TypesLibraryPackage.TYPE_INSTANCE__LITERALS:
				return literals != null && !literals.isEmpty();
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
		result.append(" (length: ");
		result.append(length);
		result.append(", precision: ");
		result.append(precision);
		result.append(", literals: ");
		result.append(literals);
		result.append(')');
		return result.toString();
	}

} //TypeInstanceImpl
