// @snehilgamit 
// This code only for learning purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String text = 
        // input.nextLine();
                "\u001B[35m\n\n\u092E\u0939\u093F\u092E\u093E \u0938\u0947 \u0924\u0942 \u091C\u094B \u092D\u0930\u093E \u0939\u0941\u0906,  \u091C\u094D\u092F\u094B\u0924\u093F \u092E\u0947\u0902 \u0938\u0926\u093E \u0930\u0939\u0928\u0947 \u0935\u093E\u0932\u093E,\n"
                        + //
                        "\n" + //
                        "\u092E\u0928\u0941\u0937\u094D\u092F\u094B\u0902 \u092E\u0947\u0902 \u0924\u0942 \u0928\u0947 \u091C\u0928\u094D\u092E \u0932\u093F\u092F\u093E, \u092B\u093F\u0930 \u0938\u0947 \u092F\u0940\u0936\u0941 \u091C\u0917 \u092E\u0947\u0902 \u0924\u0942 \u0906\u090F\u0917\u093E\n"
                        + //
                        "\n" + //
                        "\u0906\u090F\u0917\u093E \u092F\u0940\u0936\u0941 \u0906\u090F\u0917\u093E, \u092B\u093F\u0930 \u0938\u0947 \u092F\u0940\u0936\u0941 \u091C\u0917 \u092E\u0947\u0902 \u0924\u0942 \u0906\u090F\u0917\u093E\n"
                        + //
                        "\n" + //
                        "\u092E\u0928\u0941\u0937\u094D\u092F\u094B\u0902 \u092E\u0947\u0902 \u0924\u0942 \u0928\u0947 \u091C\u0928\u094D\u092E \u0932\u093F\u092F\u093E, \u092B\u093F\u0930 \u0938\u0947 \u092F\u0940\u0936\u0941 \u091C\u0917 \u092E\u0947\u0902 \u0924\u0942 \u0906\u090F\u0917\u093E\n\n\u001B[0m";
        String[] splitText = text.split("");
        for (int i = 0; i < splitText.length; i++) {
            System.out.print(splitText[i]);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        input.close();
    }
}
