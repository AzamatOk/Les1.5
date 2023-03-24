package Proxy;

public class Inst implements Website{
    private final String ip;

    public Inst(String ip) {
        this.ip = ip;
    }

    @Override
    public String load() {
        if("192.168.123.0".equals(ip)){
            return "Доступ заблокирован";
        }
        return "Вы зашли в Telegram, ваш ip:" +ip ;
    }
}
