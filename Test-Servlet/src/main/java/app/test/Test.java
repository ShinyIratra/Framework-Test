package app.test;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;

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
}