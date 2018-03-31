package simple_factory;

import java.text.DateFormat;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateTester {

    public static void main(String[] args) {
        Locale locale = Locale.FRANCE;
        Date date = new Date();
        String now = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(date);
        System.out.println(now);
        try {
            date = DateFormat.getDateInstance(DateFormat.DEFAULT, locale).parse("31 mars 2018");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("parsing exception " + e);
        }
    }
        /*Date today = new Date();

        // Print date in the default locale format
        Locale defaultLocale = Locale.getDefault();
        printLocaleDetails(defaultLocale);
        printDate(defaultLocale, today);

        // Print date in French format
        printLocaleDetails(Locale.FRANCE);
        printDate(Locale.FRANCE, today);

        // Print date in German format. We could also use Locale.GERMANY
        // instead of new Locale ("de", "DE").
        Locale germanLocale = new Locale("de", "DE");
        printLocaleDetails(germanLocale);
        printDate(germanLocale, today);
    }

    public static void printLocaleDetails(Locale locale) {
        String languageCode = locale.getLanguage();
        String languageName = locale.getDisplayLanguage();
        String countryCode = locale.getCountry();
        String countryName = locale.getDisplayCountry();
        // Print the locale info
        System.out.println("Language: " + languageName + "(" + languageCode + "); "
                + "Country: " + countryName + "(" + countryCode + ")");
    }

    public static void printDate(Locale locale, Date date) {
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String formattedDate = formatter.format(date);
        System.out.println("SHORT: " + formattedDate);

        formatter = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        formattedDate = formatter.format(date);

        formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        formattedDate = formatter.format(date);
        System.out.println("DEFAULT: " + formattedDate + "\n");


    }*/

}

