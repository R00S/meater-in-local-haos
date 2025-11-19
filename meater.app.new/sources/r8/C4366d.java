package r8;

import D8.C;
import D8.I;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: CryptoFormat.java */
/* renamed from: r8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4366d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f48434a = new byte[0];

    /* compiled from: CryptoFormat.java */
    /* renamed from: r8.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48435a;

        static {
            int[] iArr = new int[I.values().length];
            f48435a = iArr;
            try {
                iArr[I.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48435a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48435a[I.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48435a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(C.c cVar) throws GeneralSecurityException {
        int i10 = a.f48435a[cVar.e0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.d0()).array();
        }
        if (i10 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.d0()).array();
        }
        if (i10 == 4) {
            return f48434a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
