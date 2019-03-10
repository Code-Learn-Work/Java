import java.util.Scanner;

class ReplacePi{
    // static String replacePi(String input){
    //     String output;
    //     if(input.length()<=1){
    //         return input;
    //     }
    //     String small = input.substring(1);
    //     if(input.charAt(0)=='p' && small.charAt(0)=='i'){
    //         output = "3.14" + small.substring(1);
    //     }
    //     else{
    //         output = input.charAt(0) + small;
    //     }
    //     return output;
        
    // }
    public static String changePi(String str) {
  int len = str.length();
  if (len < 2)
   return str;

  if (str.endsWith("pi"))
   return changePi(str.substring(0, len - 2)) + "3.14";
  else
   return changePi(str.substring(0, len - 1)) + str.substring(len - 1, len);
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(changePi(s));
        sc.close();
    }
}