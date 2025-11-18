package r8;

import D8.A;
import D8.I;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;

/* compiled from: KeyTemplate.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final A f48446a;

    /* compiled from: KeyTemplate.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48447a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f48448b;

        static {
            int[] iArr = new int[b.values().length];
            f48448b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48448b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48448b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48448b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[I.values().length];
            f48447a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48447a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48447a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f48447a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: KeyTemplate.java */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private l(A a10) {
        this.f48446a = a10;
    }

    public static l a(String str, byte[] bArr, b bVar) {
        return new l(A.g0().E(str).F(AbstractC2898h.j(bArr)).D(c(bVar)).e());
    }

    static I c(b bVar) {
        int i10 = a.f48448b[bVar.ordinal()];
        if (i10 == 1) {
            return I.TINK;
        }
        if (i10 == 2) {
            return I.LEGACY;
        }
        if (i10 == 3) {
            return I.RAW;
        }
        if (i10 == 4) {
            return I.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    A b() {
        return this.f48446a;
    }
}
