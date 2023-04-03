/*A resposta é 91, pois soma irá dublicar o valor atual com o valor anterior até que k seja maior que indice*/

public class App {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
            System.out.println(soma);
        }
    }
}
