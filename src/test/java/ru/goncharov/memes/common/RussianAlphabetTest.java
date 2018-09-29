package ru.goncharov.memes.common;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RussianAlphabetTest {

    @DisplayName("Формируемый алфавит русского языка соответствует ожидаемому")
    @Test
    void russian_alphabet_check() {
        final List<String> expectedRussianAlphabet = Arrays.asList(
                "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й",
                "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф",
                "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"
        );
        Assert.assertThat(new RussianAlphabet().value(), CoreMatchers.is(expectedRussianAlphabet));
    }
}
