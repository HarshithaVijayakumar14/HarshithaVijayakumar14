public class countthearray{
    public static void main(String[] args) {
        int numbers[] = {70,60,48,90,210,150};
        int count=0;
        for(int i=0;i<6;i++;){
            if(numbers[i]>50){
                count++;
                System.out.println(numbers[i]);
                
            }

        }
    }
}