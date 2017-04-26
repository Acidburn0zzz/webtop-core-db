/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.core.jooq.core.tables.records;

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
public class UsersRecord extends org.jooq.impl.UpdatableRecordImpl<com.sonicle.webtop.core.jooq.core.tables.records.UsersRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 2080873348;

	/**
	 * Setter for <code>core.users.domain_id</code>.
	 */
	public void setDomainId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>core.users.domain_id</code>.
	 */
	public java.lang.String getDomainId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>core.users.user_id</code>.
	 */
	public void setUserId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>core.users.user_id</code>.
	 */
	public java.lang.String getUserId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>core.users.type</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>core.users.type</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>core.users.enabled</code>.
	 */
	public void setEnabled(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>core.users.enabled</code>.
	 */
	public java.lang.Boolean getEnabled() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>core.users.user_uid</code>.
	 */
	public void setUserUid(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>core.users.user_uid</code>.
	 */
	public java.lang.String getUserUid() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>core.users.display_name</code>.
	 */
	public void setDisplayName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>core.users.display_name</code>.
	 */
	public java.lang.String getDisplayName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>core.users.secret</code>.
	 */
	public void setSecret(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>core.users.secret</code>.
	 */
	public java.lang.String getSecret() {
		return (java.lang.String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.USER_UID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.DISPLAY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.sonicle.webtop.core.jooq.core.tables.Users.USERS.SECRET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUserUid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getDisplayName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getSecret();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value1(java.lang.String value) {
		setDomainId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value2(java.lang.String value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value3(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value4(java.lang.Boolean value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value5(java.lang.String value) {
		setUserUid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value6(java.lang.String value) {
		setDisplayName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value7(java.lang.String value) {
		setSecret(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Boolean value4, java.lang.String value5, java.lang.String value6, java.lang.String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UsersRecord
	 */
	public UsersRecord() {
		super(com.sonicle.webtop.core.jooq.core.tables.Users.USERS);
	}

	/**
	 * Create a detached, initialised UsersRecord
	 */
	public UsersRecord(java.lang.String domainId, java.lang.String userId, java.lang.String type, java.lang.Boolean enabled, java.lang.String userUid, java.lang.String displayName, java.lang.String secret) {
		super(com.sonicle.webtop.core.jooq.core.tables.Users.USERS);

		setValue(0, domainId);
		setValue(1, userId);
		setValue(2, type);
		setValue(3, enabled);
		setValue(4, userUid);
		setValue(5, displayName);
		setValue(6, secret);
	}
}