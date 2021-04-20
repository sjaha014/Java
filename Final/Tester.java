class Tester {
  public static void main(String[] args) {
    
    Circle circle1 = new Circle(10.2); 
    Circle circle2 = new Circle(5.7); 

    Circle[] circles = {circle1, circle2}; 

    for(Circle circle : circles) { 

      circle.calculateCircumference(); 
      circle.calculateArea(); 
      
      System.out.println("Diameter of the circle is " +circle.getDiameter());
      System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/ 100.0);
      System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/ 100.0); 

    }
    
    
  }
}