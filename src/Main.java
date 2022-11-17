public class Main {
    public static void main(String[] args) {

        int x = 100;
        Integer p = 200;

        String str1 = "Hello";// литерально
        String str2 = "Hello";
        // Не сравниваем так!
        System.out.println(str1==str2); // ???


        String a = new String("Moscow");
        String b = new String("Moscow");

        // Не сравниваем так!!!
        System.out.println(a==b); // ???

        // Строки сравниваем с помощь equals
        System.out.println(a.equals(b));

        String str = "Hello 123";
        System.out.println(str.hashCode());
        str += " 789"; // "Hello 123 789"
        System.out.println(str);
        System.out.println(str.hashCode());
        // String immutable - Неизменяемые


        // StringBuilder mutable - Изменяемая строка
        // или StringBuffer mutable
        StringBuilder stringBuilder = new StringBuilder("567");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" 321");
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder);
        String result = stringBuilder.toString();
        



    }
}