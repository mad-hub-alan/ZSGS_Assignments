package day_8.commandline_arguments;

public class CommandLineArgs {
    public static void main(String[] strings) {
        if(strings.length == 0){
            System.out.println("\nNo Strings Provided!\n");
        }else{
            System.out.println("");
            for(int i=0; i<strings.length; i++){
                System.out.printf("String %d : %-10s \n",(i+1),strings[i]);
            }
        }
    }
}
