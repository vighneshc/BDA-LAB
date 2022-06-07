
import java.sql.*;


public class lab1 {


	public static void main(String[] args)
	{

		Connection con = null;
		PreparedStatement ps = null;

		con = connection.connectDB();


		try {

			String sql = "insert into empdetails values('Swaroop Jadhav','SJ','swaroops.cs19@bmsce.ac.in','Marketing','8618250198',10)";

			ps = con.prepareStatement(sql);

			ps.execute();
		}


		catch (Exception e) {

			System.out.println(e);
		}
	}
