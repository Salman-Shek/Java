package chapter6;
/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] arg){

        /* ******************
         * RECTANGLE 1
         ******************* */

        //Create instance of `Rectangle` class
        Rectangle room1 = new Rectangle();
        room1.setLength(30);
        room1.setWidth(40);
        double areaOfRoom1 = room1.calculateArea();

        /* ******************
         * RECTANGLE 2
         ******************* */

        //Create instance of `Rectangle` class
        Rectangle room2 = new Rectangle(40,30);
        double areaOfRoom2 =room2.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;

        System.out.println("Length of room1: "+room2.getLength());
        System.out.println("Width of room1: "+room2.getWidth());
        System.out.println("Area of room1: "+areaOfRoom1);

        System.out.println("Length of room2: "+room2.getLength());
        System.out.println("Width of room2: "+room2.getWidth());
        System.out.println("Area of room2: "+areaOfRoom2);

        System.out.println("Total Area of both rooms: "+totalArea);

    }
}
