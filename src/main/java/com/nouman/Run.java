package com.nouman;

import java.io.IOException;

/**
 * Created by nouman on 6/12/16.
 */
public class Run {
    public static void main (String[] args) throws IOException{
        if (args.length < 1) {
            throw new IllegalArgumentException("Must have either 'producer' or 'consumer' as argument");
        }
        switch (args[0]) {
            case "producer":
                Producer.main(args);
                break;
            case "consumer":
                Consumer.main(args);
                break;
            default:
                throw new IllegalArgumentException("Don't know how to do " + args[0]);
        }
    }
}
