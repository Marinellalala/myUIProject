package com.it.Utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.stream.Collectors;

public class Utils {
    public static class String{
        public static java.lang.String getRandom(int count){
            return new Random()
                    .ints('A', 'z')
                    .limit(count)
                    .mapToObj(s->""+(char)s)
                    .collect(Collectors.joining());
        }
    }

    public static java.lang.String getRandomText(){
       return RandomStringUtils.randomAlphanumeric(100);
    }
}
