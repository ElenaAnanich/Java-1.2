public class Main {
    public static void main(String[] args) {
        int priceticket = 1000; //цена билета
        int milesprice = 20; // стоимость 1 мили
        int milles = priceticket / milesprice; // колличество миль  полученных по 1 билету

        System.out.println((milles) + " Колличество полученых миль за покупку билета");
    }
}