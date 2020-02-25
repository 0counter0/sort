import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @description
 * @params
 * @return
 * @date
 */
public class Bubble {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        //System.out.println(count);
        int array[]=new int[count];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        //Bubble(array);
        //Select(array);
        Insert(array);
        clear(array);
    }
    public static void Bubble(int array[]){
        for(int i=0;i<array.length-1;i++) {
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void Select(int array[]){
        for (int i=0;i<array.length-1;i++){
            int index=i;
            for(int j=index;j<array.length-1;j++){
                if (array[index]>array[j+1]) {
                    index=j+1;
                }
            }
            int temp=array[index];
            array[index]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void Insert(int array[]){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i;
            while(j>0&&temp<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void clear(int array[]){
        Set set=new HashSet();
        for (int i=0;i<array.length;i++){
            set.add(array[i]);
        }

        System.out.println(set);
    }

}

