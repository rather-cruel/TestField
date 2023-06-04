import program.Ukrainian.Alphabet;

public class Main {
    public static void main(String[] args) {
        new Alphabet("м'ѧсо", "mjäso");
        new Alphabet("мясо", "mjaso");
        new Alphabet("Бѣлґород", "Bělgorod");

        new Alphabet("Бѣлґород", true);
        new Alphabet("м'ѧсо", true);
        new Alphabet("мясо", true);
    }
}
