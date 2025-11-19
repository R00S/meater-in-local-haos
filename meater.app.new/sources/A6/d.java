package A6;

import A6.b;
import android.content.Context;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes2.dex */
final class d implements b {

    /* renamed from: B, reason: collision with root package name */
    private final Context f907B;

    /* renamed from: C, reason: collision with root package name */
    final b.a f908C;

    d(Context context, b.a aVar) {
        this.f907B = context.getApplicationContext();
        this.f908C = aVar;
    }

    private void l() {
        r.a(this.f907B).d(this.f908C);
    }

    private void m() {
        r.a(this.f907B).e(this.f908C);
    }

    @Override // A6.l
    public void a() {
        m();
    }

    @Override // A6.l
    public void b() {
        l();
    }

    @Override // A6.l
    public void e() {
    }
}
