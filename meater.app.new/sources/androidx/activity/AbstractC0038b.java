package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC0038b {

    /* renamed from: a */
    private boolean f111a;

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0037a> f112b = new CopyOnWriteArrayList<>();

    public AbstractC0038b(boolean z) {
        this.f111a = z;
    }

    /* renamed from: a */
    void m130a(InterfaceC0037a interfaceC0037a) {
        this.f112b.add(interfaceC0037a);
    }

    /* renamed from: b */
    public abstract void mo131b();

    /* renamed from: c */
    public final boolean m132c() {
        return this.f111a;
    }

    /* renamed from: d */
    public final void m133d() {
        Iterator<InterfaceC0037a> it = this.f112b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    void m134e(InterfaceC0037a interfaceC0037a) {
        this.f112b.remove(interfaceC0037a);
    }

    /* renamed from: f */
    public final void m135f(boolean z) {
        this.f111a = z;
    }
}
