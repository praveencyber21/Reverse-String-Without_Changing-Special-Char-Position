package ReverseString;

class Reverse {
 

    //L#inux -> x#nuiL
    static String reverse(String word){

      int length = word.length();
      int left = 0, right = length-1;
    char ch[] = word.toCharArray();
      while(left < right){

        if(!Character.isAlphabetic(ch[left])){
            left++;
          
        }
        else if(!Character.isAlphabetic(ch[right])){
            right--;
            

        }
        else {
           char temp = ch[left];
           ch[left] = ch[right];
           ch[right] = temp;
           left ++;
           right --;
            

        }
         
    }
    String reverse = new String(ch);
            
    return reverse;
    

}
 
}

       

