package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Connection conn = null;
		PreparedStatement st =  null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?,?,?,?,?)"
					, Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Thiago Chaves");
			st.setString(2, "thiago@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("03/01/1984").getTime()));
			st.setDouble(4, 3500.00);
			st.setInt(5, 4);
			int linhasAfetadas = st.executeUpdate();
			if(linhasAfetadas > 0) {
			 ResultSet rs =	st.getGeneratedKeys();
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 System.out.println("Done! ID = " + id);
			 }
			}else {
				System.out.print("Nenhuma linha afetada!!");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}
			finally {
		
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
