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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.ForeignKeyElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ForeignKeyElementImpl#getFkColumn <em>Fk Column</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ForeignKeyElementImpl#getPkColumn <em>Pk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyElementImpl extends DatabaseElementImpl implements ForeignKeyElement {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.FOREIGN_KEY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getFkColumn() {
		return (Column)eGet(DatabasePackage.Literals.FOREIGN_KEY_ELEMENT__FK_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFkColumn(Column newFkColumn) {
		eSet(DatabasePackage.Literals.FOREIGN_KEY_ELEMENT__FK_COLUMN, newFkColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getPkColumn() {
		return (Column)eGet(DatabasePackage.Literals.FOREIGN_KEY_ELEMENT__PK_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkColumn(Column newPkColumn) {
		eSet(DatabasePackage.Literals.FOREIGN_KEY_ELEMENT__PK_COLUMN, newPkColumn);
	}

} //ForeignKeyElementImpl
