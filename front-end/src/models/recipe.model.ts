export class Recipe {

    public id: number;
    public pavadinimas: string;
    public aprasymas: string;
    public sudetingumas: number;
    public max_patirties_tasku: number;
    public busena: number;

    constructor(id: number, pavadinimas: string, ivertinimas: number, aprasymas: string, sudetingumas:number, max_patirties_tasku: number, busena: number){
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.sudetingumas = sudetingumas;
        this.max_patirties_tasku = max_patirties_tasku;
        this.busena = busena;
    }
    
}