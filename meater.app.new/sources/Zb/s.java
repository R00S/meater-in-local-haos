package Zb;

import Xb.G;
import Zb.w;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LZb/s;", "E", "LZb/h;", "LZb/t;", "Lta/g;", "parentContext", "LZb/g;", "channel", "<init>", "(Lta/g;LZb/g;)V", "Loa/F;", "value", "g1", "(Loa/F;)V", "", "cause", "", "handled", "c1", "(Ljava/lang/Throwable;Z)V", "a", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class s<E> extends h<E> implements t<E> {
    public s(ta.g gVar, g<E> gVar2) {
        super(gVar, gVar2, true, true);
    }

    @Override // Xb.AbstractC1825a, Xb.C0, Xb.InterfaceC1867v0
    public boolean a() {
        return super.a();
    }

    @Override // Xb.AbstractC1825a
    protected void c1(Throwable cause, boolean handled) {
        if (f1().j(cause) || handled) {
            return;
        }
        G.a(getContext(), cause);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xb.AbstractC1825a
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public void d1(C4153F value) {
        w.a.a(f1(), null, 1, null);
    }
}
