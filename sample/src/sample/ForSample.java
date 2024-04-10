package sample;

public class ForSample {

    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
            System.out.println(i);
            
        }

    }
        for(int i = 1;i <= 20; i++) {
            if(i % 2 != 0) {
                //現在の処理をスキップし、次の繰り返しに進む
                continue;
            }
            System.out.println(i);
        }
        var numbers =new int[] {1,2,3,4,5};
        
        for (var number : numbers) {
            System.out.println(number);
        }

    }
}
