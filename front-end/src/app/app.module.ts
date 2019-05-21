import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes} from '@angular/router';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

import { RecipesComponent } from './recipes/recipes.component';
import { RecipesListComponent } from './recipes/recipes-list/recipes-list.component';
import { RecipesCreationComponent } from './recipes/recipes-creation/recipes-creation.component';
import { CoursesComponent } from './courses/courses.component';
import { CoursesListComponent } from './courses/courses-list/courses-list.component';
import { CoursesCreationComponent } from './courses/courses-creation/courses-creation.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HeaderComponent } from './header/header.component';
import { AdminComponent } from './admin/admin.component';
import { MainPageComponent } from './main-page/main-page.component';
import { CourseItemComponent } from './courses/courses-list/course-item/course-item.component';

const appRoutes: Routes = [
  { path: 'courses/courses-list', component: CoursesListComponent },
  { path: 'recipes', component: RecipesComponent },
  { path: 'admin', component: AdminComponent },
  { path:  'main-page', component: MainPageComponent},
  { path:  '', component: MainPageComponent},
  { path:  '**', component: MainPageComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    RecipesComponent,
    RecipesComponent,
    RecipesListComponent,
    RecipesCreationComponent,
    CoursesComponent,
    CoursesListComponent,
    CoursesCreationComponent,
    NavBarComponent,
    HeaderComponent,
    AdminComponent,
    MainPageComponent,
    CourseItemComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
