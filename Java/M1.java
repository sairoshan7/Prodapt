package File;

import java.util.Map;

public class M1 {

	public static void main(String[] args) {
		String filePath = "D:\\country.csv"; // Change to the path of your CSV file
        Map<String, String> countryCapitalMap = Countrymap1.loadCsvFileToMap(filePath);
        char startsWith = 'M'; // Example: Filter countries starting with 'A'
        String outputFile = "D:\\filtered_countries.txt"; // Change to desired output file path
        Countrymap1.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
        System.out.println("Filtered countries have been written to the file.");

	}

}
