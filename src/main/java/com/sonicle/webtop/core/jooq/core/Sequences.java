/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.core.jooq.core;

/**
 * Convenience access to all sequences in core
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>core.seq_activities</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_ACTIVITIES = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_activities", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_causals</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_CAUSALS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_causals", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_messages_queue</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_MESSAGES_QUEUE = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_messages_queue", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_roles_associations</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_ROLES_ASSOCIATIONS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_roles_associations", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_roles_permissions</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_ROLES_PERMISSIONS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_roles_permissions", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_shares</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_SHARES = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_shares", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_snoozed_reminders</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_SNOOZED_REMINDERS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_snoozed_reminders", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_syslog</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_SYSLOG = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_syslog", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_upgrade_statements</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_UPGRADE_STATEMENTS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_upgrade_statements", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>core.seq_users_associations</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_USERS_ASSOCIATIONS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_users_associations", com.sonicle.webtop.core.jooq.core.Core.CORE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
