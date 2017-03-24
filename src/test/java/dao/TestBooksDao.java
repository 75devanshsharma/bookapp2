package dao;
import java.util.List;

import dao.BooksDao;
import model.Books;

public class TestBooksDao {
	public static void main(String[] args) {
//		Books b = new Books();
//		b.setName("Java");
//		b.setPrice(600);
//		b.setStatus("Available");
		BooksDao dao= new BooksDao();
		//List<Books> list = dao.list();
		//System.out.println(list);
//		dao.insert(b);
		Books b = dao.FindbyName("Python");
		System.out.println(b);
		b.setPrice(800);
		dao.update(b);
	}

}
