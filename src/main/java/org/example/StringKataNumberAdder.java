package org.example;

public class StringKataNumberAdder {
    public int add( String s) {
        if(s.isEmpty()){
            return 0;
        } else {
            int sum = 0;
            // Split by comma or dot
            String[] parts = s.split("[,//.//-]");
            for (String part : parts) {
                sum += Integer.parseInt(part.trim());
            }
            return sum;
        }
    }
}
