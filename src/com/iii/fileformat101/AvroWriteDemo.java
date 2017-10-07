package com.iii.fileformat101;

import com.google.common.collect.Lists;

import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.commons.io.FileUtils;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;


public class AvroWriteDemo {

	public static List<Stock> fromCsvFile(File file) throws IOException {
		return fromCsvStream(FileUtils.openInputStream(file));
	}

	public static List<Stock> fromCsvStream(InputStream is) throws IOException {
		List<Stock> stocks = Lists.newArrayList();
		for(String line: org.apache.commons.io.IOUtils.readLines(is)) {
			stocks.add(fromCsv(line));
		}
		is.close();
		return stocks;
	}

	public static Stock fromCsv(String line) throws IOException {

		CSVParser parser = new CSVParser();

		String parts[] = parser.parseLine(line);
		Stock stock = new Stock();

		stock.setSymbol(parts[0]);
		stock.setDate(parts[1]);
		stock.setOpen(Double.valueOf(parts[2]));
		stock.setHigh(Double.valueOf(parts[3]));
		stock.setLow(Double.valueOf(parts[4]));
		stock.setClose(Double.valueOf(parts[5]));
		stock.setVolume(Integer.valueOf(parts[6]));
		stock.setAdjClose(Double.valueOf(parts[7]));
       
		return stock;
	}

	public static void main(String[] args) throws IOException {

		String inputFilePath = args[0];
		File intputFile = new File(inputFilePath);
		
		String uri = args[1];
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		Path path = new Path(uri);
		
	    OutputStream os = fs.create(path);

		DataFileWriter<Stock> writer = new DataFileWriter<Stock>(
				new SpecificDatumWriter<Stock>());

		writer.setCodec(CodecFactory.snappyCodec());
		writer.create(Stock.SCHEMA$, os);


		for (Stock stock : fromCsvFile(intputFile)) {
			writer.append(stock);
		}

	    IOUtils.closeStream(writer);
	    IOUtils.closeStream(os);
	}
}


