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
public class Causals extends org.jooq.impl.TableImpl<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord> {

	private static final long serialVersionUID = -1522157744;

	/**
	 * The reference instance of <code>core.causals</code>
	 */
	public static final com.sonicle.webtop.core.jooq.core.tables.Causals CAUSALS = new com.sonicle.webtop.core.jooq.core.tables.Causals();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord> getRecordType() {
		return com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord.class;
	}

	/**
	 * The column <code>core.causals.causal_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.Integer> CAUSAL_ID = createField("causal_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>core.causals.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>core.causals.user_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>core.causals.master_data_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.String> MASTER_DATA_ID = createField("master_data_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>core.causals.revision_status</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.String> REVISION_STATUS = createField("revision_status", org.jooq.impl.SQLDataType.VARCHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>core.causals.description</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>core.causals.read_only</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.Boolean> READ_ONLY = createField("read_only", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>core.causals.external_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>core.causals</code> table reference
	 */
	public Causals() {
		this("causals", null);
	}

	/**
	 * Create an aliased <code>core.causals</code> table reference
	 */
	public Causals(java.lang.String alias) {
		this(alias, com.sonicle.webtop.core.jooq.core.tables.Causals.CAUSALS);
	}

	private Causals(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Causals(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.core.jooq.core.Core.CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord, java.lang.Integer> getIdentity() {
		return com.sonicle.webtop.core.jooq.core.Keys.IDENTITY_CAUSALS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord> getPrimaryKey() {
		return com.sonicle.webtop.core.jooq.core.Keys.CAUSALS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord>>asList(com.sonicle.webtop.core.jooq.core.Keys.CAUSALS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.core.jooq.core.tables.Causals as(java.lang.String alias) {
		return new com.sonicle.webtop.core.jooq.core.tables.Causals(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.core.jooq.core.tables.Causals rename(java.lang.String name) {
		return new com.sonicle.webtop.core.jooq.core.tables.Causals(name, null);
	}
}
