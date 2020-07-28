```
Benchmark                           (url)  Mode  Cnt  Score   Error  Units
EqualChar.equalsOptimized               /  avgt   10  3.806 ± 0.075  ns/op
EqualChar.equalsPost                    /  avgt   10  5.706 ± 0.089  ns/op
EqualChar.equalsPre                     /  avgt   10  5.960 ± 0.062  ns/op

EqualChar.equalsOptimized  /my/server/url  avgt   10  3.250 ± 0.204  ns/op
EqualChar.equalsPost       /my/server/url  avgt   10  3.464 ± 0.116  ns/op
EqualChar.equalsPre        /my/server/url  avgt   10  3.786 ± 0.027  ns/op
```
