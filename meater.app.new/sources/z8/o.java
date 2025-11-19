package z8;

import D8.J;
import java.security.GeneralSecurityException;
import v8.C4924a;

/* compiled from: MacConfig.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53912a = new k().d();

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final J f53913b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final J f53914c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final J f53915d;

    static {
        J jY = J.Y();
        f53913b = jY;
        f53914c = jY;
        f53915d = jY;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (C4924a.a()) {
            return;
        }
        C5216c.o(true);
    }
}
