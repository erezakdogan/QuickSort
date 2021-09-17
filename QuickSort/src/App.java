public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{7,1,9,18,17,19,2,8,6,4,3,5,12,15,36,29,11};
        SortClass sortClass = new SortClass();
        sortClass.sort(array,0,array.length-1);
    }
}
