package androidx.core.os;

import android.os.Build;
import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
/* renamed from: androidx.core.os.b */
/* loaded from: classes.dex */
public final class C0273b {

    /* renamed from: a */
    private boolean f2251a;

    /* renamed from: b */
    private a f2252b;

    /* renamed from: c */
    private Object f2253c;

    /* renamed from: d */
    private boolean f2254d;

    /* compiled from: CancellationSignal.java */
    /* renamed from: androidx.core.os.b$a */
    public interface a {
        void onCancel();
    }

    /* renamed from: d */
    private void m1834d() throws InterruptedException {
        while (this.f2254d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m1835a() {
        synchronized (this) {
            if (this.f2251a) {
                return;
            }
            this.f2251a = true;
            this.f2254d = true;
            a aVar = this.f2252b;
            Object obj = this.f2253c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2254d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f2254d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m1836b() {
        boolean z;
        synchronized (this) {
            z = this.f2251a;
        }
        return z;
    }

    /* renamed from: c */
    public void m1837c(a aVar) {
        synchronized (this) {
            m1834d();
            if (this.f2252b == aVar) {
                return;
            }
            this.f2252b = aVar;
            if (this.f2251a && aVar != null) {
                aVar.onCancel();
            }
        }
    }
}
