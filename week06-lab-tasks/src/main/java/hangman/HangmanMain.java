package hangman;

import java.util.Scanner;

public class HangmanMain {
        private String wordToFind = "alma";
        private String wordFound = "_".repeat(wordToFind.length());
        private int chances = 8;

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyi tipped van még: " + chances);
            System.out.println("Mi a következő tipped?");
            String guessedCharacter = scanner.nextLine();
            if(wordToFind.contains(guessedCharacter)){
                System.out.println("Jó!");
                wordFound = updateWordFound(wordToFind, wordFound, guessedCharacter);
//                wordFound = updateTheWordFound(wordToFind, wordFound, guessedCharacter);
            }else{
                System.out.println("Nem!");
                chances--;
            }
        }while ((wordFound.contains("_")) && chances > 0);

        if(!wordFound.contains("_")){
            System.out.println("Ügyes");
        }else{
            System.out.println("Vesztettél");
        }
    }

    public String updateTheWordFound(String wordTofind, String wordFound,String guessedCharacter){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < wordFound.length();i++){
                if(guessedCharacter.equals(String.valueOf(wordTofind.charAt(i)))){
                    stringBuilder.append(guessedCharacter);
                }else{
                    stringBuilder.append(wordFound.charAt(i));
                }
            }
        return stringBuilder.toString();
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}