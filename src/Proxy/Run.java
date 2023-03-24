package Proxy;

public class Run {
    public static void main(String[] args) {
        String myIP = "192.168.123.0";
        Inst insta = new Inst(myIP);
        System.out.println(insta.load());

        String proxyIP = "132.158.11.0";
        InstProxy instProxy = new InstProxy(proxyIP);
        System.out.println(instProxy.load());
    }
}
