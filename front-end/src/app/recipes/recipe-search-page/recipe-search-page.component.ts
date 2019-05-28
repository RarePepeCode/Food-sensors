import { Component, OnInit } from '@angular/core';
import { RecipeControllerService } from 'src/app/services/recipe-controller.service';
import { Recipe } from 'src/models/recipe.model';

@Component({
  selector: 'app-recipe-search-page',
  templateUrl: './recipe-search-page.component.html',
  styleUrls: ['./recipe-search-page.component.css']
})
export class RecipeSearchPageComponent implements OnInit {

  pavadinimas: string;
  aprasymas: string;
  recipes: Array<Recipe>;
  hasRecipes: boolean = false;

  constructor(private recipeController: RecipeControllerService) { }

  ngOnInit() {
  }

  searchRecipes() {
    this.replaceUndefinedFields();
    this.recipeController.searchRecipes(this.pavadinimas, this.aprasymas)
      .subscribe((recipes) => {
        this.hasRecipes = recipes.length != 0;
        this.recipes = recipes;
      }
    );
  }

  replaceUndefinedFields() {
    if (!this.pavadinimas) {
      this.pavadinimas = "";
    }
    if (!this.aprasymas) {
      this.aprasymas = "";
    }
  }

}
