package app.upload;

import framework.annotation.ControllerAnnot;
import framework.annotation.UrlAnnot;
import framework.annotation.MethodMapping;
import framework.models.ModelView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

@ControllerAnnot
public class UploadController {

    @UrlAnnot("/upload_form")
    @MethodMapping("GET")
    public ModelView uploadForm() {
        return new ModelView("upload.jsp");
    }
    
    @UrlAnnot("/upload")
    @MethodMapping("POST")
    public String upload(Map<String, byte[]> files) {
        String destinationFolder = "uploads";

        StringBuilder result = new StringBuilder("<h3>Rapport d'Upload :</h3>");
        
        // Vérification défensive
        if (files == null || files.isEmpty()) {
            return "Aucun fichier reçu (Map vide).";
        }

        // Vérification du dossier de destination
        File destinationDir = new File(destinationFolder);
        if (!destinationDir.exists()) {
            if (!destinationDir.mkdirs()) {
                return "Erreur : Impossible de créer le dossier de destination.";
            }
        }

        // 2. On parcourt les fichiers reçus
        for (Map.Entry<String, byte[]> entry : files.entrySet()) {
            String inputName = entry.getKey(); // ex: "file1" ou "file2"
            byte[] content = entry.getValue(); // le contenu binaire
            
            result.append("<p><strong>Champ :</strong> ").append(inputName);
            result.append(" | <strong>Taille :</strong> ").append(content.length).append(" octets");

            // 3. TEST ULTIME : Sauvegarde sur le disque pour vérifier que le fichier n'est pas corrompu
            try {
                // On sauvegarde dans le dossier spécifié par l'utilisateur
                String safeName = destinationFolder + File.separator + "test_upload_" + inputName + ".dat"; 
                File f = new File(safeName);
                
                try (FileOutputStream fos = new FileOutputStream(f)) {
                    fos.write(content);
                }
                
                result.append(" | <span style='color:green'>Sauvegardé sous : " + f.getAbsolutePath() + "</span></p>");
                
            } catch (IOException e) {
                result.append(" | <span style='color:red'>Erreur sauvegarde : " + e.getMessage() + "</span></p>");
            }
        }
        
        return result.toString();
    }
}