import { Recipe } from './recipe.model';

export class Course {

    public id: number;
    public pavadinimas: string;
    public ivertinimas: number;
    public aprasymas: string;
    public recipes: Array<Recipe>;

    constructor(id: number, pavadinimas: string, ivertinimas: number, aprasymas: string, recipes: Array<Recipe>){
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.ivertinimas = ivertinimas;
        this.aprasymas = aprasymas;
        this.recipes = recipes;
    }
    
}