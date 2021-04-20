public class SmartPhone extends Mobile implements Testable { 
    private String networkGen; 
    
    public SmartPhone(String name, String brand, String oSName, String oSVersion, String networkGen) { 
      
      super(name,brand,oSName, oSVersion); 
      this.networkGen = networkGen; 
    }
  
  
    public String getNetworkGen() { 
      return this.networkGen; 
    }
  
    public void setNetworkGen(String networkGen) { 
      this.networkGen = networkGen; 
    }
  
    public boolean testCompatibility() { 
  
      if(this.getOSName().equals("Saturn")) { 
        if(this.getNetworkGen().equals("3G")) { 
          if(this.getOSVersion().equals("1.1") || this.getOSVersion().equals("1.2")) { 
            return true; 
          }
        
        } else if (this.getNetworkGen().equals("4G")) { 
          if(this.getOSVersion().equals("1.2") || this.getOSVersion().equals("1.3")) { 
            return true;
          } 
      
        } else { 
          return false; 
        }
      } 
      else if(this.getOSName().equals("Gara")) {
         if(this.getNetworkGen().equals("3G")) { 
          if(this.getOSVersion().equals("EXRT.1") || this.getOSVersion().equals("EXRT.2")) { 
            return true; 
          }
        
        } else if (this.getNetworkGen().equals("4G")) { 
          if(this.getOSVersion().equals("EXRT.2") || this.getOSVersion().equals("EXRT.3")) { 
            return true;
          } 
      
        } else { 
          return false; 
        }
  
      }
    
    
    return false; 
  } 
  
  
  
  }