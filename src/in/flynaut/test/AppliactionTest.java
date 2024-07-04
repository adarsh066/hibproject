package in.flynaut.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.flynaut.model.Employee;

public class AppliactionTest {

	public static void main(String[] args) {

		Employee employee1;

		employee1 = new Employee();

		employee1.setName("Aadarsh");
		employee1.setCity("Jamner");

//		1.Need A Session Factory
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		2.Get a Session Object form a Factory
		Session session = sessionFactory.openSession();
//		3.begin the Transaction
		session.beginTransaction();
//		4.Perform The transaction
		session.save(employee1);
//		5.Complete The transaction
		session.getTransaction().commit();
//		6.Release Session
		session.close();
	}

}
