package com.xworkz.product;

import com.xworkz.product_entity.Product_Entiry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("product");
       EntityManager entityManager= entityManagerFactory.createEntityManager();
      EntityTransaction transaction= entityManager.getTransaction();
      transaction.begin();
        Product_Entiry product_entiry=new Product_Entiry(3,"samsung","45675");
      entityManager.persist(product_entiry);
     transaction.commit();
      entityManager.close();
    }
}
