package program;


import java.io.IOException;

import model.User;
import service.ApiGitHub;
import java.util.Scanner;


public class Teste {


    public static void main(String[] args) {


        ApiGitHub apigithub = new ApiGitHub();
        
        Scanner ler = new Scanner(System.in);
        String user;
        

        try {
        	
        	System.out.printf("Digite seu usuario do github: ");
        	user = ler.next();
        	
        	
            User usuario = apigithub.getUsuario(user);
           
            String name = usuario.getNome();
            String rep = usuario.getRepositorios();
            String seg = usuario.getSeguidores();
           
            System.out.println("nome: " + name + "\n");
            System.out.println("repositorios: " + rep + "\n");
            System.out.println("seguidores: " + seg  + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }
}
