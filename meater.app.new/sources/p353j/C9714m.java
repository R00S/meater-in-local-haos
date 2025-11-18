package p353j;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9801m;

/* compiled from: ForwardingTimeout.kt */
/* renamed from: j.m */
/* loaded from: classes3.dex */
public class C9714m extends C9702e0 {

    /* renamed from: a */
    private C9702e0 f37059a;

    public C9714m(C9702e0 c9702e0) {
        C9801m.m32346f(c9702e0, "delegate");
        this.f37059a = c9702e0;
    }

    /* renamed from: a */
    public final C9702e0 m32108a() {
        return this.f37059a;
    }

    /* renamed from: b */
    public final C9714m m32109b(C9702e0 c9702e0) {
        C9801m.m32346f(c9702e0, "delegate");
        this.f37059a = c9702e0;
        return this;
    }

    @Override // p353j.C9702e0
    public C9702e0 clearDeadline() {
        return this.f37059a.clearDeadline();
    }

    @Override // p353j.C9702e0
    public C9702e0 clearTimeout() {
        return this.f37059a.clearTimeout();
    }

    @Override // p353j.C9702e0
    public long deadlineNanoTime() {
        return this.f37059a.deadlineNanoTime();
    }

    @Override // p353j.C9702e0
    public boolean hasDeadline() {
        return this.f37059a.hasDeadline();
    }

    @Override // p353j.C9702e0
    public void throwIfReached() throws IOException {
        this.f37059a.throwIfReached();
    }

    @Override // p353j.C9702e0
    public C9702e0 timeout(long j2, TimeUnit timeUnit) {
        C9801m.m32346f(timeUnit, "unit");
        return this.f37059a.timeout(j2, timeUnit);
    }

    @Override // p353j.C9702e0
    public long timeoutNanos() {
        return this.f37059a.timeoutNanos();
    }

    @Override // p353j.C9702e0
    public C9702e0 deadlineNanoTime(long j2) {
        return this.f37059a.deadlineNanoTime(j2);
    }
}
