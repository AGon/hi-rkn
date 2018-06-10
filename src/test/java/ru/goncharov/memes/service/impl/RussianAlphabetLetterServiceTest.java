package ru.goncharov.memes.service.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class RussianAlphabetLetterServiceTest {

    @DisplayName("Формируемый алфавит соответствует ожидаемому")
    @Test
    @SuppressWarnings(value = "unchecked")
    void get_russian_alphabet_test() throws Exception {
        final List<String> expectedRussianAlphabet = asList(
                "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й",
                "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф",
                "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"
        );
        final RussianAlphabetLetterService russianAlphabetLetterService = new RussianAlphabetLetterService();
        final Method method = RussianAlphabetLetterService.class.getDeclaredMethod("getRussianAlphabet", null);
        method.setAccessible(true);
        final List<String> actualRussianAlphabet = (List<String>) method.invoke(russianAlphabetLetterService, null);
        assertThat(actualRussianAlphabet, is(expectedRussianAlphabet));
    }
}
