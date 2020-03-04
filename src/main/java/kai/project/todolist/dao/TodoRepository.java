package kai.project.todolist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import kai.project.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	public List<Todo> findAllByOrderByStartDateAsc();
}
