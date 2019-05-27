import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from 'src/models/course.model';

const courseUrl = 'http://localhost:8080/courses/';

@Injectable({
  providedIn: 'root'
})
export class CourseControllerService {

  constructor(private http: HttpClient) { }

  searchCourses(): Observable<Array<Course>> {
    return this.http.get<Array<Course>>(courseUrl + 'searchCourses');
  }
}
