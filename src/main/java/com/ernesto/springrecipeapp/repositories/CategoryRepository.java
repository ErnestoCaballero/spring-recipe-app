package com.ernesto.springrecipeapp.repositories;

import com.ernesto.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
