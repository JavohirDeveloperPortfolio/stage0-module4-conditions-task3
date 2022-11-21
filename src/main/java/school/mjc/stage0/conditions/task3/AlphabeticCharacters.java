package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
            if (character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i' || character == 'y' || character == 'A' || character == 'O' || character == 'U' || character == 'E' || character == 'I' || character == 'Y'){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
