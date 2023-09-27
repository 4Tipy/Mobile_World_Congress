import java.util.ArrayList;
import java.util.List;

import Dispositivos.Dispositivos;
import Dispositivos.otros.otros_disp;
import Dispositivos.smartphones.smartphones;
import Dispositivos.Tablets.Tablets;



public class App {
    public static void main(String[] args) {

        // Creamos la lista
        List<Dispositivos> disp = new ArrayList<>();

        // un rellotge intel·ligent de 100 Euros
        disp.add(new otros_disp("prueba1", "prueba2", 100, "reloj inteligente") );
        // un mòbil Android sense accelerador ni gps de 300 Euros
        disp.add(new smartphones("sdas", "klnfsdlds", 300, "Android", false, false));
        // un iPhone de 500 Euros amb accelerador i gps
        disp.add(new smartphones("iphone", "klsdn", 500, "dsl fds", true, true));
        //una tablet de 400 Euros i un altre dispositiu qualsevol
        disp.add(new Tablets("lksdmgkfd", "kjdnbgjkdf", 400, 0));

        disp.add(new otros_disp("prueba4", "prueba5", 600, "patata") );

        for(Dispositivos lista : disp){
            System.out.println(lista);
        }
    }
}
