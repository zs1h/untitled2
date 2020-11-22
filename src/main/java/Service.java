import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

public class Service {
    public static void main(String[] args) {
        MeterRegistry registry = new SimpleMeterRegistry();
    }
    public void test(){
        System.out.println("ds");
        System.out.println("new change");
        System.out.println("sdsada");
    }

}
