package practice4;

import java.util.ArrayList;
import java.util.List;

public class FamilyRunner {
	
	
	public static void main(String[] args) {
		
		                             //
		ReportCard  report = new ReportCard(9, 9, 10,10);
		
		
		
		Student student = new Student("Ali", "Can",16, report );
		
		
		Parent parent = new Parent("Veli","Can", student.total() >= 35, student);
		
		
		
//		System.out.println(parent);
//		System.out.println("Parent status: "+parent.successMessage());
//		System.out.println("Child status: "+student.successMessage());
		
		
		
		System.out.println(parent);
		parent.buyProduct(200);;
		
		System.out.println(student.getBudget());
		
		List<Product> products = new ArrayList<>();
		
		Product p = new Product();
		
		Requirement req = new Requirement();
		List<Product> neededProducts = new ArrayList();
		p.setName("camera");
		p.setName("PC");
		neededProducts.add(p);
		
		req.setReqList(neededProducts);
		
		productList(req, parent);
		
		System.out.println(productList(req, parent).size());
		
		System.out.println(student.getBudget());
		
	}
	
	
	
	public static List<Product> productList(Requirement req, Parent parent){
		
		List<Product> productList = new ArrayList<>();
		
		String products = "camera, mobilephone,PC, car, pen, pencil, T-shirt, mathbook, science book, rice, "
				+ "tomatos, cucumber ";
		String prices = "200, 800, 1500, 10000, 2, 2, 25, 15, 13, 12, 5, 4";
		
		String [] prd = products.split(",");
		String [] allPrices = prices.split(",");
		
		
		for(Product eachProduct : req.getReqList()) {
			System.out.println("po name: "+eachProduct.getName());
			
			for (int i = 0; i < products.split(",").length; i++) {
				
				System.out.println(eachProduct.getName().toString().trim());
				System.out.println(prd[i].toString().trim());
				
				
				if(eachProduct.getName().toString().contains(prd[i].trim().toString())) {
					
					System.out.println("Prices: "+parent.getBudget()+"  new "+Double.parseDouble(allPrices[i].trim()));
					if((double)(parent.getBudget()) > (double)Double.parseDouble(allPrices[i].trim()) ) {
						System.out.println("We are there =            ========");

						parent.buyProduct(Double.parseDouble(allPrices[i].trim()));
						productList.add(new Product(prd[i].trim(),Double.parseDouble(allPrices[i].trim()) ));
					}else {
						System.out.println("Your budget is not sufficient!");
						break;
					}
				}
				
			}
		}
		System.out.println("size: "+req.getReqList().size());
		
	
		
		
		
		
		
		
		
		
		return productList;
	}

}
