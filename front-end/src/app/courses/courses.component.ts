import { Component, OnInit } from '@angular/core';
import { Course } from 'src/models/course.model';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
  selectedCourse : Course;

  constructor() { }

  ngOnInit() {
  }

}
