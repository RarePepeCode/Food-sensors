import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Comment } from 'src/models/comment.model';

const commentUrl = 'http://localhost:8080/comments/';

@Injectable({
  providedIn: 'root'
})
export class CommentControllerService {

  constructor(private http: HttpClient) { }

  comment(comment: Comment): Observable<number> {
    return this.http.post<number>(commentUrl + 'comment', comment);
  }

  rate(comment: Comment): Observable<number> {
    return this.http.post<number>(commentUrl + 'rate', comment);
  }
}
