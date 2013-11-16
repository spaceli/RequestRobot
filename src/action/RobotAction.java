package action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class RobotAction {

	private static final String urlFilename = "urlList.txt";
	private static final String logFilename = "log.txt";
	public static Boolean isWorking = false;

	public static ArrayList<String> getUrlListFromFile() {
		File file = new File(urlFilename);
		if (!file.exists())
			return new ArrayList<String>();

		BufferedReader br = null;
		ArrayList<String> urlList = new ArrayList<String>();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					file)));
			String aUrl = null;
			while ((aUrl = br.readLine()) != null) {
				urlList.add(aUrl);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return urlList;
	}

	public static void saveUrlList(ArrayList<String> urlList)
			throws IOException {
		File file = new File(urlFilename);
		if (!file.exists()) {
			file.createNewFile();
		}

		PrintWriter pw = new PrintWriter(file);
		for (String url : urlList) {
			pw.println(url);
		}
		pw.close();
	}

	public static void sendRequest(ArrayList<String> urlList)
			throws IOException {

		File logfile = new File(logFilename);
		if (!logfile.exists()) {
			logfile.createNewFile();
		}
		PrintWriter pw = new PrintWriter(logfile);
		pw.println("----- " + (new Date()).toString()
				+ " ---------------------------------");
		String tmp = null;
		for (String urlString : urlList) {
			URL url = new URL(urlString);
			BufferedReader br = new BufferedReader(new InputStreamReader(url
					.openStream()));
			while ((tmp = br.readLine()) != null) {
				tmp = new String(tmp.getBytes(), "UTF-8");
				pw.println(tmp);
			}
			br.close();
			System.out.println(urlString + "---«Î«ÛÕÍ±œ");
		}
		pw.flush();
		pw.close();

	}
}
