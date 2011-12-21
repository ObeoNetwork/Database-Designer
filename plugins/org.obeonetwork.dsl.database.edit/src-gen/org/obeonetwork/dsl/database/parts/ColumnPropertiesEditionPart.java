/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ColumnPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the nullable
	 * 
	 */
	public Boolean getNullable();

	/**
	 * Defines a new nullable
	 * @param newValue the new nullable to set
	 * 
	 */
	public void setNullable(Boolean newValue);


	/**
	 * @return the primary key
	 * 
	 */
	public Boolean getPrimaryKey();

	/**
	 * Defines a new primary key
	 * @param newValue the new primary key to set
	 * 
	 */
	public void setPrimaryKey(Boolean newValue);


	/**
	 * @return the unique
	 * 
	 */
	public Boolean getUnique();

	/**
	 * Defines a new unique
	 * @param newValue the new unique to set
	 * 
	 */
	public void setUnique(Boolean newValue);


	/**
	 * @return the autoincrement
	 * 
	 */
	public Boolean getAutoincrement();

	/**
	 * Defines a new autoincrement
	 * @param newValue the new autoincrement to set
	 * 
	 */
	public void setAutoincrement(Boolean newValue);


	/**
	 * @return the sequence
	 * 
	 */
	public EObject getSequence();

	/**
	 * Init the sequence
	 * @param settings the combo setting
	 */
	public void initSequence(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sequence
	 * @param newValue the new sequence to set
	 * 
	 */
	public void setSequence(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSequenceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sequence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSequence(ViewerFilter filter);

	/**
	 * Adds the given filter to the sequence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSequence(ViewerFilter filter);


	/**
	 * @return the defaultValue
	 * 
	 */
	public String getDefaultValue();

	/**
	 * Defines a new defaultValue
	 * @param newValue the new defaultValue to set
	 * 
	 */
	public void setDefaultValue(String newValue);


	/**
	 * @return the comments
	 * 
	 */
	public String getComments();

	/**
	 * Defines a new comments
	 * @param newValue the new comments to set
	 * 
	 */
	public void setComments(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
