```
JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

Benchmark                                                   (url)  Mode  Cnt   Score   Error  Units
StartsWith.regionMatches              http://facebook.com/loginMe  avgt   10   5.025 ± 0.032  ns/op
StartsWith.substringEqualsIgnoreCase  http://facebook.com/loginMe  avgt   10  19.390 ± 0.922  ns/op
StartsWith.toLowerCaseStartsWith      http://facebook.com/loginMe  avgt   10  40.815 ± 0.550  ns/op

StartsWith.regionMatches              Http://facebook.com/loginMe  avgt   10  14.469 ± 0.164  ns/op
StartsWith.substringEqualsIgnoreCase  Http://facebook.com/loginMe  avgt   10  21.758 ± 0.304  ns/op
StartsWith.toLowerCaseStartsWith      Http://facebook.com/loginMe  avgt   10  46.457 ± 0.643  ns/op

StartsWith.regionMatches                           not url at all  avgt   10  10.076 ± 0.092  ns/op
StartsWith.substringEqualsIgnoreCase               not url at all  avgt   10  18.300 ± 0.131  ns/op
StartsWith.toLowerCaseStartsWith                   not url at all  avgt   10  17.197 ± 0.143  ns/op
```

