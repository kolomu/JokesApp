package com.kolomu.JokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getQuote() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }

}
