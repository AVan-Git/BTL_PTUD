package app;

import org.hibernate.SessionFactory;

import GUI.DangNhap;
import connect.DatabaseSQL;

public class MyApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = DatabaseSQL.getInstance().getSessionFactory();

		if (sessionFactory != null) {
			System.out.println("Complete!");
			new DangNhap().setVisible(true);
		} else
			System.err.println("null");

	}

}
