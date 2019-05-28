import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RecipesMainPageComponent } from './recipes-main-page.component';

describe('RecipesMainPageComponent', () => {
  let component: RecipesMainPageComponent;
  let fixture: ComponentFixture<RecipesMainPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RecipesMainPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RecipesMainPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
