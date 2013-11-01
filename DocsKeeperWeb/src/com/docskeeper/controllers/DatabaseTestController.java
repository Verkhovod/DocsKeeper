package com.docskeeper.controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docskeeper.model.AuthRights;
import com.docskeeper.model.entries.LoginInfo;
import com.docskeeper.model.entries.User;

@WebServlet("/DatabaseTest")
public class DatabaseTestController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2112377796356370427L;

	public DatabaseTestController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		handleRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		handleRequest(req, resp);
	}

	private void handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("DocsKeeperEJB");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			LoginInfo loginInfo = new LoginInfo("vinglfm", "coolpass", AuthRights.ADMIN);
			User user = new User("Andrew", loginInfo);
			em.persist(loginInfo);
			em.persist(user);
			em.getTransaction().commit();
		} finally {
			if(em != null)
				em.close();
		}
		
		emf.close();
		
		
	}

}
