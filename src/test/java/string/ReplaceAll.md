JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
Benchmark                                     (value)  Mode  Cnt    Score    Error  Units
ReplaceAll.replace                                     avgt   10    3.836 ±  0.060  ns/op
ReplaceAll.replaceAll                                  avgt   10  147.857 ±  1.550  ns/op
ReplaceAll.replaceAllWithContains                      avgt   10    3.777 ±  0.069  ns/op
ReplaceAll.replaceWithContains                         avgt   10    3.778 ±  0.075  ns/op

ReplaceAll.replace                      somePathNoDoT  avgt   10    7.647 ±  0.646  ns/op
ReplaceAll.replaceAll                   somePathNoDoT  avgt   10  156.495 ±  1.751  ns/op
ReplaceAll.replaceAllWithContains       somePathNoDoT  avgt   10    7.640 ±  0.291  ns/op
ReplaceAll.replaceWithContains          somePathNoDoT  avgt   10    7.545 ±  0.298  ns/op

ReplaceAll.replace                 some.Path.With.Dot  avgt   10  123.856 ±  1.686  ns/op
ReplaceAll.replaceAll              some.Path.With.Dot  avgt   10  389.632 ± 18.308  ns/op
ReplaceAll.replaceAllWithContains  some.Path.With.Dot  avgt   10  378.527 ±  6.434  ns/op
ReplaceAll.replaceWithContains     some.Path.With.Dot  avgt   10  126.918 ±  0.940  ns/op
```

JDK 1.8.0_265, OpenJDK 64-Bit Server VM, 25.265-b01

```
Benchmark                                                   (value)  Mode  Cnt    Score   Error  Units
ReplaceAll.replace                                                   avgt   10  119.510 ± 2.406  ns/op
ReplaceAll.replace                                    somePathNoDoT  avgt   10  124.683 ± 2.547  ns/op
ReplaceAll.replace                               some.Path.With.Dot  avgt   10  391.124 ± 8.022  ns/op
ReplaceAll.replaceAll                                                avgt   10  145.469 ± 3.852  ns/op
ReplaceAll.replaceAll                                 somePathNoDoT  avgt   10  147.657 ± 2.917  ns/op
ReplaceAll.replaceAll                            some.Path.With.Dot  avgt   10  359.246 ± 6.925  ns/op
ReplaceAll.replaceAllWithContains                                    avgt   10    3.455 ± 0.111  ns/op
ReplaceAll.replaceAllWithContains                     somePathNoDoT  avgt   10    9.191 ± 0.184  ns/op
ReplaceAll.replaceAllWithContains                some.Path.With.Dot  avgt   10  363.143 ± 5.813  ns/op
ReplaceAll.replaceWithContains                                       avgt   10    3.479 ± 0.154  ns/op
ReplaceAll.replaceWithContains                        somePathNoDoT  avgt   10    9.138 ± 0.251  ns/op
ReplaceAll.replaceWithContains                   some.Path.With.Dot  avgt   10  398.229 ± 7.236  ns/op
ReplaceAllPrecompiled.replaceAllWithPrecompiled                      avgt   10   47.852 ± 1.036  ns/op
ReplaceAllPrecompiled.replaceAllWithPrecompiled       somePathNoDoT  avgt   10   55.192 ± 1.135  ns/op
ReplaceAllPrecompiled.replaceAllWithPrecompiled  some.Path.With.Dot  avgt   10  264.585 ± 4.044  ns/op
```