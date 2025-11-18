package Db;

import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1689b;
import kotlin.jvm.internal.C3862t;
import lb.EnumC3930j;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes3.dex */
public final class P {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3641a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3642b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f3643c;

        static {
            int[] iArr = new int[EnumC3930j.values().length];
            try {
                iArr[EnumC3930j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3930j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3930j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3930j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3641a = iArr;
            int[] iArr2 = new int[InterfaceC1689b.a.values().length];
            try {
                iArr2[InterfaceC1689b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC1689b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC1689b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC1689b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f3642b = iArr2;
            int[] iArr3 = new int[lb.x.values().length];
            try {
                iArr3[lb.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[lb.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[lb.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[lb.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[lb.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[lb.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f3643c = iArr3;
        }
    }

    public static final AbstractC1707u a(O o10, lb.x xVar) {
        C3862t.g(o10, "<this>");
        switch (xVar == null ? -1 : a.f3643c[xVar.ordinal()]) {
            case 1:
                AbstractC1707u INTERNAL = C1706t.f15169d;
                C3862t.f(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC1707u PRIVATE = C1706t.f15166a;
                C3862t.f(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC1707u PRIVATE_TO_THIS = C1706t.f15167b;
                C3862t.f(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC1707u PROTECTED = C1706t.f15168c;
                C3862t.f(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC1707u PUBLIC = C1706t.f15170e;
                C3862t.f(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC1707u LOCAL = C1706t.f15171f;
                C3862t.f(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC1707u PRIVATE2 = C1706t.f15166a;
                C3862t.f(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final InterfaceC1689b.a b(O o10, EnumC3930j enumC3930j) {
        C3862t.g(o10, "<this>");
        int i10 = enumC3930j == null ? -1 : a.f3641a[enumC3930j.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC1689b.a.DECLARATION : InterfaceC1689b.a.SYNTHESIZED : InterfaceC1689b.a.DELEGATION : InterfaceC1689b.a.FAKE_OVERRIDE : InterfaceC1689b.a.DECLARATION;
    }
}
