package o9;

/* compiled from: SystemClock.java */
/* loaded from: classes2.dex */
public class b implements InterfaceC4147a {

    /* renamed from: a, reason: collision with root package name */
    private static b f46597a;

    private b() {
    }

    public static b b() {
        if (f46597a == null) {
            f46597a = new b();
        }
        return f46597a;
    }

    @Override // o9.InterfaceC4147a
    public long a() {
        return System.currentTimeMillis();
    }
}
