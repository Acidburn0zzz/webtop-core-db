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
public class MessagesQueue extends org.jooq.impl.TableImpl<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord> {

	private static final long serialVersionUID = -922022513;

	/**
	 * The reference instance of <code>core.messages_queue</code>
	 */
	public static final com.sonicle.webtop.core.jooq.core.tables.MessagesQueue MESSAGES_QUEUE = new com.sonicle.webtop.core.jooq.core.tables.MessagesQueue();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord> getRecordType() {
		return com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord.class;
	}

	/**
	 * The column <code>core.messages_queue.queue_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, java.lang.Integer> QUEUE_ID = createField("queue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>core.messages_queue.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>core.messages_queue.user_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>core.messages_queue.message_type</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, java.lang.String> MESSAGE_TYPE = createField("message_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>core.messages_queue.message_raw</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, java.lang.String> MESSAGE_RAW = createField("message_raw", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>core.messages_queue.queued_on</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, org.joda.time.DateTime> QUEUED_ON = createField("queued_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "", new com.sonicle.webtop.core.jooq.DateTimeConverter());

	/**
	 * The column <code>core.messages_queue.pid</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord, java.lang.String> PID = createField("pid", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * Create a <code>core.messages_queue</code> table reference
	 */
	public MessagesQueue() {
		this("messages_queue", null);
	}

	/**
	 * Create an aliased <code>core.messages_queue</code> table reference
	 */
	public MessagesQueue(java.lang.String alias) {
		this(alias, com.sonicle.webtop.core.jooq.core.tables.MessagesQueue.MESSAGES_QUEUE);
	}

	private MessagesQueue(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord> aliased) {
		this(alias, aliased, null);
	}

	private MessagesQueue(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.core.jooq.core.Core.CORE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord> getPrimaryKey() {
		return com.sonicle.webtop.core.jooq.core.Keys.MESSAGES_QUEUE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.core.jooq.core.tables.records.MessagesQueueRecord>>asList(com.sonicle.webtop.core.jooq.core.Keys.MESSAGES_QUEUE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.core.jooq.core.tables.MessagesQueue as(java.lang.String alias) {
		return new com.sonicle.webtop.core.jooq.core.tables.MessagesQueue(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.core.jooq.core.tables.MessagesQueue rename(java.lang.String name) {
		return new com.sonicle.webtop.core.jooq.core.tables.MessagesQueue(name, null);
	}
}
