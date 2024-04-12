import utils.StringUtils;
import utils.WeekUtils;

public class Main {
    public static void main(String[] args) {

        String tekst1 = StringUtils.getFormattedText("JakiśTekst");
        System.out.println(tekst1);

        String tekst2 = StringUtils.getFormattedText("Tekst");
        System.out.println(tekst2);

        System.out.println(WeekUtils.MONDAY);

    }
}