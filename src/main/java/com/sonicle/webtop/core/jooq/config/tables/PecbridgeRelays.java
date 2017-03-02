/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.core.jooq.config.tables;

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
public class PecbridgeRelays extends org.jooq.impl.TableImpl<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord> {

	private static final long serialVersionUID = 1907714665;

	/**
	 * The reference instance of <code>config.pecbridge_relays</code>
	 */
	public static final com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays PECBRIDGE_RELAYS = new com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord> getRecordType() {
		return com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord.class;
	}

	/**
	 * The column <code>config.pecbridge_relays.relay_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.Integer> RELAY_ID = createField("relay_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>config.pecbridge_relays.context</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> CONTEXT = createField("context", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>config.pecbridge_relays.matcher</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> MATCHER = createField("matcher", org.jooq.impl.SQLDataType.VARCHAR.length(320), this, "");

	/**
	 * The column <code>config.pecbridge_relays.host</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>config.pecbridge_relays.port</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.Short> PORT = createField("port", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>config.pecbridge_relays.protocol</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>config.pecbridge_relays.username</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>config.pecbridge_relays.password</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>config.pecbridge_relays.debug</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.Boolean> DEBUG = createField("debug", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>config.pecbridge_relays.webtop_profile_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.String> WEBTOP_PROFILE_ID = createField("webtop_profile_id", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * Create a <code>config.pecbridge_relays</code> table reference
	 */
	public PecbridgeRelays() {
		this("pecbridge_relays", null);
	}

	/**
	 * Create an aliased <code>config.pecbridge_relays</code> table reference
	 */
	public PecbridgeRelays(java.lang.String alias) {
		this(alias, com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays.PECBRIDGE_RELAYS);
	}

	private PecbridgeRelays(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord> aliased) {
		this(alias, aliased, null);
	}

	private PecbridgeRelays(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.core.jooq.config.Config.CONFIG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord, java.lang.Integer> getIdentity() {
		return com.sonicle.webtop.core.jooq.config.Keys.IDENTITY_PECBRIDGE_RELAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord> getPrimaryKey() {
		return com.sonicle.webtop.core.jooq.config.Keys.PECBRIDGE_RELAYS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.config.tables.records.PecbridgeRelaysRecord>>asList(com.sonicle.webtop.core.jooq.config.Keys.PECBRIDGE_RELAYS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays as(java.lang.String alias) {
		return new com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays rename(java.lang.String name) {
		return new com.sonicle.webtop.core.jooq.config.tables.PecbridgeRelays(name, null);
	}
}
