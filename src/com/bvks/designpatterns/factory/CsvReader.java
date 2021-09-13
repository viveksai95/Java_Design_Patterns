package com.bvks.designpatterns.factory;

import java.io.File;

public class CsvReader implements FileReader {

	@Override
	public void readFile(File inputFile) {
		System.out.println("CsvReader : readFile");
	}

}
