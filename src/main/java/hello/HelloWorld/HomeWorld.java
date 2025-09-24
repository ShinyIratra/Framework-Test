package hello.HelloWorld;

import framework.UrlAnnotation;

public class HomeWorld {

    @UrlAnnotation(url = "/home")
    public String sayHome() 
    {
        return "Welcome Home!";
    }
}