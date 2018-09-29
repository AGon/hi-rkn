package ru.goncharov.memes.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OriginalPhrase implements Phrase {

    @Value("${phrase}")
    private String phrase;

    @Override
    public String value() {
        return phrase;
    }
}
