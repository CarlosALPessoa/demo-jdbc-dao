package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		//Implementacao de interface sem conhecer a implementacao
		SellerDAO sellerDAO = DaoFactory.createSellerDAO();
		
		//Buscando um vendedor por id
		System.out.println("=== TEST 1: seller findById ==== ");
		Seller seller = sellerDAO.findByID(3);
		System.out.println(seller);
		
		//Buscando por departamento os vendedores
		System.out.println("\n\n===TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj + "\n");
		}
		
		//Buscando por todos
		System.out.println("\n\n===TEST 3: seller findAllt ====");
		list = sellerDAO.findAll();
		for(Seller obj : list) {
			System.out.println(obj + "\n");
		}
		
		//Insert new seller
		System.out.println("\n\n===TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Aydriane", "aydri@gmail.com", new Date(), 3580.50, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
 	}

}
