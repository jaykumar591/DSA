package MAKAUT_CSS_OOPS;

abstract class Shape{
    public abstract void drow();
}

class Circle extends Shape{
  
    @Override
    public void drow() {
       System.out.println("Circle is drowing");
        
    }
}

class Rectangle extends Shape {
    @Override
    public void drow() {
        System.out.println("Rectangle is Drowing");
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}

class ShapIterator implements Iterator {
    public Shape shaps[];
    public int position;
   public Iterator(Shape[] shaps){
        this.shaps = shaps;
        position =0;
    }
    @Override
    public boolean hasNext() {
        
        return position<shaps.length;
    }
    @Override
    public Object next() {
        
        return shaps[position++];
    }

}

public class Seven {
    public static void main(String[] args) {
        
    }
}
