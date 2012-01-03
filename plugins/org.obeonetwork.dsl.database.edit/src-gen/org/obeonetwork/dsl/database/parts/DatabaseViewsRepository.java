/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.parts;

/**
 * 
 * 
 */
public class DatabaseViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * DataBase view descriptor
	 * 
	 */
	public static class DataBase_ {
		public static class Properties {
	
			
			public static String name = "database::DataBase_::properties::name";
			
			
			public static String url = "database::DataBase_::properties::url";
			
			
			public static String uses = "database::DataBase_::properties::uses";
			
			
			public static String comments = "database::DataBase_::properties::comments";
			
	
		}
	
	}

	/**
	 * Column view descriptor
	 * 
	 */
	public static class Column {
		public static class Properties {
	
			
			public static String name = "database::Column::properties::name";
			
			
			public static String type = "database::Column::properties::type";
			
				public static class TypeAttributes {
			
					
					public static String length = "database::Column::properties::typeAttributes::length";
					
					
					public static String precision = "database::Column::properties::typeAttributes::precision";
					
			
				}
			
			
			public static String literals = "database::Column::properties::literals";
			
				public static class NullablePkAndUnique {
			
					
					public static String nullable = "database::Column::properties::nullablePkAndUnique::nullable";
					
					
					public static String primaryKey = "database::Column::properties::nullablePkAndUnique::primary key";
					
					
					public static String unique = "database::Column::properties::nullablePkAndUnique::unique";
					
			
				}
			
				public static class Sequence {
			
					
					public static String autoincrement = "database::Column::properties::sequence::autoincrement";
					
					
					public static String sequence_ = "database::Column::properties::sequence::sequence_";
					
			
				}
			
			
			public static String defaultValue = "database::Column::properties::defaultValue";
			
			
			public static String comments = "database::Column::properties::comments";
			
	
		}
	
	}

	/**
	 * Index view descriptor
	 * 
	 */
	public static class Index {
		public static class Properties {
	
			
			public static String name = "database::Index::properties::name";
			
			
			public static String qualifier = "database::Index::properties::qualifier";
			
			
			public static String unique = "database::Index::properties::unique";
			
			
			public static String cardinality = "database::Index::properties::cardinality";
			
			
			public static String indexType = "database::Index::properties::indexType";
			
			
			public static String comments = "database::Index::properties::comments";
			
	
		}
	
	}

	/**
	 * View view descriptor
	 * 
	 */
	public static class View {
		public static class Properties {
	
			
			public static String name = "database::View::properties::name";
			
			
			public static String query = "database::View::properties::query";
			
			
			public static String comments = "database::View::properties::comments";
			
	
		}
	
	}

	/**
	 * Table view descriptor
	 * 
	 */
	public static class Table {
		public static class Properties {
	
			
			public static String name = "database::Table::properties::name";
			
			
			public static String columns = "database::Table::properties::columns";
			
			
			public static String comments = "database::Table::properties::comments";
			
	
		}
	
	}

	/**
	 * PrimaryKey view descriptor
	 * 
	 */
	public static class PrimaryKey {
		public static class Properties {
	
			
			public static String name = "database::PrimaryKey::properties::name";
			
			
			public static String columns = "database::PrimaryKey::properties::columns";
			
			
			public static String comments = "database::PrimaryKey::properties::comments";
			
	
		}
	
	}

	/**
	 * ForeignKey view descriptor
	 * 
	 */
	public static class ForeignKey {
		public static class Properties {
	
			
			public static String name = "database::ForeignKey::properties::name";
			
			
			public static String target = "database::ForeignKey::properties::target";
			
			
			public static String comments = "database::ForeignKey::properties::comments";
			
	
		}
	
	}

	/**
	 * ForeignKeyElement view descriptor
	 * 
	 */
	public static class ForeignKeyElement {
		public static class Properties {
	
				public static class SourceTable {
			
					
					public static String sourceTable_ = "database::ForeignKeyElement::properties::Source Table::Source Table_";
					
					
					public static String fKColumn = "database::ForeignKeyElement::properties::Source Table::FK Column";
					
			
				}
			
				public static class TargetTable {
			
					
					public static String targetTable_ = "database::ForeignKeyElement::properties::Target Table::Target Table_";
					
					
					public static String pKColumn = "database::ForeignKeyElement::properties::Target Table::PK Column";
					
			
				}
			
			
			public static String comments = "database::ForeignKeyElement::properties::comments";
			
	
		}
	
	}

	/**
	 * IndexElement view descriptor
	 * 
	 */
	public static class IndexElement {
		public static class Properties {
	
			
			public static String column = "database::IndexElement::properties::column";
			
			
			public static String asc = "database::IndexElement::properties::asc";
			
			
			public static String comments = "database::IndexElement::properties::comments";
			
	
		}
	
	}

	/**
	 * Constraint view descriptor
	 * 
	 */
	public static class Constraint {
		public static class Properties {
	
			
			public static String name = "database::Constraint::properties::name";
			
			
			public static String expression = "database::Constraint::properties::expression";
			
			
			public static String comments = "database::Constraint::properties::comments";
			
	
		}
	
	}

	/**
	 * Schema view descriptor
	 * 
	 */
	public static class Schema {
		public static class Properties {
	
			
			public static String name = "database::Schema::properties::name";
			
			
			public static String comments = "database::Schema::properties::comments";
			
	
		}
	
	}

	/**
	 * Sequence view descriptor
	 * 
	 */
	public static class Sequence {
		public static class Properties {
	
			
			public static String name = "database::Sequence::properties::name";
			
				public static class StartIncrement {
			
					
					public static String start = "database::Sequence::properties::StartIncrement::start";
					
					
					public static String increment = "database::Sequence::properties::StartIncrement::increment";
					
			
				}
			
				public static class MinMax {
			
					
					public static String minValue = "database::Sequence::properties::MinMax::minValue";
					
					
					public static String maxValue = "database::Sequence::properties::MinMax::maxValue";
					
			
				}
			
			
			public static String comments = "database::Sequence::properties::comments";
			
	
		}
	
	}

}
