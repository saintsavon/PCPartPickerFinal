package com.PCPartPickerFinal;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class PCPartPickerMain {

	public static void main(String[] args) {

		ObjectMapper om = new ObjectMapper();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! Thank you for using PCParPicker to build your dream system today! (Please don't sue me PCPartPicker)");
		System.out.println("Let's begin by selecting your CPU brand: intel or amd?");
		String cpu_choice = scan.nextLine();
		
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
				if (brand.getBrandName().equals(cpu_choice)) {
					System.out.println(brand);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
