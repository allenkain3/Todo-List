package kai.project.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kai.project.todolist.entity.Todo;
import kai.project.todolist.service.TodoService;

@Controller
@RequestMapping("/todos")
public class TodoController {
	
	private TodoService todoService;
	
	@Autowired
	public TodoController(TodoService theTodoService) {
		todoService = theTodoService;
	}

	//get mapping for "/list" of to-dos
	@GetMapping("/list")
	public String getTodoList(Model theModel){
		
		List<Todo> todos = todoService.getTaskList();
		
		theModel.addAttribute("todos", todos);
		
		return "todos/todo-list";
	}
	
	//get mapping for "/showFormForAdd" 
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		//create a model attribute for bind form data
		Todo todo = new Todo();
		
		theModel.addAttribute("todo", todo);
		
		return "todos/todo-form";
	}
	
	//get mapping for "/save" 
	@PostMapping("/save")
	public String saveTodo(@ModelAttribute("todo") Todo theTodo ) {
		
		todoService.saveById(theTodo);
		
		return "redirect:/todos/list";
		
	}
	
	//get mapping for "/showFormForUpdate
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("todoId") int theId, Model theModel) {
		
		Todo theTodo = todoService.getSingleTodo(theId);
		
		theModel.addAttribute("todo",theTodo);
		
		return "/todos/todo-form";
		
	}
	
	//get mapping for "/delete" 
	@GetMapping("/delete")
	public String delete(@RequestParam("todoId") int theId) {
		
		todoService.deleteById(theId);
		
		return "redirect:/todos/list";
	}
	

}
