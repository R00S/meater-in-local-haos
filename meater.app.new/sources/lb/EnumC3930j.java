package lb;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3930j implements i.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* renamed from: G, reason: collision with root package name */
    private static i.b<EnumC3930j> f44737G = new i.b<EnumC3930j>() { // from class: lb.j.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3930j a(int i10) {
            return EnumC3930j.c(i10);
        }
    };

    /* renamed from: B, reason: collision with root package name */
    private final int f44739B;

    EnumC3930j(int i10, int i11) {
        this.f44739B = i11;
    }

    public static EnumC3930j c(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int e() {
        return this.f44739B;
    }
}
