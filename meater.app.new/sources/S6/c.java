package S6;

import K6.k;
import M6.p;
import M6.u;
import N6.m;
import T6.x;
import U6.InterfaceC1742d;
import V6.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f15504f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f15505a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15506b;

    /* renamed from: c, reason: collision with root package name */
    private final N6.e f15507c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1742d f15508d;

    /* renamed from: e, reason: collision with root package name */
    private final V6.a f15509e;

    public c(Executor executor, N6.e eVar, x xVar, InterfaceC1742d interfaceC1742d, V6.a aVar) {
        this.f15506b = executor;
        this.f15507c = eVar;
        this.f15505a = xVar;
        this.f15508d = interfaceC1742d;
        this.f15509e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, M6.i iVar) {
        this.f15508d.N0(pVar, iVar);
        this.f15505a.b(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, k kVar, M6.i iVar) {
        try {
            m mVarA = this.f15507c.a(pVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f15504f.warning(str);
                kVar.a(new IllegalArgumentException(str));
            } else {
                final M6.i iVarA = mVarA.a(iVar);
                this.f15509e.d(new a.InterfaceC0265a() { // from class: S6.b
                    @Override // V6.a.InterfaceC0265a
                    public final Object execute() {
                        return this.f15501a.d(pVar, iVarA);
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e10) {
            f15504f.warning("Error scheduling event " + e10.getMessage());
            kVar.a(e10);
        }
    }

    @Override // S6.e
    public void a(final p pVar, final M6.i iVar, final k kVar) {
        this.f15506b.execute(new Runnable() { // from class: S6.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f15497B.e(pVar, kVar, iVar);
            }
        });
    }
}
