import java.util.ArrayList;

public class Demo {


    public static int getSumConsecutiveOddNos(int[] numArray)
    {

        if(numArray==null || numArray.length==0 )  return  0;

        if(numArray.length==2)
        {
            if(numArray[0]%2!=0 && numArray[1]%2!=0) return numArray[0] + numArray[1];
            if(numArray[0]%2!=0) return numArray[0];
            if(numArray[1]%2!=0) return numArray[1];
        }

        int sum=0;
        ArrayList<Integer> arrayList=new ArrayList<>();


        for(int i=0;i<numArray.length-1;i++)
        {
            if(
                    (numArray[i] < numArray[i+1])
                &&
                    (numArray[i]%2!=0 && numArray[i+1]%2!=0)
            )
            {
                arrayList.add(numArray[i]);
                arrayList.add(numArray[i+1]);
                i=i+1;
            }
            else if(
                    (i>2 && i<numArray.length-1)
                    && (numArray[i-1]%2!=0 && numArray[i]%2!=0 && numArray[i+1]%2==0)
            )
            {
                arrayList.add(numArray[i]);
            }
        }
        System.out.println(arrayList);
        return sum;
    }


    public static void main(String[] args) {

        int[] arr={23,24,41,23,25,27,45,47,20,34,35,37};

        System.out.println("arr " + getSumConsecutiveOddNos(arr));

        int[] arr2={18,22,24,26,28};
        System.out.println("arr2 " + getSumConsecutiveOddNos(arr2));

        int[] arr3={21,23,25,27,29};
        System.out.println("arr3 " + getSumConsecutiveOddNos(arr3));

        int[] arr4={};
        System.out.println("arr4 " + getSumConsecutiveOddNos(arr4));

        int[] arr5={21,22};
        System.out.println("arr5 " + getSumConsecutiveOddNos(arr5));


        int[] arr6={0};
        System.out.println("arr6 " + getSumConsecutiveOddNos(arr6));

        int[] arr7={-23,-24,-41,-23,-25,-27,-45,-47,-20,-34,-35,-37};
        System.out.println("arr7 " + getSumConsecutiveOddNos(arr7));

    }

}
