package net.salesianos.utils;

public class LineProcessor {

    private String[] content;

    public LineProcessor(String[] content) {
        this.content = content;
    }

    public String[] process() {
        String[] processedContent = new String[content.length];
        for (int i = 0; i < content.length; i++) {
            processedContent[i] = processLine(content[i]);
        }
        return processedContent;
    }

    private String processLine(String line) {
        return line.replaceAll("[aeiouAEIOU]", "X");
    }
}