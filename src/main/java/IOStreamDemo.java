import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/abc.txt";

        byte[] bytes = "Java Core".getBytes(StandardCharsets.UTF_8);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, false);

        byte[] output = IOManager.readFile(path);
        String content = new String(output);
        System.out.println(content);

        Account account = new Account(1, "khoa.nv", "123456");
        IOManager.writeObject(path, account, false);
        Account savedAccount = (Account) IOManager.readObject(path);
        System.out.println(savedAccount);
    }
}
