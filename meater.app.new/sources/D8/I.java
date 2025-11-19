package D8;

import com.google.crypto.tink.shaded.protobuf.C2915z;

/* compiled from: OutputPrefixType.java */
/* loaded from: classes2.dex */
public enum I implements C2915z.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: I, reason: collision with root package name */
    private static final C2915z.d<I> f3523I = new C2915z.d<I>() { // from class: D8.I.a
        @Override // com.google.crypto.tink.shaded.protobuf.C2915z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public I a(int i10) {
            return I.c(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f3525B;

    I(int i10) {
        this.f3525B = i10;
    }

    public static I c(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.f3525B;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
