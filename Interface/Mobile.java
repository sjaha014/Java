public class Mobile { 

    private String name; 
    private String brand; 
    private String oSName; 
    private String oSVersion; 
  
    public Mobile(String name, String brand, String oSName, String oSVersion) { 
      this.name = name; 
      this.brand = brand; 
      this.oSName = oSName; 
      this.oSVersion = oSVersion;
    }
  
    public String getName() { 
      return this.name; 
    }
  
    public void setName(String name) { 
      this.name = name; 
    }
  
    public String getBrand(){ 
      return this.brand; 
    }
  
    public void setBrand(String brand){ 
      this.brand = brand; 
    }
  
    public String getOSName() { 
      return this.oSName; 
    }
    
    public void setOSName(String oSName) { 
      this.oSName = oSName; 
    }
  
    public String getOSVersion() { 
      return this.oSVersion; 
    }
    
    public void setOSVersion(String oSVersion) { 
      this.oSVersion = oSVersion; 
    }
  }