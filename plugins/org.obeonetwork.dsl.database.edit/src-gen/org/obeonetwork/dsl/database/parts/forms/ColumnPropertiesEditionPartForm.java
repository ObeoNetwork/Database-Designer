/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.HorizontalBox;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
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
import org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;
import org.obeonetwork.dsl.database.providers.DatabaseMessages;


// End of user code

/**
 * 
 * 
 */
public class ColumnPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ColumnPropertiesEditionPart {

	protected Text name;
	protected Button nullable;
	protected Button primaryKey;
	protected Button unique;
	protected Button autoincrement;
	protected EObjectFlatComboViewer sequence;
	protected Text defaultValue;
	protected Text comments;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ColumnPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence columnStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = columnStep.addStep(DatabaseViewsRepository.Column.Properties.class);
		propertiesStep.addStep(DatabaseViewsRepository.Column.Properties.name);
		CompositionStep nullablePkAndUniqueStep = propertiesStep.addStep(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.class);
		nullablePkAndUniqueStep.addStep(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable);
		nullablePkAndUniqueStep.addStep(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey);
		nullablePkAndUniqueStep.addStep(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique);
		
		CompositionStep sequenceStep = propertiesStep.addStep(DatabaseViewsRepository.Column.Properties.Sequence.class);
		sequenceStep.addStep(DatabaseViewsRepository.Column.Properties.Sequence.autoincrement);
		sequenceStep.addStep(DatabaseViewsRepository.Column.Properties.Sequence.sequence_);
		
		propertiesStep.addStep(DatabaseViewsRepository.Column.Properties.defaultValue);
		propertiesStep.addStep(DatabaseViewsRepository.Column.Properties.comments);
		
		
		composer = new PartComposer(columnStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DatabaseViewsRepository.Column.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.class) {
					return createNullablePkAndUniqueHBox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable) {
					return createNullableCheckbox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey) {
					return createPrimaryKeyCheckbox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique) {
					return createUniqueCheckbox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.Sequence.class) {
					return createSequenceHBox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.Sequence.autoincrement) {
					return createAutoincrementCheckbox(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.Sequence.sequence_) {
					return createSequenceFlatComboViewer(parent, widgetFactory);
				}
				if (key == DatabaseViewsRepository.Column.Properties.defaultValue) {
					return 		createDefaultValueText(widgetFactory, parent);
				}
				if (key == DatabaseViewsRepository.Column.Properties.comments) {
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
		propertiesSection.setText(DatabaseMessages.ColumnPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.ColumnPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Column.Properties.name, DatabaseViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DatabaseViewsRepository.Column.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.name, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createNullablePkAndUniqueHBox(FormToolkit widgetFactory, Composite parent) {
		Composite container = widgetFactory.createComposite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan=3;
		container.setLayoutData(gridData);
		HorizontalBox nullablePkAndUniqueHBox = new HorizontalBox(container);
		//Apply constraint for checkbox
		GridData constraint = new GridData(GridData.FILL_HORIZONTAL);
		constraint.horizontalAlignment = GridData.BEGINNING;
		nullablePkAndUniqueHBox.setLayoutData(constraint);
		widgetFactory.adapt(nullablePkAndUniqueHBox);
		return nullablePkAndUniqueHBox;
	}

	
	protected Composite createNullableCheckbox(FormToolkit widgetFactory, Composite parent) {
		nullable = widgetFactory.createButton(parent, DatabaseMessages.ColumnPropertiesEditionPart_NullableLabel, SWT.CHECK);
		nullable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(nullable.getSelection())));
			}

		});
		GridData nullableData = new GridData(GridData.FILL_HORIZONTAL);
		nullableData.horizontalSpan = 2;
		nullable.setLayoutData(nullableData);
		EditingUtils.setID(nullable, DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable);
		EditingUtils.setEEFtype(nullable, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPrimaryKeyCheckbox(FormToolkit widgetFactory, Composite parent) {
		primaryKey = widgetFactory.createButton(parent, DatabaseMessages.ColumnPropertiesEditionPart_PrimaryKeyLabel, SWT.CHECK);
		primaryKey.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(primaryKey.getSelection())));
			}

		});
		GridData primaryKeyData = new GridData(GridData.FILL_HORIZONTAL);
		primaryKeyData.horizontalSpan = 2;
		primaryKey.setLayoutData(primaryKeyData);
		EditingUtils.setID(primaryKey, DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey);
		EditingUtils.setEEFtype(primaryKey, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUniqueCheckbox(FormToolkit widgetFactory, Composite parent) {
		unique = widgetFactory.createButton(parent, DatabaseMessages.ColumnPropertiesEditionPart_UniqueLabel, SWT.CHECK);
		unique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(unique.getSelection())));
			}

		});
		GridData uniqueData = new GridData(GridData.FILL_HORIZONTAL);
		uniqueData.horizontalSpan = 2;
		unique.setLayoutData(uniqueData);
		EditingUtils.setID(unique, DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique);
		EditingUtils.setEEFtype(unique, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSequenceHBox(FormToolkit widgetFactory, Composite parent) {
		Composite container = widgetFactory.createComposite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan=3;
		container.setLayoutData(gridData);
		HorizontalBox sequenceHBox = new HorizontalBox(container);
		//Apply constraint for checkbox
		GridData constraint = new GridData(GridData.FILL_HORIZONTAL);
		constraint.horizontalAlignment = GridData.BEGINNING;
		sequenceHBox.setLayoutData(constraint);
		widgetFactory.adapt(sequenceHBox);
		return sequenceHBox;
	}

	
	protected Composite createAutoincrementCheckbox(FormToolkit widgetFactory, Composite parent) {
		autoincrement = widgetFactory.createButton(parent, DatabaseMessages.ColumnPropertiesEditionPart_AutoincrementLabel, SWT.CHECK);
		autoincrement.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.Sequence.autoincrement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(autoincrement.getSelection())));
			}

		});
		GridData autoincrementData = new GridData(GridData.FILL_HORIZONTAL);
		autoincrementData.horizontalSpan = 2;
		autoincrement.setLayoutData(autoincrementData);
		EditingUtils.setID(autoincrement, DatabaseViewsRepository.Column.Properties.Sequence.autoincrement);
		EditingUtils.setEEFtype(autoincrement, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.Sequence.autoincrement, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSequenceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.ColumnPropertiesEditionPart_SequenceLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Column.Properties.Sequence.sequence_, DatabaseViewsRepository.FORM_KIND));
		sequence = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DatabaseViewsRepository.Column.Properties.Sequence.sequence_, DatabaseViewsRepository.FORM_KIND));
		widgetFactory.adapt(sequence);
		sequence.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sequenceData = new GridData(GridData.FILL_HORIZONTAL);
		sequence.setLayoutData(sequenceData);
		sequence.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.Sequence.sequence_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSequence()));
			}

		});
		sequence.setID(DatabaseViewsRepository.Column.Properties.Sequence.sequence_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.Sequence.sequence_, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDefaultValueText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.ColumnPropertiesEditionPart_DefaultValueLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Column.Properties.defaultValue, DatabaseViewsRepository.FORM_KIND));
		defaultValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		defaultValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData defaultValueData = new GridData(GridData.FILL_HORIZONTAL);
		defaultValue.setLayoutData(defaultValueData);
		defaultValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.defaultValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defaultValue.getText()));
			}
		});
		defaultValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.defaultValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defaultValue.getText()));
				}
			}
		});
		EditingUtils.setID(defaultValue, DatabaseViewsRepository.Column.Properties.defaultValue);
		EditingUtils.setEEFtype(defaultValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.defaultValue, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentsTextarea(FormToolkit widgetFactory, Composite parent) {
		Label commentsLabel = FormUtils.createPartLabel(widgetFactory, parent, DatabaseMessages.ColumnPropertiesEditionPart_CommentsLabel, propertiesEditionComponent.isRequired(DatabaseViewsRepository.Column.Properties.comments, DatabaseViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ColumnPropertiesEditionPartForm.this, DatabaseViewsRepository.Column.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
			}

		});
		EditingUtils.setID(comments, DatabaseViewsRepository.Column.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DatabaseViewsRepository.Column.Properties.comments, DatabaseViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getNullable()
	 * 
	 */
	public Boolean getNullable() {
		return Boolean.valueOf(nullable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setNullable(Boolean newValue)
	 * 
	 */
	public void setNullable(Boolean newValue) {
		if (newValue != null) {
			nullable.setSelection(newValue.booleanValue());
		} else {
			nullable.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getPrimaryKey()
	 * 
	 */
	public Boolean getPrimaryKey() {
		return Boolean.valueOf(primaryKey.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setPrimaryKey(Boolean newValue)
	 * 
	 */
	public void setPrimaryKey(Boolean newValue) {
		if (newValue != null) {
			primaryKey.setSelection(newValue.booleanValue());
		} else {
			primaryKey.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getUnique()
	 * 
	 */
	public Boolean getUnique() {
		return Boolean.valueOf(unique.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setUnique(Boolean newValue)
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
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getAutoincrement()
	 * 
	 */
	public Boolean getAutoincrement() {
		return Boolean.valueOf(autoincrement.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setAutoincrement(Boolean newValue)
	 * 
	 */
	public void setAutoincrement(Boolean newValue) {
		if (newValue != null) {
			autoincrement.setSelection(newValue.booleanValue());
		} else {
			autoincrement.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getSequence()
	 * 
	 */
	public EObject getSequence() {
		if (sequence.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sequence.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#initSequence(EObjectFlatComboSettings)
	 */
	public void initSequence(EObjectFlatComboSettings settings) {
		sequence.setInput(settings);
		if (current != null) {
			sequence.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setSequence(EObject newValue)
	 * 
	 */
	public void setSequence(EObject newValue) {
		if (newValue != null) {
			sequence.setSelection(new StructuredSelection(newValue));
		} else {
			sequence.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setSequenceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSequenceButtonMode(ButtonsModeEnum newValue) {
		sequence.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#addFilterSequence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSequence(ViewerFilter filter) {
		sequence.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#addBusinessFilterSequence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSequence(ViewerFilter filter) {
		sequence.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getDefaultValue()
	 * 
	 */
	public String getDefaultValue() {
		return defaultValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setDefaultValue(String newValue)
	 * 
	 */
	public void setDefaultValue(String newValue) {
		if (newValue != null) {
			defaultValue.setText(newValue);
		} else {
			defaultValue.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart#setComments(String newValue)
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
		return DatabaseMessages.Column_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
