public class EX0304 {
    public static int primeiroCaractereUnico(String input) {
        char[] words = input.toCharArray();
        char[] equals = words.clone();

        for(int i = 0; i < input.length(); i++) {
            for(int j = 0; j < input.length(); j++) {
                if (words[j] == (words[i]) && i != j) {
                    equals[i] = 0;
                    equals[j] = 0;
                }
            }
        }

        for(int k = 0; k < equals.length; k++) {
            if (equals[k] != 0) {
                return k;
            }
        }

        return -1;
    }
}