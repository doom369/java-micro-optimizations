package string;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 10, time = 1)
public class EnumValues {

    @Benchmark
    public void enumValuesMethod(Blackhole bh) {
        for (WidgetProperty property : WidgetProperty.values()) {
            bh.consume(property);
        }
    }

    @Benchmark
    public void enumValuesVariable(Blackhole bh) {
        for (WidgetProperty property : WidgetProperty.values) {
            bh.consume(property);
        }
    }

}
