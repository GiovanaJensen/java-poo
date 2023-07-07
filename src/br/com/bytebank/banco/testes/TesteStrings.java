package br.com.bytebank.banco.testes;

public class TesteStrings {
    public static void main(String[] args){
        String nome = "Giovana";
        char c = nome.charAt(3); //char i
        System.out.println(c);

        int pos = nome.indexOf("io");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);
        
        String outra = nome.replace("G", "g");
        System.out.println(outra);

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        } 

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);
    }
}
