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
public class Shares extends org.jooq.impl.TableImpl<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord> {

	private static final long serialVersionUID = 231299051;

	/**
	 * The reference instance of <code>core.shares</code>
	 */
	public static final com.sonicle.webtop.core.jooq.core.tables.Shares SHARES = new com.sonicle.webtop.core.jooq.core.tables.Shares();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord> getRecordType() {
		return com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord.class;
	}

	/**
	 * The column <code>core.shares.share_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord, java.lang.Integer> SHARE_ID = createField("share_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>core.shares.user_uid</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord, java.lang.String> USER_UID = createField("user_uid", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>core.shares.service_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord, java.lang.String> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>core.shares.key</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>core.shares.instance</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord, java.lang.String> INSTANCE = createField("instance", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>core.shares</code> table reference
	 */
	public Shares() {
		this("shares", null);
	}

	/**
	 * Create an aliased <code>core.shares</code> table reference
	 */
	public Shares(java.lang.String alias) {
		this(alias, com.sonicle.webtop.core.jooq.core.tables.Shares.SHARES);
	}

	private Shares(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Shares(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.core.jooq.core.Core.CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord, java.lang.Integer> getIdentity() {
		return com.sonicle.webtop.core.jooq.core.Keys.IDENTITY_SHARES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord> getPrimaryKey() {
		return com.sonicle.webtop.core.jooq.core.Keys.SHARES_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.SharesRecord>>asList(com.sonicle.webtop.core.jooq.core.Keys.SHARES_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.core.jooq.core.tables.Shares as(java.lang.String alias) {
		return new com.sonicle.webtop.core.jooq.core.tables.Shares(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.core.jooq.core.tables.Shares rename(java.lang.String name) {
		return new com.sonicle.webtop.core.jooq.core.tables.Shares(name, null);
	}
}
