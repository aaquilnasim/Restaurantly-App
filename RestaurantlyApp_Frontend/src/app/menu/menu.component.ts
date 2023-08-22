import { Component } from '@angular/core';
import { NgClass } from '@angular/common';
import { menu } from '../menu';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {

  public menu:menu[] =[];
  constructor(
    private menuservice:MenuService
  ){}

  ngOnInit(){
    this.menuservice.getAllMenu().subscribe((res:menu[])=>{
      this.menu=res;
    })
  }

  deleteModal:any;
  idTodelete:number=0;
  allMenu:menu[]=[];

  delete(delId:number){
    console.log("Delete in progress");
    this.menuservice.delete(delId).subscribe({
      next:(data)=>{
        this.allMenu=this.allMenu.filter(_=>_.menuID!=delId)
        // this.deleteModal.hide();
        this.ngOnInit();
      },
      error:(err)=>{
        console.log(err);
      }
    }); //delete

  }

}


