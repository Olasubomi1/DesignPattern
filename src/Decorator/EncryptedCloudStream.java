package Decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        System.out.println("encrypt");
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "!@#$%^7899*())*&%^^&789987&&*&**((&&^^%^0!";
    }
}
