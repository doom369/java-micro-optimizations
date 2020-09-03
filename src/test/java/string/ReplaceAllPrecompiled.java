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
import java.util.regex.Pattern;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 10, time = 1)
public class ReplaceAllPrecompiled {

    @Param({"", "somePathNoDoT", "some.Path.With.Dot"})
    String value;

    private static final Pattern DOT_PATTERN = Pattern.compile("\\.");
    @Benchmark
    public String replaceAllPrecompiled() {
        return DOT_PATTERN.matcher(value).replaceAll("%2E");
    }

    @Benchmark
    public String replaceAll() {
        return value.replaceAll("\\.", "%2E");
    }

    @Benchmark
    public String replace() {
        return value.replace(".", "%2E");
    }

}
