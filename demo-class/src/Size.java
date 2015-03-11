/**
 * Created by zh61 on 2015/2/3.
 */
public class Size{
    public int _width;

    public int getWidth() {
        return _width;
    }

    public void setWidth(int width) {
        _width = width;
    }

    public int getHeight() {
        return _height;
    }

    public void setHeight(int height) {
        _height = height;
    }

    public int _height;

    public Size(int height, int width){
        _height = height;
        _width = width;
    }

    public void Print(){
        System.out.printf("height: %d%n", _height);
        System.out.printf("width: %d%n", _width);
    }
}