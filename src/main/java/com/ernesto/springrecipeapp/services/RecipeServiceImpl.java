package com.ernesto.springrecipeapp.services;

import com.ernesto.springrecipeapp.domain.Recipe;
import com.ernesto.springrecipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
//        Iterable<Recipe> recipesIterable = recipeRepository.findAll();
//        for (Recipe recipe : recipesIterable) {
//            recipeSet.add(recipe);
//        }
        return recipeSet;
    }
}
