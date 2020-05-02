package pl.itacademy.java.lesson8;

public class WindowsFileReaderHelper extends FileReadHelper {

    @Override
    //public void printFileContent(String fileName) throws IOException { <-- THIS IS A LEGAL OVERRIDING
    //public void printFileContent(String fileName) throws FileNotFoundException { <-- THIS IS A LEGAL OVERRIDING
    //public void printFileContent(String fileName) { //<-- THIS IS A LEGAL OVERRIDING
    //public void printFileContent(String fileName) throws Exception { //<-- THIS IS NOT A LEGAL OVERRIDING
    //public void printFileContent(String fileName) throws SQLException { //<-- THIS IS NOT A LEGAL OVERRIDING
    public void printFileContent(String fileName) throws NullPointerException { //<-- THIS IS A LEGAL OVERRIDING
        System.out.println("Do something important with filename related to Windows");
    }
}
