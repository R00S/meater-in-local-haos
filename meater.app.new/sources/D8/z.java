package D8;

import com.google.crypto.tink.shaded.protobuf.C2915z;

/* compiled from: KeyStatusType.java */
/* loaded from: classes2.dex */
public enum z implements C2915z.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: H, reason: collision with root package name */
    private static final C2915z.d<z> f3577H = new C2915z.d<z>() { // from class: D8.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.C2915z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(int i10) {
            return z.c(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f3579B;

    z(int i10) {
        this.f3579B = i10;
    }

    public static z c(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.f3579B;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
