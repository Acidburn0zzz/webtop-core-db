/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.core.jooq.core.tables.pojos;

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
public class LocalVault implements java.io.Serializable {

	private static final long serialVersionUID = -859307809;

	private java.lang.String domainId;
	private java.lang.String userId;
	private java.lang.String passwordType;
	private java.lang.String password;

	public LocalVault() {}

	public LocalVault(
		java.lang.String domainId,
		java.lang.String userId,
		java.lang.String passwordType,
		java.lang.String password
	) {
		this.domainId = domainId;
		this.userId = userId;
		this.passwordType = passwordType;
		this.password = password;
	}

	public java.lang.String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.String domainId) {
		this.domainId = domainId;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public java.lang.String getPasswordType() {
		return this.passwordType;
	}

	public void setPasswordType(java.lang.String passwordType) {
		this.passwordType = passwordType;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}
}
