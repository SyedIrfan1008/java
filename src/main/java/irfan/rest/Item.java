package irfan.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item implements Comparable <Item> {
    public   int id;
    public   String name;
    public     int price;
    public Item(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price=price;
    }
    public Item() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Item i) { //( i2.compareTo i3 ) it takes as it is listed in it
        //return this.price-i.price;
        //return i.price-this.price;  // increment to decrement value it will take like big price
        return this.name.length()-i.name.length();
    }
}