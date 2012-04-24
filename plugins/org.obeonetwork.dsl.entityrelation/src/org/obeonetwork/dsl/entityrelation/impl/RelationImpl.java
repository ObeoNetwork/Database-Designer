/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.entityrelation.Cardinality;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.entityrelation.Relation;
import org.obeonetwork.dsl.entityrelation.RelationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#isSourceIsComposite <em>Source Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#isTargetIsComposite <em>Target Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends NamedElementImpl implements Relation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSource() {
		return (Entity)eGet(EntityRelationPackage.Literals.RELATION__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Entity newSource) {
		eSet(EntityRelationPackage.Literals.RELATION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRole() {
		return (String)eGet(EntityRelationPackage.Literals.RELATION__SOURCE_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRole(String newSourceRole) {
		eSet(EntityRelationPackage.Literals.RELATION__SOURCE_ROLE, newSourceRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getSourceCardinality() {
		return (Cardinality)eGet(EntityRelationPackage.Literals.RELATION__SOURCE_CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCardinality(Cardinality newSourceCardinality) {
		eSet(EntityRelationPackage.Literals.RELATION__SOURCE_CARDINALITY, newSourceCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceIsComposite() {
		return (Boolean)eGet(EntityRelationPackage.Literals.RELATION__SOURCE_IS_COMPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIsComposite(boolean newSourceIsComposite) {
		eSet(EntityRelationPackage.Literals.RELATION__SOURCE_IS_COMPOSITE, newSourceIsComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTarget() {
		return (Entity)eGet(EntityRelationPackage.Literals.RELATION__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Entity newTarget) {
		eSet(EntityRelationPackage.Literals.RELATION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRole() {
		return (String)eGet(EntityRelationPackage.Literals.RELATION__TARGET_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRole(String newTargetRole) {
		eSet(EntityRelationPackage.Literals.RELATION__TARGET_ROLE, newTargetRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getTargetCardinality() {
		return (Cardinality)eGet(EntityRelationPackage.Literals.RELATION__TARGET_CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCardinality(Cardinality newTargetCardinality) {
		eSet(EntityRelationPackage.Literals.RELATION__TARGET_CARDINALITY, newTargetCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetIsComposite() {
		return (Boolean)eGet(EntityRelationPackage.Literals.RELATION__TARGET_IS_COMPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIsComposite(boolean newTargetIsComposite) {
		eSet(EntityRelationPackage.Literals.RELATION__TARGET_IS_COMPOSITE, newTargetIsComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RelationElement> getElements() {
		return (EList<RelationElement>)eGet(EntityRelationPackage.Literals.RELATION__ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return (Identifier)eGet(EntityRelationPackage.Literals.RELATION__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		eSet(EntityRelationPackage.Literals.RELATION__IDENTIFIER, newIdentifier);
	}

} //RelationImpl
