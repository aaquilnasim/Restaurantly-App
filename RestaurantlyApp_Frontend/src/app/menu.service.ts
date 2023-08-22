import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { menu } from './menu';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  constructor(private httpClient:HttpClient) { }
  
  public getAllMenu():Observable<menu[]>{
    return this.httpClient.get<menu[]>(`http://localhost:9090/api/menuitems`);
  }

  createMenu(data:any){
    return this.httpClient.post<any>(`http://localhost:9090/api/menuitem`,data)
    .pipe(map((res:any)=>{
      return res;
    }));
  }

  getById(id:number){
    return this.httpClient.get<menu>(`http://localhost:9090/api/menuitems/${id}`);
  }

  update(payload:menu){
    return this.httpClient.put(`http://localhost:9090/api/menuitems/${payload.menuID}`,payload);
  }

  
  delete(id:number){
    return this.httpClient.delete<menu>(`http://localhost:9090/api/menuitems/${id}`);
  }
}
