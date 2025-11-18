package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p461n.p463b.C11334b;

/* compiled from: OperatorToObservableList.java */
/* renamed from: rx.n.a.e1 */
/* loaded from: classes3.dex */
public final class C11275e1<T> implements C11234e.b<List<T>, T> {

    /* compiled from: OperatorToObservableList.java */
    /* renamed from: rx.n.a.e1$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        boolean f42254f;

        /* renamed from: g */
        List<T> f42255g = new LinkedList();

        /* renamed from: h */
        final /* synthetic */ C11334b f42256h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11245j f42257i;

        a(C11334b c11334b, AbstractC11245j abstractC11245j) {
            this.f42256h = c11334b;
            this.f42257i = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42254f) {
                return;
            }
            this.f42254f = true;
            try {
                ArrayList arrayList = new ArrayList(this.f42255g);
                this.f42255g = null;
                this.f42256h.m40377b(arrayList);
            } catch (Throwable th) {
                C11240a.m40141f(th, this);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42257i.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42254f) {
                return;
            }
            this.f42255g.add(t);
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorToObservableList.java */
    /* renamed from: rx.n.a.e1$b */
    static final class b {

        /* renamed from: a */
        static final C11275e1<Object> f42259a = new C11275e1<>();
    }

    C11275e1() {
    }

    /* renamed from: b */
    public static <T> C11275e1<T> m40201b() {
        return (C11275e1<T>) b.f42259a;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super List<T>> abstractC11245j) {
        C11334b c11334b = new C11334b(abstractC11245j);
        a aVar = new a(c11334b, abstractC11245j);
        abstractC11245j.add(aVar);
        abstractC11245j.setProducer(c11334b);
        return aVar;
    }
}
