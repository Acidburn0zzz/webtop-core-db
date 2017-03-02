/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.core.jooq.core.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MediaTypes extends org.jooq.impl.TableImpl<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord> {

	private static final long serialVersionUID = 1398443935;

	/**
	 * The reference instance of <code>core.media_types</code>
	 */
	public static final com.sonicle.webtop.core.jooq.core.tables.MediaTypes MEDIA_TYPES = new com.sonicle.webtop.core.jooq.core.tables.MediaTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord> getRecordType() {
		return com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord.class;
	}

	/**
	 * The column <code>core.media_types.extension</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord, java.lang.String> EXTENSION = createField("extension", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>core.media_types.media_type</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord, java.lang.String> MEDIA_TYPE = createField("media_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * Create a <code>core.media_types</code> table reference
	 */
	public MediaTypes() {
		this("media_types", null);
	}

	/**
	 * Create an aliased <code>core.media_types</code> table reference
	 */
	public MediaTypes(java.lang.String alias) {
		this(alias, com.sonicle.webtop.core.jooq.core.tables.MediaTypes.MEDIA_TYPES);
	}

	private MediaTypes(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord> aliased) {
		this(alias, aliased, null);
	}

	private MediaTypes(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.core.jooq.core.Core.CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord> getPrimaryKey() {
		return com.sonicle.webtop.core.jooq.core.Keys.MEDIA_TYPES_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.MediaTypesRecord>>asList(com.sonicle.webtop.core.jooq.core.Keys.MEDIA_TYPES_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.core.jooq.core.tables.MediaTypes as(java.lang.String alias) {
		return new com.sonicle.webtop.core.jooq.core.tables.MediaTypes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.core.jooq.core.tables.MediaTypes rename(java.lang.String name) {
		return new com.sonicle.webtop.core.jooq.core.tables.MediaTypes(name, null);
	}
}
