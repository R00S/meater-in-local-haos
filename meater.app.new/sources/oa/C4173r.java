package oa;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "exception", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Loa/q;", "Loa/F;", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4173r {
    public static final Object a(Throwable exception) {
        C3862t.g(exception, "exception");
        return new C4172q.Failure(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof C4172q.Failure) {
            throw ((C4172q.Failure) obj).exception;
        }
    }
}
