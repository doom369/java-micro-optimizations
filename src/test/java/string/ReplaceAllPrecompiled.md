JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
Benchmark                                               (value)  Mode  Cnt    Score    Error  Units
ReplaceAllPrecompiled.replace                                    avgt   10    3.843 ±  0.100  ns/op
ReplaceAllPrecompiled.replace                     somePathNoDoT  avgt   10    8.693 ±  0.693  ns/op
ReplaceAllPrecompiled.replace                some.Path.With.Dot  avgt   10  127.022 ±  8.842  ns/op

ReplaceAllPrecompiled.replaceAll                                 avgt   10  156.550 ± 10.741  ns/op
ReplaceAllPrecompiled.replaceAll                  somePathNoDoT  avgt   10  159.619 ±  4.654  ns/op
ReplaceAllPrecompiled.replaceAll             some.Path.With.Dot  avgt   10  391.912 ± 11.445  ns/op

ReplaceAllPrecompiled.replaceAllPrecompiled                      avgt   10   52.466 ±  0.791  ns/op
ReplaceAllPrecompiled.replaceAllPrecompiled       somePathNoDoT  avgt   10   64.337 ±  0.854  ns/op
ReplaceAllPrecompiled.replaceAllPrecompiled  some.Path.With.Dot  avgt   10  274.867 ±  3.535  ns/op
```