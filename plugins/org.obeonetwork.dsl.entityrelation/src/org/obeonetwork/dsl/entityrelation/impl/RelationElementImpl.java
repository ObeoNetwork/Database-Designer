/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.RelationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationElementImpl#getSourceAttribute <em>Source Attribute</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationElementImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationElementImpl extends LogicalElementImpl implements RelationElement {
	/**
	 * The cached value of the '{@link #getSourceAttribute() <em>Source Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute sourceAttribute;

	/**
	 * The cached value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute targetAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.RELATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSourceAttribute() {
		if (sourceAttribute != null && ((EObject)sourceAttribute).eIsProxy()) {
			InternalEObject oldSourceAttribute = (InternalEObject)sourceAttribute;
			sourceAttribute = (Attribute)eResolveProxy(oldSourceAttribute);
			if (sourceAttribute != oldSourceAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.RELATION_ELEMENT__SOURCE_ATTRIBUTE, oldSourceAttribute, sourceAttribute));
			}
		}
		return sourceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSourceAttribute() {
		return sourceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAttribute(Attribute newSourceAttribute) {
		Attribute oldSourceAttribute = sourceAttribute;
		sourceAttribute = newSourceAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION_ELEMENT__SOURCE_ATTRIBUTE, oldSourceAttribute, sourceAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTargetAttribute() {
		if (targetAttribute != null && ((EObject)targetAttribute).eIsProxy()) {
			InternalEObject oldTargetAttribute = (InternalEObject)targetAttribute;
			targetAttribute = (Attribute)eResolveProxy(oldTargetAttribute);
			if (targetAttribute != oldTargetAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.RELATION_ELEMENT__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
			}
		}
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTargetAttribute() {
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAttribute(Attribute newTargetAttribute) {
		Attribute oldTargetAttribute = targetAttribute;
		targetAttribute = newTargetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION_ELEMENT__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityRelationPackage.RELATION_ELEMENT__SOURCE_ATTRIBUTE:
				if (resolve) return getSourceAttribute();
				return basicGetSourceAttribute();
			case EntityRelationPackage.RELATION_ELEMENT__TARGET_ATTRIBUTE:
				if (resolve) return getTargetAttribute();
				return basicGetTargetAttribute();
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
			case EntityRelationPackage.RELATION_ELEMENT__SOURCE_ATTRIBUTE:
				setSourceAttribute((Attribute)newValue);
				return;
			case EntityRelationPackage.RELATION_ELEMENT__TARGET_ATTRIBUTE:
				setTargetAttribute((Attribute)newValue);
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
			case EntityRelationPackage.RELATION_ELEMENT__SOURCE_ATTRIBUTE:
				setSourceAttribute((Attribute)null);
				return;
			case EntityRelationPackage.RELATION_ELEMENT__TARGET_ATTRIBUTE:
				setTargetAttribute((Attribute)null);
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
			case EntityRelationPackage.RELATION_ELEMENT__SOURCE_ATTRIBUTE:
				return sourceAttribute != null;
			case EntityRelationPackage.RELATION_ELEMENT__TARGET_ATTRIBUTE:
				return targetAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationElementImpl
