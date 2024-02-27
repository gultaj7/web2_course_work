package az.edu.ada.mw2.crudlibraryapp.crudlibraryapp.Controller;

import az.edu.ada.mw2.crudlibraryapp.crudlibraryapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBookPage(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book_page";
    }
}
