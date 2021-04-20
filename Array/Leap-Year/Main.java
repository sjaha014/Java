class Main {

    public static int[] findLeapYear(int year) { 
  
      int leapYear; 
      int[] arr = new int[15]; 
  
      if((year%4 == 0) && (year%100 != 0) || (year %400 ==0)) { 
        leapYear = year; 
      }
      else { 
        leapYear = year + 4 - (year%4); 
      }
  
  
      for(int i=0; i<arr.length; i++) { 
        arr[i] = leapYear; 
        leapYear += 4; 
        System.out.println(leapYear); 
      }
      return arr; 
  
  
    }
    
    public static void main(String[] args) {
      
      int year = 1896; 
      int[] leapYear; 
      leapYear = findLeapYear(year);
      
      for(int i=0; i<leapYear.length;i++) { 
        System.out.println(leapYear[i]);
      }
      
      
    }
  }