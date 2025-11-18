package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ot */
/* loaded from: classes2.dex */
final /* synthetic */ class C7018ot {

    /* renamed from: a */
    static final /* synthetic */ int[] f20212a;

    /* renamed from: b */
    static final /* synthetic */ int[] f20213b;

    static {
        int[] iArr = new int[zzdkt.values().length];
        f20213b = iArr;
        try {
            iArr[zzdkt.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20213b[zzdkt.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20213b[zzdkt.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzdkv.values().length];
        f20212a = iArr2;
        try {
            iArr2[zzdkv.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20212a[zzdkv.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20212a[zzdkv.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
