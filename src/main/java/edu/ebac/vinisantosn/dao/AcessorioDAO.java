package edu.ebac.vinisantosn.dao;

import edu.ebac.vinisantosn.domain.Acessorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AcessorioDAO implements IAcessorioDAO{
    @Override
    public Acessorio cadastrar(Acessorio acessorio) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AtividadeJPAAvancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return acessorio;
    }
}
