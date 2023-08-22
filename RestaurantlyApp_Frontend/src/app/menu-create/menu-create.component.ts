import { Component } from '@angular/core';
import { menu } from '../menu';
import { MenuService } from '../menu.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-create',
  templateUrl: './menu-create.component.html',
  styleUrls: ['./menu-create.component.css']
})
export class MenuCreateComponent {
  menuForm:menu={
    menuID:0,
    menuName:'',
    menuDescription:'',
    menuImage:''
  };

  constructor(private productService:MenuService,
    private router:Router){}

    ngOnInit():void{}

    create(){
      this.productService.createMenu(this.menuForm)
      .subscribe({
        next:(data)=>{
          this.router.navigate(['/menuitems'])
        },
        error:(err)=>{
          console.log(err);
        }
      })
    }
}
