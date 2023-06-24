import program.Ukrainian.Alphabet;
import program.Ukrainian.Alphabets.Abecadlo;

public class Main {
    public static void main(String[] args) {
        System.out.println("PL-Abecadło:");
        new Abecadlo("Привіт Світ! як ся маєш?", true);
        new Abecadlo("Цього сьогодні?", true);
        new Abecadlo("Шо Що Щ що Щ ЩЕ чого?", true);
        new Abecadlo("Л ль лі ля лю лє ллє лля ллю лу ли", true);

        System.out.println("\n\nOTHERS:");
        new Alphabet("сьогодні", true);
        new Alphabet("сьогодні", "siohodni");

        new Alphabet("С я ?", "S ja ?");
        new Alphabet("ВЄм", "VIem");
        new Alphabet("з'їв", "zjiv");
        new Alphabet("п'є", "pje");
        new Alphabet("кур'Єр", "kurJer");
        new Alphabet("кур'ЄР", "kurJER");
        new Alphabet("кур'єр", "kurjer");
        new Alphabet("ЯС я СЯ сЯ Ся маєш?", "JAS ja SIa sIA Sia maješ?");
        new Alphabet("нь н ьн 'нь56 ся", "ň n n ň56 sia");
        new Alphabet("Президент дякую дякуючИЙ ДЯКУЮЧИЙ", "Prezydent ďakuju ďakujučÝ ĎAKUJUČÝ");
        new Alphabet("ДЯкуЮЧИй ДяКуЮЧИй ДяКуЮчИй", "ĎAkuJUČÝ ĎaKuJUČÝ ĎaKuJučÝ");
        new Alphabet("Привіт Світ! як ся маєш?", "Pryvit Svit! jak sia maješ?");
        new Alphabet("як сЯ маєш?", "jak sIa maješ?");
        new Alphabet("Я маєш?", "Ja maješ?");
        new Alphabet("Я с маєш?", "Ja s maješ?");
        new Alphabet("як ся маєШ? маЄш? ёмаЄШ?", "jak sia majeŠ? maJeš? ёmaJEŠ?");
        new Alphabet("ДЯкуЮЧИй ДяКуЮЧИй ДяКуЮчИй ДЯКУЮЧИЙ", "ĎAkuJUČÝ ĎaKuJUČÝ ĎaKuJučÝ ĎAKUJUČÝ");
        new Alphabet("ЯС я СЯ сЯ Ся маєш?", "JAS ja SIa sIA Sia maješ?");

        new Alphabet("Мѣсто Бѣлґород", true);
        new Alphabet("м'ѧсо", true);
        new Alphabet("мѧсо", true);
        new Alphabet("мясо", true);
        new Alphabet("м'ясо ся має?", true);
    }
}
