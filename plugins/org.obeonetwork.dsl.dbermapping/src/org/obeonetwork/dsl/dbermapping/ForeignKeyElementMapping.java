/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.ForeignKeyElement;
import org.obeonetwork.dsl.entityrelation.RelationElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getForeignKeyElement <em>Foreign Key Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getRelationElement <em>Relation Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping()
 * @model
 * @generated
 */
public interface ForeignKeyElementMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreign Key Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Element</em>' reference.
	 * @see #setForeignKeyElement(ForeignKeyElement)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping_ForeignKeyElement()
	 * @model required="true"
	 * @generated
	 */
	ForeignKeyElement getForeignKeyElement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getForeignKeyElement <em>Foreign Key Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Element</em>' reference.
	 * @see #getForeignKeyElement()
	 * @generated
	 */
	void setForeignKeyElement(ForeignKeyElement value);

	/**
	 * Returns the value of the '<em><b>Relation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Element</em>' reference.
	 * @see #setRelationElement(RelationElement)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping_RelationElement()
	 * @model required="true"
	 * @generated
	 */
	RelationElement getRelationElement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getRelationElement <em>Relation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Element</em>' reference.
	 * @see #getRelationElement()
	 * @generated
	 */
	void setRelationElement(RelationElement value);

} // ForeignKeyElementMapping
