package com.company.string;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(isPangram("Bawds jog flick quartz vex nymph"));
        System.out.println(isPangram("Bawds mph"));
        System.out.println(isPangram("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isStringRotated("amazon", "azonam"));
        System.out.println(isStringRotated("amazon", "onamaz"));
    }
    static boolean isPangram(String str) {
        if(str.length()<26) {
            return false;
        }
        str = str.toLowerCase();
        int counts[] = new int[26];
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) != ' ') {
                counts[str.charAt(i)-'a']++;
            } else {
                continue;
            }
        }
        for(int i = 0 ; i < 26 ; i++){
            if( counts[i]<1){
                return false;
            }
        }
        return true;
    }

    private static boolean isStringRotated(String originalString, String rotatedString) {
        //amazon", "azonam"
        //"amazon", "onamaz"
        String str = originalString.substring(2) + originalString.substring(0,2);
        String str1 = originalString.substring(originalString.length()-2) + originalString.substring(2);
        if(str.equals(rotatedString) ){
            return true;
        } else if(str1.equals(rotatedString)) {
            return true;
        }
        return false;
    }
}
