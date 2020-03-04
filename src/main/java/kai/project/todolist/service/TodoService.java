package kai.project.todolist.service;

import java.util.List;

import kai.project.todolist.entity.Todo;

public interface TodoService {

	public List<Todo> getTaskList();
	
	public Todo getSingleTodo(int theId);
	
	public void saveById(Todo theTodo);
	
	public void deleteById(int theId);

}
