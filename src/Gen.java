import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Gen {
    public static void main(String[] args) {

        List<String> mois= new LinkedList<>();
        Iterator num_mois= mois.iterator();

        mois.add("Janvier");
        mois.add("fevrier");
        mois.add("mars");
        mois.add("avril");
        mois.add("mai");
        mois.add("juin");
        mois.add("juillet");
        mois.add("aout");
        mois.add("septembre");
        mois.add("octobre");
        mois.add("novembre");
        mois.add("decembre");

        while (num_mois.hasNext()) {
            System.out.println(num_mois.next());
        }
    }

}
