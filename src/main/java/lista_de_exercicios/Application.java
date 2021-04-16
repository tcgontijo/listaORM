package lista_de_exercicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lista_de_exercicios.library_book.domain.Book;
import lista_de_exercicios.library_book.domain.Library;
import lista_de_exercicios.library_book.repository.bookRespository;
import lista_de_exercicios.library_book.repository.libraryRepository;
import lista_de_exercicios.post_postComment.domain.Post;
import lista_de_exercicios.post_postComment.domain.PostComment;
import lista_de_exercicios.post_postComment.repository.PostCommentRepository;
import lista_de_exercicios.post_postComment.repository.PostRepository;
import lista_de_exercicios.todoList_todoListItem.domain.TodoList;
import lista_de_exercicios.todoList_todoListItem.domain.TodoListItem;
import lista_de_exercicios.todoList_todoListItem.repository.TodoListItemRepository;
import lista_de_exercicios.todoList_todoListItem.repository.TodoListRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	TodoListItemRepository itemRepo;

	@Autowired
	TodoListRepository tdRepo;

	@Autowired
	bookRespository bookRepo;

	@Autowired
	libraryRepository libRepo;

	@Autowired
	PostCommentRepository commentRepo;

	@Autowired
	PostRepository postRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* * * * * * * * * * * *
		 * Descomentar e rodar!
		 * * * * * * * * * * * */	
		todoList_todoListItem();
		//library_book();
		//post_postComment();

	}

	public void todoList_todoListItem() {

		TodoList mercado = new TodoList("Mercado");
		TodoList casa = new TodoList("Casa");

		TodoListItem item1 = new TodoListItem("Feijão", mercado);
		TodoListItem item2 = new TodoListItem("Arroz", mercado);
		TodoListItem item3 = new TodoListItem("Macarrão", mercado);
		TodoListItem item4 = new TodoListItem("Leite", mercado);

		TodoListItem item5 = new TodoListItem("Consertar torneira", casa);
		TodoListItem item6 = new TodoListItem("Trocar Lâmpada", casa);
		TodoListItem item7 = new TodoListItem("Pagar Conta de Energia", casa);
		TodoListItem item8 = new TodoListItem("Lavar janelas", casa);

		mercado.getListaDeItens().add(item1);
		mercado.getListaDeItens().add(item2);
		mercado.getListaDeItens().add(item3);
		mercado.getListaDeItens().add(item4);

		casa.getListaDeItens().add(item5);
		casa.getListaDeItens().add(item6);
		casa.getListaDeItens().add(item7);
		casa.getListaDeItens().add(item8);

		tdRepo.save(mercado);
		itemRepo.save(item1);
		itemRepo.save(item2);
		itemRepo.save(item3);
		itemRepo.save(item4);

		tdRepo.save(casa);
		itemRepo.save(item5);
		itemRepo.save(item6);
		itemRepo.save(item7);
		itemRepo.save(item8);

	}
	public void library_book() {
		Library biblioteca1 = new Library("Biblioteca Municipal");
		Library biblioteca2 = new Library("Biblioteca IFTM");

		Book livro1 = new Book("Admirável Mundo Novo", biblioteca1);
		Book livro2 = new Book("1984", biblioteca1);
		Book livro3 = new Book("Fundação", biblioteca1);

		Book livro4 = new Book("Java Persistence", biblioteca2);
		Book livro5 = new Book("Empreendedorismo", biblioteca2);
		Book livro6 = new Book("JavaScript Básico", biblioteca2);

		biblioteca1.getBooks().add(livro1);
		biblioteca1.getBooks().add(livro2);
		biblioteca1.getBooks().add(livro3);

		biblioteca2.getBooks().add(livro4);
		biblioteca2.getBooks().add(livro5);
		biblioteca2.getBooks().add(livro6);

		libRepo.save(biblioteca1);
		bookRepo.save(livro1);
		bookRepo.save(livro2);
		bookRepo.save(livro3);

		libRepo.save(biblioteca2);
		bookRepo.save(livro4);
		bookRepo.save(livro5);
		bookRepo.save(livro6);
	}
	public void post_postComment() {
		Post publicacao1 = new Post("Curta a vida pois a vida é Curta.");
		Post publicacao2 = new Post("Não contavam com minha astúcia!");

		PostComment comentario1 = new PostComment("Quanta sabedoria!", publicacao1);
		PostComment comentario2 = new PostComment("A vida não é tão curta assim", publicacao1);
		PostComment comentario3 = new PostComment("Nem concordo, nem discordo, muito pelo contrário.", publicacao1);

		PostComment comentario4 = new PostComment("Só pode ser Chapolin", publicacao2);
		PostComment comentario5 = new PostComment("Sempre contei com sua astúcia", publicacao2);
		PostComment comentario6 = new PostComment("Polegar vermelho é um ícone.", publicacao2);

		publicacao1.addComment(comentario1);
		publicacao1.addComment(comentario2);
		publicacao1.addComment(comentario3);

		publicacao2.addComment(comentario4);
		publicacao2.addComment(comentario5);
		publicacao2.addComment(comentario6);

		postRepo.save(publicacao1);
		commentRepo.save(comentario1);
		commentRepo.save(comentario2);
		commentRepo.save(comentario3);

		postRepo.save(publicacao2);
		commentRepo.save(comentario4);
		commentRepo.save(comentario5);
		commentRepo.save(comentario6);
	}
}
