package com.ernesto.springrecipeapp.services;

import com.ernesto.springrecipeapp.commands.RecipeCommand;
import com.ernesto.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long l);

}
