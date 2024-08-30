import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();

        idades.add(22);
        idades.add(445);
        idades.remove(0);
        idades.get(1);
        idades.size();

        double idade = 22.50;
        if (idade > 22.60) {
            System.out.println("maior");
        } else if (idade == 22.50) {
            System.out.println("igual");
        } else {
            System.out.println("menor");
        }

        for(var i = 0; i < idade; i++){
            System.out.println("oi");
        }

        int id = 1;
        while( id < idade) {
        id++;
        }


    }
}