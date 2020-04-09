package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Player;
import model.Skill;
import utility.ConnectionManager;
public class PlayerDAO{
    
    public List<Player> getAllPlayers () throws Exception {
	List<Player> list=new ArrayList<Player>();
	
	Player player = null;
	Skill skill = null;
	ConnectionManager cm=new ConnectionManager();
	Connection con=cm.getConnection();
	Statement stmt=con.createStatement();
	String sql="SELECT * FROM PLAYER11";
	ResultSet rs = stmt.executeQuery(sql);	
	while(rs.next()) {
		player = new Player();
		skill = new Skill();
		player.setName(rs.getString("name"));
		player.setPlayerId(rs.getLong("id"));
		player.setCountry(rs.getString("country"));
		skill.setSkillId(rs.getLong("skill_id"));
		player.setSkill(skill);
		list.add(player);
	}
	
	rs.close();
	stmt.close();
	con.close();
	return list;
    
}}
