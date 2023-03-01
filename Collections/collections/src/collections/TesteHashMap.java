package collections;

import java.util.HashMap;


public class TesteHashMap {


    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<String, String>();
       
        map.put("nome", "William");
        map.put("email", "william@gmail.com");
        map.put("funcao", "Desenvolvedor");
        map.put("linkedin", "linkedin.com/william");
        map.put("rg", null);
       
        map.remove("linkedin");


        System.out.println(map.get("funcao"));
       
        System.out.println(map.get("linkedin"));
       
        System.out.println(map);
       
        // For each com Lambda function
        map.forEach((key, value) -> {
            System.out.print(key + "=" + value + " ");
          });
       
        // For each convencional
        for (HashMap.Entry<String, String> m : map.entrySet()) {
 
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }
}
