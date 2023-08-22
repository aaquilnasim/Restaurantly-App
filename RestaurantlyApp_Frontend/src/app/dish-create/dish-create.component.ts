import { Component } from '@angular/core';
import { dish } from '../dish';
import { DishService } from '../dish.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dish-create',
  templateUrl: './dish-create.component.html',
  styleUrls: ['./dish-create.component.css']
})
export class DishCreateComponent {
  dishForm:dish={
    dishID: 0,
    dishName: '',
    dishDescription: '',
    dishPrice: 0,
    dishImage: '',
    nature: ''
  };

  constructor(private dishService:DishService,
    private router:Router){}

    ngOnInit():void{}

    create(){
      this.dishService.createDish(this.dishForm)
      .subscribe({
        next:(data)=>{
          this.router.navigate(['/dishitems'])
        },
        error:(err)=>{
          console.log(err);
        }
      })
    }

}
