package io;

import java.io.*;

public class CSVWriter {
	public String[] extens = { "m4v", "avi", "mp4", "mkv" };
	public final String LIMITER = ",";
	public final static String SHOW = "Archer";
	public final static String OUT_FILE_NAME = "out.csv";
	public final String OUTPATH_SHOWS = "C:\\Shows\\bin\\";
	public final String OUTPATH_MOVIES = "C:\\Movies\\bin\\";
	PrintWriter pw = null;
	
	StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		try {
			CSVWriter csvw = new CSVWriter();
			csvw.read(SHOW);
			csvw.write(OUT_FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void write(String outFileName) {
		pw.write(sb.toString());
	}

	private void read(String show) {
		
	}

	public CSVWriter() throws IOException {
		pw = new PrintWriter(new File(OUTPATH_SHOWS + OUT_FILE_NAME));
		
		String [][] arr = null;
		arr = getShowList(SHOW);
		
		String colNames = "name,filename,season,filetype,length,size,-1";
		sb.append(colNames);
		
	}

	private String[][] getShowList(String show) {
		int seasNum = 0;
		int totEp = 0;
		String sizeStr = "";
		DecimalFormat df = new DecimalFormat("##");
		for(int i = 0; )
		return null;
	}
}
