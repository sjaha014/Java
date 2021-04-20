class Main {
    public static void main(String[] args) {
      
      SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Gara", "EXRT.3", "4G"); 
  
      if(smartPhone.testCompatibility()) { 
        System.out.println("This mobile OS is compatible wiht the network generation");
      } else { 
        System.out.println("Not compatible");
      }
      
      
    }
  }