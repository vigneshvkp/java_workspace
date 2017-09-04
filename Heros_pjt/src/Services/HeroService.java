package Services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import dao.HeroOperation;
import pojo.Hero;

@Path("/hero")
public class HeroService {

	
	@POST
	@Path("/inserthero")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertUser(Hero hero){
		System.out.println("insert called ni json");
		System.out.println("user "+hero);
	//	System.out.println("username  "+user.getUserName());
		new HeroOperation().insert(hero);
	}
	
	
	@GET
	@Path("/listallhero")
	@Consumes(MediaType.APPLICATION_XML)
	public List<Hero> listuser(){
		List<Hero> list=new HeroOperation().listAllHero();
		return list;
	}
	
	
}
