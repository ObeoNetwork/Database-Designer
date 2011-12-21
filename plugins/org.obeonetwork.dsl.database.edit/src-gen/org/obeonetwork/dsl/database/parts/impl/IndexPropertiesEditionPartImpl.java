/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;
import org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart;
import org.obeonetwork.dsl.database.providers.DatabaseMessages;


// End of user code

/**
 * 
 * 
 */
public class IndexPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, IndexPropertiesEditionPart {

	protected Text name;
	protected Text qualifier;
	protected Button unique;
	protected Text cardinality;
	protected Text indexType;
	protected Text comments;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IndexPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence indexStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = indexStep.addStep(DatabaseViewsRepository.Index.Properties.class);
		propertiesStep.addStep(DatabaseViewsRepository.Index.Properties.name);
		propertiesStep.addStep(DatabaseViewsRepository.Index.Properties.qualifier);
		propertiesStep.addStep(DatabaseViewsRepository.Index.Properties.unique);
		propertiesStep.addStep(DatabaseViewsRepository.Index.Properties.cardinality);
		propertiesStep.addStep(DatabaseViewsRepository.Index.Properties.indexType);
		propertiesStep.addStep(DatabaseViewsRepository.Index.Properties.comments);
		
		
		composer = new PartComposer(indexStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DatabaseViewsRepository.Index.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.name) {
					return createNameText(parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.qualifier) {
					return createQualifierText(parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.unique) {
					return createUniqueCheckbox(parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.cardinality) {
					return createCardinalityText(parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.indexType) {
					return createIndexTypeText(parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.comments) {
					return createCommentsTextarea(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(DatabaseMessages.IndexPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DatabaseMessages.IndexPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.name, DatabaseViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DatabaseViewsRepository.Index.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.name, DatabaseViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createQualifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, DatabaseMessages.IndexPropertiesEditionPart_QualifierLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.qualifier, DatabaseViewsRepository.SWT_KIND));
		qualifier = new Text(parent, SWT.BORDER);
		GridData qualifierData = new GridData(GridData.FILL_HORIZONTAL);
		qualifier.setLayoutData(qualifierData);
		qualifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.qualifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifier.getText()));
			}

		});
		qualifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.qualifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifier.getText()));
				}
			}

		});
		EditingUtils.setID(qualifier, DatabaseViewsRepository.Index.Properties.qualifier);
		EditingUtils.setEEFtype(qualifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.qualifier, DatabaseViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUniqueCheckbox(Composite parent) {
		unique = new Button(parent, SWT.CHECK);
		unique.setText(DatabaseMessages.IndexPropertiesEditionPart_UniqueLabel);
		unique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.unique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(unique.getSelection())));
			}

		});
		GridData uniqueData = new GridData(GridData.FILL_HORIZONTAL);
		uniqueData.horizontalSpan = 2;
		unique.setLayoutData(uniqueData);
		EditingUtils.setID(unique, DatabaseViewsRepository.Index.Properties.unique);
		EditingUtils.setEEFtype(unique, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.unique, DatabaseViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCardinalityText(Composite parent) {
		SWTUtils.createPartLabel(parent, DatabaseMessages.IndexPropertiesEditionPart_CardinalityLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.cardinality, DatabaseViewsRepository.SWT_KIND));
		cardinality = new Text(parent, SWT.BORDER);
		GridData cardinalityData = new GridData(GridData.FILL_HORIZONTAL);
		cardinality.setLayoutData(cardinalityData);
		cardinality.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.cardinality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cardinality.getText()));
			}

		});
		cardinality.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.cardinality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cardinality.getText()));
				}
			}

		});
		EditingUtils.setID(cardinality, DatabaseViewsRepository.Index.Properties.cardinality);
		EditingUtils.setEEFtype(cardinality, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.cardinality, DatabaseViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIndexTypeText(Composite parent) {
		SWTUtils.createPartLabel(parent, DatabaseMessages.IndexPropertiesEditionPart_IndexTypeLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.indexType, DatabaseViewsRepository.SWT_KIND));
		indexType = new Text(parent, SWT.BORDER);
		GridData indexTypeData = new GridData(GridData.FILL_HORIZONTAL);
		indexType.setLayoutData(indexTypeData);
		indexType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.indexType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, indexType.getText()));
			}

		});
		indexType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.indexType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, indexType.getText()));
				}
			}

		});
		EditingUtils.setID(indexType, DatabaseViewsRepository.Index.Properties.indexType);
		EditingUtils.setEEFtype(indexType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.indexType, DatabaseViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentsTextarea(Composite parent) {
		Label commentsLabel = SWTUtils.createPartLabel(parent, DatabaseMessages.IndexPropertiesEditionPart_CommentsLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.comments, DatabaseViewsRepository.SWT_KIND));
		GridData commentsLabelData = new GridData(GridData.FILL_HORIZONTAL);
		commentsLabelData.horizontalSpan = 3;
		commentsLabel.setLayoutData(commentsLabelData);
		comments = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData commentsData = new GridData(GridData.FILL_HORIZONTAL);
		commentsData.horizontalSpan = 2;
		commentsData.heightHint = 80;
		commentsData.widthHint = 200;
		comments.setLayoutData(commentsData);
		comments.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartImpl.this, DatabaseViewsRepository.Index.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
			}

		});
		EditingUtils.setID(comments, DatabaseViewsRepository.Index.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.comments, DatabaseViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#getQualifier()
	 * 
	 */
	public String getQualifier() {
		return qualifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#setQualifier(String newValue)
	 * 
	 */
	public void setQualifier(String newValue) {
		if (newValue != null) {
			qualifier.setText(newValue);
		} else {
			qualifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#getUnique()
	 * 
	 */
	public Boolean getUnique() {
		return Boolean.valueOf(unique.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#setUnique(Boolean newValue)
	 * 
	 */
	public void setUnique(Boolean newValue) {
		if (newValue != null) {
			unique.setSelection(newValue.booleanValue());
		} else {
			unique.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#getCardinality()
	 * 
	 */
	public String getCardinality() {
		return cardinality.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#setCardinality(String newValue)
	 * 
	 */
	public void setCardinality(String newValue) {
		if (newValue != null) {
			cardinality.setText(newValue);
		} else {
			cardinality.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#getIndexType()
	 * 
	 */
	public String getIndexType() {
		return indexType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#setIndexType(String newValue)
	 * 
	 */
	public void setIndexType(String newValue) {
		if (newValue != null) {
			indexType.setText(newValue);
		} else {
			indexType.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart#setComments(String newValue)
	 * 
	 */
	public void setComments(String newValue) {
		if (newValue != null) {
			comments.setText(newValue);
		} else {
			comments.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DatabaseMessages.Index_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
