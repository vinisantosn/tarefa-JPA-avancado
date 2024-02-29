package edu.ebac.vinisantosn.dao;

import edu.ebac.vinisantosn.domain.Carro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarroDAO implements ICarroDAO{
    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AtividadeJPAAvancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return carro;
    }
}
