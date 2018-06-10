package ru.goncharov.memes.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OriginalPhrase {

    @Value("${phrase}")
    private String phrase;

    public String get() {
        return phrase;
    }
}
