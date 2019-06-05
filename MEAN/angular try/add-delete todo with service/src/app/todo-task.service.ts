import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TodoTaskService {

  tasks = [];
  message='';
  constructor() { }

  addTask(task){
    this.tasks.push({name: task.value});
    task.value= '';
    task.focus();
  }

  delTask(task){
    const index = this.tasks.indexOf(task);
    this.tasks.splice(index,1);

  }

}
