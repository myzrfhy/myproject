package bookPro.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by liuyihan on 2017/1/17.
 */
@Component
@ConfigurationProperties(prefix="book")
public class BookBean {
    private int count;
    private String name;
    public BookBean(){

    }
    public BookBean(int count,String name) {
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
