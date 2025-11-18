package Vb;

import Vb.h;
import kotlin.Metadata;

/* compiled from: MonoTimeSource.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0012"}, d2 = {"LVb/g;", "", "<init>", "()V", "", "c", "()J", "", "toString", "()Ljava/lang/String;", "LVb/h$a;", "b", "timeMark", "LVb/a;", "a", "(J)J", "J", "zero", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f18253a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long zero = System.nanoTime();

    private g() {
    }

    private final long c() {
        return System.nanoTime() - zero;
    }

    public final long a(long timeMark) {
        return f.b(c(), timeMark, d.f18243C);
    }

    public long b() {
        return h.a.c(c());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
