package ac;

import Xb.InterfaceC1867v0;
import kotlin.C2291g;
import kotlin.InterfaceC2295k;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Lac/e;", "", "capacity", "LZb/d;", "onBufferOverflow", "a", "(Lac/e;ILZb/d;)Lac/e;", "d", "(Lac/e;)Lac/e;", "Lta/g;", "context", "e", "(Lac/e;Lta/g;)Lac/e;", "Loa/F;", "c", "(Lta/g;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: ac.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C1976k {
    public static final <T> InterfaceC1970e<T> a(InterfaceC1970e<? extends T> interfaceC1970e, int i10, Zb.d dVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && dVar != Zb.d.f19650B) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            dVar = Zb.d.f19651C;
            i10 = 0;
        }
        int i11 = i10;
        Zb.d dVar2 = dVar;
        return interfaceC1970e instanceof InterfaceC2295k ? InterfaceC2295k.a.a((InterfaceC2295k) interfaceC1970e, null, i11, dVar2, 1, null) : new C2291g(interfaceC1970e, null, i11, dVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC1970e b(InterfaceC1970e interfaceC1970e, int i10, Zb.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            dVar = Zb.d.f19650B;
        }
        return C1972g.c(interfaceC1970e, i10, dVar);
    }

    private static final void c(ta.g gVar) {
        if (gVar.b(InterfaceC1867v0.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    public static final <T> InterfaceC1970e<T> d(InterfaceC1970e<? extends T> interfaceC1970e) {
        return b(interfaceC1970e, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC1970e<T> e(InterfaceC1970e<? extends T> interfaceC1970e, ta.g gVar) {
        c(gVar);
        return C3862t.b(gVar, ta.h.f50000B) ? interfaceC1970e : interfaceC1970e instanceof InterfaceC2295k ? InterfaceC2295k.a.a((InterfaceC2295k) interfaceC1970e, gVar, 0, null, 6, null) : new C2291g(interfaceC1970e, gVar, 0, null, 12, null);
    }
}
