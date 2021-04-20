public class BusBooking{ 

    private int bookingId; 
    private String destination; 
    private String tripPackage; 
    private double totalAmount; 
   
    public BusBooking(int bookingId, String destination, String tripPackage) { 
      this.bookingId = bookingId; 
      this.destination = destination; 
      this.tripPackage = tripPackage; 
      this.totalAmount = 0; 
    }  
   
    public double getTotalAmount() { 
      return this.totalAmount; 
    }
   
    public void setTotalAmount(double totalAmount) { 
      this.totalAmount = totalAmount; 
    }
   
    public String getDestination() { 
      return this.destination; 
    } 
   
    public void setDestination(String destination){ 
      this.destination = destination; 
    }
   
    public int getBookingId() { 
      return this.bookingId;
    }
   
    public void setBookingId(int bookingId) { 
      this.bookingId = bookingId; 
    }
   
    public String getTripPackage(){ 
      return this.tripPackage; 
    }
   
    public void setTripPackage(String tripPackage){ 
      this.tripPackage = tripPackage; 
    }
   
   
     public String bookTrip(String couponCode, int numberOfMembers) { 
   
       String bookingMessage = "Booking successful"; 
       boolean val = validateCouponCode(couponCode,numberOfMembers); 
       boolean bool = true; 
   
       try { 
         if(!(destination.equals("Washington DC") || destination.equals("Philadelphia") || destination.equals("Orlando") || destination.equals("Bonston"))) { 
   
           throw new InvalidDestinationException("Invalid destination"); 
         
         } else if (tripPackage != "Regular" || tripPackage != "Premium") { 
           throw new InvalidTripPackageException("Invalid package"); 
         }
   
         else if (val == false) { 
           bool = false; 
         }
       
       } catch (InvalidDestinationException e) { 
         System.out.println(e.getMessage()); 
       
       } catch(InvalidTripPackageException e) { 
         System.out.println(e.getMessage()); 
       
       } finally { 
   
         if(bool == true) { 
           if(getTripPackage().equals("Regular")) { 
             this.setTotalAmount(numberOfMembers * 500); 
             return bookingMessage; 
           
           } else if (getTripPackage().equals("Premium")) { 
             this.setTotalAmount(numberOfMembers * 800); 
             return bookingMessage; 
   
           }
         }
       }
       return ""; 
     }
   
     public boolean validateCouponCode(String couponCode, int numberOfMembers) { 
       
       boolean bool = false;
   
       try { 
         if(couponCode.equals("BIGBUS") && numberOfMembers >= 10) { 
           return true; 
         }
   
         else if(couponCode.equals("MAGICBUS") && numberOfMembers >=15) { 
           return true;
         } else { 
           throw new InvalidCouponCodeException("Invalid coupon code"); 
         }
       } catch (InvalidCouponCodeException e) { 
         System.out.println(e.getMessage()); 
       } 
       return bool; 
   
     } 
   
   }
    
   