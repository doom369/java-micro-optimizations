JDK 1.8.0_265, OpenJDK 64-Bit Server VM, 25.265-b01

```
Benchmark                              (strParams)  Mode  Cnt   Score   Error  Units
EqualsIgnoreCase.equalsAndToLowerCase  HELLO WORLD  avgt   10  67.110 ± 0.891  ns/op
EqualsIgnoreCase.equalsIgnoreCase      HELLO WORLD  avgt   10  46.485 ± 0.671  ns/op

EqualsIgnoreCase.equalsAndToLowerCase  Hello World  avgt   10  57.092 ± 1.146  ns/op
EqualsIgnoreCase.equalsIgnoreCase      Hello World  avgt   10  29.846 ± 0.292  ns/op

EqualsIgnoreCase.equalsAndToLowerCase  hello world  avgt   10  23.289 ± 0.188  ns/op
EqualsIgnoreCase.equalsIgnoreCase      hello world  avgt   10  18.668 ± 0.291  ns/op

EqualsIgnoreCase.equalsAndToLowerCase   otherParam  avgt   10  49.020 ± 1.436  ns/op
EqualsIgnoreCase.equalsIgnoreCase       otherParam  avgt   10   2.885 ± 0.056  ns/op

EqualsIgnoreCase.equals                hello world  avgt   10   6.947 ± 0.134  ns/op
```

JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
EqualsIgnoreCase.equalsAndToLowerCase  HELLO WORLD  avgt   10  37.890 ± 0.547  ns/op
EqualsIgnoreCase.equalsIgnoreCase      HELLO WORLD  avgt   10  42.518 ± 0.451  ns/op

EqualsIgnoreCase.equalsAndToLowerCase  Hello World  avgt   10  33.204 ± 0.525  ns/op
EqualsIgnoreCase.equalsIgnoreCase      Hello World  avgt   10  27.891 ± 0.288  ns/op

EqualsIgnoreCase.equalsAndToLowerCase  hello world  avgt   10  18.047 ± 0.233  ns/op
EqualsIgnoreCase.equalsIgnoreCase      hello world  avgt   10  19.639 ± 0.184  ns/op

EqualsIgnoreCase.equalsAndToLowerCase   otherParam  avgt   10  30.211 ± 0.460  ns/op
EqualsIgnoreCase.equalsIgnoreCase       otherParam  avgt   10   3.489 ± 0.026  ns/op

EqualsIgnoreCase.equals                hello world  avgt   10   7.287 ± 0.182  ns/op
```

