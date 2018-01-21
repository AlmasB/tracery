package com.almasb.tracery;

import java.util.Random;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public final class Tracery {

    static Random random = new Random();

    /**
     * Set random number generator to make Tracery deterministic.
     */
    public static void setRandom(Random random) {
        Tracery.random = random;
    }

    /**
     * Create grammar from a JSON string in Tracery format.
     */
    public static Grammar createGrammar(String json) {
        Grammar grammar = new Grammar();
        grammar.fromJSON(json);
        return grammar;
    }
}
