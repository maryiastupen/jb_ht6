package com.epam.java_basics.ht_6;

import java.util.*;

public enum Mark {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    private static final List<Mark> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    private static Map map = new HashMap<>();
    private int value;

    Mark(int value) {
        this.value = value;
    }

    static {
        for (Mark mark : Mark.values()) {
            map.put(mark.value, mark);
        }
    }

    public int getValue() {
        return value;
    }
    
    public static Mark getRandomMark() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}

