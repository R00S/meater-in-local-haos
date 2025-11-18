package p323h.p324a;

import io.reactivex.exceptions.C9240a;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p329z.p331b.C9107a;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p334e.p336b.C9124c;
import p323h.p324a.p329z.p334e.p336b.C9125d;
import p323h.p324a.p329z.p334e.p336b.C9127f;
import p323h.p324a.p329z.p342h.C9173a;
import p355k.p356a.InterfaceC9728a;
import p355k.p356a.InterfaceC9729b;

/* compiled from: Flowable.java */
/* renamed from: h.a.h */
/* loaded from: classes2.dex */
public abstract class AbstractC9071h<T> implements InterfaceC9728a<T> {

    /* renamed from: a */
    static final int f34931a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: c */
    public static int m29172c() {
        return f34931a;
    }

    @Override // p355k.p356a.InterfaceC9728a
    /* renamed from: b */
    public final void mo29173b(InterfaceC9729b<? super T> interfaceC9729b) {
        if (interfaceC9729b instanceof InterfaceC9072i) {
            m29178h((InterfaceC9072i) interfaceC9729b);
        } else {
            C9108b.m29271c(interfaceC9729b, "s is null");
            m29178h(new C9173a(interfaceC9729b));
        }
    }

    /* renamed from: d */
    public final AbstractC9071h<T> m29174d() {
        return m29175e(m29172c(), false, true);
    }

    /* renamed from: e */
    public final AbstractC9071h<T> m29175e(int i2, boolean z, boolean z2) {
        C9108b.m29272d(i2, "capacity");
        return C9063a.m29143k(new C9124c(this, i2, z2, z, C9107a.f34948c));
    }

    /* renamed from: f */
    public final AbstractC9071h<T> m29176f() {
        return C9063a.m29143k(new C9125d(this));
    }

    /* renamed from: g */
    public final AbstractC9071h<T> m29177g() {
        return C9063a.m29143k(new C9127f(this));
    }

    /* renamed from: h */
    public final void m29178h(InterfaceC9072i<? super T> interfaceC9072i) {
        C9108b.m29271c(interfaceC9072i, "s is null");
        try {
            InterfaceC9729b<? super T> interfaceC9729bM29155w = C9063a.m29155w(this, interfaceC9072i);
            C9108b.m29271c(interfaceC9729bM29155w, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29179i(interfaceC9729bM29155w);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9240a.m30000a(th);
            C9063a.m29147o(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: i */
    protected abstract void mo29179i(InterfaceC9729b<? super T> interfaceC9729b);
}
