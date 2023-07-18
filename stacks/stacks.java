// @snehilgamit 
// This code only for learing purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

import java.util.Scanner;

public class stacks {

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
        int[] a = { 60, 40, 20, 10 };
        int front = -1;
        int rear = -1;
        int[] queue = new int[max];
        Scanner input = new Scanner(System.in);
        while (true) {
            int userinput = input.nextInt();
            if (userinput == 0) {
                System.out.println("Inserted : ");
                queueinsert(rear, max, front, a, i, j, queue);
                System.out.println("and queue is " + queue[0]+" "+ queue[1] +" "+ queue[2] +" "+ queue[3]);
                i++;
                j++;
            }
        }
    }

}