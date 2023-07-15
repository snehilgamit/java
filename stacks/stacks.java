// @snehilgamit 
// This code only for learing purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

public class stacks{

    public static void queueinsert(int rear, int max, int front, int[] a, int i, int j, int[] queue) {
        if (rear == max - 1) {
            System.out.println("Overflow");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = rear + 1;
            }
            queue[i] = a[j];
        }
        System.out.println(queue[i]);
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int max = 4;
        int[] a = { 2, 3, 5, 6 };
        int front = -1;
        int rear = -1;
        int[] queue = new int[max];

        while (i < max) {
            queueinsert(rear, max, front, a, i, j, queue);
            i++;
            j++;
        }
    }

}