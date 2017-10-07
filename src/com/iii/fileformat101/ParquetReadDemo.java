package com.iii.fileformat101;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import parquet.avro.AvroParquetReader;
import parquet.hadoop.ParquetReader;


import java.io.IOException;
import java.net.URI;


public class ParquetReadDemo  {
	
	public static void main(String[] args) throws IOException {
		
		String uri = args[0];
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		Path inputPath = new Path(uri);
	
	    ParquetReader<Stock> reader = new AvroParquetReader<Stock>(inputPath);

	    Stock stock;
	    while ((stock = reader.read()) != null) {
	      System.out.println(stock);
	    }

	    reader.close();
	}
}
