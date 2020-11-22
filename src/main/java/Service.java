import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

public class Service {
    public static void main(String[] args) {
        MeterRegistry registry = new SimpleMeterRegistry();
    }

    public <T extends Number> T gauge(){

    }
}
