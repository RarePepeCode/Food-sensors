import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const courseUrl = 'http://localhost:8080/users/';

@Injectable({
  providedIn: 'root'
})
export class UserControllerService {

  constructor(private http: HttpClient) { }

  registerToCourse(courseId:number, userId: number): Observable<number> {
    return this.http.get<number>(courseUrl + 'addCourse?id=' + userId + '&courseId=' + courseId);
  }
}
