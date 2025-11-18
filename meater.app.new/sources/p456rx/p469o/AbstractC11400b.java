package p456rx.p469o;

import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.p460m.C11254c;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p461n.p462a.C11285i;
import p456rx.p461n.p462a.C11331z;

/* compiled from: ConnectableObservable.java */
/* renamed from: rx.o.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11400b<T> extends C11234e<T> {
    protected AbstractC11400b(C11234e.a<T> aVar) {
        super(aVar);
    }

    /* renamed from: f1 */
    public C11234e<T> m40552f1() {
        return m40553g1(1);
    }

    /* renamed from: g1 */
    public C11234e<T> m40553g1(int i2) {
        return m40554h1(i2, C11254c.m40157a());
    }

    /* renamed from: h1 */
    public C11234e<T> m40554h1(int i2, InterfaceC11253b<? super InterfaceC11246k> interfaceC11253b) {
        if (i2 > 0) {
            return C11234e.m40035b1(new C11285i(this, i2, interfaceC11253b));
        }
        mo40336i1(interfaceC11253b);
        return this;
    }

    /* renamed from: i1 */
    public abstract void mo40336i1(InterfaceC11253b<? super InterfaceC11246k> interfaceC11253b);

    /* renamed from: j1 */
    public C11234e<T> m40555j1() {
        return C11234e.m40035b1(new C11331z(this));
    }
}
