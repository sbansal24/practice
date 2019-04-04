package DesignPatterns.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        AdapterTest test = new AdapterTest();
        SocketAdapter adapter = new SocketAdapterImpl();
        Volt volt3 = test.getVolt(adapter, 3);
        System.out.println(volt3.getVolt());
    }

    private Volt getVolt(SocketAdapter adapter, int i) {
        switch (i) {
            case 3:
                return adapter.get3Volt();
            default:
                return adapter.get120Volt();
        }
    }
}
