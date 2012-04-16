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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.Index;
import org.obeonetwork.dsl.database.IndexElement;
import org.obeonetwork.dsl.database.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.impl.IndexImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.IndexImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.IndexImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.IndexImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.IndexImpl#getIndexType <em>Index Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.IndexImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends NamedElementImpl implements Index {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexElement> elements;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexType() <em>Index Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexType()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexType() <em>Index Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexType()
	 * @generated
	 * @ordered
	 */
	protected String indexType = INDEX_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.INDEX__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<IndexElement>(IndexElement.class, this, DatabasePackage.INDEX__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.INDEX__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.INDEX__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexType() {
		return indexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexType(String newIndexType) {
		String oldIndexType = indexType;
		indexType = newIndexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.INDEX__INDEX_TYPE, oldIndexType, indexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwner() {
		if (eContainerFeatureID() != DatabasePackage.INDEX__OWNER) return null;
		return (Table)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Table newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, DatabasePackage.INDEX__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Table newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != DatabasePackage.INDEX__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, DatabasePackage.TABLE__INDEXES, Table.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.INDEX__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.INDEX__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Table)otherEnd, msgs);
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
			case DatabasePackage.INDEX__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case DatabasePackage.INDEX__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatabasePackage.INDEX__OWNER:
				return eInternalContainer().eInverseRemove(this, DatabasePackage.TABLE__INDEXES, Table.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.INDEX__QUALIFIER:
				return getQualifier();
			case DatabasePackage.INDEX__ELEMENTS:
				return getElements();
			case DatabasePackage.INDEX__UNIQUE:
				return isUnique();
			case DatabasePackage.INDEX__CARDINALITY:
				return getCardinality();
			case DatabasePackage.INDEX__INDEX_TYPE:
				return getIndexType();
			case DatabasePackage.INDEX__OWNER:
				return getOwner();
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
			case DatabasePackage.INDEX__QUALIFIER:
				setQualifier((String)newValue);
				return;
			case DatabasePackage.INDEX__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends IndexElement>)newValue);
				return;
			case DatabasePackage.INDEX__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case DatabasePackage.INDEX__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case DatabasePackage.INDEX__INDEX_TYPE:
				setIndexType((String)newValue);
				return;
			case DatabasePackage.INDEX__OWNER:
				setOwner((Table)newValue);
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
			case DatabasePackage.INDEX__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case DatabasePackage.INDEX__ELEMENTS:
				getElements().clear();
				return;
			case DatabasePackage.INDEX__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case DatabasePackage.INDEX__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case DatabasePackage.INDEX__INDEX_TYPE:
				setIndexType(INDEX_TYPE_EDEFAULT);
				return;
			case DatabasePackage.INDEX__OWNER:
				setOwner((Table)null);
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
			case DatabasePackage.INDEX__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
			case DatabasePackage.INDEX__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case DatabasePackage.INDEX__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case DatabasePackage.INDEX__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case DatabasePackage.INDEX__INDEX_TYPE:
				return INDEX_TYPE_EDEFAULT == null ? indexType != null : !INDEX_TYPE_EDEFAULT.equals(indexType);
			case DatabasePackage.INDEX__OWNER:
				return getOwner() != null;
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
		result.append(" (qualifier: ");
		result.append(qualifier);
		result.append(", unique: ");
		result.append(unique);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", indexType: ");
		result.append(indexType);
		result.append(')');
		return result.toString();
	}

} //IndexImpl
