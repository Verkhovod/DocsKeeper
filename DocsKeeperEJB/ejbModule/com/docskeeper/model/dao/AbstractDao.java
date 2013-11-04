package com.docskeeper.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * Abstract class for persistence data operations </br> Contains an instanse of
 * {@link EntityManager} for the project persistence unit
 * 
 * @author a.pryshchepa
 * @email vinglfm@gmail.com
 */
public abstract class AbstractDao {

	@PersistenceContext(unitName = "DocsKeeperEJB", type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
