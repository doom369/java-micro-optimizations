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
public class EqualChar {

    @Param({"/", "/my/server/url"})
    private String url;

    @Benchmark
    public boolean equalsPost() {
        return url != null && url.equals("/");
    }

    @Benchmark
    public boolean equalsPre() {
        return "/".equals(url);
    }

    @Benchmark
    public boolean equalsOptimized() {
        return equalsOneChar(url);
    }

    private static boolean equalsOneChar(String url) {
        return url != null && url.length() == 1 && url.charAt(0) == '/';
    }

}