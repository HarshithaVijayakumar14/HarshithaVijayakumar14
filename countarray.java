public class countarray {
    public static void main(String[] args) {
       int array[] = {45,55,66,76,87,98,90,78};
       int count = 0;
       System.out.println("The numbers greater than 50 are: ");
       for(int i=0;i<array.length;i++){
        if(array[i]>50){
            System.out.print(array[i]+" ");
            count++;
        }
    }
       System.out.println("\nTotal count:" +count);
       
    }
}
