import java.util.Scanner;  
public class HelloWorld {  
public static void main(String[] args) {  
System.out.println("Hello World");  
Scanner scanner = new Scanner(System.in);  
System.out.print("Ad�n�z� girin: ");  
String name = scanner.nextLine();  
System.out.println("Merhaba, " + name + "!");  
}  
} 
