package org.sample.beans.producers;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.stereotype.Component;

        import java.io.File;
        import java.io.IOException;
        import java.net.URISyntaxException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.List;
@Component
@Producer(type = Producer.ProducerType.FILE)
public class FileMessageProducer implements MessageProducer {

    @Autowired
    @Qualifier("messageFile")
    private String fileName;

    @Override
    public String getMessage() {
        List<String> lines = null;
        try {
            Path path = new File(getClass().getResource(fileName).toURI()).toPath();
            lines = Files.readAllLines(path);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        String result = "";
        if(lines != null)
            result = lines.stream().reduce(result, (a, b) -> a + b);
        return result;
    }

}
