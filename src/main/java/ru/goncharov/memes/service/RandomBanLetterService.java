package ru.goncharov.memes.service;

import org.springframework.stereotype.Service;
import ru.goncharov.memes.common.NextLetter;

import java.util.Random;

@Service
public class RandomBanLetterService implements BanLetterService {

    @Override
    public void banLetter(final String phrase) {
        final String letter = new NextLetter(phrase, getLetter(phrase)).value();
        if (phrase.length() > 1) {
            banLetter(phrase.replaceAll(letter, "").trim());
        }
    }

    private Character getLetter(final String phrase) {
        final char[] letters = phrase.toCharArray();
        final char letter = letters[new Random().nextInt(letters.length)];
        return letter == ' ' ? getLetter(phrase) : letter;
    }
}
