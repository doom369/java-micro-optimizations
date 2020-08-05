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
public class EqualsIgnoreCase {

    @Param({"HELLO WORLD", "Hello World", "hello world", "otherParam"})
    String strParams;

    @Benchmark
    public boolean equalsAndToLowerCase() {
        return "hello world".equals(strParams.toLowerCase());
    }

    @Benchmark
    public boolean equalsIgnoreCase() {
        return "hello world".equalsIgnoreCase(strParams);
    }

    @Benchmark
    public boolean equals() {
        return "hello world".equals(strParams);
    }
}
