package aplication;

import controller.dao.DaoFactory;
import controller.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department department = new Department(2, null);
        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n=== TEST 3: seller insert =====");
        Seller sel = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(sel);
        System.out.println("Inserted seller: " + sel.getId());

        System.out.println("\n=== TEST 4: seller update =====");
        sel = sellerDao.findById(1);
        sel.setName("Gregoryan");
        sellerDao.update(sel);
        System.out.println("Updated seller: " + sel.getId());

    }
}
