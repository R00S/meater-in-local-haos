package p456rx.p461n.p466e;

import java.util.Queue;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p461n.p462a.C11282h;
import p456rx.p461n.p466e.p467n.C11369e;
import p456rx.p461n.p466e.p468o.C11383k;
import p456rx.p461n.p466e.p468o.C11391s;
import p456rx.p461n.p466e.p468o.C11398z;

/* compiled from: RxRingBuffer.java */
/* renamed from: rx.n.e.h */
/* loaded from: classes3.dex */
public class C11359h implements InterfaceC11246k {

    /* renamed from: f */
    public static final int f42884f;

    /* renamed from: g */
    private Queue<Object> f42885g;

    /* renamed from: h */
    private final int f42886h;

    /* renamed from: i */
    public volatile Object f42887i;

    static {
        int i2 = C11358g.m40434b() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i2 = Integer.parseInt(property);
            } catch (NumberFormatException e2) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e2.getMessage());
            }
        }
        f42884f = i2;
    }

    private C11359h(Queue<Object> queue, int i2) {
        this.f42885g = queue;
        this.f42886h = i2;
    }

    /* renamed from: a */
    public static C11359h m40436a() {
        return C11398z.m40548b() ? new C11359h(true, f42884f) : new C11359h();
    }

    /* renamed from: b */
    public static C11359h m40437b() {
        return C11398z.m40548b() ? new C11359h(false, f42884f) : new C11359h();
    }

    /* renamed from: c */
    public Object m40438c(Object obj) {
        return C11282h.m40219e(obj);
    }

    /* renamed from: d */
    public boolean m40439d(Object obj) {
        return C11282h.m40220f(obj);
    }

    /* renamed from: e */
    public boolean m40440e() {
        Queue<Object> queue = this.f42885g;
        return queue == null || queue.isEmpty();
    }

    /* renamed from: f */
    public void m40441f() {
        if (this.f42887i == null) {
            this.f42887i = C11282h.m40216b();
        }
    }

    /* renamed from: g */
    public void m40442g(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            Queue<Object> queue = this.f42885g;
            z = true;
            z2 = false;
            if (queue != null) {
                z2 = !queue.offer(C11282h.m40221g(obj));
                z = false;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z2) {
            throw new MissingBackpressureException();
        }
    }

    /* renamed from: h */
    public Object m40443h() {
        synchronized (this) {
            Queue<Object> queue = this.f42885g;
            if (queue == null) {
                return null;
            }
            Object objPeek = queue.peek();
            Object obj = this.f42887i;
            if (objPeek == null && obj != null && queue.peek() == null) {
                objPeek = obj;
            }
            return objPeek;
        }
    }

    /* renamed from: i */
    public Object m40444i() {
        synchronized (this) {
            Queue<Object> queue = this.f42885g;
            if (queue == null) {
                return null;
            }
            Object objPoll = queue.poll();
            Object obj = this.f42887i;
            if (objPoll == null && obj != null && queue.peek() == null) {
                this.f42887i = null;
                objPoll = obj;
            }
            return objPoll;
        }
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f42885g == null;
    }

    /* renamed from: j */
    public synchronized void m40445j() {
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        m40445j();
    }

    private C11359h(boolean z, int i2) {
        this.f42885g = z ? new C11383k<>(i2) : new C11391s<>(i2);
        this.f42886h = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    C11359h() {
        int i2 = f42884f;
        this(new C11369e(i2), i2);
    }
}
