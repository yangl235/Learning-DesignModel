package multiion_pattern.multi_language;

public class LingualResourceTester {
    public static void main(String[] args) {
        LingualResource ling = LingualResource.getInstance("en", "US");
        String usDollar = ling.getLocaleString("USD");
        System.out.println("USD = " + usDollar);
        LingualResource lingZh = LingualResource.getInstance("zh", "CH");
        String usDollarZh = lingZh.getLocaleString("USD");
        System.out.println("USD = " + usDollarZh);
    }
}
