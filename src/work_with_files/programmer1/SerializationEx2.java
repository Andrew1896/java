package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Peugeot 308", "Blue");
        Employee employee = new Employee("Elvira", "Ceban", "IT", 900, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream
                (new FileOutputStream("employees2.bin"))
        ) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

