package app.framework;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // Charger la configuration du projet
        ProjectConfig config = new ProjectConfig();

        // Initialiser le scanner avec le package de base défini dans la configuration
        String basePackage = config.getProperty("PACKAGE_RACINE");
        
        System.out.println("Package à scanner: " + basePackage);

        ProjectScanner scanner = new ProjectScanner(basePackage);
        Set<Class<?>> projectClasses = scanner.getAllProjectClasses();
        List<Class<?>> classList = new ArrayList<>(projectClasses);

        for(Class<?> cls : classList) {
            System.out.println("Classe trouvée: " + cls.getName());
        }
    }
}