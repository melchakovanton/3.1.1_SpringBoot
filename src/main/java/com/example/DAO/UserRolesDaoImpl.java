package com.example.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class UserRolesDaoImpl implements UserRolesDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void addUserRoles(Long userId, String userRoles) {
        if (userRoles.equalsIgnoreCase("admin")) {
            Query query = entityManager.createNativeQuery(
                    "insert into user_roles values (?, 2)");
            query.setParameter(1, userId);
            query.executeUpdate();
        }
    }
}
