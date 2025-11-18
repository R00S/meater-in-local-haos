package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10131j;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10145x;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.b0 */
/* loaded from: classes3.dex */
public final class C10271b0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.b0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39728a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39729b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f39730c;

        static {
            int[] iArr = new int[EnumC10131j.values().length];
            iArr[EnumC10131j.DECLARATION.ordinal()] = 1;
            iArr[EnumC10131j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[EnumC10131j.DELEGATION.ordinal()] = 3;
            iArr[EnumC10131j.SYNTHESIZED.ordinal()] = 4;
            f39728a = iArr;
            int[] iArr2 = new int[InterfaceC10576b.a.values().length];
            iArr2[InterfaceC10576b.a.DECLARATION.ordinal()] = 1;
            iArr2[InterfaceC10576b.a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[InterfaceC10576b.a.DELEGATION.ordinal()] = 3;
            iArr2[InterfaceC10576b.a.SYNTHESIZED.ordinal()] = 4;
            f39729b = iArr2;
            int[] iArr3 = new int[EnumC10145x.values().length];
            iArr3[EnumC10145x.INTERNAL.ordinal()] = 1;
            iArr3[EnumC10145x.PRIVATE.ordinal()] = 2;
            iArr3[EnumC10145x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[EnumC10145x.PROTECTED.ordinal()] = 4;
            iArr3[EnumC10145x.PUBLIC.ordinal()] = 5;
            iArr3[EnumC10145x.LOCAL.ordinal()] = 6;
            f39730c = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC10730u m36208a(C10269a0 c10269a0, EnumC10145x enumC10145x) {
        C9801m.m32346f(c10269a0, "<this>");
        switch (enumC10145x == null ? -1 : a.f39730c[enumC10145x.ordinal()]) {
            case 1:
                AbstractC10730u abstractC10730u = C10728t.f41219d;
                C9801m.m32345e(abstractC10730u, "INTERNAL");
                return abstractC10730u;
            case 2:
                AbstractC10730u abstractC10730u2 = C10728t.f41216a;
                C9801m.m32345e(abstractC10730u2, "PRIVATE");
                return abstractC10730u2;
            case 3:
                AbstractC10730u abstractC10730u3 = C10728t.f41217b;
                C9801m.m32345e(abstractC10730u3, "PRIVATE_TO_THIS");
                return abstractC10730u3;
            case 4:
                AbstractC10730u abstractC10730u4 = C10728t.f41218c;
                C9801m.m32345e(abstractC10730u4, "PROTECTED");
                return abstractC10730u4;
            case 5:
                AbstractC10730u abstractC10730u5 = C10728t.f41220e;
                C9801m.m32345e(abstractC10730u5, Store.PUBLIC_ACCESS);
                return abstractC10730u5;
            case 6:
                AbstractC10730u abstractC10730u6 = C10728t.f41221f;
                C9801m.m32345e(abstractC10730u6, "LOCAL");
                return abstractC10730u6;
            default:
                AbstractC10730u abstractC10730u7 = C10728t.f41216a;
                C9801m.m32345e(abstractC10730u7, "PRIVATE");
                return abstractC10730u7;
        }
    }

    /* renamed from: b */
    public static final InterfaceC10576b.a m36209b(C10269a0 c10269a0, EnumC10131j enumC10131j) {
        C9801m.m32346f(c10269a0, "<this>");
        int i2 = enumC10131j == null ? -1 : a.f39728a[enumC10131j.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? InterfaceC10576b.a.DECLARATION : InterfaceC10576b.a.SYNTHESIZED : InterfaceC10576b.a.DELEGATION : InterfaceC10576b.a.FAKE_OVERRIDE : InterfaceC10576b.a.DECLARATION;
    }
}
