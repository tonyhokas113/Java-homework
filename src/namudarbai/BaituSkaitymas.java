package namudarbai;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaituSkaitymas {
    
        public static void countByteUsage(String fileName, Map<Integer, Integer> byteMap) {
            
        try (InputStream is = new FileInputStream(fileName);) {
            int b;
            while ((b = is.read()) != -1) {
                Integer counter = byteMap.get(b);
                if (counter == null) {
                    counter = 0;
                }
                counter++;
                byteMap.put(b, counter);
            }
        } catch (Exception ex) {
            //ignore
        }
    }

    public static void main(String[] args) {

        Map<Integer, Integer> byteMap = new HashMap();
        
        countByteUsage("a.txt", byteMap);
        countByteUsage("b.txt", byteMap);
        countByteUsage("c.txt", byteMap);
        
        System.out.println(byteMap);
        
        Integer maxUsedByte = 0;
        Integer maxUsedByteCount = 0;
        for (Integer b : byteMap.keySet()) {
            if (byteMap.get(b) > maxUsedByteCount) {
                maxUsedByte = b;
                maxUsedByteCount = byteMap.get(b);
            }
        }
        System.out.println("Max used byte: " + maxUsedByte + " used " + maxUsedByteCount + " times.");
        
        List<Integer> bytesUsed = new ArrayList(byteMap.keySet());
        bytesUsed.sort((b1, b2) -> {
            return byteMap.get(b2) - byteMap.get(b1);
        });
        try (OutputStream os = new FileOutputStream("out.txt")) {
            for (Integer b : bytesUsed) {
                os.write(b);
            }
        } catch (Exception ex) {
            //ignore
        }
    }

}

/*

perskaityti baitus is failu a.txt, b.txt ir c.txt
 
suskaiciuoti kiek kiekvienas baitas kartu buvo panaudotas
 
atspausdinti baitu panaudojimu statistika
 
atspausdinti dazniausiai panaudota baita ir kiek kartu jis buvo panaudotas
 
*** i failai out.txt surasyti visus baitus panaudojimo mazejimo tvarka
 
 */


