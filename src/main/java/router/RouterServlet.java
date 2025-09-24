package router;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import framework.Router;

public class RouterServlet extends HttpServlet {

    private Router router;
    @Override
    public void init() throws ServletException {
        router = new Router();
        try {
            router.register(hello.HelloWorld.HelloWorld.class);
            router.register(hello.HelloWorld.HomeWorld.class);
        } catch (Exception e) {
            throw new ServletException("Erreur lors de l'enregistrement des routes", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String url = req.getPathInfo();
        String body;
        try {
            body = router.handle(url);
        } catch (Exception e) {
            throw new ServletException("Erreur lors du routage", e);
        }
        res.setContentType("text/html");
        res.getWriter().write(
            "<HTML><HEAD><TITLE> Bonjour tout le monde </TITLE></HEAD><BODY>" +
            body +
            "</BODY></HTML>"
        );
    }
}
