import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Recipe } from 'src/models/recipe.model';

const recipeUrl = 'http://localhost:8080/recipes/';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class RecipeControllerService {

  constructor(private http: HttpClient) { }

  searchRecipes(pavadinimas: string, aprasymas: string): Observable<Array<Recipe>> {
    return this.http.get<Array<Recipe>>(recipeUrl + 'searchRecipes?pavadinimas=' + pavadinimas + '&aprasymas=' + aprasymas);
  }

  getRecipe(id: number): Observable<Recipe> {
    return this.http.get<Recipe>(recipeUrl + 'getRecipe/' + id);
  }
  
  deleteRecipe(id): Observable<{}> {
    return this.http.delete(recipeUrl + 'deleteRecipe/' + id);
  }

  editRecipe(course : Recipe): Observable<{}> {
    console.log(course);
    return this.http.post((recipeUrl + 'saveRecipe'), course, httpOptions);
  }

  saveRecipe(course : Recipe): Observable<{}> {
    console.log(course);
    return this.http.post((recipeUrl + 'saveRecipe'), course, httpOptions);
  }

}
