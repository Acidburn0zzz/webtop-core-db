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
public class UsersAssociations implements java.io.Serializable {

	private static final long serialVersionUID = 1859609622;

	private java.lang.Integer userAssociationId;
	private java.lang.String  userUid;
	private java.lang.String  groupUid;

	public UsersAssociations() {}

	public UsersAssociations(
		java.lang.Integer userAssociationId,
		java.lang.String  userUid,
		java.lang.String  groupUid
	) {
		this.userAssociationId = userAssociationId;
		this.userUid = userUid;
		this.groupUid = groupUid;
	}

	public java.lang.Integer getUserAssociationId() {
		return this.userAssociationId;
	}

	public void setUserAssociationId(java.lang.Integer userAssociationId) {
		this.userAssociationId = userAssociationId;
	}

	public java.lang.String getUserUid() {
		return this.userUid;
	}

	public void setUserUid(java.lang.String userUid) {
		this.userUid = userUid;
	}

	public java.lang.String getGroupUid() {
		return this.groupUid;
	}

	public void setGroupUid(java.lang.String groupUid) {
		this.groupUid = groupUid;
	}
}
