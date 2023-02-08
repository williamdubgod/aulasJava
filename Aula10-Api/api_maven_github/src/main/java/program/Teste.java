package program;


import java.io.IOException;


import model.User;
import service.ApiGitHub;


public class Teste {


    public static void main(String[] args) {


        ApiGitHub apigithub = new ApiGitHub();


        try {
        	
        	
            User usuario = apigithub.getUsuario("Joseffe10");
           
            String name = usuario.getNome();
            String rep = usuario.getRepositorios();
            String seg = usuario.getSeguidores();
           
            System.out.println(name + "\n");
            System.out.println(rep + "\n");
            System.out.println(seg  + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }
}
