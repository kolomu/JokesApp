package com.kolomu.JokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    // final so it can't be changed and constructor also don't need anything about it.
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // this class gets created once by spring and we will reuse that. (Not recreated for each request!)
    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
