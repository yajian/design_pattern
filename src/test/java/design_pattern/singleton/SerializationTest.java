package design_pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午4:12 19/7/18
 * @ModifiedBy:
 */
public class SerializationTest {

    @Test
    public void test() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        StarveSingleton starveSingleton = StarveSingleton.getInstance();
        objectOutputStream.writeObject(starveSingleton);

        byte[] bytes = outputStream.toByteArray();

        ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(bytes));
        StarveSingleton instance = (StarveSingleton) inputStream.readObject();
        Assert.assertTrue(starveSingleton == instance);

    }
}
