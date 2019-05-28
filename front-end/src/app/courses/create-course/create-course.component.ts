import { Component, OnInit } from '@angular/core';
import { Course } from 'src/models/course.model';
import { CourseControllerService } from 'src/app/services/course-controller.service';

@Component({
  selector: 'app-create-course',
  templateUrl: './create-course.component.html',
  styleUrls: ['./create-course.component.css']
})
export class CreateCourseComponent implements OnInit {

  course : Course
  constructor(private courseController: CourseControllerService) { }

  ngOnInit() {
    this.course = {
      id: Math.random(),
      pavadinimas: '',
      ivertinimas: 0,
      aprasymas: '',
    }
  }

  submitData(){
    console.log("cs");
    this.courseController.saveCourse(this.course).subscribe();    
  }

}
