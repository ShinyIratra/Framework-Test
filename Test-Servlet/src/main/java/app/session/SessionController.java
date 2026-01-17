package app.test;

import framework.annotation.*;
import framework.util.FrameworkSession;

@ControllerAnnot
public class SessionController {

    // Login : On écrit dans la session
    @UrlAnnot("/login")
    @MethodMapping("GET")
    public String login(FrameworkSession session) {
        session.put("user_role", "ADMIN");
        session.put("user_email", "test@gmail.com");
        return "Vous êtes connecté ! (Session ID stocké)";
    }

    // Dashboard : On lit la session
    @UrlAnnot("/dashboard")
    @MethodMapping("GET")
    public String dashboard(FrameworkSession session) {
        Object email = session.get("user_email");
        
        if (email == null) {
            return "Vous n'êtes pas connecté.";
        }
        
        return "Bienvenue sur le dashboard, " + email.toString();
    }
    
    // Logout : On détruit la session
    @UrlAnnot("/logout")
    @MethodMapping("GET")
    public String logout(FrameworkSession session) {
        session.invalidate();
        return "Déconnexion réussie";
    }
}