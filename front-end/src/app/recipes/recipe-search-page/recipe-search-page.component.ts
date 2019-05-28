import { Component, OnInit } from '@angular/core';
import { RecipeControllerService } from 'src/app/services/recipe-controller.service';
import { Recipe } from 'src/models/recipe.model';

const courseUrl = 'http://localhost:8080/courses/';

@Component({
  selector: 'app-recipe-search-page',
  templateUrl: './recipe-search-page.component.html',
  styleUrls: ['./recipe-search-page.component.css']
})
export class RecipeSearchPageComponent implements OnInit {

  pavadinimas: string;
  aprasymas: string;
  recipes: Array<Recipe>;

  constructor(private recipeController: RecipeControllerService) { }

  ngOnInit() {
  }

  searchRecipes() {
    this.recipeController.searchRecipes(this.pavadinimas, this.aprasymas)
      .subscribe((recipes) => {
        this.recipes = recipes;
        console.log(this.recipes);
      }
    );
  }

}
