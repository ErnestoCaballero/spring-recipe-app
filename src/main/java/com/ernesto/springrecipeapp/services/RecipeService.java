package com.ernesto.springrecipeapp.services;

import com.ernesto.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
