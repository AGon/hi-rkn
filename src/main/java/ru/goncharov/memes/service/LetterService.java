package ru.goncharov.memes.service;

public interface LetterService {
    /**
     * Запретить буквы, показав запрет на примере переданной фразы.
     *
     * @param phrase Фраза
     */
    void banLetter(final String phrase);
}
