package com.bvks.designpatterns.factory;

import java.io.File;

public class ExcelReader implements FileReader {

	@Override
	public void readFile(File inputFile) {
		System.out.println("ExcelReader : readFile");
	}

}
