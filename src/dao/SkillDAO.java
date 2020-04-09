
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
    public Skill getSkillBylD (long id) throws Exception {
	Skill skill = null;
	ConnectionManager cm=new ConnectionManager();
	Connection con=cm.getConnection();
	Statement stmt=con.createStatement();
	String sql="select name from skill11 where id = "+id;
//	stmt.execute(sql);
	ResultSet rs=stmt.executeQuery(sql);	
	while(rs.next()) {
		skill = new Skill();
		skill.setSkillName(rs.getString("name"));
	}
	rs.close();
	stmt.close();
	con.close();
	return skill;
    }
}
