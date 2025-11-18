package kotlin.reflect.p371y.internal.p374j0.p392e;

import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.j */
/* loaded from: classes3.dex */
public enum EnumC10131j implements C10750i.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* renamed from: j */
    private static C10750i.b<EnumC10131j> f38871j = new C10750i.b<EnumC10131j>() { // from class: kotlin.f0.y.e.j0.e.j.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10131j mo34236a(int i2) {
            return EnumC10131j.m34768g(i2);
        }
    };

    /* renamed from: l */
    private final int f38873l;

    EnumC10131j(int i2, int i3) {
        this.f38873l = i3;
    }

    /* renamed from: g */
    public static EnumC10131j m34768g(int i2) {
        if (i2 == 0) {
            return DECLARATION;
        }
        if (i2 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i2 == 2) {
            return DELEGATION;
        }
        if (i2 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
    /* renamed from: f */
    public final int mo34235f() {
        return this.f38873l;
    }
}
