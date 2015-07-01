/*
 * webtop-core-db is a library developed by Sonicle S.r.l.
 * Copyright (C) 2014 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle@sonicle.com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2014 Sonicle S.r.l.".
 */
package com.sonicle.webtop.core.dal;

import com.sonicle.webtop.core.bol.OUserGroup;
import static com.sonicle.webtop.core.jooq.Tables.USERS_GROUPS;
import com.sonicle.webtop.core.jooq.tables.records.UsersGroupsRecord;
import java.sql.Connection;
import java.util.List;
import org.jooq.DSLContext;

/**
 *
 * @author malbinola
 */
public class UserGroupDAO extends BaseDAO {
	private final static UserGroupDAO INSTANCE = new UserGroupDAO();
	public static UserGroupDAO getInstance() {
		return INSTANCE;
	}
	
	public List<OUserGroup> selectByDomainUser(Connection con, String domainId, String userId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.select()
			.from(USERS_GROUPS)
			.where(USERS_GROUPS.DOMAIN_ID.equal(domainId)
					.and(USERS_GROUPS.USER_ID.equal(userId))
			)
			.fetchInto(OUserGroup.class);
	}
	
	public int insert(Connection con, OUserGroup item) throws DAOException {
		DSLContext dsl = getDSL(con);
		UsersGroupsRecord record = dsl.newRecord(USERS_GROUPS, item);
		return dsl
			.insertInto(USERS_GROUPS)
			.set(record)
			.execute();
	}
	
	public int delete(Connection con, int uid) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.delete(USERS_GROUPS)
			.where(
					USERS_GROUPS.UID.equal(uid)
			)
			.execute();
	}
	
	public int deleteByDomainUser(Connection con, String domainId, String userId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.delete(USERS_GROUPS)
			.where(
					USERS_GROUPS.DOMAIN_ID.equal(domainId)
					.and(USERS_GROUPS.USER_ID.equal(userId))
			)
			.execute();
	}
	
	public int deleteByDomainGroup(Connection con, String domainId, String groupId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.delete(USERS_GROUPS)
			.where(
					USERS_GROUPS.DOMAIN_ID.equal(domainId)
					.and(USERS_GROUPS.GROUP_ID.equal(groupId))
			)
			.execute();
	}
}
