package com.PCPartPickerFinal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class PCPartPickerMain {

	public static void main(String[] args) {

		ObjectMapper om = new ObjectMapper();
		om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! Thank you for using PCParPicker to build your dream system today! (Please don't sue me PCPartPicker)");
		System.out.println("Let's begin by selecting your CPU brand: intel or amd?");
		String cpuBrand_choice = scan.nextLine();
		List<String> parts_list = new ArrayList<String>(); 
		
		//try {
		//	PCPartsList ppl = om.readValue(new InputStreamReader(new FileInputStream("parts.json")), PCPartsList.class);
			//System.out.println(ppl);
			//System.out.println(ppl.getCpu().getBrands()[1].getBrandName());
			
		//	for (CPUBrand brand: ppl.getCpu().getBrands()) {
		//		if (brand.getBrandName().equals("intel")) {
		//			System.out.println(brand);
		//		} else if (brand.getBrandName().equals("amd")){
		//			System.out.println(brand);
		//		} else {
		//			System.out.checkError();
		//		}
		//	}
			
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
		

		
		try {
			PCPartsList ppl = om.readValue(new InputStreamReader(new FileInputStream("parts.json")), PCPartsList.class);

			for (CPUBrand brand: ppl.getCpu().getBrands()) {
				if (brand.getBrandName().equals(cpuBrand_choice)) {
					String CPUBrandChoices = om.writerWithDefaultPrettyPrinter().writeValueAsString(brand);
					System.out.println("\nHere are all of our Intel CPU's:");
					
					System.out.println("\n" + CPUBrandChoices);
				} else {
					System.out.println("\nPlease select either intel or amd"); // bug here that always prints at least once
				}
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nWhich CPU would you like to purchase?");
		String chosen_cpu = scan.nextLine();
		
		try {
			PCPartsList ppl = om.readValue(new InputStreamReader(new FileInputStream("parts.json")), PCPartsList.class);
						
			for (CPUBrand product: ppl.getCpu().getBrands()) {
				if (product.getBrandName().equals(chosen_cpu)) { // this needs to recognize CPU name
					parts_list.addAll((Collection<? extends String>) product); // this is broke
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(parts_list);
		System.out.println("Please select your desired compatible motherboard:");
		
		try {
			PCPartsList ppl = om.readValue(new InputStreamReader(new FileInputStream("parts.json")), PCPartsList.class);

			System.out.println(ppl.getMobo().getBrands());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Please select your desired compatible motherboard:");

		
	}

}
