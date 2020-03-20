package com.user.FormBackEnd.repo;

import org.springframework.data.repository.CrudRepository;

import com.user.FormBackEnd.entity.FormEntity;

public interface StudentFormRepo extends CrudRepository<FormEntity,String> {

}
