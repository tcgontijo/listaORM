package lista_de_exercicios.library_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lista_de_exercicios.library_book.domain.Library;

public interface libraryRepository extends JpaRepository<Library, Integer> {

}
