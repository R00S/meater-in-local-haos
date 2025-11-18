package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p461n.p463b.C11334b;

/* compiled from: OperatorToObservableSortedList.java */
/* renamed from: rx.n.a.f1 */
/* loaded from: classes3.dex */
public final class C11278f1<T> implements C11234e.b<List<T>, T> {

    /* renamed from: f */
    private static final Comparator f42271f = new c();

    /* renamed from: g */
    final Comparator<? super T> f42272g;

    /* renamed from: h */
    final int f42273h;

    /* compiled from: OperatorToObservableSortedList.java */
    /* renamed from: rx.n.a.f1$a */
    class a implements Comparator<T> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11257f f42274f;

        a(InterfaceC11257f interfaceC11257f) {
            this.f42274f = interfaceC11257f;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.f42274f.mo6865a(t, t2)).intValue();
        }
    }

    /* compiled from: OperatorToObservableSortedList.java */
    /* renamed from: rx.n.a.f1$b */
    class b extends AbstractC11245j<T> {

        /* renamed from: f */
        List<T> f42276f;

        /* renamed from: g */
        boolean f42277g;

        /* renamed from: h */
        final /* synthetic */ C11334b f42278h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11245j f42279i;

        b(C11334b c11334b, AbstractC11245j abstractC11245j) {
            this.f42278h = c11334b;
            this.f42279i = abstractC11245j;
            this.f42276f = new ArrayList(C11278f1.this.f42273h);
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42277g) {
                return;
            }
            this.f42277g = true;
            List<T> list = this.f42276f;
            this.f42276f = null;
            try {
                Collections.sort(list, C11278f1.this.f42272g);
                this.f42278h.m40377b(list);
            } catch (Throwable th) {
                C11240a.m40141f(th, this);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42279i.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42277g) {
                return;
            }
            this.f42276f.add(t);
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorToObservableSortedList.java */
    /* renamed from: rx.n.a.f1$c */
    static final class c implements Comparator<Object> {
        c() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public C11278f1(InterfaceC11257f<? super T, ? super T, Integer> interfaceC11257f, int i2) {
        this.f42273h = i2;
        this.f42272g = new a(interfaceC11257f);
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super List<T>> abstractC11245j) {
        C11334b c11334b = new C11334b(abstractC11245j);
        b bVar = new b(c11334b, abstractC11245j);
        abstractC11245j.add(bVar);
        abstractC11245j.setProducer(c11334b);
        return bVar;
    }
}
