import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  httpHeaders = {
    headers: new HttpHeaders({
      'Content-Type': 'Application/Json',
      accept: 'application/json'
    })
  };

  constructor(private api: HttpClient) { }

  getPosts(){
    return this.api.get('https://my-json-server.typicode.com/typicode/demo/posts');
  }

  addPost(){
    const post = {
      title: 'this is sample title',
      body: 'This is body'
    };
    return this.api.post('https://my-json-server.typicode.com/typicode/demo/posts', post, this.httpHeaders);
  }
}
