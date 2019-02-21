public class CircleProcessorTester
{


    public static void main(String[] args)
    {
       Circle[] circles = {
             new Circle(10.0),
             new Circle(100.0),
             new Circle(50),
             new Circle(1.0)
       };
       
       CircleProcessor processor = new CircleProcessor(circles);


        System.out.printf("Aveage: %.2f\n", processor.averageArea());
        System.out.println("Expected: 9896.80");

        processor.swapMaxAndMin();
        System.out.println(processor.toString());
        System.out.println("[Circle[radius=10.0], Circle[radius=1.0], Circle[radius=50.0], Circle[radius=100.0]]");
        
        Circle[] circles2 = {
              new Circle(10.0),
              new Circle(100.0),
              new Circle(50)
        };
        
        CircleProcessor processor2 = new CircleProcessor(circles2);


         System.out.printf("Aveage: %.2f\n", processor2.averageArea());
         System.out.println("Expected: 13194.69");

         processor2.swapMaxAndMin();
         System.out.println(processor2.toString());
         System.out.println("[Circle[radius=100.0], Circle[radius=10.0], Circle[radius=50.0]]");
    }
}