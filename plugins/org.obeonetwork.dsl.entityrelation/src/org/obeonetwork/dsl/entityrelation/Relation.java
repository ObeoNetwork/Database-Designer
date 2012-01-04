/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#isSourceIsComposite <em>Source Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#isTargetIsComposite <em>Target Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Source Cardinality</b></em>' attribute.
	 * The default value is <code>"ZERO_ONE"</code>.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.entityrelation.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cardinality</em>' attribute.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see #setSourceCardinality(Cardinality)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_SourceCardinality()
	 * @model default="ZERO_ONE"
	 * @generated
	 */
	Cardinality getSourceCardinality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Relation#getSourceCardinality <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cardinality</em>' attribute.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see #getSourceCardinality()
	 * @generated
	 */
	void setSourceCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Source Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Is Composite</em>' attribute.
	 * @see #setSourceIsComposite(boolean)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_SourceIsComposite()
	 * @model
	 * @generated
	 */
	boolean isSourceIsComposite();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Relation#isSourceIsComposite <em>Source Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Is Composite</em>' attribute.
	 * @see #isSourceIsComposite()
	 * @generated
	 */
	void setSourceIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The default value is <code>"ZERO_STAR"</code>.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.entityrelation.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see #setTargetCardinality(Cardinality)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_TargetCardinality()
	 * @model default="ZERO_STAR"
	 * @generated
	 */
	Cardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Relation#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Target Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Is Composite</em>' attribute.
	 * @see #setTargetIsComposite(boolean)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_TargetIsComposite()
	 * @model
	 * @generated
	 */
	boolean isTargetIsComposite();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Relation#isTargetIsComposite <em>Target Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Is Composite</em>' attribute.
	 * @see #isTargetIsComposite()
	 * @generated
	 */
	void setTargetIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.RelationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationElement> getElements();

} // Relation
