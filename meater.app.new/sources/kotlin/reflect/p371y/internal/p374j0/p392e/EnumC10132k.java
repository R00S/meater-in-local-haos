package kotlin.reflect.p371y.internal.p374j0.p392e;

import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.k */
/* loaded from: classes3.dex */
public enum EnumC10132k implements C10750i.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* renamed from: j */
    private static C10750i.b<EnumC10132k> f38878j = new C10750i.b<EnumC10132k>() { // from class: kotlin.f0.y.e.j0.e.k.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10132k mo34236a(int i2) {
            return EnumC10132k.m34770g(i2);
        }
    };

    /* renamed from: l */
    private final int f38880l;

    EnumC10132k(int i2, int i3) {
        this.f38880l = i3;
    }

    /* renamed from: g */
    public static EnumC10132k m34770g(int i2) {
        if (i2 == 0) {
            return FINAL;
        }
        if (i2 == 1) {
            return OPEN;
        }
        if (i2 == 2) {
            return ABSTRACT;
        }
        if (i2 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
    /* renamed from: f */
    public final int mo34235f() {
        return this.f38880l;
    }
}
