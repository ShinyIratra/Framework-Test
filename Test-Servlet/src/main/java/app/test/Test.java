package app.test;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;

@ControllerAnnot
public class Test
{
    @UrlAnnot("/test")
    public void oui()
    {

    }
}