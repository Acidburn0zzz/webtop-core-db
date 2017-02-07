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

import com.sonicle.webtop.core.bol.CausalGrid;
import com.sonicle.webtop.core.bol.OCausal;
import static com.sonicle.webtop.core.jooq.core.Sequences.SEQ_CAUSALS;
import static com.sonicle.webtop.core.jooq.core.Tables.CAUSALS;
import static com.sonicle.webtop.core.jooq.core.Tables.CUSTOMERS;
import static com.sonicle.webtop.core.jooq.core.Tables.DOMAINS;
import static com.sonicle.webtop.core.jooq.core.Tables.USERS;

import com.sonicle.webtop.core.jooq.core.tables.records.CausalsRecord;
import java.sql.Connection;
import java.util.Collection;
import java.util.List;
import org.jooq.DSLContext;

/**
 *
 * @author malbinola
 */
public class CausalDAO extends BaseDAO {
	private final static CausalDAO INSTANCE = new CausalDAO();
	public static CausalDAO getInstance() {
		return INSTANCE;
	}

	public Long getSequence(Connection con) throws DAOException {
		DSLContext dsl = getDSL(con);
		Long nextID = dsl.nextval(SEQ_CAUSALS);
		return nextID;
	}
	
	public List<OCausal> selectLiveByDomainUserCustomer(Connection con, String domainId, String userId, String customerId) throws DAOException {
		DSLContext dsl = getDSL(con);
		
		return dsl
			.select()
			.from(CAUSALS)
			.where(
				CAUSALS.DOMAIN_ID.equal(domainId)
				.and(CAUSALS.USER_ID.equal(userId))
				.or(
					CAUSALS.DOMAIN_ID.equal(domainId)
					.and(CAUSALS.USER_ID.equal("*"))
				)
				.or(
					CAUSALS.DOMAIN_ID.equal("*")
					.and(CAUSALS.USER_ID.equal(userId))
				)
				.or(
					CAUSALS.DOMAIN_ID.equal("*")
					.and(CAUSALS.USER_ID.equal("*"))
				)
			)
			.and(
				CAUSALS.CUSTOMER_ID.equal(customerId)
				.or(CAUSALS.CUSTOMER_ID.isNull())
			)
			.and(
				CAUSALS.REVISION_STATUS.notEqual("D")
				.or(CAUSALS.REVISION_STATUS.isNull())
			)
			.orderBy(
				CAUSALS.DESCRIPTION.asc()
			)
			.fetchInto(OCausal.class);
	}
	
	public List<CausalGrid> viewLiveByDomains(Connection con, Collection<String> domainIds) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.select(
				CAUSALS.CAUSAL_ID,
				CAUSALS.DOMAIN_ID,
				CAUSALS.USER_ID,
				CAUSALS.CUSTOMER_ID,
				CAUSALS.DESCRIPTION,
				CAUSALS.READ_ONLY,
				CAUSALS.EXTERNAL_ID
			)
			.select(
				USERS.DISPLAY_NAME.as("user_description"),
				DOMAINS.DESCRIPTION.as("domain_description"),
				CUSTOMERS.DESCRIPTION.as("customer_description")
			)
			.from(CAUSALS)
			.leftOuterJoin(USERS).on(
				CAUSALS.DOMAIN_ID.equal(USERS.DOMAIN_ID)
				.and(CAUSALS.USER_ID.equal(USERS.USER_ID))
			)
			.leftOuterJoin(DOMAINS).on(
				CAUSALS.DOMAIN_ID.equal(DOMAINS.DOMAIN_ID)
			)
			.leftOuterJoin(CUSTOMERS).on(
				CAUSALS.CUSTOMER_ID.equal(CUSTOMERS.CUSTOMER_ID)
			)
			.where(
				CAUSALS.DOMAIN_ID.in(domainIds)
			)
			.and(
				CAUSALS.REVISION_STATUS.notEqual("D")
				.or(CAUSALS.REVISION_STATUS.isNull())
			)
			.orderBy(
				CAUSALS.DESCRIPTION.asc()
			)
			.fetchInto(CausalGrid.class);
	}
	
	public OCausal select(Connection con, Integer causalId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.select()
			.from(CAUSALS)
			.where(
				CAUSALS.CAUSAL_ID.equal(causalId)
			)
			.fetchOneInto(OCausal.class);
	}
	
	public int insert(Connection con, OCausal item) throws DAOException {
		DSLContext dsl = getDSL(con);
		CausalsRecord record = dsl.newRecord(CAUSALS, item);
		return dsl
			.insertInto(CAUSALS)
			.set(record)
			.execute();
	}
	
	public int update(Connection con, OCausal item) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.update(CAUSALS)
			.set(CAUSALS.DOMAIN_ID, item.getDomainId())
			.set(CAUSALS.USER_ID, item.getUserId())
			.set(CAUSALS.CUSTOMER_ID, item.getCustomerId())
			.set(CAUSALS.DESCRIPTION, item.getDescription())
			.set(CAUSALS.READ_ONLY, item.getReadOnly())
			.set(CAUSALS.EXTERNAL_ID, item.getExternalId())
			.where(
				CAUSALS.CAUSAL_ID.equal(item.getCausalId())
			)
			.execute();
	}
	
	public int delete(Connection con, Integer causalId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.update(CAUSALS)
			.set(CAUSALS.REVISION_STATUS, "D")
			.where(
				CAUSALS.CAUSAL_ID.equal(causalId)
			)
			.execute();
	}
	
	public int deleteByDomain(Connection con, String domainId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.delete(CAUSALS)
			.where(
				CAUSALS.DOMAIN_ID.equal(domainId)
			)
			.execute();
	}
}
