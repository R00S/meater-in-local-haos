package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyLayoutItemProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LC/q;", "", "key", "", "lastKnownIndex", "a", "(LC/q;Ljava/lang/Object;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {
    public static final int a(q qVar, Object obj, int i10) {
        int iC;
        return (obj == null || qVar.a() == 0 || (i10 < qVar.a() && C3862t.b(obj, qVar.b(i10))) || (iC = qVar.c(obj)) == -1) ? i10 : iC;
    }
}
