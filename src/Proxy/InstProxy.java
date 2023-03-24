package Proxy;

public class InstProxy implements Website{
    private final String proxyIp;
    private Inst insta;

    public InstProxy(String ip) {
        this.proxyIp = ip;
    }
    @Override
    public String load() {
        if(insta ==null)
            insta = new Inst(proxyIp);
        return insta.load();
    }
}
