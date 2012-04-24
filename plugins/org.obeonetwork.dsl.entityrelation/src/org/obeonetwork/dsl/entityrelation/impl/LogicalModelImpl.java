/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.LogicalModel;
import org.obeonetwork.dsl.entityrelation.Relation;
import org.obeonetwork.dsl.typeslibrary.TypesLibrary;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryUser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalModelImpl extends NamedElementImpl implements LogicalModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.LOGICAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypesLibrary> getUsedLibraries() {
		return (EList<TypesLibrary>)eGet(TypesLibraryPackage.Literals.TYPES_LIBRARY_USER__USED_LIBRARIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getEntities() {
		return (EList<Entity>)eGet(EntityRelationPackage.Literals.LOGICAL_MODEL__ENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eGet(EntityRelationPackage.Literals.LOGICAL_MODEL__RELATIONS, true);
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
				case EntityRelationPackage.LOGICAL_MODEL__USED_LIBRARIES: return TypesLibraryPackage.TYPES_LIBRARY_USER__USED_LIBRARIES;
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
				case TypesLibraryPackage.TYPES_LIBRARY_USER__USED_LIBRARIES: return EntityRelationPackage.LOGICAL_MODEL__USED_LIBRARIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LogicalModelImpl
