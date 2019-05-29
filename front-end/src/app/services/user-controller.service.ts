import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const courseUrl = 'http://localhost:8080/users/';

@Injectable({
  providedIn: 'root'
})
export class UserControllerService {

  constructor(private http: HttpClient) { }

  registerToCourse(courseId:number, userId: number) {
    return this.http.put<number>(courseUrl + 'addCourse', {courseId: courseId, id: userId});
  }
}
