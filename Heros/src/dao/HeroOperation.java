package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import generic.Common;
import pojo.Hero;

public class HeroOperation {
	static SessionFactory sessionfact=null;
	static Session session=null;
	static Transaction tx=null;
	
	public HeroOperation(){
		sessionfact=Common.getSessionFactory();
		session=sessionfact.openSession();
	}
	
	public static void insert(Hero hero){
		System.out.println("before insert ");
		System.out.println("id "+hero.getId());
		System.out.println("name "+hero.getName());
		tx=session.beginTransaction();
		session.persist(hero);
		session.getTransaction().commit();
	}
	
	public static List listAllHero(){
		tx=session.beginTransaction();
		List<Hero> list = (List<Hero>) session.createQuery("from Hero").list();
		return list;
	}
	
	public static List listHeroById(String id){
		tx=session.beginTransaction();
		List<Hero> list = (List<Hero>) session.createQuery("from Hero where id=:userid").setParameter("userid", id).list();
		return list;
	}
	
}
