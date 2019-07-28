package ShellSort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException {
        int sum=0;
        int N = 0;
        for (int k = 0; k <50 ; k++)
        {BufferedReader bin =new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String s;
        int i=0;
//        String words[] = new String[0];
        String lines[] = new String[0];
        int count=0;
        List<String> words =new ArrayList<>();
        while((s=bin.readLine())!=null) {
        String word[] =s.split(" ");
            for (int j = 0; j < word.length; j++) {
                words.add(word[j]);
            }
        }
        N=(words.size());
        String[] wordsArr =new String[words.size()];
        words.toArray(wordsArr);
            long init =System.currentTimeMillis();
            knuthSquence.sort(wordsArr);
            long curr=System.currentTimeMillis();
            sum+=curr-init;
        }
        System.out.println(N);
        double answer =sum/50000.0;
        System.out.println(answer);
    }
}
