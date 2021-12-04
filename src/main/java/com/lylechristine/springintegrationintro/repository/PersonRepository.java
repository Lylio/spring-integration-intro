package com.lylechristine.springintegrationintro.repository;

import com.lylechristine.springintegrationintro.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
