/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Dradrach
 */
public class Brick {
    private int length;
    private int width;
    private int height;

    public Brick(int length, int width) {
        this.length = length;
        this.width = width;
        this.height = 1;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    
}
