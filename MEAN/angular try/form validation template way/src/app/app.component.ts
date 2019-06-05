import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'formtry';

  user = {
    name: ''
  }
  onSubmit(e){
    console.log(e.controls['username'].status );
  }
}
