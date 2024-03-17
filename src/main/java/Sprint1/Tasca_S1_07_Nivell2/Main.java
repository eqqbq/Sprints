package Sprint1.Tasca_S1_07_Nivell2;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = obtainPath(Movil.class);

        File fileJSON = new File(path);

        if (!fileJSON.exists()){
            fileJSON.createNewFile();
        }

        List<Movil> listaMoviles = new ArrayList();

        listaMoviles.add(new Movil("Samsung", 23));
        listaMoviles.add(new Movil("LG", 40));
        listaMoviles.add(new Movil("Sony", 98));
        listaMoviles.add(new Movil("Xiaomi", 12));

        String json = new Gson().toJson(listaMoviles);

        try {
            FileWriter myWriter = new FileWriter(fileJSON);
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static String obtainPath(Class<?> clase) {

        Serializer annotation = clase.getAnnotation(Serializer.class);
        return annotation.addedPath();
    }
}
