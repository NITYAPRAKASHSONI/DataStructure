import java.util.ArrayList;
import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        int arr[] ={2,3,1,4,4,5};
//ArrayList<Integer> list=findAllIndex(arr,4,0,new ArrayList<>());
  //      System.out.println(list);

        System.out.println(findAllIndex1(arr,4,0));
    }


    static ArrayList<Integer> findAllIndex(int arr[], int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
      return   findAllIndex(arr,target,index+1,list);
    }


    static ArrayList<Integer> findAllIndex1(int arr[],int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCall=findAllIndex1(arr,target,index+1);
        list.addAll(list);
        return list;
    }


}
