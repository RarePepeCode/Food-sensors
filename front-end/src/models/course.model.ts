export class Course {

    public id: number;
    public pavadinimas: string;
    public ivertinimas: number;
    public aprasymas: string;

    constructor(id: number, pavadinimas: string, ivertinimas: number, aprasymas: string){
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.ivertinimas = ivertinimas;
        this.aprasymas = aprasymas;
    }
    
}