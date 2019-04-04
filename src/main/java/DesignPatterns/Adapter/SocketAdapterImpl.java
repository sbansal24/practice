package DesignPatterns.Adapter;

public class SocketAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();
    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 40);
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    private Volt convertVolt(Volt volt,int divisor ){
        return new Volt(volt.getVolt()/divisor);
    }
}
