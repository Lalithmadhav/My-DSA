public class findMinVal {
    public static void main(String[] args) {
        int[] myarray = {7, 12, 9, 4, 11};
        int minVal = myarray[0];
        for(int i:myarray) {
            if (i<minVal) {
                minVal = i;
            }
        }
        System.out.println("Lowest Val: " + minVal);
        System.out.printf("Lowest Val: %d%n", minVal);
        System.out.print("Lowest Val: "+minVal);
        System.out.println(":)");
        String str = String.format("Lowest Val: %d", minVal);
        System.out.println(str); 
        str = "Lowest Val: ".formatted(minVal);
        System.out.println(str);
    }
}