
// Example of 1D and 2D arrays in Java
public class ArrayExample {
    public static void main(String[] args) {
        int[] oneD = {1, 2, 3, 4, 5};
        System.out.println("1D Array:");
        for (int num : oneD) {
            System.out.println(num);
        }

        int[][] twoD = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("\n2D Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
