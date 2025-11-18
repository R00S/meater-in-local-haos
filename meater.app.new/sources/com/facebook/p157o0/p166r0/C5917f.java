package com.facebook.p157o0.p166r0;

import kotlin.collections.C10803n;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: MTensor.kt */
/* renamed from: com.facebook.o0.r0.f */
/* loaded from: classes2.dex */
public final class C5917f {

    /* renamed from: a */
    public static final a f15413a = new a(null);

    /* renamed from: b */
    private int[] f15414b;

    /* renamed from: c */
    private int f15415c;

    /* renamed from: d */
    private float[] f15416d;

    /* compiled from: MTensor.kt */
    /* renamed from: com.facebook.o0.r0.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final int m12678b(int[] iArr) {
            int i2 = 1;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i3 = iArr[0];
            int iM38770z = C10803n.m38770z(iArr);
            if (1 <= iM38770z) {
                while (true) {
                    i3 *= iArr[i2];
                    if (i2 == iM38770z) {
                        break;
                    }
                    i2++;
                }
            }
            return i3;
        }
    }

    public C5917f(int[] iArr) {
        C9801m.m32346f(iArr, "shape");
        this.f15414b = iArr;
        int iM12678b = f15413a.m12678b(iArr);
        this.f15415c = iM12678b;
        this.f15416d = new float[iM12678b];
    }

    /* renamed from: a */
    public final float[] m12673a() {
        return this.f15416d;
    }

    /* renamed from: b */
    public final int m12674b(int i2) {
        return this.f15414b[i2];
    }

    /* renamed from: c */
    public final int m12675c() {
        return this.f15414b.length;
    }

    /* renamed from: d */
    public final void m12676d(int[] iArr) {
        C9801m.m32346f(iArr, "shape");
        this.f15414b = iArr;
        int iM12678b = f15413a.m12678b(iArr);
        float[] fArr = new float[iM12678b];
        System.arraycopy(this.f15416d, 0, fArr, 0, Math.min(this.f15415c, iM12678b));
        this.f15416d = fArr;
        this.f15415c = iM12678b;
    }
}
