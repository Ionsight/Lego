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
public class Order {

    private int id;
    private int userid;
    private int height;
    private int width;
    private int length;

    public Order(int id, int userid, int height, int width, int length) {
        this.id = id;
        this.userid = userid;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", userid=" + userid + ", height=" + height + ", width=" + width + ", length=" + length + '}';
    }

}
