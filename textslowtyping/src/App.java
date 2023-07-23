// @snehilgamit 
// This code only for learing purpose.There are many bugs or you can write it in easly, better syntax. i am learing nothing else..... :)

public class App {
    public static void main(String[] args) throws Exception {
        String text = "Good morning, I am snehil. how are you?";
        String[] al = text.split("");
        for(int i =0;i<al.length;i++){
            System.out.print(al[i]);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
