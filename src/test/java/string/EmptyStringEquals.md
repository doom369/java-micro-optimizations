```
Benchmark                               (strParams)  Mode  Cnt  Score   Error  Units
EmptyStringEquals.equalsPost                         avgt   10  4.348 ± 0.056  ns/op
EmptyStringEquals.nonNullAndIsEmpty                  avgt   10  3.029 ± 0.033  ns/op
EmptyStringEquals.preEquals                          avgt   10  4.360 ± 0.060  ns/op

EmptyStringEquals.equalsPost         nonEmptyString  avgt   10  3.552 ± 0.024  ns/op
EmptyStringEquals.nonNullAndIsEmpty  nonEmptyString  avgt   10  3.031 ± 0.082  ns/op
EmptyStringEquals.preEquals          nonEmptyString  avgt   10  3.813 ± 0.115  ns/op
```