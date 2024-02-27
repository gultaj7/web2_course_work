package az.edu.ada.mw2.crudlibraryapp.crudlibraryapp.service;

import az.edu.ada.mw2.crudlibraryapp.crudlibraryapp.model.BookModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static List<BookModel> books;

    static {
        books = new ArrayList();
        books.add(new BookModel("Animal Farm", 1945));
        books.add(new BookModel("Brave New World", 1932));
    }

    public List<BookModel> getAllBooks() {
        return books;
    }

}
