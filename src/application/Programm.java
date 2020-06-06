package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programm {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("===TEST 1: seller findById === ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n===TEST 2: seller findByDepartment === ");
		Department department2 = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department2);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===TEST 3: seller findAll === ");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

//		System.out.println("\n===TEST 4: seller insert === ");
//		Seller newSeller = new Seller(null, "Dave", "dave@gmail.com", new Date(), 3000.0, department2);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n===TEST 5: seller update === ");
		seller = sellerDao.findById(1);
		seller.setName("Bob Lila");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
