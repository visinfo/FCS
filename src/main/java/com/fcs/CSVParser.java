package com.fcs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fcs.model.Transaction;

public class CSVParser implements FileParser {

   private List<Transaction> inputList;
  
	public void parser(String filePath) {

		try(  InputStream inputFS = new FileInputStream(filePath);BufferedReader br =
                new BufferedReader(new InputStreamReader(inputFS)) ){

			  inputList = br.lines().skip(1).map(getTransaction).collect(Collectors.toList());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public List<Transaction> getInputList() {
		return inputList;
	}

	private Function<String, Transaction> getTransaction = (line) -> {

		  String[] p = line.split(",");// a CSV has comma separated lines

		  Transaction item = new Transaction();

		  item.setReferenceId(p[0]);//<-- this is the first column in the csv file

		  if (p[3] != null && p[3].trim().length() > 0) {

		    //item.setSomeProeprty(p[3]);

		  }

		  //more initialization goes here

		  return item;

		};

}
