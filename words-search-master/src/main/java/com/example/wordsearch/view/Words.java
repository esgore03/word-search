package com.example.wordsearch.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
    private char[][] wordsSearch;
    private List<String> arrayWords;
    public void Words (){
        this.wordsSearch = new char[][] {
                {'J', 'H', 'G', 'J', 'G', 'D', 'U', 'I', 'T', 'L', 'I', 'O', 'G', 'D', 'R', 'F', 'H', 'J', 'N', 'J'},
                {'N', 'U', 'I', 'N', 'S', 'A', 'R', 'U', 'K', 'L', 'A', 'A', 'O', 'P', 'B', 'E', 'C', 'E', 'A', 'D'},
                {'C', 'T', 'Q', 'O', 'F', 'A', 'X', 'P', 'I', 'N', 'R', 'B', 'R', 'Q', 'Z', 'B', 'N', 'D', 'R', 'F'},
                {'I', 'E', 'U', 'E', 'G', 'U', 'F', 'T', 'C', 'Y', 'X', 'E', 'A', 'A', 'X', 'H', 'O', 'G', 'R', 'O'},
                {'D', 'C', 'I', 'I', 'O', 'C', 'R', 'Y', 'O', 'D', 'N', 'C', 'C', 'I', 'D', 'K', 'S', 'E', 'A', 'A'},
                {'N', 'F', 'E', 'H', 'I', 'G', 'A', 'I', 'F', 'G', 'Z', 'P', 'T', 'C', 'K', 'O', 'N', 'V', 'Q', 'R'},
                {'U', 'V', 'O', 'E', 'Y', 'C', 'K', 'G', 'I', 'J', 'R', 'I', 'D', 'E', 'Y', 'E', 'I', 'T', 'W', 'N'},
                {'L', 'W', 'U', 'U', 'O', 'C', 'A', 'E', 'S', 'I', 'R', 'U', 'R', 'P', 'K', 'C', 'O', 'D', 'W', 'C'},
                {'U', 'X', 'E', 'C', 'U', 'A', 'N', 'R', 'A', 'F', 'I', 'U', 'S', 'T', 'I', 'U', 'N', 'T', 'E', 'E'},
                {'L', 'C', 'F', 'J', 'T', 'I', 'N', 'S', 'M', 'J', 'Z', 'U', 'O', 'P', 'S', 'A', 'N', 'L', 'D', 'N'},
                {'L', 'H', 'I', 'W', 'K', 'V', 'B', 'R', 'Z', 'H', 'A', 'N', 'A', 'A', 'R', 'Y', 'L', 'A', 'V', 'S'},
                {'F', 'N', 'Y', 'I', 'L', 'N', 'M', 'U', 'Y', 'I', 'B', 'U', 'Y', 'B', 'N', 'I', 'R', 'J', 'D', 'H'},
                {'X', 'E', 'R', 'V', 'E', 'O', 'B', 'Z', 'I', 'M', 'J', 'S', 'E', 'N', 'M', 'I', 'I', 'I', 'W', 'Y'},
                {'N', 'V', 'N', 'A', 'D', 'L', 'M', 'A', 'N', 'R', 'M', 'Z', 'A', 'A', 'U', 'X', 'N', 'B', 'N', 'V'},
                {'S', 'C', 'U', 'R', 'F', 'A', 'W', 'T', 'K', 'U', 'B', 'E', 'C', 'S', 'T', 'T', 'J', 'D', 'U', 'A'},
                {'O', 'I', 'S', 'U', 'U', 'T', 'D', 'I', 'O', 'H', 'R', 'W', 'U', 'K', 'E', 'J', 'S', 'O', 'A', 'N'},
                {'G', 'U', 'Z', 'S', 'Q', 'A', 'E', 'Z', 'R', 'Y', 'Q', 'E', 'Y', 'E', 'E', 'O', 'D', 'U', 'O', 'A'},
                {'R', 'M', 'I', 'U', 'I', 'S', 'U', 'I', 'T', 'A', 'O', 'P', 'O', 'N', 'J', 'O', 'D', 'G', 'D', 'Z'}};
        this.arrayWords = new ArrayList<>(Arrays.asList("AZIR", "BRAND",  "CAMILE",  "DARIUS", "EKKO", "JHIM",
                "JINX", "KLED", "LULU", "RAKAN", "RENEKETON", "RENGAR", "SHYVANA", "TALON", "URGOT", "VARUS",
                "VEIGAR", "VI", "YASUO", "ZAC"));
    }

    public char[][] getWordsSearch() {
        return wordsSearch;
    }
    public List<String> getArrayWords() {
        return arrayWords;
    }

    public void setArrayWords(List<String> arrayWords) {
        this.arrayWords = arrayWords;
    }

    public void setWordsSearch(char[][] wordsSearch) {
        this.wordsSearch = wordsSearch;
    }
}
