/**
 * -------------------------------------------------
 * File name: FileEx1.java
 * Project name: CISP1020
 * -------------------------------------------------
 * Creator's name: David Blair
 * Email: dlblair@northeaststate.edu
 * Course and section: CISP 1020 A01
 * Creation date: Jan 12, 2018
 * -------------------------------------------------
 */
package chapter12;

import java.io.File;
import java.util.Date;

/**
 * <b>Messing with the File class</b>
 * <hr>
 * Date created: Jan 12, 2018
 * <hr>
 * @author David Blair
 */
public class FileEx1
{

	/**
	 * Method description: Entry for Java applications
	 * Date: Jan 12, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args)
	{
		//instantiate a new File object
		File file = new File("testFile.txt");
		//add the testFile.txt to the working folder CISP1020/src/chapter12
		System.out.println("File Exists: " + file.exists()); //does not find file?
		//let's try to find the file ...
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		//the File object is looking at the top of the classpath instead of in chapter12 package
		System.out.println("File Exists: " + file.exists()); //move file and try again
		System.out.println("Length of file: " + file.length());
		System.out.println("Can read file: " + file.canRead());
		System.out.println("Can write to file: " + file.canWrite());
		System.out.println("Is textFile a directory: " + file.isDirectory());
		System.out.println("Is textfile a file: " + file.isFile());
		System.out.println("Last date modified: " + new Date(file.lastModified()));
	}

}
