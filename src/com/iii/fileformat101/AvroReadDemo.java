package com.iii.fileformat101;

import org.apache.avro.file.DataFileStream;
import org.apache.avro.specific.SpecificDatumReader;

import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;


public class AvroReadDemo {

	public static void main(String[] args) throws IOException {

		String inputFilePath = args[0];
		
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(inputFilePath), conf);
		Path path = new Path(inputFilePath);
		
	    InputStream is = fs.open(path);

		DataFileStream<Stock> reader = new DataFileStream<Stock>(is,
				new SpecificDatumReader<Stock>(Stock.class));

		for (Stock a : reader) {
			System.out.println(a);
		}

		IOUtils.closeStream(is);
		IOUtils.closeStream(reader);
	}
}


