package Lb;

import Hb.Q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes3.dex */
public final class p {

    /* compiled from: TypeSystemContext.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11309a;

        static {
            int[] iArr = new int[Q0.values().length];
            try {
                iArr[Q0.f5693F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q0.f5694G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q0.f5695H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11309a = iArr;
        }
    }

    public static final t a(Q0 q02) {
        C3862t.g(q02, "<this>");
        int i10 = a.f11309a[q02.ordinal()];
        if (i10 == 1) {
            return t.f11312E;
        }
        if (i10 == 2) {
            return t.f11310C;
        }
        if (i10 == 3) {
            return t.f11311D;
        }
        throw new NoWhenBranchMatchedException();
    }
}
