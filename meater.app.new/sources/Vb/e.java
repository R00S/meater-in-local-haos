package Vb;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DurationUnitJvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"", "value", "LVb/d;", "sourceUnit", "targetUnit", "b", "(JLVb/d;LVb/d;)J", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes3.dex */
class e {
    public static final long a(long j10, d sourceUnit, d targetUnit) {
        C3862t.g(sourceUnit, "sourceUnit");
        C3862t.g(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j10, sourceUnit.getTimeUnit());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        C3862t.g(sourceUnit, "sourceUnit");
        C3862t.g(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j10, sourceUnit.getTimeUnit());
    }
}
