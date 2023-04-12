package Tasks;

public class Quiz3 {
    public static void main(String[] args) {
//        int nums[] = {12, 15, 16, 17, 19};
//        for (int i = nums.length-1; i > 0; i--) {
//            System.out.println(nums[i]);
//        }

        //2nd
//        int i = 50;
//        int[] a = new int[10];
//        System.out.println(a.length);
//        a = new int[100];
//        System.out.println(a.length);
//        a = new int[i];
//        System.out.println(a.length);


//        //3rd
        int[] a ={12, 15, 11, 13, 9, 25};
        int[] a2 ={12, 15, 11, 13, 9, 25};
        int sum = 0;
        for(int i = 0; i <a.length; i++){
            if(a[i]%2 == a2[i]%5){
                sum += i*i;
            }
            System.out.println("sum = "+ sum);
        }

    //4th
        char array_variable [] = new char[10];
        for (int i = 0; i < 10; i++) {
            array_variable[i]='i';
            System.out.println(array_variable[i]+ "");
        }

        //5th
//        int arr_variable[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int sum =0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum = sum + arr_variable[i][j];
//            }
//        }
//        System.out.println(sum/5);


        //6th
        int [] array = {1, 4, 3, 6, 8, 2, 5};
        int what = array[0];
        for (int index = 0; index < array.length; index++) {
            if(array[index] > what){
                what = array[index];
            }
        }
        System.out.println(what);



        //7th
        for (int i = 1; i < 15; i+=3) {
            System.out.println(i);
        }


//        //8th
//        int x = 1;
//        while (x<5){
//            x++;
//            System.out.println(x);
//        }


        //9th
//        int z =0;
//        for (int y = 0; y >= z; y++) {
//            System.out.println(y + "~");
//            System.out.println(z);
//        }

        //10th
//        int count = 0;
//        while(count++ < 10){
//            System.out.println("WtoJ");
//        }
//
//        //11th
        int y = 0;
        for (int i = 0; i < 10; i++) {
            y += 1;
        }
//
//        //12th
////        for (int i = 0; i < 5; i++) {
////            System.out.println("i = " + i);
////        }
////        System.out.println("i after the loop =" + i);
//
////13th
//        for (int i = 0; i <=5 ; i++) {
//            System.out.println("i=" + i);
//        }
//
//
//        //14th
        int k =3, tot =0;
        do{
            tot = tot + k;
            k++;
        }while(k<11);
        System.out.println(tot);
//
//
//        //15
        int x =1;
        do{
            x++;
            System.out.println(x);
        }while(x<5);
//
//        //16
        int z =2, su=0;
        while(z<9){
            z++;
            su=su+z;
        }System.out.println(su);
//
//
//        //17
        int m =2, total=0;
        while(m<6){
            total=total+m;
            m++;
        }System.out.println(total);
//
////18
//        int[]zip = new int[5];
//
//        zip[0] = 7;
//        zip[1] = 3;
//        zip[2] = 4;
//        zip[3] = 1;
//        zip[4] = 9;
//        System.out.println(zip[2+1]);
    }
}
