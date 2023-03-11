package Default;

import java.lang.reflect.Field;

public class Testmain {
    public static void main(String[] args) throws IllegalAccessException {
        // We want to use the refelction with java.lang.Class
        Rectangle rectangle =new Rectangle();
        rectangle.width=2.0;
        rectangle.height=3.0;
        Class rectangleClass = rectangle.getClass();
        //We want Field class
        Field[] fields=rectangleClass.getFields();
        for (Field field:fields) {
            if (field.getName().equals("width")){
                Object value = field.get(rectangle);
                double r =(Double)value;
                System.out.println(r);
                //field.set(rectangle,5.0);
              //  System.out.println(rectangle.height);
            }
        }
    }
}
