import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Recipe } from 'src/models/recipe.model';

const recipeUrl = 'http://localhost:8080/recipes/';

@Injectable({
  providedIn: 'root'
})
export class RecipeControllerService {

  constructor(private http: HttpClient) { }

  searchRecipes(pavadinimas: string, aprasymas: string): Observable<Array<Recipe>> {
    return this.http.get<Array<Recipe>>(recipeUrl + 'searchRecipes?pavadinimas=' + pavadinimas + '&aprasymas=' + aprasymas);
  }
}
