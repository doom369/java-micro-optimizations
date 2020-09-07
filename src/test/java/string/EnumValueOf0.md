JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10

```
//with predicted input
Benchmark                (strParams)  Mode  Cnt   Score   Error  Units
EnumValueOf.enumMap            LABEL  avgt   10  11.749 ± 0.761  ns/op
EnumValueOf.enumMap         ON_LABEL  avgt   10  11.778 ± 0.306  ns/op
EnumValueOf.enumMap              MAX  avgt   10  10.517 ± 0.056  ns/op
EnumValueOf.enumSwitch         LABEL  avgt   80   7.149 ± 0.030  ns/op
EnumValueOf.enumSwitch      ON_LABEL  avgt   80   7.758 ± 0.077  ns/op
EnumValueOf.enumSwitch           MAX  avgt   80   6.948 ± 0.083  ns/op
EnumValueOf.enumValueOf        LABEL  avgt   80  15.659 ± 0.450  ns/op
EnumValueOf.enumValueOf     ON_LABEL  avgt   80  14.734 ± 0.542  ns/op
EnumValueOf.enumValueOf          MAX  avgt   80  15.153 ± 0.578  ns/op
```