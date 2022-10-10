import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] array = {"Phu", "Tien", "Tung", "Trung", "Mai"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(name)){
                System.out.println("Position of " + name + " in the list is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("The name " + name + " not found");
        }
    }
}