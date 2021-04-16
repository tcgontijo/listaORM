package lista_de_exercicios.todoList_todoListItem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lista_de_exercicios.todoList_todoListItem.domain.TodoList;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Integer> {

}
