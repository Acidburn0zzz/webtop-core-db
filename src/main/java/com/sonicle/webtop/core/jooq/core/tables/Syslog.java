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
public class Syslog extends org.jooq.impl.TableImpl<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord> {

	private static final long serialVersionUID = -565313687;

	/**
	 * The reference instance of <code>core.syslog</code>
	 */
	public static final com.sonicle.webtop.core.jooq.core.tables.Syslog SYSLOG = new com.sonicle.webtop.core.jooq.core.tables.Syslog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord> getRecordType() {
		return com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord.class;
	}

	/**
	 * The column <code>core.syslog.syslog_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.Long> SYSLOG_ID = createField("syslog_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>core.syslog.timestamp</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, org.joda.time.DateTime> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new com.sonicle.webtop.core.jooq.DateTimeConverter());

	/**
	 * The column <code>core.syslog.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>core.syslog.user_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>core.syslog.service_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>core.syslog.action</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>core.syslog.sw_name</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> SW_NAME = createField("sw_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>core.syslog.ip_address</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> IP_ADDRESS = createField("ip_address", org.jooq.impl.SQLDataType.VARCHAR.length(39), this, "");

	/**
	 * The column <code>core.syslog.user_agent</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> USER_AGENT = createField("user_agent", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>core.syslog.session_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>core.syslog.data</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord, java.lang.String> DATA = createField("data", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>core.syslog</code> table reference
	 */
	public Syslog() {
		this("syslog", null);
	}

	/**
	 * Create an aliased <code>core.syslog</code> table reference
	 */
	public Syslog(java.lang.String alias) {
		this(alias, com.sonicle.webtop.core.jooq.core.tables.Syslog.SYSLOG);
	}

	private Syslog(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord> aliased) {
		this(alias, aliased, null);
	}

	private Syslog(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.core.jooq.core.Core.CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord> getPrimaryKey() {
		return com.sonicle.webtop.core.jooq.core.Keys.SYSLOG_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.SyslogRecord>>asList(com.sonicle.webtop.core.jooq.core.Keys.SYSLOG_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.core.jooq.core.tables.Syslog as(java.lang.String alias) {
		return new com.sonicle.webtop.core.jooq.core.tables.Syslog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.core.jooq.core.tables.Syslog rename(java.lang.String name) {
		return new com.sonicle.webtop.core.jooq.core.tables.Syslog(name, null);
	}
}
