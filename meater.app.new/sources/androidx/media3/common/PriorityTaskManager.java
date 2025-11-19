package androidx.media3.common;

import X1.L;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class PriorityTaskManager {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26034a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f26035b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f26036c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    public void a(int i10) {
        synchronized (this.f26034a) {
            this.f26035b.add(Integer.valueOf(i10));
            this.f26036c = Math.max(this.f26036c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f26034a) {
            try {
                if (this.f26036c != i10) {
                    throw new PriorityTooLowException(i10, this.f26036c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(int i10) {
        synchronized (this.f26034a) {
            this.f26035b.remove(Integer.valueOf(i10));
            this.f26036c = this.f26035b.isEmpty() ? Integer.MIN_VALUE : ((Integer) L.i(this.f26035b.peek())).intValue();
            this.f26034a.notifyAll();
        }
    }
}
