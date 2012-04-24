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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.database.DataBase;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.Schema;
import org.obeonetwork.dsl.typeslibrary.TypesLibrary;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryUser;
import org.obeonetwork.dsl.typeslibrary.UserDefinedTypesLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.impl.DataBaseImpl#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.DataBaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.DataBaseImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.DataBaseImpl#getDefines <em>Defines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBaseImpl extends TableContainerImpl implements DataBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.DATA_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypesLibrary> getUsedLibraries() {
		EList<TypesLibrary> usedLibraries = (EList<TypesLibrary>)eVirtualGet(DatabasePackage.DATA_BASE__USED_LIBRARIES);
		if (usedLibraries == null) {
			eVirtualSet(DatabasePackage.DATA_BASE__USED_LIBRARIES, usedLibraries = new EObjectResolvingEList<TypesLibrary>(TypesLibrary.class, this, DatabasePackage.DATA_BASE__USED_LIBRARIES));
		}
		return usedLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eVirtualGet(DatabasePackage.DATA_BASE__URL, URL_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String url = newUrl;
		Object oldUrl = eVirtualSet(DatabasePackage.DATA_BASE__URL, url);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATA_BASE__URL, oldUrl == EVIRTUAL_NO_VALUE ? URL_EDEFAULT : oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Schema> getSchemas() {
		EList<Schema> schemas = (EList<Schema>)eVirtualGet(DatabasePackage.DATA_BASE__SCHEMAS);
		if (schemas == null) {
			eVirtualSet(DatabasePackage.DATA_BASE__SCHEMAS, schemas = new EObjectContainmentEList<Schema>(Schema.class, this, DatabasePackage.DATA_BASE__SCHEMAS));
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserDefinedTypesLibrary> getDefines() {
		EList<UserDefinedTypesLibrary> defines = (EList<UserDefinedTypesLibrary>)eVirtualGet(DatabasePackage.DATA_BASE__DEFINES);
		if (defines == null) {
			eVirtualSet(DatabasePackage.DATA_BASE__DEFINES, defines = new EObjectContainmentEList<UserDefinedTypesLibrary>(UserDefinedTypesLibrary.class, this, DatabasePackage.DATA_BASE__DEFINES));
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.DATA_BASE__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
			case DatabasePackage.DATA_BASE__DEFINES:
				return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
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
			case DatabasePackage.DATA_BASE__USED_LIBRARIES:
				return getUsedLibraries();
			case DatabasePackage.DATA_BASE__URL:
				return getUrl();
			case DatabasePackage.DATA_BASE__SCHEMAS:
				return getSchemas();
			case DatabasePackage.DATA_BASE__DEFINES:
				return getDefines();
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
			case DatabasePackage.DATA_BASE__USED_LIBRARIES:
				getUsedLibraries().clear();
				getUsedLibraries().addAll((Collection<? extends TypesLibrary>)newValue);
				return;
			case DatabasePackage.DATA_BASE__URL:
				setUrl((String)newValue);
				return;
			case DatabasePackage.DATA_BASE__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends Schema>)newValue);
				return;
			case DatabasePackage.DATA_BASE__DEFINES:
				getDefines().clear();
				getDefines().addAll((Collection<? extends UserDefinedTypesLibrary>)newValue);
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
			case DatabasePackage.DATA_BASE__USED_LIBRARIES:
				getUsedLibraries().clear();
				return;
			case DatabasePackage.DATA_BASE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DatabasePackage.DATA_BASE__SCHEMAS:
				getSchemas().clear();
				return;
			case DatabasePackage.DATA_BASE__DEFINES:
				getDefines().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabasePackage.DATA_BASE__USED_LIBRARIES:
				EList<TypesLibrary> usedLibraries = (EList<TypesLibrary>)eVirtualGet(DatabasePackage.DATA_BASE__USED_LIBRARIES);
				return usedLibraries != null && !usedLibraries.isEmpty();
			case DatabasePackage.DATA_BASE__URL:
				String url = (String)eVirtualGet(DatabasePackage.DATA_BASE__URL, URL_EDEFAULT);
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DatabasePackage.DATA_BASE__SCHEMAS:
				EList<Schema> schemas = (EList<Schema>)eVirtualGet(DatabasePackage.DATA_BASE__SCHEMAS);
				return schemas != null && !schemas.isEmpty();
			case DatabasePackage.DATA_BASE__DEFINES:
				EList<UserDefinedTypesLibrary> defines = (EList<UserDefinedTypesLibrary>)eVirtualGet(DatabasePackage.DATA_BASE__DEFINES);
				return defines != null && !defines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypesLibraryUser.class) {
			switch (derivedFeatureID) {
				case DatabasePackage.DATA_BASE__USED_LIBRARIES: return TypesLibraryPackage.TYPES_LIBRARY_USER__USED_LIBRARIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypesLibraryUser.class) {
			switch (baseFeatureID) {
				case TypesLibraryPackage.TYPES_LIBRARY_USER__USED_LIBRARIES: return DatabasePackage.DATA_BASE__USED_LIBRARIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (url: ");
		result.append(eVirtualGet(DatabasePackage.DATA_BASE__URL, URL_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //DataBaseImpl
