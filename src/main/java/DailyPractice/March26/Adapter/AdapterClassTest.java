package DailyPractice.March26.Adapter;

public class AdapterClassTest {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println(v3.getVolts());
        System.out.println(v12.getVolts());
        System.out.println(v120.getVolts());
    }
}
