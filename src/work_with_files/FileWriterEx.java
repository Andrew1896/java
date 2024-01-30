package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Pentru ca raul sa triumfe este suficient ca oamenii buni sa nu faca nimic" +
                " Edmund Burke";
        String s = " Salut!\n";

        try (FileWriter writer = new FileWriter("test2.txt", true)) {
//            writer = new FileWriter("C:\\Users\\ionla\\OneDrive\\Рабочий стол\\text1");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            writer.close();
//        }
    }
}
