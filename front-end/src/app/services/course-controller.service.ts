import { UserControllerService } from './user-controller.service';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Headers, RequestOptions } from '@angular/http';
import { Course } from 'src/models/course.model';

const courseUrl = 'http://localhost:8080/courses/';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class CourseControllerService {

  constructor(private http: HttpClient, private userController: UserControllerService) { }

  searchCourses(): Observable<Array<Course>> {
    return this.http.get<Array<Course>>(courseUrl + 'searchCourses');
  }

  getCourse(id): Observable<Course> {
    return this.http.get<Course>(courseUrl + 'getCourse/' + id);
  }

  deleteCourse(id): Observable<{}> {
    return this.http.delete(courseUrl + 'deleteCourse/' + id);
  }

  saveCourse(course : Course): Observable<{}> {
    console.log(course);
    return this.http.post((courseUrl + 'saveCourse'), course,  httpOptions);
  }

  selectCourse(courseId: number):Observable<number> {
    return this.userController.registerToCourse(courseId, 1);
  }

  saveCoursesWithRecipes(course: Course, id :number): Observable<{}> {
    return this.http.post((courseUrl + 'saveCoursesRecipes/' + id), course, httpOptions);
  }

}
