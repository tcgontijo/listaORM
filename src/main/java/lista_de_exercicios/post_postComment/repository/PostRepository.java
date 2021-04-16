package lista_de_exercicios.post_postComment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lista_de_exercicios.post_postComment.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
