package Level2;
import java.util.*;
import java.io.*;

public class Task3_FileEncryptionAndDecryption {

	public static void main(String[] args) {

		int shift = 3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type encryption/Decryption (E or D) ");
		char choice = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("enter file name with extension: ");
		String f = sc.nextLine();
		
		File inputFile = new File("src/Level2/" + f);
	
		
		if (!inputFile.exists()) {
           
			System.out.println("File not found. Please check the path.");
			sc.close();
			return;
        }
		String fileText = readFile(inputFile);

		if (choice == 'E' || choice == 'e') {
			 String encryptedText = encrypt(fileText, shift);
			 fileWrite("src/Level2/encrypted_" + f, encryptedText);
	            System.out.println("Encryption complete. Output saved to: encrypted_" + f);
	           
	            System.out.println("Encrypted data:");
	            System.out.println(encryptedText); 
	            
        } else if (choice == 'D' || choice == 'd') {
        	String decryptedText = decrypt(fileText, shift);
        	fileWrite("src/Level2/decrypted_" + f, decryptedText);
            System.out.println("Decryption complete. Output saved to: decrypted_" + f);
            System.out.println("Decrypted data:");
            System.out.println(decryptedText); 
        } else {
            System.out.println("Invalid option. Please enter 'E' or 'D'.");
        }

        sc.close();
		
	}
	public static String encrypt(String txt, int n) {
		StringBuilder res = new StringBuilder();
		char ch[]= txt.toCharArray();
		for(char c: ch) {
			res.append((char)(c+n));
		}
		 return res.toString();
	}
	public static String decrypt(String txt, int n) {
        StringBuilder res = new StringBuilder();
        char[] ch = txt.toCharArray();
        for (char c : ch) {
            res.append((char) (c - n));
        }
        return res.toString();
    }	
	public static void fileWrite(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static String readFile(File fileName) {
		String data="";
		try {
			Scanner reader = new Scanner(fileName);
			data = reader.nextLine();
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		}
		return data.toString();
		
	}

}
