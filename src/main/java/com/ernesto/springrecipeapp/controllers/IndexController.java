package com.ernesto.springrecipeapp.controllers;

import com.ernesto.springrecipeapp.domain.Category;
import com.ernesto.springrecipeapp.domain.UnitOfMeasure;
import com.ernesto.springrecipeapp.repositories.CategoryRepository;
import com.ernesto.springrecipeapp.repositories.UnitOfMeasureRepository;
import com.ernesto.springrecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
