class Main {
    public static void main(String[] args) {
      
  
      int[] itemPrice = {800,700,1000,150,50}; 
      String[] itemArray = {"iphone", "ipad", "macbook","ipod", "airpad"}; 
  
      String itemPurchase[] = {"ipad", "airpad", "iphone"}; 
      int[] purchaseQuantity = {1,4,2}; 
  
      int amount = 0; 
  
      for(int i=0; i<itemPurchase.length;i++) { 
        for(int j=0; j<itemArray.length; j++) { 
  
          if(itemPurchase[i].equals(itemArray[j])) { 
            amount += purchaseQuantity[i]*itemPrice[j]; 
          }
        }
      }
  
      System.out.println(amount); 
    }
  }