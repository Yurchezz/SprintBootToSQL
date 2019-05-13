package ua.lviv.iot.rest;
import lombok.Data;

import javax.persistence.*;


@Data
@Inheritance
@Entity
@DiscriminatorColumn(name = "GOOD_TYPE")
@Table(name = "good_sql_rest")
 public abstract class Good{

    private @Id @GeneratedValue Long id;

    private String name;
    private int price;


    public Good() {
    }

    public Good(String name, int price){
        this.name = name;
        this.price = price;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

     public String getName(){
         return name;
     }

     public void setName(String name){
         this.name = name;
     }

     public int getPrice(){
         return price;
     }

     public void setPrice(int price){
         this.price = price;
     }

     @Override
     public String toString(){
         return "Good {" +
                 " | name = '" + name + '\'' +
                 ", | price = " + price +
                 '}';
     }
 }
