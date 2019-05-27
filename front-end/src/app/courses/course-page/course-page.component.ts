import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Course } from 'src/models/course.model';
import { CourseControllerService } from 'src/app/services/course-controller.service';

@Component({
  selector: 'app-course-page',
  templateUrl: './course-page.component.html',
  styleUrls: ['./course-page.component.css']
})
export class CoursePageComponent implements OnInit {

  course : Course
  courseID : number;
  isEditMode : boolean


  constructor(private courseController: CourseControllerService, private route: ActivatedRoute) { }

  ngOnInit() {     
    this.route.params.subscribe( params => {
      this.courseID = params['id'],
      this.isEditMode = params['edit']
      })
    this.courseController.getCourse(this.courseID)
      .subscribe((course) => {
        this.course = course;
      }
    );
    console.log(this.isEditMode)
    this.course = new Course(1, "Pavadinimas", 10, "ilgas aprasymas");
  }

}
