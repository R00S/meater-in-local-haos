package com.google.crypto.tink.internal;

import B8.b;
import B8.c;
import D8.z;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import r8.v;

/* compiled from: MonitoringUtil.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f37655a = new b(null);

    /* compiled from: MonitoringUtil.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37656a;

        static {
            int[] iArr = new int[z.values().length];
            f37656a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37656a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37656a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MonitoringUtil.java */
    private static class b implements b.a {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // B8.b.a
        public void a() {
        }

        @Override // B8.b.a
        public void b(int i10, long j10) {
        }
    }

    public static <P> B8.c a(v<P> vVar) {
        c.b bVarA = B8.c.a();
        bVarA.d(vVar.d());
        Iterator<List<v.c<P>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c<P> cVar : it.next()) {
                bVarA.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            bVarA.e(vVar.e().d());
        }
        try {
            return bVarA.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static r8.k c(z zVar) {
        int i10 = a.f37656a[zVar.ordinal()];
        if (i10 == 1) {
            return r8.k.f48442b;
        }
        if (i10 == 2) {
            return r8.k.f48443c;
        }
        if (i10 == 3) {
            return r8.k.f48444d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
