package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		//Implementacao de interface sem conhecer a implementacao
		SellerDAO sellerDAO = DaoFactory.createSellerDAO();
		
		//Buscando um vendedor por id
		System.out.println("=== TEST 1: seller findById ==== ");
		Seller seller = sellerDAO.findByID(3);
		System.out.println(seller);
	}

}
