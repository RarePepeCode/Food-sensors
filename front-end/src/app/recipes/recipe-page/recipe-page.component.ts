import { CommentControllerService } from './../../services/comment-controller.service';
import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Recipe } from 'src/models/recipe.model';
import { RecipeControllerService } from 'src/app/services/recipe-controller.service';
import { Comment } from 'src/models/comment.model';

@Component({
  selector: 'app-recipe-page',
  templateUrl: './recipe-page.component.html',
  styleUrls: ['./recipe-page.component.css']
})
export class RecipePageComponent implements OnInit {

  recipe : Recipe;
  recipeId : number;
  isEditMode : boolean = false;
  komentaroTekstas: string;
  ivertinimas: number = 1;

  constructor(private route: ActivatedRoute, 
    private recipeController: RecipeControllerService, 
    private commentController: CommentControllerService) { }

  ngOnInit() {
    this.route.params.subscribe( params => {
      this.recipeId = params['id'],
      this.isEditMode = params['edit']

      this.recipeController.getRecipe(this.recipeId)
        .subscribe((recipe) => {
          this.recipe = recipe;
        }
      );
    });
  }

  comment() {
    let komentaras = new Comment(null, this.komentaroTekstas, this.recipe, null, {id: 1});

    this.commentController.comment(komentaras).subscribe(
      (id: number) => {
        console.log(id);
      }
    );
  }

  rate() {
    let komentaras = new Comment(null, null, this.recipe, this.ivertinimas, {id: 1});
    this.commentController.rate(komentaras).subscribe(
      (id: number) => {
        console.log(id);
      }
    );
  }
}