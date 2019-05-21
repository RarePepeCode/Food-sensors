export class Course {

    public id: any
    public name: string
    public discription: string;
    public approved: boolean

    constructor(id: any, name: string, desc: string, aprroved: boolean){
        this.id = id;
        this.name = name;
        this.discription = desc;
        this.approved = aprroved;
    }
    
}