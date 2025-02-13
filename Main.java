Sure, here is a simple Java program that reads data from a file, processes it, and writes to another file:

```Java
import java.io.*;

public class BasicDataProcessing {

    public static void main(String[] args) {
        processFile("input.txt", "output.txt");
    }

    static void processFile(String inputFile, String outputFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String processedData = processData(line);
                writer.write(processedData + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String processData(String data) {
        // This is a simple example of data processing, 
        // you can replace it with your own logic
        return data.toUpperCase();
    }
}
```

Цей код читає дані з файлу `input.txt`, обробляє їх (в цьому випадку просто перетворює на верхній регістр), а потім записує результат у файл `output.txt`. Примітка: цей код має бути запущений в директорії, де є файл `input.txt`.

This code reads data from a file named `input.txt`, processes the data (in this case, simply converting it to uppercase), and then writes the processed data to a file named `output.txt`. Please note that this code should be run in a directory that contains the `input.txt` file.