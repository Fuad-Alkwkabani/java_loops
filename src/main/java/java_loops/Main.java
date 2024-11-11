package java_loops;

public class Main {

    public static void main(String[] args) {
        // ejecutar la aplicación
        MainView mainView = new MainView();
        int numb = mainView.index();

        MultiplyTable.generateTabla(numb);
        
        mainView.render(MultiplyTable.getTable());
    }
}
