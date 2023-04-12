public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            System.out.println(sumA);//jeśli zostawimy ten sout w pętli to doda pokolei każdy element 1, 3 ,6
        }
        System.out.println("dodanie tablicy \"a\": " + sumA);

        for (int i : b) {//zastosowanie pętli for each, która działa, w tym przypadku tak samo jak pętla for
            sumB += i; //zmienił się rónież ten zapis
        }
        System.out.println("dodanie tablicy \"b\": " + sumB);

        System.out.println("suma elementów tablicy \"a\" oraz \"b\": " + (sumA + sumB));
    }
}