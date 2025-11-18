package com.google.crypto.tink.internal;

import D8.I;
import D8.y;
import java.security.GeneralSecurityException;

/* compiled from: LegacyProtoKey.java */
/* loaded from: classes2.dex */
public final class e extends r8.g {

    /* renamed from: a, reason: collision with root package name */
    private final o f37652a;

    /* compiled from: LegacyProtoKey.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37653a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37654b;

        static {
            int[] iArr = new int[y.c.values().length];
            f37654b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37654b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I.values().length];
            f37653a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37653a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37653a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37653a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, r8.y yVar) throws GeneralSecurityException {
        a(oVar, yVar);
        this.f37652a = oVar;
    }

    private static void a(o oVar, r8.y yVar) throws GeneralSecurityException {
        int i10 = a.f37654b[oVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            r8.y.b(yVar);
        }
    }
}
