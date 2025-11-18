package p456rx.p473s;

import java.util.ArrayList;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p461n.p462a.C11282h;
import p456rx.p473s.C11421e;

/* compiled from: BehaviorSubject.java */
/* renamed from: rx.s.a */
/* loaded from: classes.dex */
public final class C11417a<T> extends AbstractC11420d<T, T> {

    /* renamed from: g */
    private static final Object[] f43037g = new Object[0];

    /* renamed from: h */
    private final C11421e<T> f43038h;

    /* compiled from: BehaviorSubject.java */
    /* renamed from: rx.s.a$a */
    /* loaded from: classes3.dex */
    static class a implements InterfaceC11253b<C11421e.c<T>> {

        /* renamed from: f */
        final /* synthetic */ C11421e f43039f;

        a(C11421e c11421e) {
            this.f43039f = c11421e;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C11421e.c<T> cVar) {
            cVar.m40654b(this.f43039f.m40646d());
        }
    }

    protected C11417a(C11234e.a<T> aVar, C11421e<T> c11421e) {
        super(aVar);
        this.f43038h = c11421e;
    }

    /* renamed from: g1 */
    public static <T> C11417a<T> m40634g1() {
        return m40635h1(null, false);
    }

    /* renamed from: h1 */
    private static <T> C11417a<T> m40635h1(T t, boolean z) {
        C11421e c11421e = new C11421e();
        if (z) {
            c11421e.m40649g(C11282h.m40221g(t));
        }
        a aVar = new a(c11421e);
        c11421e.f43053i = aVar;
        c11421e.f43054j = aVar;
        return new C11417a<>(c11421e, c11421e);
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        if (this.f43038h.m40646d() == null || this.f43038h.f43051g) {
            Object objM40216b = C11282h.m40216b();
            for (C11421e.c<T> cVar : this.f43038h.m40650h(objM40216b)) {
                cVar.m40656d(objM40216b);
            }
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        if (this.f43038h.m40646d() == null || this.f43038h.f43051g) {
            Object objM40217c = C11282h.m40217c(th);
            ArrayList arrayList = null;
            for (C11421e.c<T> cVar : this.f43038h.m40650h(objM40217c)) {
                try {
                    cVar.m40656d(objM40217c);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            C11240a.m40139d(arrayList);
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        if (this.f43038h.m40646d() == null || this.f43038h.f43051g) {
            Object objM40221g = C11282h.m40221g(t);
            for (C11421e.c<T> cVar : this.f43038h.m40647e(objM40221g)) {
                cVar.m40656d(objM40221g);
            }
        }
    }
}
