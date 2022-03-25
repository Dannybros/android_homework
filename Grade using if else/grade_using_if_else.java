import java.util.Scanner;

class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter percentage marks: ");
    	double percentage = scanner.nextDouble();
        
        if(percentage >= 100){
    		System.out.println("A");
    	}else if(percentage < 100 && percentage >= 90){
    		System.out.println("B+");
    	}else if(percentage < 90 && percentage > 80){
    		System.out.println("B");
    	}else if(percentage < 80 && percentage >= 70){
    		System.out.println("C+");
    	}else if(percentage < 70 && percentage >= 60){
    		System.out.println("C");
    	}else if(percentage < 60 && percentage >= 50){
    		System.out.println("D");
    	}else {
    		System.out.println("Failed!");
    	}
    }
}