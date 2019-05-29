import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Course } from 'src/models/course.model';
import { CourseControllerService } from 'src/app/services/course-controller.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-course-page',
  templateUrl: './course-page.component.html',
  styleUrls: ['./course-page.component.css']
})
export class CoursePageComponent implements OnInit {

  course : Course
  courseID : number;
  isEditMode : boolean = false;


  constructor(private courseController: CourseControllerService, private route: ActivatedRoute,  private router: Router) { }

  ngOnInit() {     
    this.route.params.subscribe( params => {
      this.courseID = params['id'],
      this.isEditMode = params['edit']
      });
    this.courseController.getCourse(this.courseID)
      .subscribe((course) => {
        console.log("WE" + course)
        this.course = course;
      }
    );

    
  }

  submitCourse(){
    console.log("ciga");
    this.courseController.saveCourse(this.course).subscribe();
    this.navigateBack();  
  }

  deleteCourse(){
    this.courseController.deleteCourse(this.courseID).subscribe();
    this.navigateBack(); 
  }

  navigateBack() { //isEditMode === 'true'
    if (this.isEditMode)
    {
      this.router.navigate(['admin']);
    }
    else{
      this.router.navigate(['courses']);
    }
  }

  registerToCourse(courseId: number) {
    this.courseController.selectCourse(courseId).subscribe();
    this.navigateBack();
  }
}
