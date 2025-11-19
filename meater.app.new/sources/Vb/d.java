package Vb;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LVb/d;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "B", "Ljava/util/concurrent/TimeUnit;", "j", "()Ljava/util/concurrent/TimeUnit;", "C", "D", "E", "F", "G", "H", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: C, reason: collision with root package name */
    public static final d f18243C = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: D, reason: collision with root package name */
    public static final d f18244D = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: E, reason: collision with root package name */
    public static final d f18245E = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: F, reason: collision with root package name */
    public static final d f18246F = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: G, reason: collision with root package name */
    public static final d f18247G = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: H, reason: collision with root package name */
    public static final d f18248H = new d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: I, reason: collision with root package name */
    public static final d f18249I = new d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ d[] f18250J;

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f18251K;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final TimeUnit timeUnit;

    static {
        d[] dVarArrC = c();
        f18250J = dVarArrC;
        f18251K = C4929b.a(dVarArrC);
    }

    private d(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    private static final /* synthetic */ d[] c() {
        return new d[]{f18243C, f18244D, f18245E, f18246F, f18247G, f18248H, f18249I};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f18250J.clone();
    }

    /* renamed from: j, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
