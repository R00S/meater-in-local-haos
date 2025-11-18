package ta;

import Ba.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import ua.C4696b;

/* compiled from: Continuation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lta/d;", "", "receiver", "completion", "Loa/F;", "a", "(LBa/p;Ljava/lang/Object;Lta/d;)Lta/d;", "b", "(LBa/p;Ljava/lang/Object;Lta/d;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    public static final <R, T> InterfaceC4588d<C4153F> a(p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, R r10, InterfaceC4588d<? super T> completion) {
        C3862t.g(pVar, "<this>");
        C3862t.g(completion, "completion");
        return new i(C4696b.c(C4696b.a(pVar, r10, completion)), C4696b.e());
    }

    public static final <R, T> void b(p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, R r10, InterfaceC4588d<? super T> completion) {
        C3862t.g(pVar, "<this>");
        C3862t.g(completion, "completion");
        InterfaceC4588d interfaceC4588dC = C4696b.c(C4696b.a(pVar, r10, completion));
        C4172q.Companion companion = C4172q.INSTANCE;
        interfaceC4588dC.resumeWith(C4172q.a(C4153F.f46609a));
    }
}
