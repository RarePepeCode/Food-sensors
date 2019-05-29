import { Component, OnInit, Input } from '@angular/core';
import { RecipeControllerService } from 'src/app/services/recipe-controller.service';
import { Recipe } from 'src/models/recipe.model';
import { Router } from '@angular/router';

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
  buttonName: string;

  @Input() isAdminTab : boolean = false

  constructor(private recipeController: RecipeControllerService, private router: Router) { }

  ngOnInit() {
    if (this.isAdminTab)
    {
      this.buttonName = "Kurti Receptą";
    }
    else
    {
      this.buttonName = "Siūlyti Receptą";
    }
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

  selectRecipe(recipeId: number) {
    this.router.navigate(['recipe', recipeId, this.isAdminTab]);
  }

  replaceUndefinedFields() {
    if (!this.pavadinimas) {
      this.pavadinimas = "";
    }
    if (!this.aprasymas) {
      this.aprasymas = "";
    }
  }

  openCreateCourse() {
    this.router.navigate(['create-recipe', this.isAdminTab])
  }

}
