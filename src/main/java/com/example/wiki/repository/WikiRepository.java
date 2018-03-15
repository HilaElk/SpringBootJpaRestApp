package com.example.wiki.repository;

import com.example.wiki.model.Wiki;
import org.springframework.data.repository.CrudRepository;


//@RepositoryRestResource(collectionResourceRel = "schedule", path = "schedule")
public interface WikiRepository extends CrudRepository<com.example.wiki.model.Wiki, Long> {

}
