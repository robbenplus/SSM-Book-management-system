import com.robben.pojo.Books;
import com.robben.service.BookService;
import com.robben.service.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("BookServiceImpl");
        for (Books book : bookService.queryAllBook()) {
            System.out.println(book);
        }
    }
}
