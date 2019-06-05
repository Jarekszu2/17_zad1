package ofertaSprzedazy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOfertaSprzedaży {
    public static void main(String[] args) {
        System.out.println();

        OfertaSprzedazy os1 = new OfertaSprzedazy("n1", 21.0);
        OfertaSprzedazy os2 = new OfertaSprzedazy("d3", 1.0);
        OfertaSprzedazy os4 = new OfertaSprzedazy("n21", 121.0);
        OfertaSprzedazy os6 = new OfertaSprzedazy("a3", 121.0);

        List<OfertaSprzedazy> listaOfert = new ArrayList<OfertaSprzedazy>();
        listaOfert.add(os1);
        listaOfert.add(os2);
        listaOfert.add(os4);
        listaOfert.add(os6);

        listaOfert.forEach(System.out::println);

        System.out.println();
        Collections.sort(listaOfert);
        listaOfert.forEach(System.out::println);
    }
}
