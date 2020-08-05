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
public class StartsWith {

    @Param({"http://facebook.com/loginMe", "Http://facebook.com/loginMe", "not url at all"})
    String url;

    @Benchmark
    public boolean regionMatches() {
        return url.regionMatches(true, 0, "http", 0, "http".length());
    }

    @Benchmark
    public boolean toLowerCaseStartsWith() {
        return url.toLowerCase().startsWith("http");
    }

    @Benchmark
    public boolean substringEqualsIgnoreCase() {
        return url.substring(0, 4).equalsIgnoreCase("http");
    }
}
