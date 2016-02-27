package com.springangular.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springangular.model.DocumentClass;

import lombok.Getter;

public abstract class ServiceDefault<T extends DocumentClass, R extends MongoRepository> {

    @Autowired
    @Getter
    protected R repository;

    public T save(T entity) {
        if (entity.getId() != null) {
            return update(entity);
        }
        beforeInsert();
        repository.save(entity);
        afterInsert();
        return entity;
    }

    private T update(T entity) {
        beforeUpdate();
        repository.save(entity);
        afterUpdate();
        return entity;
    }

    public void delete(T entity) {
        beforeDelete();
        repository.delete(entity);
        afterDelete();
    }

    public Collection<T> findAll() {
        return repository.findAll();
    }

    protected void afterInsert() {

    }

    protected void afterUpdate() {

    }

    protected void afterDelete() {

    }

    protected void beforeInsert() {

    }

    protected void beforeUpdate() {

    }

    protected void beforeDelete() {

    }

}
