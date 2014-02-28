package com.shpitc.driveshare.server.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.shpitc.driveshare.server.dao.TorqueDao;

public class TorqueDaoImpl extends JdbcTemplate implements TorqueDao {




	@Override
	public void insertData(final String[] row) {
		String sql = "INSERT INTO raw_logs (v, session, id, time, kff1005, kff1006, kff1001) VALUES (?,?,?,?,?,?,?)";
	
		
		
		execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean  doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//				for(String[] row : data) {
					for(int i=0;i<row.length;i++) {
						if(i<4) {
							ps.setString(i+1, row[i]);
						} else {
							ps.setFloat(i+1, Float.valueOf(row[i]));
						}
					}		
					
//				}	
				return ps.execute();
			}
			
		});
//		Connection conn = null;
//		
//		try {
//			conn = dataSource.getConnection();			
//			conn.setAutoCommit(false);
//			PreparedStatement prepStmt = conn.prepareStatement(sql);
//			
//			for(String[] row : data) {
//				for(int i=0;i<row.length;i++) {
//					if(i<4) {
//						prepStmt.setString(i+1, row[i]);
//					} else {
//						prepStmt.setFloat(i+1, Float.valueOf(row[i]));
//					}
//				}		
//				
//			}	
//			
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


		
		
		
	}

}
