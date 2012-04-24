/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationFactory;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.typeslibrary.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#getUsedInIdentifier <em>Used In Identifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#isInPrimaryIdentifier <em>In Primary Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getOwner() {
		return (Entity)eGet(EntityRelationPackage.Literals.ATTRIBUTE__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Entity newOwner) {
		eSet(EntityRelationPackage.Literals.ATTRIBUTE__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(EntityRelationPackage.Literals.ATTRIBUTE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(EntityRelationPackage.Literals.ATTRIBUTE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eGet(EntityRelationPackage.Literals.ATTRIBUTE__REQUIRED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eSet(EntityRelationPackage.Literals.ATTRIBUTE__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getUsedInIdentifier() {
		return (Identifier)eGet(EntityRelationPackage.Literals.ATTRIBUTE__USED_IN_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedInIdentifier(Identifier newUsedInIdentifier) {
		eSet(EntityRelationPackage.Literals.ATTRIBUTE__USED_IN_IDENTIFIER, newUsedInIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInPrimaryIdentifier() {
		if (getOwner() != null) {
			Identifier primaryIdentifier = getOwner().getPrimaryIdentifier();
			if (primaryIdentifier != null) {
				return primaryIdentifier.getAttributes().contains(this);
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addToPrimaryIdentifier() {
		// Do nothing if the attribute is already in the primary identifier or if it does not belong to a table
		if (isInPrimaryIdentifier() == false
				&& getOwner() != null) {
			Entity entity = getOwner();
			// First, ensure there is a primary identifier defined on this entity
			Identifier primaryIdentifier = entity.getPrimaryIdentifier();
			if (primaryIdentifier == null) {
				// Create a primary identifier
				primaryIdentifier = EntityRelationFactory.eINSTANCE.createIdentifier();
				primaryIdentifier.setName(entity.getName() + "_ID");
				entity.getIdentifiers().add(primaryIdentifier);
				entity.setPrimaryIdentifier(primaryIdentifier);
			}
			
			// Then attach the attribute to the primary identifier
			primaryIdentifier.getAttributes().add(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFromPrimaryIdentifier() {
		if (isInPrimaryIdentifier() == true) {
			getOwner().getPrimaryIdentifier().getAttributes().remove(this);
		}
	}

} //AttributeImpl
