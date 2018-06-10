package ru.goncharov.memes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.goncharov.memes.service.LetterService;
import ru.goncharov.memes.service.impl.RussianAlphabetLetterService;
import ru.goncharov.memes.utils.OriginalPhrase;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class HiRknApplication {

    public static void main(final String[] args) {
        final ConfigurableApplicationContext context = run(HiRknApplication.class, args);
        final LetterService letterService = context.getBean(RussianAlphabetLetterService.class);
        final OriginalPhrase phrase = context.getBean(OriginalPhrase.class);
        letterService.banLetter(phrase.get());
    }
}
