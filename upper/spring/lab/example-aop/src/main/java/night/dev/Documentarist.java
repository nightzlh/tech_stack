package night.dev;

public class Documentarist {

    private GrammyGuitarist guitarist;
    public void execute() {
        guitarist.sing();
        guitarist.talk();
    }

    public void setDep(GrammyGuitarist guitarist) {
        this.guitarist = guitarist;
    }
}
