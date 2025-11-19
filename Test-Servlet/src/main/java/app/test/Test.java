package app.test;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;
import framework.annotation.RequestParam;

import framework.models.ModelView;

@ControllerAnnot
public class Test
{
    @UrlAnnot("/test")
    public String oui()
    {
        return "<!DOCTYPE html>" +
               "<html lang='en'>" +
               "<head>" +
               "<meta charset='UTF-8'>" +
               "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
               "<title>yes</title>" +
               "</head>" +
               "<body>" +
               "<p> ça marche ! </p>" +
               "</body>" +
               "</html>";
    }

    @UrlAnnot("/user/{iratra}/{tafita}")
    public String user(@RequestParam("iratra") String iratraParam, @RequestParam("tafita") String tafitaParam, String iratra, String tafita)
    {
        return "<p> Ceci est le message (Param) de Tafita : " + tafitaParam + "</p>" +
                "<p> Ceci est le message (Param) de Iratra : " + iratraParam + "</p>" +
                "<p> Ceci est le message de Tafita : " + tafita + "</p>" +
                "<p> Ceci est le message de Iratra : " + iratra + "</p>";
    }

    @UrlAnnot("/post_user")
    public String post_user(@RequestParam("iratra") String iratraParam, @RequestParam("tafita") String tafitaParam, String iratra, String tafita)
    {
        return "<p> Ceci est le message (Param) de Tafita : " + tafitaParam + "</p>" +
                "<p> Ceci est le message (Param) de Iratra : " + iratraParam + "</p>" +
                "<p> Ceci est le message de Tafita : " + tafita + "</p>" +
                "<p> Ceci est le message de Iratra : " + iratra + "</p>";
    }

    @UrlAnnot("/jsp_test")
    public ModelView view()
    {
        ModelView mv = new ModelView("test.jsp");
        Integer[] numbers = {1, 2, 3, 4, 5};
        mv.addAttribute("numbers", numbers);
        mv.addAttribute("error", "Ceci est une erreur");
        return mv;
    }

    @UrlAnnot("/erreur")
    public float erreur()
    {
        return 0.2f;
    }
}