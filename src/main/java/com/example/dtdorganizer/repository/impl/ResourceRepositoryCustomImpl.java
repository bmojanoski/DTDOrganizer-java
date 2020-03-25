package com.example.dtdorganizer.repository.impl;

import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.repository.ResourceRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class ResourceRepositoryCustomImpl implements ResourceRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Resource> getAllByOffice() {
        Query query = entityManager.createNativeQuery(
                "select * from RESOURCE as R " +
                "where cast(R.RESOURCE_TYPE as text) like ?", Resource.class);
        query.setParameter(1, 0 + "%");
        return query.getResultList();
    }

    @Override
    public List<Resource> getAllByWorkMaterials() {
        Query query = entityManager.createNativeQuery(
                "select * from RESOURCE as R " +
                        "where cast(R.RESOURCE_TYPE as text) like ?", Resource.class);
        query.setParameter(1, 1 + "%");
        return query.getResultList();
    }

    @Override
    public List<Resource> getAllByUtilities() {
        Query query = entityManager.createNativeQuery(
                "select * from RESOURCE as R " +
                        "where cast(R.RESOURCE_TYPE as text) like ?", Resource.class);
        query.setParameter(1, 2 + "%");
        return query.getResultList();
    }
}
