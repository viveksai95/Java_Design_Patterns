package com.bvks.designpatterns.factory;

public class FactoryPatternDemo {

	 public static void main(String[] args) {
		 FileReaderFactory fileReaderFactory = new FileReaderFactory();
		 
		 FileReader excelFR = fileReaderFactory.getFileReader("EXCEL");
		 excelFR.readFile(null);
		 
		 FileReader csvFR = fileReaderFactory.getFileReader("CSV");
		 csvFR.readFile(null);
	 }
}
