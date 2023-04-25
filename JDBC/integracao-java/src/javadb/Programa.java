package javadb;

public class Programa {


    public static void main(String[] args) {
        UsuarioDBOracle db = new UsuarioDBOracle();
       
        Usuario a = new Usuario(2, "Sergio");
       // db.InserirUsuarioDB(a);
        
       // a.setNome("João Marcelo");
       // db.AtualizarUsuarioDB(a);
       
        //db.ExcluirUsuarioDB(1);
       
        db.ListarUsuarioDB();

      
    }
}
