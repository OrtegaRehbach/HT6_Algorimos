public class App {
    public static void main(String[] args) {
    
        FileHandler fileHandler = new FileHandler();
        String fileName = "resources/ListadoProducto.txt";
        System.out.println(fileHandler.readFromFile(fileName));

    }
}