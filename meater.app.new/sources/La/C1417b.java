package La;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;
import oa.C4173r;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "LLa/a;", "a", "(LBa/l;)LLa/a;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1417b {
    static {
        Object objA;
        try {
            C4172q.Companion companion = C4172q.INSTANCE;
            objA = C4172q.a(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            C4172q.Companion companion2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        if (C4172q.d(objA)) {
            objA = Boolean.TRUE;
        }
        Object objA2 = C4172q.a(objA);
        Boolean bool = Boolean.FALSE;
        if (C4172q.c(objA2)) {
            objA2 = bool;
        }
        ((Boolean) objA2).booleanValue();
    }

    public static final <V> AbstractC1415a<V> a(Ba.l<? super Class<?>, ? extends V> compute) {
        C3862t.g(compute, "compute");
        return new C1431i(compute);
    }
}
