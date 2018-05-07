package decorator.grep;

import java.io.*;

public class GrepReader extends FilterReader {

    /**
     * substring to be matched
     */
    protected String substring;

    protected BufferedReader in;
    private int lineNumber;

    public GrepReader(FileReader in, String substring) {
        super(in);
        this.in = new BufferedReader(in);
        this.substring = substring;
        lineNumber = 0;
    }

    public final String readLine() throws IOException {
        String line;
        //step forward until line matching substring
        do {
            line = in.readLine();
            lineNumber++;
        }
        while ((line != null) && line.indexOf(substring) == -1);
        return line;
    }

    public int getLineNo() {
        return lineNumber;
    }


}
