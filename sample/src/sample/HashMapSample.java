package sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>(); //importしたHashMapをコンストラクターしている

        // HashMapにキーと値を追加。ようはHashMapのデータに具体的なデータを入れていっている。
        //詳しく言うと、"null"の値が入ったデータを書き換えている。
        members.put("GK", "前川");
        members.put("DF", "菅原");
        members.put("MF", "守田");
        members.put("FW", "上田");

        // 要素の取得。さっき入れたキーのデータを新しい文字列で定義する。
        String fw = members.get("FW");
        System.out.println("FWは: " + fw); //これで、”fw”という文字列を入れれば、それが入っているFWをもってきて、それに結び付く値が出てくる。

        // 要素の変更。put()を使うと、新しく値を書き換えられる。
        members.put("FW", "細谷"); // FW要素を置換
        System.out.println("1番目の要素（置換後）: " + members.get("FW"));

        // 要素の削除。
        System.out.println("GKの要素（削除前）: " + members.get("GK"));
        members.remove("GK"); // GK要素を削除
        System.out.println("GKの要素（削除後）: " + members.get("GK"));

        //拡張forループによる取得：entrySet
        //繰り返し要素を取得する際は、entrySetメソッドを使う。
        //Map.Entry< , >entry で、キーと値を取得。 for(〇〇:▼▼)で、▼▼から要素を一つ取得して〇〇に代入
        for (Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println("entrySet キー: " + entry.getKey() + ", 値: " + entry.getValue());
        }

        // 拡張forループによる取得：keySet
        //keySet()でキーのみを取得できる。この場合、membersのキーのみを取得して表示する動作を繰り返している。
        for (String key : members.keySet()) {
            System.out.println("keySet キー: " + key + ", 値: " + members.get(key));
        }
        
        // 拡張forループによる取得：values
        for (String value : members.values()) { //membersの値を取得し、１つづつmemberに代入
            System.out.println("values 値: " + value);
        }        

        // サイズの取得
        int size = members.size(); // Mapのサイズを取得
        System.out.println("Mapのサイズ（クリア前）: " + size);
        members.clear(); // Mapの内容をクリア .clear() で、membersのデータをすべて消す。
        System.out.println("Mapのサイズ（クリア後）: " + members.size());
    }
    
}