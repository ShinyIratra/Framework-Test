package app.test;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;

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

    @UrlAnnot("/jsp_test")
    public ModelView view()
    {
        ModelView mv = new ModelView("test.jsp");
        return mv;
    }

    @UrlAnnot("/erreur")
    public float erreur()
    {
        return 0.2f;
    }
}