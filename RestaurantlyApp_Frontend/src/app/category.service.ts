import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { category } from './category';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private httpClient:HttpClient) { }

  public getAllCategory():Observable<category[]>{
    return this.httpClient.get<category[]>(`http://localhost:9090/api/categoryitems`);
  }

  createCategory(data:any){
    return this.httpClient.post<any>(`http://localhost:9090/api/categoryitem`,data)
    .pipe(map((res:any)=>{
      return res;
    }));
  }

  getById(id:number){
    return this.httpClient.get<category>(`http://localhost:9090/api/categoryitems/${id}`);
  }

  update(payload:category){
    return this.httpClient.put(`http://localhost:9090/api/categoryitems/${payload.categoryID}`,payload);
  }

  
  delete(id:number){
    return this.httpClient.delete<category>(`http://localhost:9090/api/categoryitems/${id}`);
  }
}
