package D8;

import com.google.crypto.tink.shaded.protobuf.C2915z;

/* compiled from: HashType.java */
/* loaded from: classes2.dex */
public enum u implements C2915z.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: J, reason: collision with root package name */
    private static final C2915z.d<u> f3556J = new C2915z.d<u>() { // from class: D8.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.C2915z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(int i10) {
            return u.c(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f3558B;

    u(int i10) {
        this.f3558B = i10;
    }

    public static u c(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.f3558B;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
