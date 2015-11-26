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

import com.sonicle.webtop.core.bol.OPostponedReminder;
import static com.sonicle.webtop.core.jooq.Sequences.SEQ_POSTPONED_REMINDERS;
import static com.sonicle.webtop.core.jooq.Tables.POSTPONED_REMINDERS;
import com.sonicle.webtop.core.jooq.tables.records.PostponedRemindersRecord;
import java.sql.Connection;
import java.util.List;
import org.joda.time.DateTime;
import org.jooq.DSLContext;

/**
 *
 * @author malbinola
 */
public class PostponedReminderDAO extends BaseDAO {
	private final static PostponedReminderDAO INSTANCE = new PostponedReminderDAO();
	public static PostponedReminderDAO getInstance() {
		return INSTANCE;
	}
	
	public Long getSequence(Connection con) throws DAOException {
		DSLContext dsl = getDSL(con);
		Long nextID = dsl.nextval(SEQ_POSTPONED_REMINDERS);
		return nextID;
	}
	
	public List<OPostponedReminder> selectExpiredForUpdateByInstant(Connection con, DateTime greaterInstant) {
		DSLContext dsl = getDSL(con);
		return dsl
			.select()
			.from(POSTPONED_REMINDERS)
			.where(
					POSTPONED_REMINDERS.REMIND_ON.lessOrEqual(greaterInstant)
			)
			.fetchInto(OPostponedReminder.class);
	}
	
	public int insert(Connection con, OPostponedReminder item) throws DAOException {
		DSLContext dsl = getDSL(con);
		PostponedRemindersRecord record = dsl.newRecord(POSTPONED_REMINDERS, item);
		return dsl
			.insertInto(POSTPONED_REMINDERS)
			.set(record)
			.execute();
	}
	
	public int delete(Connection con, int id) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
			.delete(POSTPONED_REMINDERS)
			.where(
				POSTPONED_REMINDERS.POSTPONED_REMINDER_ID.equal(id)
			)
			.execute();
	}
}
