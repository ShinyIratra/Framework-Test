package hello.HelloWorld;

import framework.UrlAnnotation;

public class HelloWorld {

    @UrlAnnotation(url = "/hello")
    public String sayHello() 
    {
        return "Hello, World!";
    }
}