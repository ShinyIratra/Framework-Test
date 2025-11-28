package app.test;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;
import framework.annotation.RequestParam;
import framework.annotation.MethodMapping;

import framework.models.ModelView;

@ControllerAnnot
public class Test
{
    @UrlAnnot("/user/{iratra}/{tafita}")
    @MethodMapping("GET")
    public String user(@RequestParam("iratra") String iratraParam, @RequestParam("tafita") String tafitaParam, String iratra, String tafita)
    {
        return "<p> Ceci est le message (Param) de Tafita : " + tafitaParam + "</p>" +
                "<p> Ceci est le message (Param) de Iratra : " + iratraParam + "</p>" +
                "<p> Ceci est le message de Tafita : " + tafita + "</p>" +
                "<p> Ceci est le message de Iratra : " + iratra + "</p>";
    }

    @UrlAnnot("/post_user")
    @MethodMapping("GET")
    public String post_user(@RequestParam("iratra") String iratraParam, @RequestParam("tafita") String tafitaParam, String iratra, String tafita)
    {
        return "<p> Ceci est le message (Param) de Tafita : " + tafitaParam + "</p>" +
                "<p> Ceci est le message (Param) de Iratra : " + iratraParam + "</p>" +
                "<p> Ceci est le message de Tafita : " + tafita + "</p>" +
                "<p> Ceci est le message de Iratra : " + iratra + "</p>";
    }

    @UrlAnnot("/jsp_test")
    @MethodMapping("GET")
    public ModelView view()
    {
        ModelView mv = new ModelView("test.jsp");
        Integer[] numbers = {1, 2, 3, 4, 5};
        mv.addAttribute("numbers", numbers);
        mv.addAttribute("error", "Ceci est une erreur");
        return mv;
    }

    @UrlAnnot("/test")
    @MethodMapping("GET")
    public String test1()
    {
        return "<p> ça marche \"test\" GET </p>";
    }

    @UrlAnnot("/test")
    @MethodMapping("POST")
    public String test2()
    {
        System.out.println("Mande !!!!");
        return "<p> ça marche \"test\" POST </p>";
    }

    @UrlAnnot("/erreur")
    @MethodMapping("GET")
    public float erreur()
    {
        return 0.2f;
    }
}