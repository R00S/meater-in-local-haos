package androidx.work.impl.p013m.p015f;

import android.content.Context;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: Trackers.java */
/* renamed from: androidx.work.impl.m.f.g */
/* loaded from: classes.dex */
public class C0759g {

    /* renamed from: a */
    private static C0759g f4761a;

    /* renamed from: b */
    private C0753a f4762b;

    /* renamed from: c */
    private C0754b f4763c;

    /* renamed from: d */
    private C0757e f4764d;

    /* renamed from: e */
    private C0758f f4765e;

    private C0759g(Context context, InterfaceC0799a interfaceC0799a) {
        Context applicationContext = context.getApplicationContext();
        this.f4762b = new C0753a(applicationContext, interfaceC0799a);
        this.f4763c = new C0754b(applicationContext, interfaceC0799a);
        this.f4764d = new C0757e(applicationContext, interfaceC0799a);
        this.f4765e = new C0758f(applicationContext, interfaceC0799a);
    }

    /* renamed from: c */
    public static synchronized C0759g m5066c(Context context, InterfaceC0799a interfaceC0799a) {
        if (f4761a == null) {
            f4761a = new C0759g(context, interfaceC0799a);
        }
        return f4761a;
    }

    /* renamed from: a */
    public C0753a m5067a() {
        return this.f4762b;
    }

    /* renamed from: b */
    public C0754b m5068b() {
        return this.f4763c;
    }

    /* renamed from: d */
    public C0757e m5069d() {
        return this.f4764d;
    }

    /* renamed from: e */
    public C0758f m5070e() {
        return this.f4765e;
    }
}
