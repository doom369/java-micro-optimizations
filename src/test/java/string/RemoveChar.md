JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
Benchmark                           (value)  Mode  Cnt   Score   Error  Units
RemoveChar.remove                            avgt   10   4.405 ± 1.646  ns/op
RemoveChar.remove             somePathNoDoT  avgt   10   7.820 ± 0.296  ns/op
RemoveChar.remove        some.Path.With.Dot  avgt   10  92.185 ± 3.752  ns/op

RemoveChar.removeApache                      avgt   10   3.708 ± 0.070  ns/op
RemoveChar.removeApache       somePathNoDoT  avgt   10  10.018 ± 0.103  ns/op
RemoveChar.removeApache  some.Path.With.Dot  avgt   10  37.822 ± 0.486  ns/op

RemoveChar.removeSpring                      avgt   10   3.609 ± 0.033  ns/op
RemoveChar.removeSpring       somePathNoDoT  avgt   10   7.996 ± 0.308  ns/op
RemoveChar.removeSpring  some.Path.With.Dot  avgt   10  87.148 ± 1.391  ns/op
```