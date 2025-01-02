package org.example;

public class TC01 {
    public static void main(String[] args) {
        String str = "Komrelly Srinivas Reddy";
        //print all the duplicate chars in the string
        int flag;
        for(int i=0; i<str.length(); i++){
            flag =1;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag++;
                    break;
                }
            }
            if(flag>1){
              System.out.println(str.charAt(i));
            }
        }
    }
}
