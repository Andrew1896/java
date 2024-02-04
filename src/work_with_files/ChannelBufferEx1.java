package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder poezie = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read: " + byteRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    poezie.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(poezie);
            String text = "\nDacă vrei să duci o viața fericită, leag-o de un scop,"
                    + " nu de oameni și lucruri. – Albert Einstein";
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer1);

//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
