package ru.goncharov.memes.service;

import org.springframework.stereotype.Service;
import ru.goncharov.memes.common.NextLetter;
import ru.goncharov.memes.common.RussianAlphabet;

import java.util.List;

import static java.lang.String.format;

@Service
public class RussianAlphabetBanLetterService implements BanLetterService {

    private final List<String> russianAlphabet = new RussianAlphabet().value();
    private int index = 0;

    @Override
    public void banLetter(final String phrase) {
        final String letter = new NextLetter(phrase, getLetter(phrase)).value();
        if (phrase.length() > 2) {
            final String regex = format("(%s|%s)", letter.toLowerCase(), letter.toUpperCase());
            ++index;
            banLetter(phrase.replaceAll(regex, "").trim());
        }
    }

    private Character getLetter(final String phrase) {
        final String letter = russianAlphabet.get(index);
        if (phrase.toUpperCase().contains(letter)) {
            return letter.toCharArray()[0];
        } else {
            ++index;
            return getLetter(phrase);
        }
    }
}
