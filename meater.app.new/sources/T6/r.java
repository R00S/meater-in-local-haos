package T6;

import N6.g;
import P6.c;
import U6.AbstractC1749k;
import U6.InterfaceC1741c;
import U6.InterfaceC1742d;
import V6.a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Uploader.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16204a;

    /* renamed from: b, reason: collision with root package name */
    private final N6.e f16205b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1742d f16206c;

    /* renamed from: d, reason: collision with root package name */
    private final x f16207d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f16208e;

    /* renamed from: f, reason: collision with root package name */
    private final V6.a f16209f;

    /* renamed from: g, reason: collision with root package name */
    private final W6.a f16210g;

    /* renamed from: h, reason: collision with root package name */
    private final W6.a f16211h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1741c f16212i;

    public r(Context context, N6.e eVar, InterfaceC1742d interfaceC1742d, x xVar, Executor executor, V6.a aVar, W6.a aVar2, W6.a aVar3, InterfaceC1741c interfaceC1741c) {
        this.f16204a = context;
        this.f16205b = eVar;
        this.f16206c = interfaceC1742d;
        this.f16207d = xVar;
        this.f16208e = executor;
        this.f16209f = aVar;
        this.f16210g = aVar2;
        this.f16211h = aVar3;
        this.f16212i = interfaceC1741c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(M6.p pVar) {
        return Boolean.valueOf(this.f16206c.l0(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(M6.p pVar) {
        return this.f16206c.j0(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, M6.p pVar, long j10) {
        this.f16206c.p1(iterable);
        this.f16206c.d1(pVar, this.f16210g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f16206c.E(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f16212i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f16212i.b(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(M6.p pVar, long j10) {
        this.f16206c.d1(pVar, this.f16210g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(M6.p pVar, int i10) {
        this.f16207d.b(pVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final M6.p pVar, final int i10, Runnable runnable) {
        try {
            try {
                V6.a aVar = this.f16209f;
                final InterfaceC1742d interfaceC1742d = this.f16206c;
                Objects.requireNonNull(interfaceC1742d);
                aVar.d(new a.InterfaceC0265a() { // from class: T6.i
                    @Override // V6.a.InterfaceC0265a
                    public final Object execute() {
                        return Integer.valueOf(interfaceC1742d.B());
                    }
                });
                if (k()) {
                    u(pVar, i10);
                } else {
                    this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.j
                        @Override // V6.a.InterfaceC0265a
                        public final Object execute() {
                            return this.f16185a.s(pVar, i10);
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f16207d.b(pVar, i10 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public M6.i j(N6.m mVar) {
        V6.a aVar = this.f16209f;
        final InterfaceC1741c interfaceC1741c = this.f16212i;
        Objects.requireNonNull(interfaceC1741c);
        return mVar.a(M6.i.a().i(this.f16210g.a()).o(this.f16211h.a()).n("GDT_CLIENT_METRICS").h(new M6.h(K6.c.b("proto"), ((P6.a) aVar.d(new a.InterfaceC0265a() { // from class: T6.h
            @Override // V6.a.InterfaceC0265a
            public final Object execute() {
                return interfaceC1741c.c();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16204a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public N6.g u(final M6.p pVar, int i10) {
        N6.g gVarB;
        N6.m mVarA = this.f16205b.a(pVar.b());
        long jMax = 0;
        N6.g gVarE = N6.g.e(0L);
        while (true) {
            final long j10 = jMax;
            while (((Boolean) this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.k
                @Override // V6.a.InterfaceC0265a
                public final Object execute() {
                    return this.f16188a.l(pVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.l
                    @Override // V6.a.InterfaceC0265a
                    public final Object execute() {
                        return this.f16190a.m(pVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    Q6.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    gVarB = N6.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC1749k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarB = mVarA.b(N6.f.a().b(arrayList).c(pVar.c()).a());
                }
                gVarE = gVarB;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.m
                        @Override // V6.a.InterfaceC0265a
                        public final Object execute() {
                            return this.f16192a.n(iterable, pVar, j10);
                        }
                    });
                    this.f16207d.a(pVar, i10 + 1, true);
                    return gVarE;
                }
                this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.n
                    @Override // V6.a.InterfaceC0265a
                    public final Object execute() {
                        return this.f16196a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j10, gVarE.b());
                    if (pVar.e()) {
                        this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.o
                            @Override // V6.a.InterfaceC0265a
                            public final Object execute() {
                                return this.f16198a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strN = ((AbstractC1749k) it2.next()).b().n();
                        if (map.containsKey(strN)) {
                            map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                        } else {
                            map.put(strN, 1);
                        }
                    }
                    this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.p
                        @Override // V6.a.InterfaceC0265a
                        public final Object execute() {
                            return this.f16199a.q(map);
                        }
                    });
                }
            }
            this.f16209f.d(new a.InterfaceC0265a() { // from class: T6.q
                @Override // V6.a.InterfaceC0265a
                public final Object execute() {
                    return this.f16201a.r(pVar, j10);
                }
            });
            return gVarE;
        }
    }

    public void v(final M6.p pVar, final int i10, final Runnable runnable) {
        this.f16208e.execute(new Runnable() { // from class: T6.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f16179B.t(pVar, i10, runnable);
            }
        });
    }
}
