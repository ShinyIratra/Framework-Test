package app.test;

import framework.annotation.*;
import framework.util.FrameworkSession;
import framework.annotation.AuthAnnot;

@ControllerAnnot
public class SessionController {

    // Login : On écrit dans la session
    @UrlAnnot("/login")
    @MethodMapping("GET")
    public String login(FrameworkSession session) {
        session.put("user_role", "ADMIN");
        session.put("user_email", "test@gmail.com");
        session.put("auth_user", "employe");
        return "Vous êtes connecté ! (Session ID stocké)";
    }

    // Dashboard : On lit la session
    @UrlAnnot("/frontoffice")
    @AuthAnnot("employe")
    @MethodMapping("GET")
    public String frontoffice(FrameworkSession session) {
        Object email = session.get("user_email");
        
        if (email == null) {
            return "Vous n'êtes pas connecté.";
        }
        
        return "Bienvenue sur le dashboard, " + email.toString() + " seules les employes peuvent voir ceci.";
    }

     // Dashboard : On lit la session
    @UrlAnnot("/backoffice")
    @AuthAnnot("manager")
    @MethodMapping("GET")
    public String backoffice(FrameworkSession session) {
        Object email = session.get("user_email");
        
        if (email == null) {
            return "Vous n'êtes pas connecté.";
        }
        
        return "Bienvenue sur le dashboard, " + email.toString() + " seules les managers peuvent voir ceci.";
    }

    @UrlAnnot("/all")
    @AuthAnnot("")
    @MethodMapping("GET")
    public String all(FrameworkSession session) {
        Object email = session.get("user_email");
        
        if (email == null) {
            return "Vous n'êtes pas connecté.";
        }
        
        return "Bienvenue sur le dashboard, " + email.toString() + " toutes les personnes connectées peuvent voir ceci.";
    }
    
    // Logout : On détruit la session
    @UrlAnnot("/logout")
    @MethodMapping("GET")
    public String logout(FrameworkSession session) {
        session.invalidate();
        return "Déconnexion réussie";
    }
}