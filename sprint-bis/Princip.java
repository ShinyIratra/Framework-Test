import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Princip {
    public static void main(String[] args) {
        // Exemple: liste des classes à tester (à adapter dynamiquement)
        String[] classNames = {
            "test1.Test1A",
            "test1.Test1B",
            "test1.Test1C",
            "test2.Test1A",
            "test2.Test1B",
            "test2.Test1C"
            // Ajoute ici toutes les classes à tester
        };

        for (String className : classNames) {
            try {
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(framework.ControllerAnnot.class)) {
                    for (Method method : clazz.getDeclaredMethods()) {
                        if (method.isAnnotationPresent(framework.UrlAnnot.class)) {
                            framework.UrlAnnot url = method.getAnnotation(framework.UrlAnnot.class);
                            System.out.println("Classe: " + className + ", URL: " + url.value());
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                // Classe non trouvée, ignorer
            }
        }
    }
}