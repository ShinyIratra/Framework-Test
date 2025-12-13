package app.test;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;
import framework.annotation.RequestParam;
import framework.annotation.MethodMapping;
import framework.annotation.JsonAnnot;

import framework.models.ModelView;

import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import app.model.Employe;
import app.model.Departement;

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

    @UrlAnnot("/formulaire")
    @MethodMapping("GET")
    public ModelView formulaire_view()
    {
        ModelView mv = new ModelView("formulaire.jsp");
        mv.addAttribute("titre", "Formulaire Test");
        return mv;
    }

    @UrlAnnot("/formulaire_sprint8")
    @MethodMapping("POST")
    public String formulaire_submit(Map<String, Object[]> parameterMap)
    {
        StringBuilder result = new StringBuilder("<h1>Paramètres reçus :</h1><ul>");
        
        for (Map.Entry<String, Object[]> entry : parameterMap.entrySet()) 
        {
            String paramName = entry.getKey();
            Object[] paramValues = entry.getValue();
            result.append("<li><strong>")
                  .append(paramName)
                  .append("</strong> : ")
                  .append(String.join(", ", Arrays.stream(paramValues).map(Object::toString).toArray(String[]::new)))
                  .append("</li>");
        }
        
        result.append("</ul>");
        return result.toString();
    }

    @UrlAnnot("/formulaire")
    @MethodMapping("POST")
    @JsonAnnot
    public Employe formulaire_submit(Employe e)
    {
        return e;
    }

    @UrlAnnot("/departement")
    @MethodMapping("GET")
    @JsonAnnot
    public List<Departement> getDepartements()
    {   
        List<Departement> departements = new ArrayList<>();
        departements.add(new Departement(1, "Informatique"));
        departements.add(new Departement(2, "Ressources Humaines"));
        departements.add(new Departement(3, "Marketing"));
        return departements;
    }

    @UrlAnnot("/erreur")
    @MethodMapping("GET")
    public float erreur()
    {
        return 0.2f;
    }
}