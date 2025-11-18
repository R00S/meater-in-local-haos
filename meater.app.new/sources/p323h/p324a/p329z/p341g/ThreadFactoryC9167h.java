package p323h.p324a.p329z.p341g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* renamed from: h.a.z.g.h */
/* loaded from: classes2.dex */
public final class ThreadFactoryC9167h extends AtomicLong implements ThreadFactory {

    /* renamed from: f */
    final String f35240f;

    /* renamed from: g */
    final int f35241g;

    /* renamed from: h */
    final boolean f35242h;

    /* compiled from: RxThreadFactory.java */
    /* renamed from: h.a.z.g.h$a */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC9167h(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f35240f + '-' + incrementAndGet();
        Thread aVar = this.f35242h ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f35241g);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f35240f + "]";
    }

    public ThreadFactoryC9167h(String str, int i2) {
        this(str, i2, false);
    }

    public ThreadFactoryC9167h(String str, int i2, boolean z) {
        this.f35240f = str;
        this.f35241g = i2;
        this.f35242h = z;
    }
}
