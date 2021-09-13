package com.bvks.designpatterns.factory;

import java.util.Objects;

public class FileReaderFactory {

	public FileReader getFileReader(String fileType) {
		if (!Objects.nonNull(fileType))
			return null;

		if (fileType.equals("EXCEL")) {
			return new ExcelReader();
		} else if (fileType.equals("CSV")) {
			return new CsvReader();
		}

		return null;
	}

}
