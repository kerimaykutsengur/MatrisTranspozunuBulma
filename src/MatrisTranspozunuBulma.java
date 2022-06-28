import java.util.Arrays;

public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        int[][] list = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matris : ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j][i] + "  ");
            }
            System.out.println("");
        }

    }


}
