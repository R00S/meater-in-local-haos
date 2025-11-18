package lb;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3931k implements i.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* renamed from: G, reason: collision with root package name */
    private static i.b<EnumC3931k> f44744G = new i.b<EnumC3931k>() { // from class: lb.k.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3931k a(int i10) {
            return EnumC3931k.c(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f44746B;

    EnumC3931k(int i10, int i11) {
        this.f44746B = i11;
    }

    public static EnumC3931k c(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int e() {
        return this.f44746B;
    }
}
