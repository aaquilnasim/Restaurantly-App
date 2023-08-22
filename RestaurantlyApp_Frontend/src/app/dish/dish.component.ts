import { Component } from '@angular/core';
import { DishService } from '../dish.service';
import { dish } from '../dish';

@Component({
  selector: 'app-dish',
  templateUrl: './dish.component.html',
  styleUrls: ['./dish.component.css']
})
export class DishComponent {
  public dish:dish[] =[];
  constructor(
    private dishservice:DishService
  ){}

  ngOnInit(){
    this.dishservice.getAllDish().subscribe((res:dish[])=>{
      this.dish=res;
    })
  }

  deleteModal:any;
  idTodelete:number=0;
  allMenu:dish[]=[];

  delete(delId:number){
    console.log("Delete in progress");
    this.dishservice.delete(delId).subscribe({
      next:(data)=>{
        this.allMenu=this.allMenu.filter(_=>_.dishID!=delId)
        // this.deleteModal.hide();
        this.ngOnInit();
      },
      error:(err)=>{
        console.log(err);
      }
    }); //delete

  }

}
