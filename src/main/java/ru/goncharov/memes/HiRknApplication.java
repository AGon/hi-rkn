package ru.goncharov.memes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.goncharov.memes.common.OriginalPhrase;
import ru.goncharov.memes.common.Phrase;
import ru.goncharov.memes.service.BanLetterService;
import ru.goncharov.memes.service.RussianAlphabetBanLetterService;

@SpringBootApplication
public class HiRknApplication {

    public static void main(final String[] args) {
        final ApplicationContext context = SpringApplication.run(HiRknApplication.class, args);
        final BanLetterService letterService = context.getBean(RussianAlphabetBanLetterService.class);
        final Phrase phrase = context.getBean(OriginalPhrase.class);
        letterService.banLetter(phrase.value());
    }
}
