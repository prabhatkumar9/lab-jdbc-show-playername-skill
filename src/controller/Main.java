package controller;
import java.util.ArrayList;
import java.util.List;
import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;

public class Main{
    public static void main(String[] args) throws Exception {
	SkillDAO skilldao=new SkillDAO();    
	PlayerDAO playerdao =  new PlayerDAO();
	System.out.println("List of all player and skills : ");
	List<Player> list=new ArrayList<Player>();
	list = playerdao.getAllPlayers();
	for(int i=0;i<list.size();i++) {
	        /////System.out.println(skilldao.getSkillBylD(list.get(i).getSkill().getSkillId()).getSkillName());
		System.out.println(i+1+". "+list.get(i).getName()+" "+list.get(i).getCountry()+" "+skilldao.getSkillBylD(list.get(i).getSkill().getSkillId()).getSkillName()+".");
	}
    }
}
