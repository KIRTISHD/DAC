import { Component } from '@angular/core';
import { PostsService} from './posts.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'asas';
  posts : any = null;
  constructor(private apiPosts : PostsService) {
    this.apiPosts.getPosts().subscribe(data => this.posts = data);
    this.apiPosts.addPost().subscribe(post => this.posts.push(post));
  }


}
