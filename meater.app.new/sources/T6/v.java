package T6;

import U6.InterfaceC1742d;
import V6.a;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: WorkInitializer.java */
/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16224a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1742d f16225b;

    /* renamed from: c, reason: collision with root package name */
    private final x f16226c;

    /* renamed from: d, reason: collision with root package name */
    private final V6.a f16227d;

    v(Executor executor, InterfaceC1742d interfaceC1742d, x xVar, V6.a aVar) {
        this.f16224a = executor;
        this.f16225b = interfaceC1742d;
        this.f16226c = xVar;
        this.f16227d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<M6.p> it = this.f16225b.g0().iterator();
        while (it.hasNext()) {
            this.f16226c.b(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f16227d.d(new a.InterfaceC0265a() { // from class: T6.u
            @Override // V6.a.InterfaceC0265a
            public final Object execute() {
                return this.f16223a.d();
            }
        });
    }

    public void c() {
        this.f16224a.execute(new Runnable() { // from class: T6.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f16222B.e();
            }
        });
    }
}
