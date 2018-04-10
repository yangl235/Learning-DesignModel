package singleton.config_manager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConfigClient {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Type quit to quit");
        do {
            System.out.println("Property item to read: ");
            String line = reader.readLine();
            if (line.equals("quit")) {
                break;
            }
            System.out.println(ConfigManager.getInstance().getConfigItem(line, "Not found."));
        }
        while (true);
    }
}
