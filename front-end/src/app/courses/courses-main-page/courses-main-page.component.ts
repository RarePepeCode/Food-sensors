import { Component, OnInit } from '@angular/core';
import { CourseControllerService } from 'src/app/services/course-controller.service';
import { Course } from 'src/models/course.model';

@Component({
  selector: 'app-courses-main-page',
  templateUrl: './courses-main-page.component.html',
  styleUrls: ['./courses-main-page.component.css']
})
export class CoursesMainPageComponent implements OnInit {
  courses: Array<Course>;

  constructor(private courseController: CourseControllerService) { }

  ngOnInit() {
    this.courseController.searchCourses()
      .subscribe((courses) => {
        this.courses = courses;
      }
    );
  }

}
