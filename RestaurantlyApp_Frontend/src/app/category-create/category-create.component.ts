import { Component } from '@angular/core';
import { category } from '../category';
import { Router } from '@angular/router';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent {
  categoryForm:category={
    categoryID: 0,
    categoryName: '',
    categoryDescription: '',
    categoryImage: ''
  };
  constructor(private categoryService:CategoryService,
    private router:Router){}

    ngOnInit():void{}

    create(){
      this.categoryService.createCategory(this.categoryForm)
      .subscribe({
        next:(data)=>{
          this.router.navigate(['/categoryitems'])
        },
        error:(err)=>{
          console.log(err);
        }
      })
    }

}
