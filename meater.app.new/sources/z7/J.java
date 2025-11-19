package z7;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f53805a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f53806b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f53807c;

    J() {
    }

    public final void a(I i10) {
        synchronized (this.f53805a) {
            try {
                if (this.f53806b == null) {
                    this.f53806b = new ArrayDeque();
                }
                this.f53806b.add(i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC5208j abstractC5208j) {
        I i10;
        synchronized (this.f53805a) {
            if (this.f53806b != null && !this.f53807c) {
                this.f53807c = true;
                while (true) {
                    synchronized (this.f53805a) {
                        try {
                            i10 = (I) this.f53806b.poll();
                            if (i10 == null) {
                                this.f53807c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i10.c(abstractC5208j);
                }
            }
        }
    }
}
