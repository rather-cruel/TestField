import program.Alphabet;
import program.Ukrainian;

public class Main {
    public static void main(String[] args) {
        new Alphabet("нь н ьн 'нь56 ся");
        new Alphabet("дякую дякуючИЙ ДЯКУЮЧИЙ");
        new Alphabet("дякую дякуючИЙ ДЯкуЮЧИй");
        new Alphabet("дякую дякуючИЙ ДяКуЮЧИй");
        new Alphabet("дякую дякуючИЙ ДяКуЮчИй");
        new Alphabet("Привіт Світ! як ся маєш? Президент");
        new Alphabet("Привіт Світ! як ся маєШ? Президент");
        new Alphabet("Привіт Світ! Як ся маЄш? Президент");
        new Alphabet("Привіт Світ! Як ся ёмаЄШ? Президент");
    }
}
