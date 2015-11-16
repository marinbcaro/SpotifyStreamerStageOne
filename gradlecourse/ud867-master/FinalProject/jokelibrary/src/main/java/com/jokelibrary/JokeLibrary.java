package com.jokelibrary;

import java.util.ArrayList;
import java.util.List;

public class JokeLibrary {

    public String getJoke(){

        List<String> jokes = new ArrayList<String>();
        jokes.add("What do you call a man that irons clothes? Iron Man");
        jokes.add("How does the moon cut his hair? Eclipses it!");
        jokes.add("Why do French people eat snails?Because they don't like fast food.");
        jokes.add("Time flies like an arrow, fruit flies like banana.");
        jokes.add("What do you call dangerous precipitation? A rain of terror.");
        jokes.add("What’s the best part about living in Switzerland? Not sure, but the flag is a big plus.");
        return jokes.get((int) (Math.random() * jokes.size()));
    }
}
