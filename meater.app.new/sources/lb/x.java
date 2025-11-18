package lb;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* loaded from: classes3.dex */
public enum x implements i.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* renamed from: I, reason: collision with root package name */
    private static i.b<x> f45031I = new i.b<x>() { // from class: lb.x.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(int i10) {
            return x.c(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f45033B;

    x(int i10, int i11) {
        this.f45033B = i11;
    }

    public static x c(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int e() {
        return this.f45033B;
    }
}
