import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { dish } from './dish';

@Injectable({
  providedIn: 'root'
})
export class DishService {

  constructor(private httpClient:HttpClient) { }

  public getAllDish():Observable<dish[]>{
    return this.httpClient.get<dish[]>(`http://localhost:9090/api/dishitems`);
  }

  createDish(data:any){
    return this.httpClient.post<any>(`http://localhost:9090/api/dishitem`,data)
    .pipe(map((res:any)=>{
      return res;
    }));
  }

  getById(id:number){
    return this.httpClient.get<dish>(`http://localhost:9090/api/dishitems/${id}`);
  }

  update(payload:dish){
    return this.httpClient.put(`http://localhost:9090/api/dishitems/${payload.dishID}`,payload);
  }

  
  delete(id:number){
    return this.httpClient.delete<dish>(`http://localhost:9090/api/dishitems/${id}`);
  }
}
