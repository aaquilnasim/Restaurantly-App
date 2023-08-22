import { Component } from '@angular/core';
import { menu } from '../menu';
import { ActivatedRoute, Router } from '@angular/router';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-menu-edit',
  templateUrl: './menu-edit.component.html',
  styleUrls: ['./menu-edit.component.css']
})
export class MenuEditComponent {
  menuForm: menu={
    menuID: 0,
    menuName: '',
    menuDescription: '',
    menuImage: ''
  };
  constructor(
    private route:ActivatedRoute,
    private router:Router,
    private menuService:MenuService
  ){}
  
  ngOnInit():void{
    this.route.paramMap.subscribe((param)=>{
      var menuID=Number(param.get('id'));
      this.getById(menuID);
    });
  }
  getById(menuID: number) {
    this.menuService.getById(menuID).subscribe((data)=>{
      console.log(data);
      this.menuForm=data;
    });
  }

  update(){
    this.menuService.update(this.menuForm).subscribe({
      next:(data)=>{
        this.router.navigate(["/menuitems"]);
      },
      error:(err)=>{
        console.log(err);
      },
    });
    
  }

}
