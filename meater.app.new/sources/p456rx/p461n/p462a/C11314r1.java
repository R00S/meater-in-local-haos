package p456rx.p461n.p462a;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11259h;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11426b;

/* compiled from: SingleOperatorZip.java */
/* renamed from: rx.n.a.r1 */
/* loaded from: classes3.dex */
public final class C11314r1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOperatorZip.java */
    /* renamed from: rx.n.a.r1$a */
    static class a<R> implements Single.InterfaceC11229j<R> {

        /* renamed from: f */
        final /* synthetic */ Single[] f42572f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC11259h f42573g;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: SingleOperatorZip.java */
        /* renamed from: rx.n.a.r1$a$a, reason: collision with other inner class name */
        class C11603a<T> extends AbstractC11244i<T> {

            /* renamed from: g */
            final /* synthetic */ Object[] f42574g;

            /* renamed from: h */
            final /* synthetic */ int f42575h;

            /* renamed from: i */
            final /* synthetic */ AtomicInteger f42576i;

            /* renamed from: j */
            final /* synthetic */ AbstractC11244i f42577j;

            /* renamed from: k */
            final /* synthetic */ AtomicBoolean f42578k;

            C11603a(Object[] objArr, int i2, AtomicInteger atomicInteger, AbstractC11244i abstractC11244i, AtomicBoolean atomicBoolean) {
                this.f42574g = objArr;
                this.f42575h = i2;
                this.f42576i = atomicInteger;
                this.f42577j = abstractC11244i;
                this.f42578k = atomicBoolean;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p456rx.AbstractC11244i
            /* renamed from: c */
            public void mo29130c(T t) {
                this.f42574g[this.f42575h] = t;
                if (this.f42576i.decrementAndGet() == 0) {
                    try {
                        this.f42577j.mo29130c(a.this.f42573g.call(this.f42574g));
                    } catch (Throwable th) {
                        C11240a.m40140e(th);
                        onError(th);
                    }
                }
            }

            @Override // p456rx.AbstractC11244i
            public void onError(Throwable th) {
                if (this.f42578k.compareAndSet(false, true)) {
                    this.f42577j.onError(th);
                } else {
                    C11409c.m40578j(th);
                }
            }
        }

        a(Single[] singleArr, InterfaceC11259h interfaceC11259h) {
            this.f42572f = singleArr;
            this.f42573g = interfaceC11259h;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11244i<? super R> abstractC11244i) {
            if (this.f42572f.length == 0) {
                abstractC11244i.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f42572f.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f42572f.length];
            C11426b c11426b = new C11426b();
            abstractC11244i.m40149b(c11426b);
            for (int i2 = 0; i2 < this.f42572f.length && !c11426b.isUnsubscribed() && !atomicBoolean.get(); i2++) {
                C11603a c11603a = new C11603a(objArr, i2, atomicInteger, abstractC11244i, atomicBoolean);
                c11426b.m40667a(c11603a);
                if (c11426b.isUnsubscribed() || atomicBoolean.get()) {
                    return;
                }
                this.f42572f[i2].m39928t(c11603a);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> Single<R> m40313a(Single<? extends T>[] singleArr, InterfaceC11259h<? extends R> interfaceC11259h) {
        return Single.m39909b(new a(singleArr, interfaceC11259h));
    }
}
