import java.sql.*;
public class UpdateTable {
	
	int empno, salary;
	String name,address,email,phoneno;
	
	
	public int update(int empno,String name,String address, int salary ){
		this.empno=empno;
		this.name=name;
		this.address=address;
		this.salary=salary;
		
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			PreparedStatement ps=con.prepareStatement("update mph6 set name=?,address=?,salary=? where empno=?");
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setInt(3,salary);
			ps.setInt(4,empno);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	
	/*public static void main(String[] args) throws Exception {
		UpdateTable upt=new UpdateTable();
		upt.update(107, "jai", "CHEN", 40000);
		
	}*/

}
