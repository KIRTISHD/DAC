import { Component, OnInit } from '@angular/core';
import { TodoTaskService } from '../todo-task.service';

@Component({
  selector: 'app-todoapp',
  templateUrl: './todoapp.component.html',
  styleUrls: ['./todoapp.component.scss']
})
export class TodoappComponent implements OnInit {

  tasks = null;
  constructor(private todo : TodoTaskService) { }
  ngOnInit() {
    this.tasks = this.todo.tasks;
  }

  addTask(task){
    this.todo.addTask(task);
  }

  delTask(task){
    this.todo.delTask(task);

  }
  

}
