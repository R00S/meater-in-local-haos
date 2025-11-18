package x8;

import D8.J;
import java.security.GeneralSecurityException;
import v8.C4924a;

/* compiled from: DeterministicAeadConfig.java */
/* renamed from: x8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5077b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f52894a = new C5076a().d();

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final J f52895b = J.Y();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final J f52896c = J.Y();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        C5078c.e();
        if (C4924a.a()) {
            return;
        }
        C5076a.m(true);
    }
}
