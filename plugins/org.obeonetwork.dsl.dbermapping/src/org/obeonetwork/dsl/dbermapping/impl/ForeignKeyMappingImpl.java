/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping.impl;

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
import org.obeonetwork.dsl.database.ForeignKey;
import org.obeonetwork.dsl.dbermapping.DBERMappingPackage;
import org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping;
import org.obeonetwork.dsl.dbermapping.ForeignKeyMapping;
import org.obeonetwork.dsl.entityrelation.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl#getForeignKeyElementMappings <em>Foreign Key Element Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyMappingImpl extends EObjectImpl implements ForeignKeyMapping {
	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected ForeignKey foreignKey;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation relation;

	/**
	 * The cached value of the '{@link #getForeignKeyElementMappings() <em>Foreign Key Element Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyElementMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKeyElementMapping> foreignKeyElementMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DBERMappingPackage.Literals.FOREIGN_KEY_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey getForeignKey() {
		if (foreignKey != null && foreignKey.eIsProxy()) {
			InternalEObject oldForeignKey = (InternalEObject)foreignKey;
			foreignKey = (ForeignKey)eResolveProxy(oldForeignKey);
			if (foreignKey != oldForeignKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY, oldForeignKey, foreignKey));
			}
		}
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey basicGetForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(ForeignKey newForeignKey) {
		ForeignKey oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (Relation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DBERMappingPackage.FOREIGN_KEY_MAPPING__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(Relation newRelation) {
		Relation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBERMappingPackage.FOREIGN_KEY_MAPPING__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKeyElementMapping> getForeignKeyElementMappings() {
		if (foreignKeyElementMappings == null) {
			foreignKeyElementMappings = new EObjectContainmentEList<ForeignKeyElementMapping>(ForeignKeyElementMapping.class, this, DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS);
		}
		return foreignKeyElementMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS:
				return ((InternalEList<?>)getForeignKeyElementMappings()).basicRemove(otherEnd, msgs);
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
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY:
				if (resolve) return getForeignKey();
				return basicGetForeignKey();
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS:
				return getForeignKeyElementMappings();
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
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY:
				setForeignKey((ForeignKey)newValue);
				return;
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__RELATION:
				setRelation((Relation)newValue);
				return;
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS:
				getForeignKeyElementMappings().clear();
				getForeignKeyElementMappings().addAll((Collection<? extends ForeignKeyElementMapping>)newValue);
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
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY:
				setForeignKey((ForeignKey)null);
				return;
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__RELATION:
				setRelation((Relation)null);
				return;
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS:
				getForeignKeyElementMappings().clear();
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
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY:
				return foreignKey != null;
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__RELATION:
				return relation != null;
			case DBERMappingPackage.FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS:
				return foreignKeyElementMappings != null && !foreignKeyElementMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyMappingImpl
