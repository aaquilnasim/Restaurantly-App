import { Component } from '@angular/core';
import { common } from '../common';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-menulist',
  templateUrl: './menulist.component.html',
  styleUrls: ['./menulist.component.css']
})
export class MenulistComponent {
  public common:common[] =[];

  constructor(
    private commonservice:CommonService
  ){}

  ngOnInit(){
    this.commonservice.getAll().subscribe((res:common[])=>{
      this.common=res;
    })
  }
}
