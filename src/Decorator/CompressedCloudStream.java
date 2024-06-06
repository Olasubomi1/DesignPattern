package Decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = compress(data);
        System.out.println("compress");
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0,5);
    }
}
