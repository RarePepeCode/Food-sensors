import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CourseServiceService {

  private allCoursesUrl = 'http://localhost:8081/courses/allCourses';

  constructor(private http: HttpClient) { }

  private extractData(res: Response) {
    let body = res;

    return body || { };
  }

  getAllCourses(): Observable<any> {
    return this.http.get(this.allCoursesUrl).pipe(
      map(this.extractData));
  }
}
