package string;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 10, time = 1)
public class EnumValueOf0 {

    @Param({"LABEL", "ON_LABEL", "MAX"})
    String strParams;

    @Benchmark
    public WidgetProperty enumValueOf() {
        return WidgetProperty.valueOf(strParams);
    }

    @Benchmark
    public WidgetProperty enumSwitch() {
        return WidgetProperty.valueOfSwitch(strParams);
    }

    @Benchmark
    public WidgetProperty enumMap() {
        return WidgetProperty.valueOfMap(strParams);
    }
}
