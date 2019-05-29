import { Component, OnInit } from '@angular/core';
import { Recipe } from 'src/models/recipe.model';
import { ActivatedRoute, Router } from '@angular/router';
import { RecipeControllerService } from 'src/app/services/recipe-controller.service';

@Component({
  selector: 'app-create-recipe',
  templateUrl: './create-recipe.component.html',
  styleUrls: ['./create-recipe.component.css']
})
export class CreateRecipeComponent implements OnInit {

  recipe: Recipe
  isCreate: boolean

  constructor(private recipeController: RecipeControllerService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.isCreate = params['create']
    });
    this.recipe = {
      id: Math.random(),
      pavadinimas: '',
      aprasymas: '',
      sudetingumas: 0,
      max_patirties_tasku: 0,
      busena: 0
    };
  }

  saveRecipe() {
    this.recipeController.saveRecipe(this.recipe).subscribe();
    if (this.isCreate)
    {
      this.router.navigate(['admin']);
    }
    else{
      this.router.navigate(['recipes']);
    }
  }

}
