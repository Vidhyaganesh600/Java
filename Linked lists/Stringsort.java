import java.util.Arrays;
public class Stringsort {
    public static void main(String[] args){
        String[] countries={"India","Afghanisthan","Nepal","Switzerland","Srilanka","Bhutan"};
        int size=countries.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<countries.length;j++){
                if((countries[i].compareToIgnoreCase(countries[j]))>0){
                    String temp=countries[i];
                    countries[i]=countries[j];
                    countries[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(countries));
    }
}
