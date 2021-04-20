public class Circle { 

  private final double PI; 
  private double diameter; 
  private double circumference; 
  private double area; 

  public Circle(double diameter) { 
    this.PI = 3.14; 
    this.diameter = diameter; 
  }  

  public void calculateCircumference() { 
    this.setCircumference(this.getPI()*this.getDiameter()); 
  }

  public void calculateArea() { 
    double radius = this.getDiameter() / 2; 
    double radiusSquared = radius * radius; 
    this.setArea(this.getPI()*radiusSquared); 
  }

  public double getDiameter() { 
    return this.diameter; 
  }

  public void setDiameter(double diameter) { 
    this.diameter = diameter; 
  }

  public double getCircumference() { 
    return this.circumference; 
  }

  public void setCircumference(double circumference) { 
    this.circumference = circumference; 
  }

  public double getArea() { 
    return this.area; 
  }

  public void setArea(double area) { 
    this.area = area; 
  }

  public double getPI() { 
    return this.PI; 
  }
}