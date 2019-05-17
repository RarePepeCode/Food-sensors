import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Course } from 'src/models/course.model';


@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit {

  @Output() courseWasSelected = new EventEmitter<Course>();

  courses: Course[] = [
    new Course('xddd', "no.1"),
    new Course('cancer', 'FOR4LIFE')
  ]

  constructor() { }

  ngOnInit() {
  }

  OnCourseSelected(course: Course) {
    this.courseWasSelected.emit(course);
  }

}
