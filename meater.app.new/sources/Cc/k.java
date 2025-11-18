package Cc;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ForwardingTimeout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, d2 = {"LCc/k;", "LCc/C;", "delegate", "<init>", "(LCc/C;)V", "j", "(LCc/C;)LCc/k;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)LCc/C;", "", "e", "()Z", "c", "()J", "deadlineNanoTime", "d", "(J)LCc/C;", "b", "()LCc/C;", "a", "Loa/F;", "f", "()V", "LCc/C;", "i", "setDelegate", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class k extends C {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C delegate;

    public k(C delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // Cc.C
    public C a() {
        return this.delegate.a();
    }

    @Override // Cc.C
    public C b() {
        return this.delegate.b();
    }

    @Override // Cc.C
    public long c() {
        return this.delegate.c();
    }

    @Override // Cc.C
    public C d(long deadlineNanoTime) {
        return this.delegate.d(deadlineNanoTime);
    }

    @Override // Cc.C
    /* renamed from: e */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // Cc.C
    public void f() throws InterruptedIOException {
        this.delegate.f();
    }

    @Override // Cc.C
    public C g(long timeout, TimeUnit unit) {
        C3862t.g(unit, "unit");
        return this.delegate.g(timeout, unit);
    }

    /* renamed from: i, reason: from getter */
    public final C getDelegate() {
        return this.delegate;
    }

    public final k j(C delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
