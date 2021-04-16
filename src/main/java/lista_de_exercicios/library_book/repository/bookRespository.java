package lista_de_exercicios.library_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lista_de_exercicios.library_book.domain.Book;

public interface bookRespository extends JpaRepository<Book, Integer> {

}
