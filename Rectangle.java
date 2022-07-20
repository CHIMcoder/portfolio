//Jamarian Cleveland
package language.Classes;

public class Rectangle {
    private static int length;
    private int width;

    public Rectangle(){
        this.length = 0;
        this.width = 0;

    }
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }





    public void setWidth(int width){
        this.width = width;
    }
    public void setLength (int length){
        this.length = length;
    }
    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }
    public int getArea(int i){
        return this.length * this.width;
    }
    public int getPerimeter(int i){
        return 2 * (this.length + this.width);
    }
}



