package org.obeonetwork.dsl.entityrelation.design.services.label;

import org.obeonetwork.dsl.entityrelation.LogicalElement;
import org.obeonetwork.dsl.entityrelation.NamedElement;
import org.obeonetwork.dsl.entityrelation.util.EntityRelationSwitch;

public class EntityRelationEditLabelServices extends EntityRelationSwitch<LogicalElement> {

	private String editedLabelContent;
	
	public LogicalElement editLogicalElementLabel(LogicalElement element, String editedLabelContent) {
		this.editedLabelContent = editedLabelContent;
		return doSwitch(element);
	}

	@Override
	public LogicalElement caseNamedElement(NamedElement object) {
		object.setName(editedLabelContent);
		return object;
	}
	
	
}
