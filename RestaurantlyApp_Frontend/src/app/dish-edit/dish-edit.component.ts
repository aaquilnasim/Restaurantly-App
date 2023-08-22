import { Component } from '@angular/core';
import { dish } from '../dish';
import { ActivatedRoute, Router } from '@angular/router';
import { DishService } from '../dish.service';

@Component({
  selector: 'app-dish-edit',
  templateUrl: './dish-edit.component.html',
  styleUrls: ['./dish-edit.component.css']
})
export class DishEditComponent {
  dishForm:dish={
    dishID: 0,
    dishName: '',
    dishDescription: '',
    dishPrice: 0,
    dishImage: '',
    nature: ''
  };

  constructor(
    private route:ActivatedRoute,
    private router:Router,
    private dishService:DishService
    ){}

    ngOnInit():void{
      this.route.paramMap.subscribe((param)=>{
        var dishID=Number(param.get('id'));
        this.getById(dishID);
      });
    }
    getById(categoryID: number) {
      this.dishService.getById(categoryID).subscribe((data)=>{
        console.log(data);
        this.dishForm=data;
      });
    }
  
    update(){
      this.dishService.update(this.dishForm).subscribe({
        next:(data)=>{
          this.router.navigate(["/dishitems"]);
        },
        error:(err)=>{
          console.log(err);
        },
      });
      
    }

}
