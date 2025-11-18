package kotlin.reflect.p371y.internal.p374j0.p415l.p419w1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.f0.y.e.j0.l.w1.q */
/* loaded from: classes3.dex */
public final class C10450q {

    /* compiled from: TypeSystemContext.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.w1.q$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40377a;

        static {
            int[] iArr = new int[EnumC10384r1.values().length];
            iArr[EnumC10384r1.INVARIANT.ordinal()] = 1;
            iArr[EnumC10384r1.IN_VARIANCE.ordinal()] = 2;
            iArr[EnumC10384r1.OUT_VARIANCE.ordinal()] = 3;
            f40377a = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC10454u m37112a(EnumC10384r1 enumC10384r1) {
        C9801m.m32346f(enumC10384r1, "<this>");
        int i2 = a.f40377a[enumC10384r1.ordinal()];
        if (i2 == 1) {
            return EnumC10454u.INV;
        }
        if (i2 == 2) {
            return EnumC10454u.IN;
        }
        if (i2 == 3) {
            return EnumC10454u.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
