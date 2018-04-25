package bankingq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="banking";
		String user="root";
		String pass="";
		Scanner input=new Scanner(System.in);
		Connection con;
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,user,pass);
			con.setAutoCommit(false);
			while(true){
				System.out.println("1. 2. 3. 4. 5.");
				int ch=input.nextInt();
				switch(ch)
				{
				case 1:break;
				case 2:
					int bankid=2;
					double bal=3000;
					String q2="update banking set bal=? where bankid=?";
					
					PreparedStatement pst=con.prepareStatement(q2);
					pst.setDouble(1, bal);
					pst.setInt(2, bankid);
					pst.execute();
					break;
				
				
				case 3:
					break;
				case 4:
					con.commit();
					break;
				case 5:
					break;
					
				}
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
