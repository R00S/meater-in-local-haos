package kd;

import Ia.d;
import Wb.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KoinPlatformTools.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkd/a;", "LIa/d;", "kClass", "", "b", "(Lkd/a;LIa/d;)Ljava/lang/String;", "a", "(Lkd/a;)Ljava/lang/String;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final String a(a aVar) {
        C3862t.g(aVar, "<this>");
        return c.INSTANCE.d().toString();
    }

    public static final String b(a aVar, d<?> kClass) {
        C3862t.g(aVar, "<this>");
        C3862t.g(kClass, "kClass");
        return "KClass@" + kClass.hashCode();
    }
}
