public class RewriteJava1 {

    public static void main(String[] args) {
        // write your code here
        int[] array = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        int e = searchIndex(array, 11);
        System.out.println(e);
    }

    private static int searchIndex(int[] array, int i) {
        int index=0;
        int limit = array.length-1;
        while (index<=limit){

            int point =(int)Math.ceil((index+limit)/2);
            int entry = array[point];

            if(i>entry){
                index = point +1;
                continue;
            }
            if(i<entry){
                limit=point-1;
                continue;
            }
            return point;
        }
        return -1;
    }
}
