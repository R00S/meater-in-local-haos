package n1;

import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f45593a;

    /* renamed from: b, reason: collision with root package name */
    private a f45594b;

    /* renamed from: c, reason: collision with root package name */
    private Object f45595c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45596d;

    /* compiled from: CancellationSignal.java */
    public interface a {
        void onCancel();
    }

    private void c() throws InterruptedException {
        while (this.f45596d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f45593a) {
                    return;
                }
                this.f45593a = true;
                this.f45596d = true;
                a aVar = this.f45594b;
                Object obj = this.f45595c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f45596d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f45596d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f45594b == aVar) {
                    return;
                }
                this.f45594b = aVar;
                if (this.f45593a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
