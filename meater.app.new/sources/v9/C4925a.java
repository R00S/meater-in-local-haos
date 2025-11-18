package v9;

import java.util.Locale;

/* compiled from: AndroidLogger.java */
/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4925a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C4925a f51590c;

    /* renamed from: a, reason: collision with root package name */
    private final C4927c f51591a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f51592b;

    public C4925a(C4927c c4927c) {
        this.f51592b = false;
        this.f51591a = c4927c == null ? C4927c.c() : c4927c;
    }

    public static C4925a e() {
        if (f51590c == null) {
            synchronized (C4925a.class) {
                try {
                    if (f51590c == null) {
                        f51590c = new C4925a();
                    }
                } finally {
                }
            }
        }
        return f51590c;
    }

    public void a(String str) {
        if (this.f51592b) {
            this.f51591a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f51592b) {
            this.f51591a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f51592b) {
            this.f51591a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f51592b) {
            this.f51591a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f51592b) {
            this.f51591a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f51592b) {
            this.f51591a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f51592b;
    }

    public void i(boolean z10) {
        this.f51592b = z10;
    }

    public void j(String str) {
        if (this.f51592b) {
            this.f51591a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f51592b) {
            this.f51591a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private C4925a() {
        this(null);
    }
}
