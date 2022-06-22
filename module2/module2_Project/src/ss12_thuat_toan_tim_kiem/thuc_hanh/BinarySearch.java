package ss12_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    static int[] list = {2, 11, 31, 55, 69, 77, 21, 7};

    static int binarySearch(int[] list, int key) {
        int first = 0;
        int last = list.length - 1;
        while (last >= first) {
            int mid = (last + first) / 2;
            if (key < list[mid]) {
                last = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,31));
        System.out.println(binarySearch(list,22));
        System.out.println(binarySearch(list,2));
    }
}
