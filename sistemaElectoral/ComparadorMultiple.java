package sistemaElectoral;

import java.util.Comparator;

public class ComparadorMultiple implements Comparator<Candidato>{
	Comparator<Candidato> c1, c2;

    public ComparadorMultiple(Comparator<Candidato> c1, Comparator<Candidato> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Candidato a1, Candidato a2) {
        int resu = c1.compare(a1,a2);
        if (resu == 0)
            return c2.compare(a1,a2);
        return resu;
    }

}
