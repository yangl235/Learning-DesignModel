package multiion_pattern.multi_language;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class LingualResource {
    private String language = "en";
    private String region = "US";
    private String localeCode = "en_US";
    private static final String FILE_NAME = "res";
    private static HashMap instances = new HashMap(19);
    private Locale locale = null;
    private ResourceBundle resourceBundle = null;
    private LingualResource lnkLingualResource;

    /**
     * 私有构造函数
     *
     * @param language
     * @param region
     * @return
     */
    private LingualResource(String language, String region) {
        this.localeCode = language;
        this.region = region;
        localeCode = makeLocaleCode(language, region);
        locale = new Locale(language, region);
        resourceBundle = ResourceBundle.getBundle(FILE_NAME, locale);
        instances.put(makeLocaleCode(language, region), resourceBundle);

    }

    /**
     * 私有构造函数
     */
    private LingualResource() {
    }

    /**
     * 工厂方法，返回一个具有指定的内部状态的实例
     */
    public synchronized static LingualResource getInstance(String language, String region) {
        if (LingualResource.makeLocaleCode(language, region) != null) {
            //return makeLocaleCode(language, region);
            return new LingualResource(language, region);
        } else {
            return new LingualResource(language, region);
        }
    }

    public String getLocaleString(String code) {
        return resourceBundle.getString(code);
    }

    private static String makeLocaleCode(String language, String region) {
        return language + "_" + region;
    }
}
