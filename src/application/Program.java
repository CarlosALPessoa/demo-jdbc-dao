package application;

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
 	}

}
