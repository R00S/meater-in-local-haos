package T3;

import L3.y;
import O3.o;
import Q3.b;
import R3.k;
import S3.q;
import X3.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s.C4411v;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public class i extends T3.b {

    /* renamed from: D, reason: collision with root package name */
    private final StringBuilder f15966D;

    /* renamed from: E, reason: collision with root package name */
    private final RectF f15967E;

    /* renamed from: F, reason: collision with root package name */
    private final Matrix f15968F;

    /* renamed from: G, reason: collision with root package name */
    private final Paint f15969G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f15970H;

    /* renamed from: I, reason: collision with root package name */
    private final Map<Q3.d, List<N3.d>> f15971I;

    /* renamed from: J, reason: collision with root package name */
    private final C4411v<String> f15972J;

    /* renamed from: K, reason: collision with root package name */
    private final List<d> f15973K;

    /* renamed from: L, reason: collision with root package name */
    private final o f15974L;

    /* renamed from: M, reason: collision with root package name */
    private final n f15975M;

    /* renamed from: N, reason: collision with root package name */
    private final L3.i f15976N;

    /* renamed from: O, reason: collision with root package name */
    private O3.a<Integer, Integer> f15977O;

    /* renamed from: P, reason: collision with root package name */
    private O3.a<Integer, Integer> f15978P;

    /* renamed from: Q, reason: collision with root package name */
    private O3.a<Integer, Integer> f15979Q;

    /* renamed from: R, reason: collision with root package name */
    private O3.a<Integer, Integer> f15980R;

    /* renamed from: S, reason: collision with root package name */
    private O3.a<Float, Float> f15981S;

    /* renamed from: T, reason: collision with root package name */
    private O3.a<Float, Float> f15982T;

    /* renamed from: U, reason: collision with root package name */
    private O3.a<Float, Float> f15983U;

    /* renamed from: V, reason: collision with root package name */
    private O3.a<Float, Float> f15984V;

    /* renamed from: W, reason: collision with root package name */
    private O3.a<Float, Float> f15985W;

    /* renamed from: X, reason: collision with root package name */
    private O3.a<Typeface, Typeface> f15986X;

    /* compiled from: TextLayer.java */
    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: TextLayer.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15989a;

        static {
            int[] iArr = new int[b.a.values().length];
            f15989a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15989a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15989a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(n nVar, e eVar) {
        R3.b bVar;
        R3.b bVar2;
        R3.a aVar;
        R3.a aVar2;
        super(nVar, eVar);
        this.f15966D = new StringBuilder(2);
        this.f15967E = new RectF();
        this.f15968F = new Matrix();
        this.f15969G = new a(1);
        this.f15970H = new b(1);
        this.f15971I = new HashMap();
        this.f15972J = new C4411v<>();
        this.f15973K = new ArrayList();
        this.f15975M = nVar;
        this.f15976N = eVar.c();
        o oVarH = eVar.t().h();
        this.f15974L = oVarH;
        oVarH.a(this);
        j(oVarH);
        k kVarU = eVar.u();
        if (kVarU != null && (aVar2 = kVarU.f14780a) != null) {
            O3.a<Integer, Integer> aVarH = aVar2.h();
            this.f15977O = aVarH;
            aVarH.a(this);
            j(this.f15977O);
        }
        if (kVarU != null && (aVar = kVarU.f14781b) != null) {
            O3.a<Integer, Integer> aVarH2 = aVar.h();
            this.f15979Q = aVarH2;
            aVarH2.a(this);
            j(this.f15979Q);
        }
        if (kVarU != null && (bVar2 = kVarU.f14782c) != null) {
            O3.a<Float, Float> aVarH3 = bVar2.h();
            this.f15981S = aVarH3;
            aVarH3.a(this);
            j(this.f15981S);
        }
        if (kVarU == null || (bVar = kVarU.f14783d) == null) {
            return;
        }
        O3.a<Float, Float> aVarH4 = bVar.h();
        this.f15983U = aVarH4;
        aVarH4.a(this);
        j(this.f15983U);
    }

    private String Q(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!e0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.f15972J.d(j10)) {
            return this.f15972J.f(j10);
        }
        this.f15966D.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.f15966D.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.f15966D.toString();
        this.f15972J.k(j10, string);
        return string;
    }

    private void R(Q3.b bVar, int i10) {
        O3.a<Integer, Integer> aVar = this.f15978P;
        if (aVar != null) {
            this.f15969G.setColor(aVar.h().intValue());
        } else {
            O3.a<Integer, Integer> aVar2 = this.f15977O;
            if (aVar2 != null) {
                this.f15969G.setColor(aVar2.h().intValue());
            } else {
                this.f15969G.setColor(bVar.f14292h);
            }
        }
        O3.a<Integer, Integer> aVar3 = this.f15980R;
        if (aVar3 != null) {
            this.f15970H.setColor(aVar3.h().intValue());
        } else {
            O3.a<Integer, Integer> aVar4 = this.f15979Q;
            if (aVar4 != null) {
                this.f15970H.setColor(aVar4.h().intValue());
            } else {
                this.f15970H.setColor(bVar.f14293i);
            }
        }
        int iIntValue = ((((this.f15898x.h() == null ? 100 : this.f15898x.h().h().intValue()) * 255) / 100) * i10) / 255;
        this.f15969G.setAlpha(iIntValue);
        this.f15970H.setAlpha(iIntValue);
        O3.a<Float, Float> aVar5 = this.f15982T;
        if (aVar5 != null) {
            this.f15970H.setStrokeWidth(aVar5.h().floatValue());
            return;
        }
        O3.a<Float, Float> aVar6 = this.f15981S;
        if (aVar6 != null) {
            this.f15970H.setStrokeWidth(aVar6.h().floatValue());
        } else {
            this.f15970H.setStrokeWidth(bVar.f14294j * j.e());
        }
    }

    private void S(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void T(Q3.d dVar, float f10, Q3.b bVar, Canvas canvas) {
        List<N3.d> listB0 = b0(dVar);
        for (int i10 = 0; i10 < listB0.size(); i10++) {
            Path pathH = listB0.get(i10).h();
            pathH.computeBounds(this.f15967E, false);
            this.f15968F.reset();
            this.f15968F.preTranslate(0.0f, (-bVar.f14291g) * j.e());
            this.f15968F.preScale(f10, f10);
            pathH.transform(this.f15968F);
            if (bVar.f14295k) {
                W(pathH, this.f15969G, canvas);
                W(pathH, this.f15970H, canvas);
            } else {
                W(pathH, this.f15970H, canvas);
                W(pathH, this.f15969G, canvas);
            }
        }
    }

    private void U(String str, Q3.b bVar, Canvas canvas) {
        if (bVar.f14295k) {
            S(str, this.f15969G, canvas);
            S(str, this.f15970H, canvas);
        } else {
            S(str, this.f15970H, canvas);
            S(str, this.f15969G, canvas);
        }
    }

    private void V(String str, Q3.b bVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strQ = Q(str, length);
            length += strQ.length();
            U(strQ, bVar, canvas);
            canvas.translate(this.f15969G.measureText(strQ) + f10, 0.0f);
        }
    }

    private void W(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void X(String str, Q3.b bVar, Q3.c cVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            Q3.d dVarG = this.f15976N.c().g(Q3.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (dVarG != null) {
                T(dVarG, f11, bVar, canvas);
                canvas.translate((((float) dVarG.b()) * f11 * j.e()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Y(Q3.b r19, Q3.c r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.d0(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.f14285a
            com.airbnb.lottie.n r2 = r7.f15975M
            L3.H r2 = r2.Z()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.getName()
            java.lang.String r1 = r2.c(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.f15969G
            r2.setTypeface(r0)
            O3.a<java.lang.Float, java.lang.Float> r0 = r7.f15985W
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.f14287c
        L37:
            android.graphics.Paint r2 = r7.f15969G
            float r3 = X3.j.e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.f15970H
            android.graphics.Paint r3 = r7.f15969G
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.f15970H
            android.graphics.Paint r3 = r7.f15969G
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f14289e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            O3.a<java.lang.Float, java.lang.Float> r3 = r7.f15984V
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            O3.a<java.lang.Float, java.lang.Float> r3 = r7.f15983U
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = X3.j.e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.c0(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Le1
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.f14297m
            if (r0 != 0) goto La2
            r0 = 0
        La0:
            r2 = r0
            goto La5
        La2:
            float r0 = r0.x
            goto La0
        La5:
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.g0(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb6:
            int r2 = r0.size()
            if (r1 >= r2) goto Lde
            java.lang.Object r2 = r0.get(r1)
            T3.i$d r2 = (T3.i.d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = T3.i.d.a(r2)
            boolean r3 = r7.f0(r10, r8, r15, r3)
            if (r3 == 0) goto Ld8
            java.lang.String r2 = T3.i.d.b(r2)
            r7.V(r2, r8, r10, r11)
        Ld8:
            r21.restore()
            int r1 = r1 + 1
            goto Lb6
        Lde:
            int r6 = r17 + 1
            goto L92
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.i.Y(Q3.b, Q3.c, android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Z(Q3.b r21, android.graphics.Matrix r22, Q3.c r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            O3.a<java.lang.Float, java.lang.Float> r0 = r8.f15985W
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.f14287c
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = X3.j.g(r22)
            java.lang.String r0 = r9.f14285a
            java.util.List r12 = r8.c0(r0)
            int r13 = r12.size()
            int r0 = r9.f14289e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            O3.a<java.lang.Float, java.lang.Float> r1 = r8.f15984V
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
        L3c:
            r14 = r0
            goto L4d
        L3e:
            O3.a<java.lang.Float, java.lang.Float> r1 = r8.f15983U
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4d:
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lbe
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.f14297m
            if (r0 != 0) goto L61
            r0 = 0
        L5f:
            r2 = r0
            goto L64
        L61:
            float r0 = r0.x
            goto L5f
        L64:
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.g0(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L75:
            int r0 = r6.size()
            if (r5 >= r0) goto Lbb
            java.lang.Object r0 = r6.get(r5)
            T3.i$d r0 = (T3.i.d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = T3.i.d.a(r0)
            r4 = r24
            boolean r1 = r8.f0(r4, r9, r7, r1)
            if (r1 == 0) goto Lab
            java.lang.String r1 = T3.i.d.b(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.X(r1, r2, r3, r4, r5, r6, r7)
            goto Lb1
        Lab:
            r16 = r5
            r18 = r6
            r19 = r7
        Lb1:
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L75
        Lbb:
            int r6 = r17 + 1
            goto L51
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.i.Z(Q3.b, android.graphics.Matrix, Q3.c, android.graphics.Canvas):void");
    }

    private d a0(int i10) {
        for (int size = this.f15973K.size(); size < i10; size++) {
            this.f15973K.add(new d(null));
        }
        return this.f15973K.get(i10 - 1);
    }

    private List<N3.d> b0(Q3.d dVar) {
        if (this.f15971I.containsKey(dVar)) {
            return this.f15971I.get(dVar);
        }
        List<q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new N3.d(this.f15975M, this, listA.get(i10), this.f15976N));
        }
        this.f15971I.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> c0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface d0(Q3.c cVar) {
        Typeface typefaceH;
        O3.a<Typeface, Typeface> aVar = this.f15986X;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceA0 = this.f15975M.a0(cVar);
        return typefaceA0 != null ? typefaceA0 : cVar.d();
    }

    private boolean e0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    private boolean f0(Canvas canvas, Q3.b bVar, int i10, float f10) {
        PointF pointF = bVar.f14296l;
        PointF pointF2 = bVar.f14297m;
        float fE = j.e();
        float f11 = (i10 * bVar.f14290f * fE) + (pointF == null ? 0.0f : (bVar.f14290f * fE) + pointF.y);
        if (this.f15975M.G() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f14287c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f15989a[bVar.f14288d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    private List<d> g0(String str, float f10, Q3.c cVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                Q3.d dVarG = this.f15976N.c().g(Q3.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVarG != null) {
                    fMeasureText = ((float) dVarG.b()) * f11 * j.e();
                }
            } else {
                fMeasureText = this.f15969G.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                d dVarA0 = a0(i10);
                if (i12 == i11) {
                    dVarA0.c(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    dVarA0.c(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            a0(i10).c(str.substring(i11), f13);
        }
        return this.f15973K.subList(0, i10);
    }

    @Override // T3.b, Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        super.c(t10, cVar);
        if (t10 == y.f9222a) {
            O3.a<Integer, Integer> aVar = this.f15978P;
            if (aVar != null) {
                I(aVar);
            }
            if (cVar == null) {
                this.f15978P = null;
                return;
            }
            O3.q qVar = new O3.q(cVar);
            this.f15978P = qVar;
            qVar.a(this);
            j(this.f15978P);
            return;
        }
        if (t10 == y.f9223b) {
            O3.a<Integer, Integer> aVar2 = this.f15980R;
            if (aVar2 != null) {
                I(aVar2);
            }
            if (cVar == null) {
                this.f15980R = null;
                return;
            }
            O3.q qVar2 = new O3.q(cVar);
            this.f15980R = qVar2;
            qVar2.a(this);
            j(this.f15980R);
            return;
        }
        if (t10 == y.f9240s) {
            O3.a<Float, Float> aVar3 = this.f15982T;
            if (aVar3 != null) {
                I(aVar3);
            }
            if (cVar == null) {
                this.f15982T = null;
                return;
            }
            O3.q qVar3 = new O3.q(cVar);
            this.f15982T = qVar3;
            qVar3.a(this);
            j(this.f15982T);
            return;
        }
        if (t10 == y.f9241t) {
            O3.a<Float, Float> aVar4 = this.f15984V;
            if (aVar4 != null) {
                I(aVar4);
            }
            if (cVar == null) {
                this.f15984V = null;
                return;
            }
            O3.q qVar4 = new O3.q(cVar);
            this.f15984V = qVar4;
            qVar4.a(this);
            j(this.f15984V);
            return;
        }
        if (t10 == y.f9211F) {
            O3.a<Float, Float> aVar5 = this.f15985W;
            if (aVar5 != null) {
                I(aVar5);
            }
            if (cVar == null) {
                this.f15985W = null;
                return;
            }
            O3.q qVar5 = new O3.q(cVar);
            this.f15985W = qVar5;
            qVar5.a(this);
            j(this.f15985W);
            return;
        }
        if (t10 != y.f9218M) {
            if (t10 == y.f9220O) {
                this.f15974L.r(cVar);
                return;
            }
            return;
        }
        O3.a<Typeface, Typeface> aVar6 = this.f15986X;
        if (aVar6 != null) {
            I(aVar6);
        }
        if (cVar == null) {
            this.f15986X = null;
            return;
        }
        O3.q qVar6 = new O3.q(cVar);
        this.f15986X = qVar6;
        qVar6.a(this);
        j(this.f15986X);
    }

    @Override // T3.b, N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f15976N.b().width(), this.f15976N.b().height());
    }

    @Override // T3.b
    void u(Canvas canvas, Matrix matrix, int i10) {
        Q3.b bVarH = this.f15974L.h();
        Q3.c cVar = this.f15976N.g().get(bVarH.f14286b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        R(bVarH, i10);
        if (this.f15975M.i1()) {
            Z(bVarH, matrix, cVar, canvas);
        } else {
            Y(bVarH, cVar, canvas);
        }
        canvas.restore();
    }

    /* compiled from: TextLayer.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f15990a;

        /* renamed from: b, reason: collision with root package name */
        private float f15991b;

        private d() {
            this.f15990a = "";
            this.f15991b = 0.0f;
        }

        void c(String str, float f10) {
            this.f15990a = str;
            this.f15991b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
