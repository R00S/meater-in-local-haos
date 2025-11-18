package s8;

import java.security.GeneralSecurityException;
import v8.C4924a;

/* compiled from: AeadConfig.java */
/* renamed from: s8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4502a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f49428a = new C4506e().d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f49429b = new C4517p().d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f49430c = new u().d();

    /* renamed from: d, reason: collision with root package name */
    public static final String f49431d = new C4509h().d();

    /* renamed from: e, reason: collision with root package name */
    public static final String f49432e = new C4494D().d();

    /* renamed from: f, reason: collision with root package name */
    public static final String f49433f = new C4496F().d();

    /* renamed from: g, reason: collision with root package name */
    public static final String f49434g = new z().d();

    /* renamed from: h, reason: collision with root package name */
    public static final String f49435h = new C4498H().d();

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final D8.J f49436i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final D8.J f49437j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final D8.J f49438k;

    static {
        D8.J jY = D8.J.Y();
        f49436i = jY;
        f49437j = jY;
        f49438k = jY;
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
        C4505d.e();
        z8.o.b();
        C4506e.p(true);
        C4517p.o(true);
        if (C4924a.a()) {
            return;
        }
        C4509h.o(true);
        u.p(true);
        z.m(true);
        C4494D.m(true);
        C4496F.m(true);
        C4498H.m(true);
    }
}
