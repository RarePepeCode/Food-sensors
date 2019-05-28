import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CourseControllerService } from 'src/app/services/course-controller.service';
import { Course } from 'src/models/course.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-courses-main-page',
  templateUrl: './courses-main-page.component.html',
  styleUrls: ['./courses-main-page.component.css']
})
export class CoursesMainPageComponent implements OnInit {
  courses: Array<Course>;
  

  @Input() isAdminTab : boolean
  @Output() openCourse = new EventEmitter<number>();

  constructor(private courseController: CourseControllerService, private router: Router) {}

  ngOnInit() {  
    this.courseController.searchCourses()
      .subscribe((courses) => {
        this.courses = courses;
      }
    );
  }

  selectCourse(id){
    this.router.navigate(['course', id, this.isAdminTab]);
  }    
  
  openCreateCourse(){
    this.router.navigate(['create-course']);
  }

}
