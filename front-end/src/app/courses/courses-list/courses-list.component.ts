import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Course } from 'src/models/course.model';
import { HttpClient } from '@angular/common/http';
import { CourseServiceService } from 'src/app/services/course-service.service';


@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit {

  @Output() courseWasSelected = new EventEmitter<Course>();



  courses: Course[] =   [
    // new Course(1, 'name1', 'disc1', true), 
    // new Course(2, 'name2', 'disc2', true), 
    // new Course(3, 'name3', 'disc3', true)
  ]



  constructor(private restService : CourseServiceService) { }

  ngOnInit() {
    //this.getDataChartData();
  }

  OnCourseSelected(course: Course) {
    this.courseWasSelected.emit(course);
  }

  getDataChartData() {
    //console.log("XD")
    this.restService.getAllCourses()
      .subscribe(
      data => {
        this.courses = data;
      },
      err => {
        //console.log(err);
      }
    );
  }

}
