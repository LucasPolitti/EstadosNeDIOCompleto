import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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

     //Estado com a menor população, vamos trabalhar com a chave e o valor separadamente, método values retorna uma Collection de valores e o KeySet retorna um Set, vamos trabalhar com eles separadamente, mas tendo ligação

    System.out.println("Exiba o Estado menos populoso: ");

    Integer menorPopulacao = Collections.min(estadosNe.values());

    String estadoMenosPopuloso = "";

    for (Map.Entry<String,Integer> entry2 : estadosNe.entrySet()) {

        if (entry2.getValue().equals(menorPopulacao)) {

        estadoMenosPopuloso = entry2.getKey();

        System.out.println("Menos populoso: " + estadoMenosPopuloso + " - " + menorPopulacao);

        }
        
    }


    System.out.println("EXIBA A SOMA DOS CONSUMOS: ");

    Iterator<Integer> iterator = estadosNe.values().iterator();

    Integer soma = 0;
    while(iterator.hasNext()) {

        soma += iterator.next();
    }

    System.out.println("Soma das populações: " + soma);

    System.out.println("EXIBA A MÉDIA DA SOMA DAS POPULAÇÕES: ");

    System.out.println("A média é : " + soma/estadosNe.size());

    System.out.println(estadosNe);

    System.out.println("REMOVA OS ESTADOS COM A POPULAÇÃO MENOR DO QUE 4 MILHÕES");

    Iterator<Integer> iterator1 = estadosNe.values().iterator();

    while(iterator1.hasNext()) {
         if (iterator1.next() < 4000000) iterator1.remove();
    }

    System.out.println(estadosNe);

    System.out.println("APAGUE O DICIONÁRIO DE ESTADOS DO NE");

    estadosNe.clear();

    System.out.println("CONFIRA SE O DICIONÁRIO ESTÁ VAZIO: ");

    System.out.println("O dicionário está vazio? " + estadosNe.isEmpty());






    





















    
}





}