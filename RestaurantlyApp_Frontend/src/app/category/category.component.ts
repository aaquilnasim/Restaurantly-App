import { Component } from '@angular/core';
import { category } from '../category';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent {

  public category:category[] =[];
  constructor(
    private categoryservice:CategoryService
  ){}

  ngOnInit(){
    this.categoryservice.getAllCategory().subscribe((res:category[])=>{
      this.category=res;
    })
  }

  deleteModal:any;
  idTodelete:number=0;
  allCategory:category[]=[];

  delete(delId:number){
    console.log("Delete in progress");
    this.categoryservice.delete(delId).subscribe({
      next:(data)=>{
        this.allCategory=this.allCategory.filter(_=>_.categoryID!=delId)
        // this.deleteModal.hide();
        this.ngOnInit();
      },
      error:(err)=>{
        console.log(err);
      }
    }); //delete

  }
}
