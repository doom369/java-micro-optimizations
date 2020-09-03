JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
Benchmark                                     (value)  Mode  Cnt    Score   Error  Units
ReplaceCustom.replace                                  avgt   10    4.497 ± 1.085  ns/op
ReplaceCustom.replace                   somePathNoDoT  avgt   10    7.944 ± 0.289  ns/op
ReplaceCustom.replace              some.Path.With.Dot  avgt   10  106.270 ± 5.095  ns/op

ReplaceCustom.replaceApache                            avgt   10    3.784 ± 0.065  ns/op
ReplaceCustom.replaceApache             somePathNoDoT  avgt   10    8.168 ± 0.052  ns/op
ReplaceCustom.replaceApache        some.Path.With.Dot  avgt   10  121.248 ± 1.935  ns/op

ReplaceCustom.replaceChar                              avgt   10    3.689 ± 0.040  ns/op
ReplaceCustom.replaceChar               somePathNoDoT  avgt   10    8.787 ± 0.119  ns/op
ReplaceCustom.replaceChar          some.Path.With.Dot  avgt   10   26.824 ± 0.391  ns/op

ReplaceCustom.springCustomReplace                      avgt   10    3.628 ± 0.058  ns/op
ReplaceCustom.springCustomReplace       somePathNoDoT  avgt   10    7.991 ± 0.268  ns/op
ReplaceCustom.springCustomReplace  some.Path.With.Dot  avgt   10  108.191 ± 6.138  ns/op
```

JDK 1.8.0_265, OpenJDK 64-Bit Server VM, 25.265-b01

```
Benchmark                                     (value)  Mode  Cnt    Score   Error  Units
ReplaceCustom.replace                                  avgt   10  116.851 ± 3.107  ns/op
ReplaceCustom.replace                   somePathNoDoT  avgt   10  124.806 ± 3.289  ns/op
ReplaceCustom.replace              some.Path.With.Dot  avgt   10  376.608 ± 4.225  ns/op
ReplaceCustom.replaceChar                              avgt   10    3.445 ± 0.093  ns/op
ReplaceCustom.replaceChar               somePathNoDoT  avgt   10   11.484 ± 0.074  ns/op
ReplaceCustom.replaceChar          some.Path.With.Dot  avgt   10   31.191 ± 0.641  ns/op
ReplaceCustom.springCustomReplace                      avgt   10    2.963 ± 0.054  ns/op
ReplaceCustom.springCustomReplace       somePathNoDoT  avgt   10    8.943 ± 0.102  ns/op
ReplaceCustom.springCustomReplace  some.Path.With.Dot  avgt   10  109.930 ± 1.716  ns/op
```