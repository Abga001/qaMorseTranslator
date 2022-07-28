package com.qa.morsetranslator;

import java.util.*;
import java.util.stream.Collectors;

	public class MorseTranslator {

	    private final Map<String, String> MORSE_MAP;

	    public MorseTranslator(){
	        this.MORSE_MAP = new HashMap<>();

	        this.MORSE_MAP.put("*-", "A");
	        this.MORSE_MAP.put("-***", "B");
	        this.MORSE_MAP.put("-*-*", "C");
	        this.MORSE_MAP.put("-**", "D");
	        this.MORSE_MAP.put("*", "E");
	        this.MORSE_MAP.put("**-*", "F");
	        this.MORSE_MAP.put("**-*", "G");
	        this.MORSE_MAP.put("****", "H");
	        this.MORSE_MAP.put("**", "I");
	        this.MORSE_MAP.put("*---", "J");
	        this.MORSE_MAP.put("-*-", "K");
	        this.MORSE_MAP.put("*-**", "L");
	        this.MORSE_MAP.put("--", "M");
	        this.MORSE_MAP.put("-*", "N");
	        this.MORSE_MAP.put("---", "O");
	        this.MORSE_MAP.put("*--*", "P");
	        this.MORSE_MAP.put("--*-", "Q");
	        this.MORSE_MAP.put("*-*", "R");
	        this.MORSE_MAP.put("***", "S");
	        this.MORSE_MAP.put("-", "T");
	        this.MORSE_MAP.put("**-", "U");
	        this.MORSE_MAP.put("**-", "V");
	        this.MORSE_MAP.put("*--", "W");
	        this.MORSE_MAP.put("-**-", "X");
	        this.MORSE_MAP.put("-*--", "Y");
	        this.MORSE_MAP.put("--**", "Z");

	        this.MORSE_MAP.put("/", " ");
	    }

	    public String translate(String input) {
	        return Arrays.stream(input.split(" "))
	            .map(n -> this.MORSE_MAP.get(n))
	            .collect(Collectors.joining(""));
	    }
	}

