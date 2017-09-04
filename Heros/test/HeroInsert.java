import dao.HeroOperation;
import pojo.Hero;

public class HeroInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero hero=new Hero(12,"twelve");
		new HeroOperation().insert(hero);
		System.out.println("inserted successfully");
	}

}
