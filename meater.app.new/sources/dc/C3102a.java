package dc;

import Ba.l;
import Ba.p;
import cc.C2380k;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Cancellable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001ai\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u00032\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lta/d;", "", "receiver", "completion", "Lkotlin/Function1;", "", "Loa/F;", "onCancellation", "b", "(LBa/p;Ljava/lang/Object;Lta/d;LBa/l;)V", "fatalCompletion", "c", "(Lta/d;Lta/d;)V", "e", "a", "(Lta/d;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: dc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3102a {
    private static final void a(InterfaceC4588d<?> interfaceC4588d, Throwable th) throws Throwable {
        C4172q.Companion companion = C4172q.INSTANCE;
        interfaceC4588d.resumeWith(C4172q.a(C4173r.a(th)));
        throw th;
    }

    public static final <R, T> void b(p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, R r10, InterfaceC4588d<? super T> interfaceC4588d, l<? super Throwable, C4153F> lVar) throws Throwable {
        try {
            InterfaceC4588d interfaceC4588dC = C4696b.c(C4696b.a(pVar, r10, interfaceC4588d));
            C4172q.Companion companion = C4172q.INSTANCE;
            C2380k.b(interfaceC4588dC, C4172q.a(C4153F.f46609a), lVar);
        } catch (Throwable th) {
            a(interfaceC4588d, th);
        }
    }

    public static final void c(InterfaceC4588d<? super C4153F> interfaceC4588d, InterfaceC4588d<?> interfaceC4588d2) throws Throwable {
        try {
            InterfaceC4588d interfaceC4588dC = C4696b.c(interfaceC4588d);
            C4172q.Companion companion = C4172q.INSTANCE;
            C2380k.c(interfaceC4588dC, C4172q.a(C4153F.f46609a), null, 2, null);
        } catch (Throwable th) {
            a(interfaceC4588d2, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, InterfaceC4588d interfaceC4588d, l lVar, int i10, Object obj2) throws Throwable {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, interfaceC4588d, lVar);
    }
}
