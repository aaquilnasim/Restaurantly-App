import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { common } from './common';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private httpClient:HttpClient) { }

  public getAll():Observable<common[]>{
    return this.httpClient.get<common[]>(`http://localhost:9090/api/common`);
  }
}
