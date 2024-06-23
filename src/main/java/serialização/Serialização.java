package serialização;

import dominio.Cargo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

public class Serialização {

//    public static void main(String[] args) {
//        Cargo cargo = new Cargo("Gerente", "diretoria", 10550.20);
//        serializar(cargo,"C:/Users/leona/OneDrive/Documentos/NetBeansProjects/2914-java-screenmatch-listas-colecoes2/mercado/src/main/java/serialização/banco.txt");
//    
//    }
    public static <T> void serializar(T objeto, String path) {
        Path caminho = Paths.get(path.toString());
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(caminho))) {
            oos.writeObject(objeto);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static ArrayList<Object> lerArquivoBinario(String nomeArq) {
        ArrayList<Object> lista = new ArrayList();
        try {
            File arq = new File(nomeArq);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Object>) objInput.readObject();
                objInput.close();
            }
        } catch (IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch (ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
        }
        return (lista);
    }
}
