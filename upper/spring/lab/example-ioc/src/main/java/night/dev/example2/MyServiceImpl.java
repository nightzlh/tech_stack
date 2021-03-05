package night.dev.example2;

import org.springframework.beans.factory.annotation.Autowired;

public class MyServiceImpl implements MyService {
    @Autowired
    private Dependency1 dep1;

    @Autowired
    private Dependency2 dep2;

    public void doStuff() {
        System.out.println(dep1.getName() + " vs " + dep2.getName());
    }
}
