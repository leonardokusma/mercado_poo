package serialização;

import dominio.Cargo;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

public class Serialização {
    
    
    public static void main(String[] args) {
        Cargo cargo = new Cargo(1,"Gerente", "diretoria", 10550.20);
        serializar(cargo,"C:/Users/leona/OneDrive/Documentos/NetBeansProjects/2914-java-screenmatch-listas-colecoes2/mercado/src/main/java/serialização/teste.txt");
    
    }

    private static <T> void serializar(T objeto, String path) {
        Path caminho = Paths.get(path.toString());
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(caminho))){
            oos.writeObject(objeto);
            oos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            
        } 
        }
    }
