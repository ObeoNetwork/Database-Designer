/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.EntityImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.EntityImpl#getPrimaryIdentifier <em>Primary Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getPrimaryIdentifier() <em>Primary Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier primaryIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, EntityRelationPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, EntityRelationPackage.ENTITY__IDENTIFIERS);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPrimaryIdentifier() {
		if (primaryIdentifier != null && primaryIdentifier.eIsProxy()) {
			InternalEObject oldPrimaryIdentifier = (InternalEObject)primaryIdentifier;
			primaryIdentifier = (Identifier)eResolveProxy(oldPrimaryIdentifier);
			if (primaryIdentifier != oldPrimaryIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.ENTITY__PRIMARY_IDENTIFIER, oldPrimaryIdentifier, primaryIdentifier));
			}
		}
		return primaryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetPrimaryIdentifier() {
		return primaryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryIdentifier(Identifier newPrimaryIdentifier) {
		Identifier oldPrimaryIdentifier = primaryIdentifier;
		primaryIdentifier = newPrimaryIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.ENTITY__PRIMARY_IDENTIFIER, oldPrimaryIdentifier, primaryIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case EntityRelationPackage.ENTITY__IDENTIFIERS:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
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
			case EntityRelationPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case EntityRelationPackage.ENTITY__IDENTIFIERS:
				return getIdentifiers();
			case EntityRelationPackage.ENTITY__PRIMARY_IDENTIFIER:
				if (resolve) return getPrimaryIdentifier();
				return basicGetPrimaryIdentifier();
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
			case EntityRelationPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntityRelationPackage.ENTITY__IDENTIFIERS:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case EntityRelationPackage.ENTITY__PRIMARY_IDENTIFIER:
				setPrimaryIdentifier((Identifier)newValue);
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
			case EntityRelationPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EntityRelationPackage.ENTITY__IDENTIFIERS:
				getIdentifiers().clear();
				return;
			case EntityRelationPackage.ENTITY__PRIMARY_IDENTIFIER:
				setPrimaryIdentifier((Identifier)null);
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
			case EntityRelationPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EntityRelationPackage.ENTITY__IDENTIFIERS:
				return identifiers != null && !identifiers.isEmpty();
			case EntityRelationPackage.ENTITY__PRIMARY_IDENTIFIER:
				return primaryIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
