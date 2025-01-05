package aplication;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department d1 = new Department(1,"Books");
        System.out.println(d1);

        Seller seller = new Seller(21,"Juan","juan@gmail.com",new Date(),3000.0,d1);
        System.out.println(seller);
    }
}
