import { Component, OnInit } from '@angular/core';
import { Course } from 'src/models/course.model';
import { CourseControllerService } from 'src/app/services/course-controller.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Recipe } from 'src/models/recipe.model';
import { RecipeControllerService } from 'src/app/services/recipe-controller.service';

@Component({
  selector: 'app-create-course',
  templateUrl: './create-course.component.html',
  styleUrls: ['./create-course.component.css']
})
export class CreateCourseComponent implements OnInit {

  recipes : Array<Recipe>
  hasRecipes : boolean
  course : Course
  isCreate : boolean

  constructor(private courseController: CourseControllerService, private recipeController: RecipeControllerService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.route.params.subscribe( params => {
      this.isCreate = params['create']
      });
    this.course = {
      id: Math.random(),
      pavadinimas: '',
      ivertinimas: 0,
      aprasymas: '',
      recipes: new Array<Recipe>(),
      patvirtintas: this.isCreate
    }
    this.recipesForNewCourse();
  }

  recipesForNewCourse(){
    this.recipeController.getRecipesForNewCourse().subscribe((recipes) => {
      this.hasRecipes = recipes.length != 0;
      this.recipes = recipes;
    }
  );
  }

  submitData(){
    console.log(this.isCreate);
    this.courseController.saveCourse(this.course).subscribe();
    if (this.isCreate)
    {
      this.router.navigate(['admin']);
    }
    else{
      this.router.navigate(['courses']);
    }
    
  }

  addRecipe(recipe: Recipe) {
    this.course.recipes.push(recipe);
    this.recipes.forEach( (item, index) => {
      if (item === recipe)
        this.recipes.splice(index, 1);
    });
  }

}
