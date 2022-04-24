public class ATM{

    public int countBanknotes(int sum){
        
      int count = 0;
      int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
      int i = 0;
      
      while (sum>0) {
          count += sum/banknotes[i];
          sum = sum % banknotes[i];
          i++;
      }
      
      return count;
         
    }  
  
    public static void main (String[] args){
    }


}