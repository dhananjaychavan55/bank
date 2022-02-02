package com.getHibernateUtil;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.model.Account;



public class HibernateConfig {

	public static StandardServiceRegistry registry;
	public static SessionFactory factory;
	
	public static SessionFactory getSessionFactory() {
		
		if(factory==null) {
			Map<String, Object> settings = new HashMap<String, Object>();
			settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernatemaven");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL57Dialect");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.HBM2DDL_AUTO, "create");
			registry = new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds = new MetadataSources(registry).addAnnotatedClass(Account.class);
			Metadata md = mds.getMetadataBuilder().build();
			factory = md.getSessionFactoryBuilder().build();
			}
			return factory;
		
		
	}
}
