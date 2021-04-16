package lista_de_exercicios.todoList_todoListItem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lista_de_exercicios.todoList_todoListItem.domain.TodoListItem;

@Repository
public interface TodoListItemRepository extends JpaRepository<TodoListItem, Integer> {

}
