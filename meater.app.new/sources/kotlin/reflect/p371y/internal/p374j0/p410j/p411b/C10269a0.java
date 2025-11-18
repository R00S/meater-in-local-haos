package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10132k;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10145x;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: ProtoEnumFlags.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.a0 */
/* loaded from: classes3.dex */
public final class C10269a0 {

    /* renamed from: a */
    public static final C10269a0 f39714a = new C10269a0();

    /* compiled from: ProtoEnumFlags.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.a0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39715a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39716b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f39717c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f39718d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f39719e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f39720f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f39721g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f39722h;

        static {
            int[] iArr = new int[EnumC10132k.values().length];
            iArr[EnumC10132k.FINAL.ordinal()] = 1;
            iArr[EnumC10132k.OPEN.ordinal()] = 2;
            iArr[EnumC10132k.ABSTRACT.ordinal()] = 3;
            iArr[EnumC10132k.SEALED.ordinal()] = 4;
            f39715a = iArr;
            int[] iArr2 = new int[EnumC10583d0.values().length];
            iArr2[EnumC10583d0.FINAL.ordinal()] = 1;
            iArr2[EnumC10583d0.OPEN.ordinal()] = 2;
            iArr2[EnumC10583d0.ABSTRACT.ordinal()] = 3;
            iArr2[EnumC10583d0.SEALED.ordinal()] = 4;
            f39716b = iArr2;
            int[] iArr3 = new int[EnumC10145x.values().length];
            iArr3[EnumC10145x.INTERNAL.ordinal()] = 1;
            iArr3[EnumC10145x.PRIVATE.ordinal()] = 2;
            iArr3[EnumC10145x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[EnumC10145x.PROTECTED.ordinal()] = 4;
            iArr3[EnumC10145x.PUBLIC.ordinal()] = 5;
            iArr3[EnumC10145x.LOCAL.ordinal()] = 6;
            f39717c = iArr3;
            int[] iArr4 = new int[C10124c.c.values().length];
            iArr4[C10124c.c.CLASS.ordinal()] = 1;
            iArr4[C10124c.c.INTERFACE.ordinal()] = 2;
            iArr4[C10124c.c.ENUM_CLASS.ordinal()] = 3;
            iArr4[C10124c.c.ENUM_ENTRY.ordinal()] = 4;
            iArr4[C10124c.c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[C10124c.c.OBJECT.ordinal()] = 6;
            iArr4[C10124c.c.COMPANION_OBJECT.ordinal()] = 7;
            f39718d = iArr4;
            int[] iArr5 = new int[EnumC10588f.values().length];
            iArr5[EnumC10588f.CLASS.ordinal()] = 1;
            iArr5[EnumC10588f.INTERFACE.ordinal()] = 2;
            iArr5[EnumC10588f.ENUM_CLASS.ordinal()] = 3;
            iArr5[EnumC10588f.ENUM_ENTRY.ordinal()] = 4;
            iArr5[EnumC10588f.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[EnumC10588f.OBJECT.ordinal()] = 6;
            f39719e = iArr5;
            int[] iArr6 = new int[C10140s.c.values().length];
            iArr6[C10140s.c.IN.ordinal()] = 1;
            iArr6[C10140s.c.OUT.ordinal()] = 2;
            iArr6[C10140s.c.INV.ordinal()] = 3;
            f39720f = iArr6;
            int[] iArr7 = new int[C10138q.b.c.values().length];
            iArr7[C10138q.b.c.IN.ordinal()] = 1;
            iArr7[C10138q.b.c.OUT.ordinal()] = 2;
            iArr7[C10138q.b.c.INV.ordinal()] = 3;
            iArr7[C10138q.b.c.STAR.ordinal()] = 4;
            f39721g = iArr7;
            int[] iArr8 = new int[EnumC10384r1.values().length];
            iArr8[EnumC10384r1.IN_VARIANCE.ordinal()] = 1;
            iArr8[EnumC10384r1.OUT_VARIANCE.ordinal()] = 2;
            iArr8[EnumC10384r1.INVARIANT.ordinal()] = 3;
            f39722h = iArr8;
        }
    }

    private C10269a0() {
    }

    /* renamed from: a */
    public final EnumC10588f m36204a(C10124c.c cVar) {
        switch (cVar == null ? -1 : a.f39718d[cVar.ordinal()]) {
        }
        return EnumC10588f.CLASS;
    }

    /* renamed from: b */
    public final EnumC10583d0 m36205b(EnumC10132k enumC10132k) {
        int i2 = enumC10132k == null ? -1 : a.f39715a[enumC10132k.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? EnumC10583d0.FINAL : EnumC10583d0.SEALED : EnumC10583d0.ABSTRACT : EnumC10583d0.OPEN : EnumC10583d0.FINAL;
    }

    /* renamed from: c */
    public final EnumC10384r1 m36206c(C10138q.b.c cVar) {
        C9801m.m32346f(cVar, "projection");
        int i2 = a.f39721g[cVar.ordinal()];
        if (i2 == 1) {
            return EnumC10384r1.IN_VARIANCE;
        }
        if (i2 == 2) {
            return EnumC10384r1.OUT_VARIANCE;
        }
        if (i2 == 3) {
            return EnumC10384r1.INVARIANT;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
    }

    /* renamed from: d */
    public final EnumC10384r1 m36207d(C10140s.c cVar) {
        C9801m.m32346f(cVar, "variance");
        int i2 = a.f39720f[cVar.ordinal()];
        if (i2 == 1) {
            return EnumC10384r1.IN_VARIANCE;
        }
        if (i2 == 2) {
            return EnumC10384r1.OUT_VARIANCE;
        }
        if (i2 == 3) {
            return EnumC10384r1.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
