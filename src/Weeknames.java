public class Weeknames {
    public static void main(String[] args) {
        int n;
        String s;
        n = 9;
        switch (n) {
            case 1:
                s = "Понедельник";
                break;
            case 2:
                s = "Вторник";
                break;
            case 3:
                s = "Среда";
                break;
            case 4:
                s = "Четверг";
                break;
            case 5:
                s = "Пятница";
                break;
            case 6:
                s = "Суббота";
                break;
            case 7:
                s = "Воскресенье";
                break;
            default:
                s = "Неправильно введен день";
        }

        System.out.println(s);
    }
}