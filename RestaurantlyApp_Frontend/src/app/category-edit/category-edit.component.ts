import { Component } from '@angular/core';
import { category } from '../category';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent {
  categoryForm:category={
    categoryID: 0,
    categoryName: '',
    categoryDescription: '',
    categoryImage: ''
  };
  constructor(
    private route:ActivatedRoute,
    private router:Router,
    private categoryService:CategoryService
    ){}

    ngOnInit():void{
      this.route.paramMap.subscribe((param)=>{
        var categoryID=Number(param.get('id'));
        this.getById(categoryID);
      });
    }
    getById(categoryID: number) {
      this.categoryService.getById(categoryID).subscribe((data)=>{
        console.log(data);
        this.categoryForm=data;
      });
    }
  
    update(){
      this.categoryService.update(this.categoryForm).subscribe({
        next:(data)=>{
          this.router.navigate(["/categoryitems"]);
        },
        error:(err)=>{
          console.log(err);
        },
      });
      
    }

}
