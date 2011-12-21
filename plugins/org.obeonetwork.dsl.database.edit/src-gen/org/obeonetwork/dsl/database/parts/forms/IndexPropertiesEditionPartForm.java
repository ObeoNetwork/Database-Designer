/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;
import org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart;
import org.obeonetwork.dsl.database.providers.DatabaseMessages;


// End of user code

/**
 * 
 * 
 */
public class IndexPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, IndexPropertiesEditionPart {

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
	public IndexPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.qualifier) {
					return 		createQualifierText(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.unique) {
					return createUniqueCheckbox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.cardinality) {
					return 		createCardinalityText(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.indexType) {
					return 		createIndexTypeText(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Index.Properties.comments) {
					return createCommentsTextarea(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(DatabaseMessages.IndexPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.IndexPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.name, DatabaseViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DatabaseViewsRepository.Index.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.name, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createQualifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.IndexPropertiesEditionPart_QualifierLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.qualifier, DatabaseViewsRepository.FORM_KIND));
		qualifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		qualifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData qualifierData = new GridData(GridData.FILL_HORIZONTAL);
		qualifier.setLayoutData(qualifierData);
		qualifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.qualifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifier.getText()));
			}
		});
		qualifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.qualifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifier.getText()));
				}
			}
		});
		EditingUtils.setID(qualifier, DatabaseViewsRepository.Index.Properties.qualifier);
		EditingUtils.setEEFtype(qualifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.qualifier, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUniqueCheckbox(FormToolkit widgetFactory, Composite parent) {
		unique = widgetFactory.createButton(parent, DatabaseMessages.IndexPropertiesEditionPart_UniqueLabel, SWT.CHECK);
		unique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.unique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(unique.getSelection())));
			}

		});
		GridData uniqueData = new GridData(GridData.FILL_HORIZONTAL);
		uniqueData.horizontalSpan = 2;
		unique.setLayoutData(uniqueData);
		EditingUtils.setID(unique, DatabaseViewsRepository.Index.Properties.unique);
		EditingUtils.setEEFtype(unique, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.unique, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCardinalityText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.IndexPropertiesEditionPart_CardinalityLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.cardinality, DatabaseViewsRepository.FORM_KIND));
		cardinality = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		cardinality.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData cardinalityData = new GridData(GridData.FILL_HORIZONTAL);
		cardinality.setLayoutData(cardinalityData);
		cardinality.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.cardinality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cardinality.getText()));
			}
		});
		cardinality.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.cardinality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cardinality.getText()));
				}
			}
		});
		EditingUtils.setID(cardinality, DatabaseViewsRepository.Index.Properties.cardinality);
		EditingUtils.setEEFtype(cardinality, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.cardinality, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIndexTypeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.IndexPropertiesEditionPart_IndexTypeLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.indexType, DatabaseViewsRepository.FORM_KIND));
		indexType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		indexType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData indexTypeData = new GridData(GridData.FILL_HORIZONTAL);
		indexType.setLayoutData(indexTypeData);
		indexType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.indexType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, indexType.getText()));
			}
		});
		indexType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.indexType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, indexType.getText()));
				}
			}
		});
		EditingUtils.setID(indexType, DatabaseViewsRepository.Index.Properties.indexType);
		EditingUtils.setEEFtype(indexType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.indexType, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentsTextarea(FormToolkit widgetFactory, Composite parent) {
		Label commentsLabel = FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.IndexPropertiesEditionPart_CommentsLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Index.Properties.comments, DatabaseViewsRepository.FORM_KIND));
		GridData commentsLabelData = new GridData(GridData.FILL_HORIZONTAL);
		commentsLabelData.horizontalSpan = 3;
		commentsLabel.setLayoutData(commentsLabelData);
		comments = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IndexPropertiesEditionPartForm.this, DatabaseViewsRepository.Index.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
			}

		});
		EditingUtils.setID(comments, DatabaseViewsRepository.Index.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Index.Properties.comments, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
