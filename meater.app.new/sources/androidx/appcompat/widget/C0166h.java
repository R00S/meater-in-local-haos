package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0165g0;
import p024c.p025a.C0823a;
import p024c.p025a.C0825c;
import p024c.p025a.C0827e;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p053e.C0923a;

/* compiled from: AppCompatDrawableManager.java */
/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public final class C0166h {

    /* renamed from: a */
    private static final PorterDuff.Mode f1139a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0166h f1140b;

    /* renamed from: c */
    private C0165g0 f1141c;

    /* compiled from: AppCompatDrawableManager.java */
    /* renamed from: androidx.appcompat.widget.h$a */
    class a implements C0165g0.e {

        /* renamed from: a */
        private final int[] f1142a = {C0827e.f5092S, C0827e.f5090Q, C0827e.f5094a};

        /* renamed from: b */
        private final int[] f1143b = {C0827e.f5108o, C0827e.f5075B, C0827e.f5113t, C0827e.f5109p, C0827e.f5110q, C0827e.f5112s, C0827e.f5111r};

        /* renamed from: c */
        private final int[] f1144c = {C0827e.f5089P, C0827e.f5091R, C0827e.f5104k, C0827e.f5082I, C0827e.f5083J, C0827e.f5085L, C0827e.f5087N, C0827e.f5084K, C0827e.f5086M, C0827e.f5088O};

        /* renamed from: d */
        private final int[] f1145d = {C0827e.f5116w, C0827e.f5102i, C0827e.f5115v};

        /* renamed from: e */
        private final int[] f1146e = {C0827e.f5081H, C0827e.f5093T};

        /* renamed from: f */
        private final int[] f1147f = {C0827e.f5096c, C0827e.f5100g, C0827e.f5097d, C0827e.f5101h};

        a() {
        }

        /* renamed from: f */
        private boolean m1016f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1017g(Context context) {
            return m1018h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1018h(Context context, int i2) {
            int iM1070c = C0175l0.m1070c(context, C0823a.f5048v);
            return new ColorStateList(new int[][]{C0175l0.f1206b, C0175l0.f1209e, C0175l0.f1207c, C0175l0.f1213i}, new int[]{C0175l0.m1069b(context, C0823a.f5046t), C0923a.m5882j(iM1070c, i2), C0923a.m5882j(iM1070c, i2), i2});
        }

        /* renamed from: i */
        private ColorStateList m1019i(Context context) {
            return m1018h(context, C0175l0.m1070c(context, C0823a.f5045s));
        }

        /* renamed from: j */
        private ColorStateList m1020j(Context context) {
            return m1018h(context, C0175l0.m1070c(context, C0823a.f5046t));
        }

        /* renamed from: k */
        private ColorStateList m1021k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = C0823a.f5051y;
            ColorStateList colorStateListM1072e = C0175l0.m1072e(context, i2);
            if (colorStateListM1072e == null || !colorStateListM1072e.isStateful()) {
                iArr[0] = C0175l0.f1206b;
                iArr2[0] = C0175l0.m1069b(context, i2);
                iArr[1] = C0175l0.f1210f;
                iArr2[1] = C0175l0.m1070c(context, C0823a.f5047u);
                iArr[2] = C0175l0.f1213i;
                iArr2[2] = C0175l0.m1070c(context, i2);
            } else {
                iArr[0] = C0175l0.f1206b;
                iArr2[0] = colorStateListM1072e.getColorForState(iArr[0], 0);
                iArr[1] = C0175l0.f1210f;
                iArr2[1] = C0175l0.m1070c(context, C0823a.f5047u);
                iArr[2] = C0175l0.f1213i;
                iArr2[2] = colorStateListM1072e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m1022l(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (C0200y.m1234a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0166h.f1139a;
            }
            drawable.setColorFilter(C0166h.m1009e(i2, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.C0165g0.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo1002a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0166h.m1007a()
                int[] r1 = r6.f1142a
                boolean r1 = r6.m1016f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p024c.p025a.C0823a.f5049w
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f1144c
                boolean r1 = r6.m1016f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p024c.p025a.C0823a.f5047u
                goto L14
            L22:
                int[] r1 = r6.f1145d
                boolean r1 = r6.m1016f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p024c.p025a.C0827e.f5114u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p024c.p025a.C0827e.f5105l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.C0200y.m1234a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.C0175l0.m1070c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0166h.m1009e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0166h.a.mo1002a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0165g0.e
        /* renamed from: b */
        public PorterDuff.Mode mo1003b(int i2) {
            if (i2 == C0827e.f5079F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0165g0.e
        /* renamed from: c */
        public Drawable mo1004c(C0165g0 c0165g0, Context context, int i2) {
            if (i2 == C0827e.f5103j) {
                return new LayerDrawable(new Drawable[]{c0165g0.m990j(context, C0827e.f5102i), c0165g0.m990j(context, C0827e.f5104k)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0165g0.e
        /* renamed from: d */
        public ColorStateList mo1005d(Context context, int i2) {
            if (i2 == C0827e.f5106m) {
                return C0833a.m5261c(context, C0825c.f5058e);
            }
            if (i2 == C0827e.f5080G) {
                return C0833a.m5261c(context, C0825c.f5061h);
            }
            if (i2 == C0827e.f5079F) {
                return m1021k(context);
            }
            if (i2 == C0827e.f5099f) {
                return m1020j(context);
            }
            if (i2 == C0827e.f5095b) {
                return m1017g(context);
            }
            if (i2 == C0827e.f5098e) {
                return m1019i(context);
            }
            if (i2 == C0827e.f5077D || i2 == C0827e.f5078E) {
                return C0833a.m5261c(context, C0825c.f5060g);
            }
            if (m1016f(this.f1143b, i2)) {
                return C0175l0.m1072e(context, C0823a.f5049w);
            }
            if (m1016f(this.f1146e, i2)) {
                return C0833a.m5261c(context, C0825c.f5057d);
            }
            if (m1016f(this.f1147f, i2)) {
                return C0833a.m5261c(context, C0825c.f5056c);
            }
            if (i2 == C0827e.f5074A) {
                return C0833a.m5261c(context, C0825c.f5059f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0165g0.e
        /* renamed from: e */
        public boolean mo1006e(Context context, int i2, Drawable drawable) {
            if (i2 == C0827e.f5076C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = C0823a.f5049w;
                m1022l(drawableFindDrawableByLayerId, C0175l0.m1070c(context, i3), C0166h.f1139a);
                m1022l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0175l0.m1070c(context, i3), C0166h.f1139a);
                m1022l(layerDrawable.findDrawableByLayerId(R.id.progress), C0175l0.m1070c(context, C0823a.f5047u), C0166h.f1139a);
                return true;
            }
            if (i2 != C0827e.f5118y && i2 != C0827e.f5117x && i2 != C0827e.f5119z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m1022l(layerDrawable2.findDrawableByLayerId(R.id.background), C0175l0.m1069b(context, C0823a.f5049w), C0166h.f1139a);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i4 = C0823a.f5047u;
            m1022l(drawableFindDrawableByLayerId2, C0175l0.m1070c(context, i4), C0166h.f1139a);
            m1022l(layerDrawable2.findDrawableByLayerId(R.id.progress), C0175l0.m1070c(context, i4), C0166h.f1139a);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C0166h m1008b() {
        if (f1140b == null) {
            m1010h();
        }
        return f1140b;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1009e(int i2, PorterDuff.Mode mode) {
        return C0165g0.m983l(i2, mode);
    }

    /* renamed from: h */
    public static synchronized void m1010h() {
        if (f1140b == null) {
            C0166h c0166h = new C0166h();
            f1140b = c0166h;
            c0166h.f1141c = C0165g0.m981h();
            f1140b.f1141c.m996u(new a());
        }
    }

    /* renamed from: i */
    static void m1011i(Drawable drawable, C0181o0 c0181o0, int[] iArr) {
        C0165g0.m989w(drawable, c0181o0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m1012c(Context context, int i2) {
        return this.f1141c.m990j(context, i2);
    }

    /* renamed from: d */
    synchronized Drawable m1013d(Context context, int i2, boolean z) {
        return this.f1141c.m991k(context, i2, z);
    }

    /* renamed from: f */
    synchronized ColorStateList m1014f(Context context, int i2) {
        return this.f1141c.m992m(context, i2);
    }

    /* renamed from: g */
    public synchronized void m1015g(Context context) {
        this.f1141c.m994s(context);
    }
}
