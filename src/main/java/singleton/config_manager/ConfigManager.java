package singleton.config_manager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {
    /**
     * 属性文件全名
     */
    private static final String PFILE = System.getProperty("user.dir") + File.separator + "Singleton.properties";
    /**
     * 对应于属性文件的文件对象变量
     */
    private File m_file = null;
    /**
     * 属性文件的最后修改日期
     */
    private long m_lastModifiedTime = 0;
    /**
     * 属性文件对应的属性对象变量
     */
    private Properties m_props = null;
    /**
     * 本类可能存在的唯一的一个实例
     */
    private static ConfigManager m_instance = new ConfigManager();

    /**
     * 私有的构造子
     */
    private ConfigManager() {
        m_file = new File(PFILE);
        m_lastModifiedTime = m_file.lastModified();
        if (m_lastModifiedTime == 0) {
            System.err.println(PFILE + " file does not exist!");
        }
        m_props = new Properties();
        try {
            m_props.load(new FileInputStream(PFILE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 静态工厂方法
     *
     * @return 返回ConfigManager类的单一实例
     */
    synchronized public static ConfigManager getInstance() {
        return m_instance;
    }

    /**
     * 读取一个特定的属性项
     *
     * @param name       属性项的项名
     * @param defaultVal 属性项的默认值
     * @return 属性项的值
     */
    final public Object getConfigItem(String name, Object defaultVal) {
        long newTime = m_file.lastModified();
        //检查属性文件是否被其他程序修改过，如果是，则重新读取此文件
        if (newTime == 0) {
            //属性文件不存在
            if (m_lastModifiedTime == 0) {
                System.err.println(PFILE + " file does not exist!");
            } else {
                System.err.println(PFILE + " file was deleted!!");
            }
            return defaultVal;
        } else if (newTime > m_lastModifiedTime) {
            //去除旧的配置
            m_props.clear();
            try {
                m_props.load(new FileInputStream(PFILE));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m_lastModifiedTime = newTime;
        Object val = m_props.get(name);
        if (val == null) {
            return defaultVal;
        } else {
            return val;
        }
    }

}
