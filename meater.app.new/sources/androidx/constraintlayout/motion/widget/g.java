package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import c1.AbstractC2307b;
import c1.C2306a;
import c1.c;
import c1.d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    boolean f23808a;

    /* renamed from: b, reason: collision with root package name */
    private k f23809b;

    /* renamed from: c, reason: collision with root package name */
    private k f23810c;

    /* renamed from: d, reason: collision with root package name */
    private f f23811d;

    /* renamed from: e, reason: collision with root package name */
    private f f23812e;

    /* renamed from: f, reason: collision with root package name */
    private Y0.a[] f23813f;

    /* renamed from: g, reason: collision with root package name */
    private Y0.a f23814g;

    /* renamed from: h, reason: collision with root package name */
    float f23815h;

    /* renamed from: i, reason: collision with root package name */
    float f23816i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f23817j;

    /* renamed from: k, reason: collision with root package name */
    private double[] f23818k;

    /* renamed from: l, reason: collision with root package name */
    private double[] f23819l;

    /* renamed from: m, reason: collision with root package name */
    private String[] f23820m;

    /* renamed from: n, reason: collision with root package name */
    private float[] f23821n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<k> f23822o;

    /* renamed from: p, reason: collision with root package name */
    private HashMap<String, c1.d> f23823p;

    /* renamed from: q, reason: collision with root package name */
    private HashMap<String, c1.c> f23824q;

    /* renamed from: r, reason: collision with root package name */
    private HashMap<String, AbstractC2307b> f23825r;

    /* renamed from: s, reason: collision with root package name */
    private e[] f23826s;

    /* renamed from: t, reason: collision with root package name */
    private int f23827t;

    /* renamed from: u, reason: collision with root package name */
    private View f23828u;

    /* renamed from: v, reason: collision with root package name */
    private int f23829v;

    /* renamed from: w, reason: collision with root package name */
    private float f23830w;

    /* renamed from: x, reason: collision with root package name */
    private Interpolator f23831x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f23832y;

    private float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f23816i;
            if (f12 != 1.0d) {
                float f13 = this.f23815h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        Y0.b bVar = this.f23809b.f23899B;
        Iterator<k> it = this.f23822o.iterator();
        float f14 = Float.NaN;
        while (it.hasNext()) {
            k next = it.next();
            Y0.b bVar2 = next.f23899B;
            if (bVar2 != null) {
                float f15 = next.f23901D;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = next.f23901D;
                }
            }
        }
        if (bVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) bVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f23813f[0].b(d10, dArr);
        this.f23813f[0].d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f23809b.j(d10, this.f23817j, dArr, fArr, dArr2, fArr2);
    }

    boolean c(View view, float f10, long j10, Y0.c cVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d.a aVar;
        boolean zC;
        int i10;
        double d10;
        float fA = a(f10, null);
        int i11 = this.f23829v;
        if (i11 != d.f23805a) {
            float f11 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fA / f11)) * f11;
            float f12 = (fA % f11) / f11;
            if (!Float.isNaN(this.f23830w)) {
                f12 = (f12 + this.f23830w) % 1.0f;
            }
            Interpolator interpolator = this.f23831x;
            fA = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fA;
        HashMap<String, c1.c> map = this.f23824q;
        if (map != null) {
            Iterator<c1.c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().b(view, f13);
            }
        }
        HashMap<String, c1.d> map2 = this.f23823p;
        if (map2 != null) {
            d.a aVar2 = null;
            boolean zB = false;
            for (c1.d dVar : map2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    zB |= dVar.b(view, f13, j10, cVar);
                }
            }
            zC = zB;
            aVar = aVar2;
        } else {
            aVar = null;
            zC = false;
        }
        Y0.a[] aVarArr = this.f23813f;
        if (aVarArr != null) {
            double d11 = f13;
            aVarArr[0].b(d11, this.f23818k);
            this.f23813f[0].d(d11, this.f23819l);
            if (this.f23832y) {
                d10 = d11;
            } else {
                d10 = d11;
                this.f23809b.n(f13, view, this.f23817j, this.f23818k, this.f23819l, null, this.f23808a);
                this.f23808a = false;
            }
            if (this.f23827t != d.f23805a) {
                if (this.f23828u == null) {
                    this.f23828u = ((View) view.getParent()).findViewById(this.f23827t);
                }
                if (this.f23828u != null) {
                    float top = (r1.getTop() + this.f23828u.getBottom()) / 2.0f;
                    float left = (this.f23828u.getLeft() + this.f23828u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, c1.c> map3 = this.f23824q;
            if (map3 != null) {
                for (c1.c cVar2 : map3.values()) {
                    if (cVar2 instanceof c.a) {
                        double[] dArr = this.f23819l;
                        if (dArr.length > 1) {
                            ((c.a) cVar2).c(view, f13, dArr[0], dArr[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr2 = this.f23819l;
                i10 = 1;
                zC |= aVar.c(view, cVar, f13, j10, dArr2[0], dArr2[1]);
            } else {
                i10 = 1;
            }
            int i12 = i10;
            while (true) {
                Y0.a[] aVarArr2 = this.f23813f;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i12].c(d10, this.f23821n);
                C2306a.b(this.f23809b.f23913P.get(this.f23820m[i12 - 1]), view, this.f23821n);
                i12++;
            }
            f fVar = this.f23811d;
            if (fVar.f23806B == 0) {
                if (f13 <= 0.0f) {
                    view.setVisibility(fVar.f23807C);
                } else if (f13 >= 1.0f) {
                    view.setVisibility(this.f23812e.f23807C);
                } else if (this.f23812e.f23807C != fVar.f23807C) {
                    view.setVisibility(0);
                }
            }
            if (this.f23826s != null) {
                int i13 = 0;
                while (true) {
                    e[] eVarArr = this.f23826s;
                    if (i13 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i13].a(f13, view);
                    i13++;
                }
            }
        } else {
            i10 = 1;
            k kVar = this.f23809b;
            float f14 = kVar.f23903F;
            k kVar2 = this.f23810c;
            float f15 = f14 + ((kVar2.f23903F - f14) * f13);
            float f16 = kVar.f23904G;
            float f17 = f16 + ((kVar2.f23904G - f16) * f13);
            float f18 = kVar.f23905H;
            float f19 = kVar2.f23905H;
            float f20 = kVar.f23906I;
            float f21 = kVar2.f23906I;
            float f22 = f15 + 0.5f;
            int i14 = (int) f22;
            float f23 = f17 + 0.5f;
            int i15 = (int) f23;
            int i16 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i17 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f19 != f18 || f21 != f20 || this.f23808a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f23808a = false;
            }
            view.layout(i14, i15, i16, i17);
        }
        HashMap<String, AbstractC2307b> map4 = this.f23825r;
        if (map4 != null) {
            for (AbstractC2307b abstractC2307b : map4.values()) {
                if (abstractC2307b instanceof AbstractC2307b.a) {
                    double[] dArr3 = this.f23819l;
                    ((AbstractC2307b.a) abstractC2307b).c(view, f13, dArr3[0], dArr3[i10]);
                } else {
                    abstractC2307b.b(view, f13);
                }
            }
        }
        return zC;
    }

    public String toString() {
        return " start: x: " + this.f23809b.f23903F + " y: " + this.f23809b.f23904G + " end: x: " + this.f23810c.f23903F + " y: " + this.f23810c.f23904G;
    }
}
