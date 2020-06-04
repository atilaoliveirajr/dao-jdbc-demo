package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programm {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("===TESTE 1: seller findById === ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n===TESTE 2: seller findByDepartment === ");
		Department department2 = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department2);
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
