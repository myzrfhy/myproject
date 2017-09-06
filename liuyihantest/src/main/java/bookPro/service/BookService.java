package bookPro.service;

import bookPro.bean.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuyihan on 2017/1/17.
 */
@Service
public class BookService {
    @Autowired
    private BookBean book;

    public BookBean getBook()
    {
        return book;
    }
}
