import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes} from '@angular/router';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';

import { CoursesComponent } from './courses/courses.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HeaderComponent } from './header/header.component';
import { AdminComponent } from './admin/admin.component';
import { MainPageComponent } from './main-page/main-page.component';
import { CoursesMainPageComponent } from './courses/courses-main-page/courses-main-page.component';
import { CoursePageComponent } from './courses/course-page/course-page.component';
import { RecipeSearchPageComponent } from './recipes/recipe-search-page/recipe-search-page.component';
import { RecipesMainPageComponent } from './recipes/recipes-main-page/recipes-main-page.component';
import { RecipePageComponent } from './recipes/recipe-page/recipe-page.component';
import { CreateCourseComponent } from './courses/create-course/create-course.component';
import { RecipesComponent } from './recipes/recipes.component';
import { CreateRecipeComponent } from './recipes/create-recipe/create-recipe.component';


const appRoutes: Routes = [
  { path: 'courses', component: CoursesComponent },
  { path: 'course/:id/:edit',component: CoursePageComponent},
  { path: 'create-course/:create',component: CreateCourseComponent},
  { path: 'recipes', component: RecipesComponent },
  { path: 'recipes-search', component: RecipeSearchPageComponent },
  { path: 'recipe/:id/:edit', component: RecipePageComponent },
  { path: 'create-recipe/:create',component: CreateRecipeComponent},
  { path: 'admin', component: AdminComponent },
  { path:  'main-page', component: MainPageComponent},
  { path:  '', component: MainPageComponent},
  { path:  '**', component: MainPageComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    CoursesComponent,
    NavBarComponent,
    HeaderComponent,
    AdminComponent,
    MainPageComponent,
    CoursesMainPageComponent,
    CoursePageComponent,
    RecipeSearchPageComponent,
    RecipesMainPageComponent,
    RecipePageComponent,
    CreateCourseComponent,
    RecipesComponent,
    CreateRecipeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: false } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
