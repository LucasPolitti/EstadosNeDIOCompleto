import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class ExerciciosEstadoJava {

public static void main(String[] args) {


Map<String, Integer> estadosNe = new HashMap<>() {{

    put("Pernambuco", 9616621);
    put("Alagoas", 3351543);
    put("Ceará", 9187103);
    put("Rio Grande do Norte", 3534265);
    put("Paraíba", 4039277);


}};

System.out.println(estadosNe.toString());

estadosNe.put("Rio Grande do Norte", 3534165);

System.out.println(estadosNe);

System.out.println("Paraíba está no dicionário? " + estadosNe.containsKey("Paraíba"));

System.out.println("Exiba a população de Pernambuco: " + estadosNe.get("Pernambuco"));

System.out.println("EXIBA OS ESTADOS");

Set<String> estados = estadosNe.keySet();

System.out.println("Todos os Estados: " + estados);

Collection<Integer> populaçãoNe = estadosNe.values();

System.out.println("População: " + populaçãoNe);

System.out.println("Exiba o modelo mais econômico e seu consumo: ");

Integer maiorPopulacao = Collections.max(estadosNe.values());

System.out.println("Maior população: " + maiorPopulacao);

// entries e entry foram nomes dados por escolha no código abaixo
// estudar novamente o método abaixo no final da aula 1 de Maps BootCamp Quebec Java
// estudar interface entry

Set<Map.Entry<String, Integer>> entries = estadosNe.entrySet();

String estadoMaisPopuloso = "";

for (Map.Entry<String, Integer> entry : entries) {
     if (entry.getValue().equals(maiorPopulacao)) {
     estadoMaisPopuloso = entry.getKey();

     System.out.println("Estado mais populoso: " + estadoMaisPopuloso + " - " + maiorPopulacao);

     }
   
    }

    





















    
}





}