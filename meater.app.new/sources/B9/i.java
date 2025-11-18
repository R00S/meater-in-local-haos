package B9;

import java.util.concurrent.TimeUnit;

/* compiled from: Rate.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f1937a;

    /* renamed from: b, reason: collision with root package name */
    private long f1938b;

    /* renamed from: c, reason: collision with root package name */
    private TimeUnit f1939c;

    /* compiled from: Rate.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1940a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f1940a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1940a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1940a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f1937a = j10;
        this.f1938b = j11;
        this.f1939c = timeUnit;
    }

    public double a() {
        int i10 = a.f1940a[this.f1939c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f1937a / this.f1939c.toSeconds(this.f1938b) : (this.f1937a / this.f1938b) * TimeUnit.SECONDS.toMillis(1L) : (this.f1937a / this.f1938b) * TimeUnit.SECONDS.toMicros(1L) : (this.f1937a / this.f1938b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
