package X9;

import Y9.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import ba.C2274a;

/* compiled from: AttributeController.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Y9.a f18923a;

    public a(Y9.a aVar) {
        this.f18923a = aVar;
    }

    private V9.a a(int i10) {
        switch (i10) {
            case 0:
                return V9.a.NONE;
            case 1:
                return V9.a.COLOR;
            case 2:
                return V9.a.SCALE;
            case 3:
                return V9.a.WORM;
            case 4:
                return V9.a.SLIDE;
            case 5:
                return V9.a.FILL;
            case 6:
                return V9.a.THIN_WORM;
            case 7:
                return V9.a.DROP;
            case 8:
                return V9.a.SWAP;
            case 9:
                return V9.a.SCALE_DOWN;
            default:
                return V9.a.NONE;
        }
    }

    private d b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? d.Auto : d.Auto : d.Off : d.On;
    }

    private void d(TypedArray typedArray) {
        boolean z10 = typedArray.getBoolean(C2274a.f30690n, false);
        long j10 = typedArray.getInt(C2274a.f30683g, 350);
        if (j10 < 0) {
            j10 = 0;
        }
        V9.a aVarA = a(typedArray.getInt(C2274a.f30684h, V9.a.NONE.ordinal()));
        d dVarB = b(typedArray.getInt(C2274a.f30694r, d.Off.ordinal()));
        boolean z11 = typedArray.getBoolean(C2274a.f30688l, false);
        long j11 = typedArray.getInt(C2274a.f30689m, 3000);
        this.f18923a.y(j10);
        this.f18923a.H(z10);
        this.f18923a.z(aVarA);
        this.f18923a.Q(dVarB);
        this.f18923a.D(z11);
        this.f18923a.G(j11);
    }

    private void e(TypedArray typedArray) {
        int color = typedArray.getColor(C2274a.f30699w, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(C2274a.f30697u, Color.parseColor("#ffffff"));
        this.f18923a.W(color);
        this.f18923a.S(color2);
    }

    private void f(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(C2274a.f30700x, -1);
        boolean z10 = typedArray.getBoolean(C2274a.f30685i, true);
        int i10 = 0;
        boolean z11 = typedArray.getBoolean(C2274a.f30687k, false);
        int i11 = typedArray.getInt(C2274a.f30686j, -1);
        if (i11 == -1) {
            i11 = 3;
        }
        int i12 = typedArray.getInt(C2274a.f30696t, 0);
        if (i12 >= 0 && (i11 <= 0 || i12 <= i11 - 1)) {
            i10 = i12;
        }
        this.f18923a.X(resourceId);
        this.f18923a.A(z10);
        this.f18923a.C(z11);
        this.f18923a.B(i11);
        this.f18923a.T(i10);
        this.f18923a.U(i10);
        this.f18923a.I(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[PHI: r5
      0x0043: PHI (r5v6 float) = (r5v1 float), (r5v2 float) binds: [B:13:0x0041, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g(android.content.res.TypedArray r8) {
        /*
            r7 = this;
            int r0 = ba.C2274a.f30691o
            Y9.b r1 = Y9.b.HORIZONTAL
            int r2 = r1.ordinal()
            int r0 = r8.getInt(r0, r2)
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            Y9.b r1 = Y9.b.VERTICAL
        L11:
            int r0 = ba.C2274a.f30693q
            r2 = 6
            int r2 = ca.C2353b.a(r2)
            float r2 = (float) r2
            float r0 = r8.getDimension(r0, r2)
            int r0 = (int) r0
            r2 = 0
            if (r0 >= 0) goto L22
            r0 = r2
        L22:
            int r3 = ba.C2274a.f30692p
            r4 = 8
            int r4 = ca.C2353b.a(r4)
            float r4 = (float) r4
            float r3 = r8.getDimension(r3, r4)
            int r3 = (int) r3
            if (r3 >= 0) goto L33
            r3 = r2
        L33:
            int r4 = ba.C2274a.f30695s
            r5 = 1060320051(0x3f333333, float:0.7)
            float r4 = r8.getFloat(r4, r5)
            r5 = 1050253722(0x3e99999a, float:0.3)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L45
        L43:
            r4 = r5
            goto L4c
        L45:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L4c
            goto L43
        L4c:
            int r5 = ba.C2274a.f30698v
            r6 = 1
            int r6 = ca.C2353b.a(r6)
            float r6 = (float) r6
            float r8 = r8.getDimension(r5, r6)
            int r8 = (int) r8
            if (r8 <= r0) goto L5c
            r8 = r0
        L5c:
            Y9.a r5 = r7.f18923a
            V9.a r5 = r5.b()
            V9.a r6 = V9.a.FILL
            if (r5 == r6) goto L67
            goto L68
        L67:
            r2 = r8
        L68:
            Y9.a r8 = r7.f18923a
            r8.P(r0)
            Y9.a r8 = r7.f18923a
            r8.J(r1)
            Y9.a r8 = r7.f18923a
            r8.K(r3)
            Y9.a r8 = r7.f18923a
            r8.R(r4)
            Y9.a r8 = r7.f18923a
            r8.V(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X9.a.g(android.content.res.TypedArray):void");
    }

    public void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2274a.f30682f, 0, 0);
        f(typedArrayObtainStyledAttributes);
        e(typedArrayObtainStyledAttributes);
        d(typedArrayObtainStyledAttributes);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
