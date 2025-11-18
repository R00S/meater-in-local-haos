package androidx.room;

import androidx.room.C0648g;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p323h.p324a.AbstractC9073j;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9075l;
import p323h.p324a.InterfaceC9077n;
import p323h.p324a.InterfaceC9078o;
import p323h.p324a.InterfaceC9083t;
import p323h.p324a.InterfaceC9085v;
import p323h.p324a.p326b0.C9065a;
import p323h.p324a.p327x.C9090d;
import p323h.p324a.p328y.InterfaceC9093a;
import p323h.p324a.p328y.InterfaceC9098f;

/* compiled from: RxRoom.java */
/* renamed from: androidx.room.n */
/* loaded from: classes.dex */
public class C0655n {

    /* renamed from: a */
    public static final Object f4337a = new Object();

    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.n$a */
    static class a implements InterfaceC9078o<Object> {

        /* renamed from: a */
        final /* synthetic */ String[] f4338a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0651j f4339b;

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.n$a$a, reason: collision with other inner class name */
        class C11442a extends C0648g.c {

            /* renamed from: b */
            final /* synthetic */ InterfaceC9077n f4340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11442a(String[] strArr, InterfaceC9077n interfaceC9077n) {
                super(strArr);
                this.f4340b = interfaceC9077n;
            }

            @Override // androidx.room.C0648g.c
            /* renamed from: b */
            public void mo4610b(Set<String> set) {
                this.f4340b.onNext(C0655n.f4337a);
            }
        }

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.n$a$b */
        class b implements InterfaceC9093a {

            /* renamed from: a */
            final /* synthetic */ C0648g.c f4342a;

            b(C0648g.c cVar) {
                this.f4342a = cVar;
            }

            @Override // p323h.p324a.p328y.InterfaceC9093a
            public void run() throws Exception {
                a.this.f4339b.getInvalidationTracker().m4599g(this.f4342a);
            }
        }

        a(String[] strArr, AbstractC0651j abstractC0651j) {
            this.f4338a = strArr;
            this.f4339b = abstractC0651j;
        }

        @Override // p323h.p324a.InterfaceC9078o
        /* renamed from: a */
        public void mo4659a(InterfaceC9077n<Object> interfaceC9077n) throws Exception {
            C11442a c11442a = new C11442a(this.f4338a, interfaceC9077n);
            this.f4339b.getInvalidationTracker().m4594a(c11442a);
            interfaceC9077n.mo29217a(C9090d.m29244c(new b(c11442a)));
            interfaceC9077n.onNext(C0655n.f4337a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.n$b */
    static class b<T> implements InterfaceC9098f<Object, InterfaceC9075l<T>> {

        /* renamed from: f */
        final /* synthetic */ AbstractC9073j f4344f;

        b(AbstractC9073j abstractC9073j) {
            this.f4344f = abstractC9073j;
        }

        @Override // p323h.p324a.p328y.InterfaceC9098f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9075l<T> mo4660a(Object obj) throws Exception {
            return this.f4344f;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.n$c */
    static class c<T> implements InterfaceC9085v<T> {

        /* renamed from: a */
        final /* synthetic */ Callable f4345a;

        c(Callable callable) {
            this.f4345a = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p323h.p324a.InterfaceC9085v
        /* renamed from: a */
        public void mo4662a(InterfaceC9083t<T> interfaceC9083t) throws Exception {
            try {
                interfaceC9083t.onSuccess(this.f4345a.call());
            } catch (EmptyResultSetException e2) {
                interfaceC9083t.mo29235c(e2);
            }
        }
    }

    /* renamed from: a */
    public static <T> AbstractC9076m<T> m4655a(AbstractC0651j abstractC0651j, boolean z, String[] strArr, Callable<T> callable) {
        AbstractC9081r abstractC9081rM29162a = C9065a.m29162a(m4658d(abstractC0651j, z));
        return (AbstractC9076m<T>) m4656b(abstractC0651j, strArr).m29215y(abstractC9081rM29162a).m29198C(abstractC9081rM29162a).m29211u(abstractC9081rM29162a).m29209q(new b(AbstractC9073j.m29181c(callable)));
    }

    /* renamed from: b */
    public static AbstractC9076m<Object> m4656b(AbstractC0651j abstractC0651j, String... strArr) {
        return AbstractC9076m.m29189c(new a(strArr, abstractC0651j));
    }

    /* renamed from: c */
    public static <T> AbstractC9082s<T> m4657c(Callable<T> callable) {
        return AbstractC9082s.m29226c(new c(callable));
    }

    /* renamed from: d */
    private static Executor m4658d(AbstractC0651j abstractC0651j, boolean z) {
        return z ? abstractC0651j.getTransactionExecutor() : abstractC0651j.getQueryExecutor();
    }
}
