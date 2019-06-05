import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'formtry';

  myData = ['facebook','google','youtube'];
  myData2 = [
    {name:'lala', mobile:4000}, 
    {name:'mama', mobile:5000}
  ];

  user = {
    name: ''
  }
  onSubmit(e){
    console.log(e.controls['username'].status );
  }

  onInput(val: string){
    this.title=val;
  }
}
