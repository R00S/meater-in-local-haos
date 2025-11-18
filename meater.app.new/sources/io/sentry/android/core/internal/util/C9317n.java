package io.sentry.android.core.internal.util;

import io.sentry.transport.InterfaceC9613q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Debouncer.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.n */
/* loaded from: classes2.dex */
public class C9317n {

    /* renamed from: a */
    private final long f35999a;

    /* renamed from: b */
    private final InterfaceC9613q f36000b;

    /* renamed from: d */
    private final int f36002d;

    /* renamed from: c */
    private final AtomicInteger f36001c = new AtomicInteger(0);

    /* renamed from: e */
    private final AtomicLong f36003e = new AtomicLong(0);

    public C9317n(InterfaceC9613q interfaceC9613q, long j2, int i2) {
        this.f36000b = interfaceC9613q;
        this.f35999a = j2;
        this.f36002d = i2 <= 0 ? 1 : i2;
    }

    /* renamed from: a */
    public boolean m30291a() {
        long jMo30147a = this.f36000b.mo30147a();
        if (this.f36003e.get() == 0 || this.f36003e.get() + this.f35999a <= jMo30147a) {
            this.f36001c.set(0);
            this.f36003e.set(jMo30147a);
            return false;
        }
        if (this.f36001c.incrementAndGet() < this.f36002d) {
            return false;
        }
        this.f36001c.set(0);
        return true;
    }
}
