package night.dev.structure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class LoadSrcAsStreamExample {

    // absolute path or relative path
    public void loadByClass(String path) {
        InputStream input = LoadSrcAsStreamExample.class.getResourceAsStream(path);
        showPath(input);
    }

    // relative path only, path from root of class path
    public void loadByClassLoader(String path) {
        InputStream input = LoadSrcAsStreamExample.class.getClassLoader().getResourceAsStream(path);
        showPath(input);
    }

    public static void showPath(InputStream input) {
        Properties prop = new Properties();

        if (null == input) {
            throw new RuntimeException("can not load properties: " + input);
        }

        try {
            prop.load(input);
            input.close();
            for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                System.out.println(entry.getKey().toString() + "="
                        + entry.getValue().toString());
            }

        } catch (IOException e) {
            throw new RuntimeException("can not read properties: " + input);
        }
    }

    public void run() {
        this.loadByClass("cur_path_mybatis.xml");
        this.loadByClass("/night/dev/structure/cur_path_mybatis.xml");

        this.loadByClass("resource_in_src.xml");
        this.loadByClass("/night/dev/structure/resource_in_src.xml");

        this.loadByClassLoader("night/dev/structure/cur_path_mybatis.xml");
        this.loadByClassLoader("night/dev/structure/resource_in_src.xml");
    }
}

