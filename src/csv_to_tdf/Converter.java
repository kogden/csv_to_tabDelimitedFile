package csv_to_tdf;
import java.util.*;
import java.io.*;

public class Converter {

	public Converter() {
	}

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 1) {
            System.err.println("Usage: ./converter file");
            System.exit(1);
        }
		
		
		//Test Obj
		//Student newStudent = new Student(1, "Benny_Bozo", "LaSalle");
		//System.out.print(newStudent);
		
		String curLine;
		ArrayList<Student> studentArr = new ArrayList<Student>(); 
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			while((curLine = in.readLine()) != null) {
				String[] splitLine = curLine.split(",");
				Student newStudent = new Student(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2]);
				studentArr.add(newStudent);
			}
	        
			File file = new File("tdf.txt");
			PrintWriter pw = new PrintWriter(new FileOutputStream(file));
		    for (Student student : studentArr)
		         pw.println(student); 
		    pw.close();
		    System.out.printf("File is located at %s%n", file.getAbsolutePath());
		    
	        in.close();
		}catch (FileNotFoundException e) {
            System.err.println("Unable to open file " +
                    args[0] + ": " + e.getMessage());
                System.exit(1);
        }catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	    /*FileWriter writer = new FileWriter("tdf.txt");
	    for(Student s : studentArr) {
	    	 	writer.write(s);
	    }
	    writer.close();*/
		
		//System.out.println(studentArr);
	}
}
