package bookPro.controller;

import bookPro.bean.BookBean;
import bookPro.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by liuyihan on 2017/1/16.
 */
@EnableSwagger2
@RestController
@Api("BookController")
public class BookController {
    @Autowired
    private BookService bookService;

    @ApiOperation("获得书籍")
    @RequestMapping(value = "/book/get",method = RequestMethod.GET)
    public BookBean getBook() {
        return bookService.getBook();
    }

    @ApiOperation("获得书籍的数量")
    @RequestMapping(value = "/book/{xishu}/count",method = RequestMethod.GET)
    public int getHash(@PathVariable int xishu) {
        return bookService.getBook().getCount()*xishu;
    }

}



