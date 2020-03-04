package kai.project.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kai.project.todolist.dao.TodoRepository;
import kai.project.todolist.entity.Todo;

@Service
public class TodoServiceImplementation implements TodoService {
	
	private TodoRepository todoRepository;
	
	@Autowired
	public TodoServiceImplementation(TodoRepository theTodoRepository) {
		todoRepository = theTodoRepository;
	}

	@Override
	public List<Todo> getTaskList() {
		return todoRepository.findAllByOrderByStartDateAsc();
	}

	@Override
	public Todo getSingleTodo(int theId) {
		return todoRepository.getOne(theId);
	}

	@Override
	public void saveById(Todo theTodo) {
		todoRepository.save(theTodo);

	}

	@Override
	public void deleteById(int theId) {
		todoRepository.deleteById(theId);

	}

}
