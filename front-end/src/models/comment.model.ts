import { User } from './user.model';
import { Recipe } from './recipe.model';

export class Comment {

    public id: number;
    public komentaras: string;
    public recipe: Recipe;
    public ivertinimas: number;
    public naudotojas_paraso_komentara: User;

    constructor(id: number, komentaras: string, recipe: Recipe, ivertinimas: number, naudotojas_paraso_komentara: User){
        this.id = id;
        this.komentaras = komentaras;
        this.recipe = recipe;
        this.ivertinimas = ivertinimas;
        this.naudotojas_paraso_komentara = naudotojas_paraso_komentara;
    }
    
}