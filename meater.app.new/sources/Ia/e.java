package Ia;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KClasses.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "LIa/d;", "value", "a", "(LIa/d;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(d<T> dVar, Object obj) {
        C3862t.g(dVar, "<this>");
        if (dVar.s(obj)) {
            C3862t.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.q());
    }
}
