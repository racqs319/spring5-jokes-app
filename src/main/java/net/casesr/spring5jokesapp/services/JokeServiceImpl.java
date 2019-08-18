package net.casesr.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getQuote() {
        ChuckNorrisQuotes generator = new ChuckNorrisQuotes();

        return generator.getRandomQuote();
    }
}
