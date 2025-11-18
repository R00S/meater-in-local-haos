package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f24073g = {0, 4, 8};

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f24074h = new SparseIntArray();

    /* renamed from: i, reason: collision with root package name */
    private static SparseIntArray f24075i = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f24076a = "";

    /* renamed from: b, reason: collision with root package name */
    private String[] f24077b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public int f24078c = 0;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f24079d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f24080e = true;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<Integer, a> f24081f = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f24082a;

        /* renamed from: b, reason: collision with root package name */
        String f24083b;

        /* renamed from: c, reason: collision with root package name */
        public final C0348d f24084c = new C0348d();

        /* renamed from: d, reason: collision with root package name */
        public final c f24085d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f24086e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f24087f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f24088g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        C0347a f24089h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0347a {

            /* renamed from: a, reason: collision with root package name */
            int[] f24090a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f24091b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f24092c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f24093d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f24094e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f24095f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f24096g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f24097h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f24098i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f24099j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f24100k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f24101l = 0;

            C0347a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f24095f;
                int[] iArr = this.f24093d;
                if (i11 >= iArr.length) {
                    this.f24093d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f24094e;
                    this.f24094e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f24093d;
                int i12 = this.f24095f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f24094e;
                this.f24095f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f24092c;
                int[] iArr = this.f24090a;
                if (i12 >= iArr.length) {
                    this.f24090a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f24091b;
                    this.f24091b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f24090a;
                int i13 = this.f24092c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f24091b;
                this.f24092c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f24098i;
                int[] iArr = this.f24096g;
                if (i11 >= iArr.length) {
                    this.f24096g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f24097h;
                    this.f24097h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f24096g;
                int i12 = this.f24098i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f24097h;
                this.f24098i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f24101l;
                int[] iArr = this.f24099j;
                if (i11 >= iArr.length) {
                    this.f24099j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f24100k;
                    this.f24100k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f24099j;
                int i12 = this.f24101l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f24100k;
                this.f24101l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f24082a = i10;
            b bVar2 = this.f24086e;
            bVar2.f24147j = bVar.f23980e;
            bVar2.f24149k = bVar.f23982f;
            bVar2.f24151l = bVar.f23984g;
            bVar2.f24153m = bVar.f23986h;
            bVar2.f24155n = bVar.f23988i;
            bVar2.f24157o = bVar.f23990j;
            bVar2.f24159p = bVar.f23992k;
            bVar2.f24161q = bVar.f23994l;
            bVar2.f24163r = bVar.f23996m;
            bVar2.f24164s = bVar.f23998n;
            bVar2.f24165t = bVar.f24000o;
            bVar2.f24166u = bVar.f24008s;
            bVar2.f24167v = bVar.f24010t;
            bVar2.f24168w = bVar.f24012u;
            bVar2.f24169x = bVar.f24014v;
            bVar2.f24170y = bVar.f23952G;
            bVar2.f24171z = bVar.f23953H;
            bVar2.f24103A = bVar.f23954I;
            bVar2.f24104B = bVar.f24002p;
            bVar2.f24105C = bVar.f24004q;
            bVar2.f24106D = bVar.f24006r;
            bVar2.f24107E = bVar.f23969X;
            bVar2.f24108F = bVar.f23970Y;
            bVar2.f24109G = bVar.f23971Z;
            bVar2.f24143h = bVar.f23976c;
            bVar2.f24139f = bVar.f23972a;
            bVar2.f24141g = bVar.f23974b;
            bVar2.f24135d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f24137e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f24110H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f24111I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f24112J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f24113K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f24116N = bVar.f23949D;
            bVar2.f24124V = bVar.f23958M;
            bVar2.f24125W = bVar.f23957L;
            bVar2.f24127Y = bVar.f23960O;
            bVar2.f24126X = bVar.f23959N;
            bVar2.f24156n0 = bVar.f23973a0;
            bVar2.f24158o0 = bVar.f23975b0;
            bVar2.f24128Z = bVar.f23961P;
            bVar2.f24130a0 = bVar.f23962Q;
            bVar2.f24132b0 = bVar.f23965T;
            bVar2.f24134c0 = bVar.f23966U;
            bVar2.f24136d0 = bVar.f23963R;
            bVar2.f24138e0 = bVar.f23964S;
            bVar2.f24140f0 = bVar.f23967V;
            bVar2.f24142g0 = bVar.f23968W;
            bVar2.f24154m0 = bVar.f23977c0;
            bVar2.f24118P = bVar.f24018x;
            bVar2.f24120R = bVar.f24020z;
            bVar2.f24117O = bVar.f24016w;
            bVar2.f24119Q = bVar.f24019y;
            bVar2.f24122T = bVar.f23946A;
            bVar2.f24121S = bVar.f23947B;
            bVar2.f24123U = bVar.f23948C;
            bVar2.f24162q0 = bVar.f23979d0;
            bVar2.f24114L = bVar.getMarginEnd();
            this.f24086e.f24115M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, e.a aVar) {
            f(i10, aVar);
            this.f24084c.f24190d = aVar.f24218x0;
            e eVar = this.f24087f;
            eVar.f24194b = aVar.f24208A0;
            eVar.f24195c = aVar.f24209B0;
            eVar.f24196d = aVar.f24210C0;
            eVar.f24197e = aVar.f24211D0;
            eVar.f24198f = aVar.f24212E0;
            eVar.f24199g = aVar.f24213F0;
            eVar.f24200h = aVar.f24214G0;
            eVar.f24202j = aVar.f24215H0;
            eVar.f24203k = aVar.f24216I0;
            eVar.f24204l = aVar.f24217J0;
            eVar.f24206n = aVar.f24220z0;
            eVar.f24205m = aVar.f24219y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i10, e.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f24086e;
                bVar2.f24148j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f24144h0 = barrier.getType();
                this.f24086e.f24150k0 = barrier.getReferencedIds();
                this.f24086e.f24146i0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f24086e;
            bVar.f23980e = bVar2.f24147j;
            bVar.f23982f = bVar2.f24149k;
            bVar.f23984g = bVar2.f24151l;
            bVar.f23986h = bVar2.f24153m;
            bVar.f23988i = bVar2.f24155n;
            bVar.f23990j = bVar2.f24157o;
            bVar.f23992k = bVar2.f24159p;
            bVar.f23994l = bVar2.f24161q;
            bVar.f23996m = bVar2.f24163r;
            bVar.f23998n = bVar2.f24164s;
            bVar.f24000o = bVar2.f24165t;
            bVar.f24008s = bVar2.f24166u;
            bVar.f24010t = bVar2.f24167v;
            bVar.f24012u = bVar2.f24168w;
            bVar.f24014v = bVar2.f24169x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f24110H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f24111I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f24112J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f24113K;
            bVar.f23946A = bVar2.f24122T;
            bVar.f23947B = bVar2.f24121S;
            bVar.f24018x = bVar2.f24118P;
            bVar.f24020z = bVar2.f24120R;
            bVar.f23952G = bVar2.f24170y;
            bVar.f23953H = bVar2.f24171z;
            bVar.f24002p = bVar2.f24104B;
            bVar.f24004q = bVar2.f24105C;
            bVar.f24006r = bVar2.f24106D;
            bVar.f23954I = bVar2.f24103A;
            bVar.f23969X = bVar2.f24107E;
            bVar.f23970Y = bVar2.f24108F;
            bVar.f23958M = bVar2.f24124V;
            bVar.f23957L = bVar2.f24125W;
            bVar.f23960O = bVar2.f24127Y;
            bVar.f23959N = bVar2.f24126X;
            bVar.f23973a0 = bVar2.f24156n0;
            bVar.f23975b0 = bVar2.f24158o0;
            bVar.f23961P = bVar2.f24128Z;
            bVar.f23962Q = bVar2.f24130a0;
            bVar.f23965T = bVar2.f24132b0;
            bVar.f23966U = bVar2.f24134c0;
            bVar.f23963R = bVar2.f24136d0;
            bVar.f23964S = bVar2.f24138e0;
            bVar.f23967V = bVar2.f24140f0;
            bVar.f23968W = bVar2.f24142g0;
            bVar.f23971Z = bVar2.f24109G;
            bVar.f23976c = bVar2.f24143h;
            bVar.f23972a = bVar2.f24139f;
            bVar.f23974b = bVar2.f24141g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f24135d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f24137e;
            String str = bVar2.f24154m0;
            if (str != null) {
                bVar.f23977c0 = str;
            }
            bVar.f23979d0 = bVar2.f24162q0;
            bVar.setMarginStart(bVar2.f24115M);
            bVar.setMarginEnd(this.f24086e.f24114L);
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f24086e.a(this.f24086e);
            aVar.f24085d.a(this.f24085d);
            aVar.f24084c.a(this.f24084c);
            aVar.f24087f.a(this.f24087f);
            aVar.f24082a = this.f24082a;
            aVar.f24089h = this.f24089h;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {

        /* renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f24102r0;

        /* renamed from: d, reason: collision with root package name */
        public int f24135d;

        /* renamed from: e, reason: collision with root package name */
        public int f24137e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f24150k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f24152l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f24154m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24129a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f24131b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24133c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f24139f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f24141g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f24143h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f24145i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f24147j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f24149k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f24151l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f24153m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f24155n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f24157o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f24159p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f24161q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f24163r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f24164s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f24165t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f24166u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f24167v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f24168w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f24169x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f24170y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f24171z = 0.5f;

        /* renamed from: A, reason: collision with root package name */
        public String f24103A = null;

        /* renamed from: B, reason: collision with root package name */
        public int f24104B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f24105C = 0;

        /* renamed from: D, reason: collision with root package name */
        public float f24106D = 0.0f;

        /* renamed from: E, reason: collision with root package name */
        public int f24107E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f24108F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f24109G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f24110H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f24111I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f24112J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f24113K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f24114L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f24115M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f24116N = 0;

        /* renamed from: O, reason: collision with root package name */
        public int f24117O = Integer.MIN_VALUE;

        /* renamed from: P, reason: collision with root package name */
        public int f24118P = Integer.MIN_VALUE;

        /* renamed from: Q, reason: collision with root package name */
        public int f24119Q = Integer.MIN_VALUE;

        /* renamed from: R, reason: collision with root package name */
        public int f24120R = Integer.MIN_VALUE;

        /* renamed from: S, reason: collision with root package name */
        public int f24121S = Integer.MIN_VALUE;

        /* renamed from: T, reason: collision with root package name */
        public int f24122T = Integer.MIN_VALUE;

        /* renamed from: U, reason: collision with root package name */
        public int f24123U = Integer.MIN_VALUE;

        /* renamed from: V, reason: collision with root package name */
        public float f24124V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public float f24125W = -1.0f;

        /* renamed from: X, reason: collision with root package name */
        public int f24126X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f24127Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f24128Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f24130a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f24132b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f24134c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f24136d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f24138e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f24140f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f24142g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f24144h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f24146i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f24148j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f24156n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f24158o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f24160p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f24162q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24102r0 = sparseIntArray;
            sparseIntArray.append(i.f24342O5, 24);
            f24102r0.append(i.f24350P5, 25);
            f24102r0.append(i.f24366R5, 28);
            f24102r0.append(i.f24374S5, 29);
            f24102r0.append(i.f24414X5, 35);
            f24102r0.append(i.f24406W5, 34);
            f24102r0.append(i.f24638x5, 4);
            f24102r0.append(i.f24630w5, 3);
            f24102r0.append(i.f24614u5, 1);
            f24102r0.append(i.f24484f6, 6);
            f24102r0.append(i.f24493g6, 7);
            f24102r0.append(i.f24262E5, 17);
            f24102r0.append(i.f24270F5, 18);
            f24102r0.append(i.f24278G5, 19);
            SparseIntArray sparseIntArray2 = f24102r0;
            int i10 = i.f24582q5;
            sparseIntArray2.append(i10, 90);
            f24102r0.append(i.f24456c5, 26);
            f24102r0.append(i.f24382T5, 31);
            f24102r0.append(i.f24390U5, 32);
            f24102r0.append(i.f24254D5, 10);
            f24102r0.append(i.f24246C5, 9);
            f24102r0.append(i.f24520j6, 13);
            f24102r0.append(i.f24547m6, 16);
            f24102r0.append(i.f24529k6, 14);
            f24102r0.append(i.f24502h6, 11);
            f24102r0.append(i.f24538l6, 15);
            f24102r0.append(i.f24511i6, 12);
            f24102r0.append(i.f24439a6, 38);
            f24102r0.append(i.f24326M5, 37);
            f24102r0.append(i.f24318L5, 39);
            f24102r0.append(i.f24430Z5, 40);
            f24102r0.append(i.f24310K5, 20);
            f24102r0.append(i.f24422Y5, 36);
            f24102r0.append(i.f24238B5, 5);
            f24102r0.append(i.f24334N5, 91);
            f24102r0.append(i.f24398V5, 91);
            f24102r0.append(i.f24358Q5, 91);
            f24102r0.append(i.f24622v5, 91);
            f24102r0.append(i.f24606t5, 91);
            f24102r0.append(i.f24483f5, 23);
            f24102r0.append(i.f24501h5, 27);
            f24102r0.append(i.f24519j5, 30);
            f24102r0.append(i.f24528k5, 8);
            f24102r0.append(i.f24492g5, 33);
            f24102r0.append(i.f24510i5, 2);
            f24102r0.append(i.f24465d5, 22);
            f24102r0.append(i.f24474e5, 21);
            SparseIntArray sparseIntArray3 = f24102r0;
            int i11 = i.f24448b6;
            sparseIntArray3.append(i11, 41);
            SparseIntArray sparseIntArray4 = f24102r0;
            int i12 = i.f24286H5;
            sparseIntArray4.append(i12, 42);
            f24102r0.append(i.f24598s5, 87);
            f24102r0.append(i.f24590r5, 88);
            f24102r0.append(i.f24556n6, 76);
            f24102r0.append(i.f24646y5, 61);
            f24102r0.append(i.f24230A5, 62);
            f24102r0.append(i.f24654z5, 63);
            f24102r0.append(i.f24475e6, 69);
            f24102r0.append(i.f24302J5, 70);
            f24102r0.append(i.f24564o5, 71);
            f24102r0.append(i.f24546m5, 72);
            f24102r0.append(i.f24555n5, 73);
            f24102r0.append(i.f24573p5, 74);
            f24102r0.append(i.f24537l5, 75);
            SparseIntArray sparseIntArray5 = f24102r0;
            int i13 = i.f24457c6;
            sparseIntArray5.append(i13, 84);
            f24102r0.append(i.f24466d6, 86);
            f24102r0.append(i13, 83);
            f24102r0.append(i.f24294I5, 85);
            f24102r0.append(i11, 87);
            f24102r0.append(i12, 88);
            f24102r0.append(i.f24595s2, 89);
            f24102r0.append(i10, 90);
        }

        public void a(b bVar) {
            this.f24129a = bVar.f24129a;
            this.f24135d = bVar.f24135d;
            this.f24131b = bVar.f24131b;
            this.f24137e = bVar.f24137e;
            this.f24139f = bVar.f24139f;
            this.f24141g = bVar.f24141g;
            this.f24143h = bVar.f24143h;
            this.f24145i = bVar.f24145i;
            this.f24147j = bVar.f24147j;
            this.f24149k = bVar.f24149k;
            this.f24151l = bVar.f24151l;
            this.f24153m = bVar.f24153m;
            this.f24155n = bVar.f24155n;
            this.f24157o = bVar.f24157o;
            this.f24159p = bVar.f24159p;
            this.f24161q = bVar.f24161q;
            this.f24163r = bVar.f24163r;
            this.f24164s = bVar.f24164s;
            this.f24165t = bVar.f24165t;
            this.f24166u = bVar.f24166u;
            this.f24167v = bVar.f24167v;
            this.f24168w = bVar.f24168w;
            this.f24169x = bVar.f24169x;
            this.f24170y = bVar.f24170y;
            this.f24171z = bVar.f24171z;
            this.f24103A = bVar.f24103A;
            this.f24104B = bVar.f24104B;
            this.f24105C = bVar.f24105C;
            this.f24106D = bVar.f24106D;
            this.f24107E = bVar.f24107E;
            this.f24108F = bVar.f24108F;
            this.f24109G = bVar.f24109G;
            this.f24110H = bVar.f24110H;
            this.f24111I = bVar.f24111I;
            this.f24112J = bVar.f24112J;
            this.f24113K = bVar.f24113K;
            this.f24114L = bVar.f24114L;
            this.f24115M = bVar.f24115M;
            this.f24116N = bVar.f24116N;
            this.f24117O = bVar.f24117O;
            this.f24118P = bVar.f24118P;
            this.f24119Q = bVar.f24119Q;
            this.f24120R = bVar.f24120R;
            this.f24121S = bVar.f24121S;
            this.f24122T = bVar.f24122T;
            this.f24123U = bVar.f24123U;
            this.f24124V = bVar.f24124V;
            this.f24125W = bVar.f24125W;
            this.f24126X = bVar.f24126X;
            this.f24127Y = bVar.f24127Y;
            this.f24128Z = bVar.f24128Z;
            this.f24130a0 = bVar.f24130a0;
            this.f24132b0 = bVar.f24132b0;
            this.f24134c0 = bVar.f24134c0;
            this.f24136d0 = bVar.f24136d0;
            this.f24138e0 = bVar.f24138e0;
            this.f24140f0 = bVar.f24140f0;
            this.f24142g0 = bVar.f24142g0;
            this.f24144h0 = bVar.f24144h0;
            this.f24146i0 = bVar.f24146i0;
            this.f24148j0 = bVar.f24148j0;
            this.f24154m0 = bVar.f24154m0;
            int[] iArr = bVar.f24150k0;
            if (iArr == null || bVar.f24152l0 != null) {
                this.f24150k0 = null;
            } else {
                this.f24150k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f24152l0 = bVar.f24152l0;
            this.f24156n0 = bVar.f24156n0;
            this.f24158o0 = bVar.f24158o0;
            this.f24160p0 = bVar.f24160p0;
            this.f24162q0 = bVar.f24162q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24447b5);
            this.f24131b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f24102r0.get(index);
                switch (i11) {
                    case 1:
                        this.f24163r = d.o(typedArrayObtainStyledAttributes, index, this.f24163r);
                        break;
                    case 2:
                        this.f24113K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24113K);
                        break;
                    case 3:
                        this.f24161q = d.o(typedArrayObtainStyledAttributes, index, this.f24161q);
                        break;
                    case 4:
                        this.f24159p = d.o(typedArrayObtainStyledAttributes, index, this.f24159p);
                        break;
                    case 5:
                        this.f24103A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f24107E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f24107E);
                        break;
                    case 7:
                        this.f24108F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f24108F);
                        break;
                    case 8:
                        this.f24114L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24114L);
                        break;
                    case 9:
                        this.f24169x = d.o(typedArrayObtainStyledAttributes, index, this.f24169x);
                        break;
                    case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        this.f24168w = d.o(typedArrayObtainStyledAttributes, index, this.f24168w);
                        break;
                    case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        this.f24120R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24120R);
                        break;
                    case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        this.f24121S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24121S);
                        break;
                    case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        this.f24117O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24117O);
                        break;
                    case 14:
                        this.f24119Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24119Q);
                        break;
                    case 15:
                        this.f24122T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24122T);
                        break;
                    case 16:
                        this.f24118P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24118P);
                        break;
                    case 17:
                        this.f24139f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f24139f);
                        break;
                    case 18:
                        this.f24141g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f24141g);
                        break;
                    case 19:
                        this.f24143h = typedArrayObtainStyledAttributes.getFloat(index, this.f24143h);
                        break;
                    case 20:
                        this.f24170y = typedArrayObtainStyledAttributes.getFloat(index, this.f24170y);
                        break;
                    case 21:
                        this.f24137e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f24137e);
                        break;
                    case 22:
                        this.f24135d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f24135d);
                        break;
                    case 23:
                        this.f24110H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24110H);
                        break;
                    case 24:
                        this.f24147j = d.o(typedArrayObtainStyledAttributes, index, this.f24147j);
                        break;
                    case 25:
                        this.f24149k = d.o(typedArrayObtainStyledAttributes, index, this.f24149k);
                        break;
                    case 26:
                        this.f24109G = typedArrayObtainStyledAttributes.getInt(index, this.f24109G);
                        break;
                    case 27:
                        this.f24111I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24111I);
                        break;
                    case 28:
                        this.f24151l = d.o(typedArrayObtainStyledAttributes, index, this.f24151l);
                        break;
                    case 29:
                        this.f24153m = d.o(typedArrayObtainStyledAttributes, index, this.f24153m);
                        break;
                    case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                        this.f24115M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24115M);
                        break;
                    case 31:
                        this.f24166u = d.o(typedArrayObtainStyledAttributes, index, this.f24166u);
                        break;
                    case 32:
                        this.f24167v = d.o(typedArrayObtainStyledAttributes, index, this.f24167v);
                        break;
                    case 33:
                        this.f24112J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24112J);
                        break;
                    case 34:
                        this.f24157o = d.o(typedArrayObtainStyledAttributes, index, this.f24157o);
                        break;
                    case 35:
                        this.f24155n = d.o(typedArrayObtainStyledAttributes, index, this.f24155n);
                        break;
                    case 36:
                        this.f24171z = typedArrayObtainStyledAttributes.getFloat(index, this.f24171z);
                        break;
                    case 37:
                        this.f24125W = typedArrayObtainStyledAttributes.getFloat(index, this.f24125W);
                        break;
                    case 38:
                        this.f24124V = typedArrayObtainStyledAttributes.getFloat(index, this.f24124V);
                        break;
                    case 39:
                        this.f24126X = typedArrayObtainStyledAttributes.getInt(index, this.f24126X);
                        break;
                    case 40:
                        this.f24127Y = typedArrayObtainStyledAttributes.getInt(index, this.f24127Y);
                        break;
                    case 41:
                        d.p(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.p(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f24104B = d.o(typedArrayObtainStyledAttributes, index, this.f24104B);
                                break;
                            case 62:
                                this.f24105C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24105C);
                                break;
                            case 63:
                                this.f24106D = typedArrayObtainStyledAttributes.getFloat(index, this.f24106D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f24140f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f24142g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f24144h0 = typedArrayObtainStyledAttributes.getInt(index, this.f24144h0);
                                        break;
                                    case 73:
                                        this.f24146i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24146i0);
                                        break;
                                    case 74:
                                        this.f24152l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f24160p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f24160p0);
                                        break;
                                    case 76:
                                        this.f24162q0 = typedArrayObtainStyledAttributes.getInt(index, this.f24162q0);
                                        break;
                                    case 77:
                                        this.f24164s = d.o(typedArrayObtainStyledAttributes, index, this.f24164s);
                                        break;
                                    case 78:
                                        this.f24165t = d.o(typedArrayObtainStyledAttributes, index, this.f24165t);
                                        break;
                                    case 79:
                                        this.f24123U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24123U);
                                        break;
                                    case 80:
                                        this.f24116N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24116N);
                                        break;
                                    case 81:
                                        this.f24128Z = typedArrayObtainStyledAttributes.getInt(index, this.f24128Z);
                                        break;
                                    case 82:
                                        this.f24130a0 = typedArrayObtainStyledAttributes.getInt(index, this.f24130a0);
                                        break;
                                    case 83:
                                        this.f24134c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24134c0);
                                        break;
                                    case 84:
                                        this.f24132b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24132b0);
                                        break;
                                    case 85:
                                        this.f24138e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24138e0);
                                        break;
                                    case 86:
                                        this.f24136d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24136d0);
                                        break;
                                    case 87:
                                        this.f24156n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f24156n0);
                                        break;
                                    case 88:
                                        this.f24158o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f24158o0);
                                        break;
                                    case 89:
                                        this.f24154m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
                                        this.f24145i = typedArrayObtainStyledAttributes.getBoolean(index, this.f24145i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f24102r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f24102r0.get(index));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f24172o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24173a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f24174b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f24175c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f24176d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f24177e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f24178f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f24179g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f24180h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f24181i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f24182j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f24183k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f24184l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f24185m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f24186n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24172o = sparseIntArray;
            sparseIntArray.append(i.f24607t6, 1);
            f24172o.append(i.f24623v6, 2);
            f24172o.append(i.f24655z6, 3);
            f24172o.append(i.f24599s6, 4);
            f24172o.append(i.f24591r6, 5);
            f24172o.append(i.f24583q6, 6);
            f24172o.append(i.f24615u6, 7);
            f24172o.append(i.f24647y6, 8);
            f24172o.append(i.f24639x6, 9);
            f24172o.append(i.f24631w6, 10);
        }

        public void a(c cVar) {
            this.f24173a = cVar.f24173a;
            this.f24174b = cVar.f24174b;
            this.f24176d = cVar.f24176d;
            this.f24177e = cVar.f24177e;
            this.f24178f = cVar.f24178f;
            this.f24181i = cVar.f24181i;
            this.f24179g = cVar.f24179g;
            this.f24180h = cVar.f24180h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24574p6);
            this.f24173a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f24172o.get(index)) {
                    case 1:
                        this.f24181i = typedArrayObtainStyledAttributes.getFloat(index, this.f24181i);
                        break;
                    case 2:
                        this.f24177e = typedArrayObtainStyledAttributes.getInt(index, this.f24177e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f24176d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f24176d = Y0.b.f19187c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f24178f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f24174b = d.o(typedArrayObtainStyledAttributes, index, this.f24174b);
                        break;
                    case 6:
                        this.f24175c = typedArrayObtainStyledAttributes.getInteger(index, this.f24175c);
                        break;
                    case 7:
                        this.f24179g = typedArrayObtainStyledAttributes.getFloat(index, this.f24179g);
                        break;
                    case 8:
                        this.f24183k = typedArrayObtainStyledAttributes.getInteger(index, this.f24183k);
                        break;
                    case 9:
                        this.f24182j = typedArrayObtainStyledAttributes.getFloat(index, this.f24182j);
                        break;
                    case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f24186n = resourceId;
                            if (resourceId != -1) {
                                this.f24185m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f24184l = string;
                            if (string.indexOf("/") > 0) {
                                this.f24186n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f24185m = -2;
                                break;
                            } else {
                                this.f24185m = -1;
                                break;
                            }
                        } else {
                            this.f24185m = typedArrayObtainStyledAttributes.getInteger(index, this.f24186n);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0348d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f24187a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f24188b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f24189c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f24190d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f24191e = Float.NaN;

        public void a(C0348d c0348d) {
            this.f24187a = c0348d.f24187a;
            this.f24188b = c0348d.f24188b;
            this.f24190d = c0348d.f24190d;
            this.f24191e = c0348d.f24191e;
            this.f24189c = c0348d.f24189c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24311K6);
            this.f24187a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24327M6) {
                    this.f24190d = typedArrayObtainStyledAttributes.getFloat(index, this.f24190d);
                } else if (index == i.f24319L6) {
                    this.f24188b = typedArrayObtainStyledAttributes.getInt(index, this.f24188b);
                    this.f24188b = d.f24073g[this.f24188b];
                } else if (index == i.f24343O6) {
                    this.f24189c = typedArrayObtainStyledAttributes.getInt(index, this.f24189c);
                } else if (index == i.f24335N6) {
                    this.f24191e = typedArrayObtainStyledAttributes.getFloat(index, this.f24191e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f24192o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24193a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f24194b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f24195c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f24196d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f24197e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f24198f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f24199g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f24200h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f24201i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f24202j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f24203k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f24204l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f24205m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f24206n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24192o = sparseIntArray;
            sparseIntArray.append(i.f24449b7, 1);
            f24192o.append(i.f24458c7, 2);
            f24192o.append(i.f24467d7, 3);
            f24192o.append(i.f24431Z6, 4);
            f24192o.append(i.f24440a7, 5);
            f24192o.append(i.f24399V6, 6);
            f24192o.append(i.f24407W6, 7);
            f24192o.append(i.f24415X6, 8);
            f24192o.append(i.f24423Y6, 9);
            f24192o.append(i.f24476e7, 10);
            f24192o.append(i.f24485f7, 11);
            f24192o.append(i.f24494g7, 12);
        }

        public void a(e eVar) {
            this.f24193a = eVar.f24193a;
            this.f24194b = eVar.f24194b;
            this.f24195c = eVar.f24195c;
            this.f24196d = eVar.f24196d;
            this.f24197e = eVar.f24197e;
            this.f24198f = eVar.f24198f;
            this.f24199g = eVar.f24199g;
            this.f24200h = eVar.f24200h;
            this.f24201i = eVar.f24201i;
            this.f24202j = eVar.f24202j;
            this.f24203k = eVar.f24203k;
            this.f24204l = eVar.f24204l;
            this.f24205m = eVar.f24205m;
            this.f24206n = eVar.f24206n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24391U6);
            this.f24193a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f24192o.get(index)) {
                    case 1:
                        this.f24194b = typedArrayObtainStyledAttributes.getFloat(index, this.f24194b);
                        break;
                    case 2:
                        this.f24195c = typedArrayObtainStyledAttributes.getFloat(index, this.f24195c);
                        break;
                    case 3:
                        this.f24196d = typedArrayObtainStyledAttributes.getFloat(index, this.f24196d);
                        break;
                    case 4:
                        this.f24197e = typedArrayObtainStyledAttributes.getFloat(index, this.f24197e);
                        break;
                    case 5:
                        this.f24198f = typedArrayObtainStyledAttributes.getFloat(index, this.f24198f);
                        break;
                    case 6:
                        this.f24199g = typedArrayObtainStyledAttributes.getDimension(index, this.f24199g);
                        break;
                    case 7:
                        this.f24200h = typedArrayObtainStyledAttributes.getDimension(index, this.f24200h);
                        break;
                    case 8:
                        this.f24202j = typedArrayObtainStyledAttributes.getDimension(index, this.f24202j);
                        break;
                    case 9:
                        this.f24203k = typedArrayObtainStyledAttributes.getDimension(index, this.f24203k);
                        break;
                    case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        this.f24204l = typedArrayObtainStyledAttributes.getDimension(index, this.f24204l);
                        break;
                    case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        this.f24205m = true;
                        this.f24206n = typedArrayObtainStyledAttributes.getDimension(index, this.f24206n);
                        break;
                    case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        this.f24201i = d.o(typedArrayObtainStyledAttributes, index, this.f24201i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f24074h.append(i.f24505i0, 25);
        f24074h.append(i.f24514j0, 26);
        f24074h.append(i.f24532l0, 29);
        f24074h.append(i.f24541m0, 30);
        f24074h.append(i.f24593s0, 36);
        f24074h.append(i.f24585r0, 35);
        f24074h.append(i.f24344P, 4);
        f24074h.append(i.f24336O, 3);
        f24074h.append(i.f24304K, 1);
        f24074h.append(i.f24320M, 91);
        f24074h.append(i.f24312L, 92);
        f24074h.append(i.f24233B0, 6);
        f24074h.append(i.f24241C0, 7);
        f24074h.append(i.f24400W, 17);
        f24074h.append(i.f24408X, 18);
        f24074h.append(i.f24416Y, 19);
        f24074h.append(i.f24272G, 99);
        f24074h.append(i.f24450c, 27);
        f24074h.append(i.f24550n0, 32);
        f24074h.append(i.f24559o0, 33);
        f24074h.append(i.f24392V, 10);
        f24074h.append(i.f24384U, 9);
        f24074h.append(i.f24265F0, 13);
        f24074h.append(i.f24289I0, 16);
        f24074h.append(i.f24273G0, 14);
        f24074h.append(i.f24249D0, 11);
        f24074h.append(i.f24281H0, 15);
        f24074h.append(i.f24257E0, 12);
        f24074h.append(i.f24617v0, 40);
        f24074h.append(i.f24487g0, 39);
        f24074h.append(i.f24478f0, 41);
        f24074h.append(i.f24609u0, 42);
        f24074h.append(i.f24469e0, 20);
        f24074h.append(i.f24601t0, 37);
        f24074h.append(i.f24376T, 5);
        f24074h.append(i.f24496h0, 87);
        f24074h.append(i.f24577q0, 87);
        f24074h.append(i.f24523k0, 87);
        f24074h.append(i.f24328N, 87);
        f24074h.append(i.f24296J, 87);
        f24074h.append(i.f24495h, 24);
        f24074h.append(i.f24513j, 28);
        f24074h.append(i.f24616v, 31);
        f24074h.append(i.f24624w, 8);
        f24074h.append(i.f24504i, 34);
        f24074h.append(i.f24522k, 2);
        f24074h.append(i.f24477f, 23);
        f24074h.append(i.f24486g, 21);
        f24074h.append(i.f24625w0, 95);
        f24074h.append(i.f24424Z, 96);
        f24074h.append(i.f24468e, 22);
        f24074h.append(i.f24531l, 43);
        f24074h.append(i.f24640y, 44);
        f24074h.append(i.f24600t, 45);
        f24074h.append(i.f24608u, 46);
        f24074h.append(i.f24592s, 60);
        f24074h.append(i.f24576q, 47);
        f24074h.append(i.f24584r, 48);
        f24074h.append(i.f24540m, 49);
        f24074h.append(i.f24549n, 50);
        f24074h.append(i.f24558o, 51);
        f24074h.append(i.f24567p, 52);
        f24074h.append(i.f24632x, 53);
        f24074h.append(i.f24633x0, 54);
        f24074h.append(i.f24433a0, 55);
        f24074h.append(i.f24641y0, 56);
        f24074h.append(i.f24442b0, 57);
        f24074h.append(i.f24649z0, 58);
        f24074h.append(i.f24451c0, 59);
        f24074h.append(i.f24352Q, 61);
        f24074h.append(i.f24368S, 62);
        f24074h.append(i.f24360R, 63);
        f24074h.append(i.f24648z, 64);
        f24074h.append(i.f24369S0, 65);
        f24074h.append(i.f24264F, 66);
        f24074h.append(i.f24377T0, 67);
        f24074h.append(i.f24313L0, 79);
        f24074h.append(i.f24459d, 38);
        f24074h.append(i.f24305K0, 68);
        f24074h.append(i.f24225A0, 69);
        f24074h.append(i.f24460d0, 70);
        f24074h.append(i.f24297J0, 97);
        f24074h.append(i.f24248D, 71);
        f24074h.append(i.f24232B, 72);
        f24074h.append(i.f24240C, 73);
        f24074h.append(i.f24256E, 74);
        f24074h.append(i.f24224A, 75);
        f24074h.append(i.f24321M0, 76);
        f24074h.append(i.f24568p0, 77);
        f24074h.append(i.f24385U0, 78);
        f24074h.append(i.f24288I, 80);
        f24074h.append(i.f24280H, 81);
        f24074h.append(i.f24329N0, 82);
        f24074h.append(i.f24361R0, 83);
        f24074h.append(i.f24353Q0, 84);
        f24074h.append(i.f24345P0, 85);
        f24074h.append(i.f24337O0, 86);
        SparseIntArray sparseIntArray = f24075i;
        int i10 = i.f24420Y3;
        sparseIntArray.append(i10, 6);
        f24075i.append(i10, 7);
        f24075i.append(i.f24379T2, 27);
        f24075i.append(i.f24446b4, 13);
        f24075i.append(i.f24473e4, 16);
        f24075i.append(i.f24455c4, 14);
        f24075i.append(i.f24428Z3, 11);
        f24075i.append(i.f24464d4, 15);
        f24075i.append(i.f24437a4, 12);
        f24075i.append(i.f24372S3, 40);
        f24075i.append(i.f24316L3, 39);
        f24075i.append(i.f24308K3, 41);
        f24075i.append(i.f24364R3, 42);
        f24075i.append(i.f24300J3, 20);
        f24075i.append(i.f24356Q3, 37);
        f24075i.append(i.f24252D3, 5);
        f24075i.append(i.f24324M3, 87);
        f24075i.append(i.f24348P3, 87);
        f24075i.append(i.f24332N3, 87);
        f24075i.append(i.f24228A3, 87);
        f24075i.append(i.f24652z3, 87);
        f24075i.append(i.f24419Y2, 24);
        f24075i.append(i.f24436a3, 28);
        f24075i.append(i.f24544m3, 31);
        f24075i.append(i.f24553n3, 8);
        f24075i.append(i.f24427Z2, 34);
        f24075i.append(i.f24445b3, 2);
        f24075i.append(i.f24403W2, 23);
        f24075i.append(i.f24411X2, 21);
        f24075i.append(i.f24380T3, 95);
        f24075i.append(i.f24260E3, 96);
        f24075i.append(i.f24395V2, 22);
        f24075i.append(i.f24454c3, 43);
        f24075i.append(i.f24571p3, 44);
        f24075i.append(i.f24526k3, 45);
        f24075i.append(i.f24535l3, 46);
        f24075i.append(i.f24517j3, 60);
        f24075i.append(i.f24499h3, 47);
        f24075i.append(i.f24508i3, 48);
        f24075i.append(i.f24463d3, 49);
        f24075i.append(i.f24472e3, 50);
        f24075i.append(i.f24481f3, 51);
        f24075i.append(i.f24490g3, 52);
        f24075i.append(i.f24562o3, 53);
        f24075i.append(i.f24388U3, 54);
        f24075i.append(i.f24268F3, 55);
        f24075i.append(i.f24396V3, 56);
        f24075i.append(i.f24276G3, 57);
        f24075i.append(i.f24404W3, 58);
        f24075i.append(i.f24284H3, 59);
        f24075i.append(i.f24244C3, 62);
        f24075i.append(i.f24236B3, 63);
        f24075i.append(i.f24580q3, 64);
        f24075i.append(i.f24572p4, 65);
        f24075i.append(i.f24628w3, 66);
        f24075i.append(i.f24581q4, 67);
        f24075i.append(i.f24500h4, 79);
        f24075i.append(i.f24387U2, 38);
        f24075i.append(i.f24509i4, 98);
        f24075i.append(i.f24491g4, 68);
        f24075i.append(i.f24412X3, 69);
        f24075i.append(i.f24292I3, 70);
        f24075i.append(i.f24612u3, 71);
        f24075i.append(i.f24596s3, 72);
        f24075i.append(i.f24604t3, 73);
        f24075i.append(i.f24620v3, 74);
        f24075i.append(i.f24588r3, 75);
        f24075i.append(i.f24518j4, 76);
        f24075i.append(i.f24340O3, 77);
        f24075i.append(i.f24589r4, 78);
        f24075i.append(i.f24644y3, 80);
        f24075i.append(i.f24636x3, 81);
        f24075i.append(i.f24527k4, 82);
        f24075i.append(i.f24563o4, 83);
        f24075i.append(i.f24554n4, 84);
        f24075i.append(i.f24545m4, 85);
        f24075i.append(i.f24536l4, 86);
        f24075i.append(i.f24482f4, 97);
    }

    private int[] j(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objI;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objI = ((ConstraintLayout) view.getParent()).i(0, strTrim)) != null && (objI instanceof Integer)) {
                iIntValue = ((Integer) objI).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a k(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? i.f24371S2 : i.f24441b);
        s(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a l(int i10) {
        if (!this.f24081f.containsKey(Integer.valueOf(i10))) {
            this.f24081f.put(Integer.valueOf(i10), new a());
        }
        return this.f24081f.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void p(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.f23973a0 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.f23975b0 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L4e
            r4.f24135d = r2
            r4.f24156n0 = r5
            goto L70
        L4e:
            r4.f24137e = r2
            r4.f24158o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.C0347a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.C0347a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            q(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.p(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void q(Object obj, String str, int i10) throws NumberFormatException {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    r(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f24103A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0347a) {
                        ((a.C0347a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f23957L = f10;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f23958M = f10;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f24135d = 0;
                            bVar3.f24125W = f10;
                        } else {
                            bVar3.f24137e = 0;
                            bVar3.f24124V = f10;
                        }
                    } else if (obj instanceof a.C0347a) {
                        a.C0347a c0347a = (a.C0347a) obj;
                        if (i10 == 0) {
                            c0347a.b(23, 0);
                            c0347a.a(39, f10);
                        } else {
                            c0347a.b(21, 0);
                            c0347a.a(40, f10);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f23967V = fMax;
                            bVar4.f23961P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f23968W = fMax;
                            bVar4.f23962Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f24135d = 0;
                            bVar5.f24140f0 = fMax;
                            bVar5.f24128Z = 2;
                        } else {
                            bVar5.f24137e = 0;
                            bVar5.f24142g0 = fMax;
                            bVar5.f24130a0 = 2;
                        }
                    } else if (obj instanceof a.C0347a) {
                        a.C0347a c0347a2 = (a.C0347a) obj;
                        if (i10 == 0) {
                            c0347a2.b(23, 0);
                            c0347a2.b(54, 2);
                        } else {
                            c0347a2.b(21, 0);
                            c0347a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void r(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f23954I = str;
        bVar.f23955J = fAbs;
        bVar.f23956K = i10;
    }

    private void s(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            t(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f24459d && i.f24616v != index && i.f24624w != index) {
                aVar.f24085d.f24173a = true;
                aVar.f24086e.f24131b = true;
                aVar.f24084c.f24187a = true;
                aVar.f24087f.f24193a = true;
            }
            switch (f24074h.get(index)) {
                case 1:
                    b bVar = aVar.f24086e;
                    bVar.f24163r = o(typedArray, index, bVar.f24163r);
                    break;
                case 2:
                    b bVar2 = aVar.f24086e;
                    bVar2.f24113K = typedArray.getDimensionPixelSize(index, bVar2.f24113K);
                    break;
                case 3:
                    b bVar3 = aVar.f24086e;
                    bVar3.f24161q = o(typedArray, index, bVar3.f24161q);
                    break;
                case 4:
                    b bVar4 = aVar.f24086e;
                    bVar4.f24159p = o(typedArray, index, bVar4.f24159p);
                    break;
                case 5:
                    aVar.f24086e.f24103A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f24086e;
                    bVar5.f24107E = typedArray.getDimensionPixelOffset(index, bVar5.f24107E);
                    break;
                case 7:
                    b bVar6 = aVar.f24086e;
                    bVar6.f24108F = typedArray.getDimensionPixelOffset(index, bVar6.f24108F);
                    break;
                case 8:
                    b bVar7 = aVar.f24086e;
                    bVar7.f24114L = typedArray.getDimensionPixelSize(index, bVar7.f24114L);
                    break;
                case 9:
                    b bVar8 = aVar.f24086e;
                    bVar8.f24169x = o(typedArray, index, bVar8.f24169x);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    b bVar9 = aVar.f24086e;
                    bVar9.f24168w = o(typedArray, index, bVar9.f24168w);
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    b bVar10 = aVar.f24086e;
                    bVar10.f24120R = typedArray.getDimensionPixelSize(index, bVar10.f24120R);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    b bVar11 = aVar.f24086e;
                    bVar11.f24121S = typedArray.getDimensionPixelSize(index, bVar11.f24121S);
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    b bVar12 = aVar.f24086e;
                    bVar12.f24117O = typedArray.getDimensionPixelSize(index, bVar12.f24117O);
                    break;
                case 14:
                    b bVar13 = aVar.f24086e;
                    bVar13.f24119Q = typedArray.getDimensionPixelSize(index, bVar13.f24119Q);
                    break;
                case 15:
                    b bVar14 = aVar.f24086e;
                    bVar14.f24122T = typedArray.getDimensionPixelSize(index, bVar14.f24122T);
                    break;
                case 16:
                    b bVar15 = aVar.f24086e;
                    bVar15.f24118P = typedArray.getDimensionPixelSize(index, bVar15.f24118P);
                    break;
                case 17:
                    b bVar16 = aVar.f24086e;
                    bVar16.f24139f = typedArray.getDimensionPixelOffset(index, bVar16.f24139f);
                    break;
                case 18:
                    b bVar17 = aVar.f24086e;
                    bVar17.f24141g = typedArray.getDimensionPixelOffset(index, bVar17.f24141g);
                    break;
                case 19:
                    b bVar18 = aVar.f24086e;
                    bVar18.f24143h = typedArray.getFloat(index, bVar18.f24143h);
                    break;
                case 20:
                    b bVar19 = aVar.f24086e;
                    bVar19.f24170y = typedArray.getFloat(index, bVar19.f24170y);
                    break;
                case 21:
                    b bVar20 = aVar.f24086e;
                    bVar20.f24137e = typedArray.getLayoutDimension(index, bVar20.f24137e);
                    break;
                case 22:
                    C0348d c0348d = aVar.f24084c;
                    c0348d.f24188b = typedArray.getInt(index, c0348d.f24188b);
                    C0348d c0348d2 = aVar.f24084c;
                    c0348d2.f24188b = f24073g[c0348d2.f24188b];
                    break;
                case 23:
                    b bVar21 = aVar.f24086e;
                    bVar21.f24135d = typedArray.getLayoutDimension(index, bVar21.f24135d);
                    break;
                case 24:
                    b bVar22 = aVar.f24086e;
                    bVar22.f24110H = typedArray.getDimensionPixelSize(index, bVar22.f24110H);
                    break;
                case 25:
                    b bVar23 = aVar.f24086e;
                    bVar23.f24147j = o(typedArray, index, bVar23.f24147j);
                    break;
                case 26:
                    b bVar24 = aVar.f24086e;
                    bVar24.f24149k = o(typedArray, index, bVar24.f24149k);
                    break;
                case 27:
                    b bVar25 = aVar.f24086e;
                    bVar25.f24109G = typedArray.getInt(index, bVar25.f24109G);
                    break;
                case 28:
                    b bVar26 = aVar.f24086e;
                    bVar26.f24111I = typedArray.getDimensionPixelSize(index, bVar26.f24111I);
                    break;
                case 29:
                    b bVar27 = aVar.f24086e;
                    bVar27.f24151l = o(typedArray, index, bVar27.f24151l);
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    b bVar28 = aVar.f24086e;
                    bVar28.f24153m = o(typedArray, index, bVar28.f24153m);
                    break;
                case 31:
                    b bVar29 = aVar.f24086e;
                    bVar29.f24115M = typedArray.getDimensionPixelSize(index, bVar29.f24115M);
                    break;
                case 32:
                    b bVar30 = aVar.f24086e;
                    bVar30.f24166u = o(typedArray, index, bVar30.f24166u);
                    break;
                case 33:
                    b bVar31 = aVar.f24086e;
                    bVar31.f24167v = o(typedArray, index, bVar31.f24167v);
                    break;
                case 34:
                    b bVar32 = aVar.f24086e;
                    bVar32.f24112J = typedArray.getDimensionPixelSize(index, bVar32.f24112J);
                    break;
                case 35:
                    b bVar33 = aVar.f24086e;
                    bVar33.f24157o = o(typedArray, index, bVar33.f24157o);
                    break;
                case 36:
                    b bVar34 = aVar.f24086e;
                    bVar34.f24155n = o(typedArray, index, bVar34.f24155n);
                    break;
                case 37:
                    b bVar35 = aVar.f24086e;
                    bVar35.f24171z = typedArray.getFloat(index, bVar35.f24171z);
                    break;
                case 38:
                    aVar.f24082a = typedArray.getResourceId(index, aVar.f24082a);
                    break;
                case 39:
                    b bVar36 = aVar.f24086e;
                    bVar36.f24125W = typedArray.getFloat(index, bVar36.f24125W);
                    break;
                case 40:
                    b bVar37 = aVar.f24086e;
                    bVar37.f24124V = typedArray.getFloat(index, bVar37.f24124V);
                    break;
                case 41:
                    b bVar38 = aVar.f24086e;
                    bVar38.f24126X = typedArray.getInt(index, bVar38.f24126X);
                    break;
                case 42:
                    b bVar39 = aVar.f24086e;
                    bVar39.f24127Y = typedArray.getInt(index, bVar39.f24127Y);
                    break;
                case 43:
                    C0348d c0348d3 = aVar.f24084c;
                    c0348d3.f24190d = typedArray.getFloat(index, c0348d3.f24190d);
                    break;
                case 44:
                    e eVar = aVar.f24087f;
                    eVar.f24205m = true;
                    eVar.f24206n = typedArray.getDimension(index, eVar.f24206n);
                    break;
                case 45:
                    e eVar2 = aVar.f24087f;
                    eVar2.f24195c = typedArray.getFloat(index, eVar2.f24195c);
                    break;
                case 46:
                    e eVar3 = aVar.f24087f;
                    eVar3.f24196d = typedArray.getFloat(index, eVar3.f24196d);
                    break;
                case 47:
                    e eVar4 = aVar.f24087f;
                    eVar4.f24197e = typedArray.getFloat(index, eVar4.f24197e);
                    break;
                case 48:
                    e eVar5 = aVar.f24087f;
                    eVar5.f24198f = typedArray.getFloat(index, eVar5.f24198f);
                    break;
                case 49:
                    e eVar6 = aVar.f24087f;
                    eVar6.f24199g = typedArray.getDimension(index, eVar6.f24199g);
                    break;
                case 50:
                    e eVar7 = aVar.f24087f;
                    eVar7.f24200h = typedArray.getDimension(index, eVar7.f24200h);
                    break;
                case 51:
                    e eVar8 = aVar.f24087f;
                    eVar8.f24202j = typedArray.getDimension(index, eVar8.f24202j);
                    break;
                case 52:
                    e eVar9 = aVar.f24087f;
                    eVar9.f24203k = typedArray.getDimension(index, eVar9.f24203k);
                    break;
                case 53:
                    e eVar10 = aVar.f24087f;
                    eVar10.f24204l = typedArray.getDimension(index, eVar10.f24204l);
                    break;
                case 54:
                    b bVar40 = aVar.f24086e;
                    bVar40.f24128Z = typedArray.getInt(index, bVar40.f24128Z);
                    break;
                case 55:
                    b bVar41 = aVar.f24086e;
                    bVar41.f24130a0 = typedArray.getInt(index, bVar41.f24130a0);
                    break;
                case 56:
                    b bVar42 = aVar.f24086e;
                    bVar42.f24132b0 = typedArray.getDimensionPixelSize(index, bVar42.f24132b0);
                    break;
                case 57:
                    b bVar43 = aVar.f24086e;
                    bVar43.f24134c0 = typedArray.getDimensionPixelSize(index, bVar43.f24134c0);
                    break;
                case 58:
                    b bVar44 = aVar.f24086e;
                    bVar44.f24136d0 = typedArray.getDimensionPixelSize(index, bVar44.f24136d0);
                    break;
                case 59:
                    b bVar45 = aVar.f24086e;
                    bVar45.f24138e0 = typedArray.getDimensionPixelSize(index, bVar45.f24138e0);
                    break;
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    e eVar11 = aVar.f24087f;
                    eVar11.f24194b = typedArray.getFloat(index, eVar11.f24194b);
                    break;
                case 61:
                    b bVar46 = aVar.f24086e;
                    bVar46.f24104B = o(typedArray, index, bVar46.f24104B);
                    break;
                case 62:
                    b bVar47 = aVar.f24086e;
                    bVar47.f24105C = typedArray.getDimensionPixelSize(index, bVar47.f24105C);
                    break;
                case 63:
                    b bVar48 = aVar.f24086e;
                    bVar48.f24106D = typedArray.getFloat(index, bVar48.f24106D);
                    break;
                case 64:
                    c cVar = aVar.f24085d;
                    cVar.f24174b = o(typedArray, index, cVar.f24174b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f24085d.f24176d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f24085d.f24176d = Y0.b.f19187c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f24085d.f24178f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f24085d;
                    cVar2.f24181i = typedArray.getFloat(index, cVar2.f24181i);
                    break;
                case 68:
                    C0348d c0348d4 = aVar.f24084c;
                    c0348d4.f24191e = typedArray.getFloat(index, c0348d4.f24191e);
                    break;
                case 69:
                    aVar.f24086e.f24140f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f24086e.f24142g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f24086e;
                    bVar49.f24144h0 = typedArray.getInt(index, bVar49.f24144h0);
                    break;
                case 73:
                    b bVar50 = aVar.f24086e;
                    bVar50.f24146i0 = typedArray.getDimensionPixelSize(index, bVar50.f24146i0);
                    break;
                case 74:
                    aVar.f24086e.f24152l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f24086e;
                    bVar51.f24160p0 = typedArray.getBoolean(index, bVar51.f24160p0);
                    break;
                case 76:
                    c cVar3 = aVar.f24085d;
                    cVar3.f24177e = typedArray.getInt(index, cVar3.f24177e);
                    break;
                case 77:
                    aVar.f24086e.f24154m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0348d c0348d5 = aVar.f24084c;
                    c0348d5.f24189c = typedArray.getInt(index, c0348d5.f24189c);
                    break;
                case 79:
                    c cVar4 = aVar.f24085d;
                    cVar4.f24179g = typedArray.getFloat(index, cVar4.f24179g);
                    break;
                case 80:
                    b bVar52 = aVar.f24086e;
                    bVar52.f24156n0 = typedArray.getBoolean(index, bVar52.f24156n0);
                    break;
                case 81:
                    b bVar53 = aVar.f24086e;
                    bVar53.f24158o0 = typedArray.getBoolean(index, bVar53.f24158o0);
                    break;
                case 82:
                    c cVar5 = aVar.f24085d;
                    cVar5.f24175c = typedArray.getInteger(index, cVar5.f24175c);
                    break;
                case 83:
                    e eVar12 = aVar.f24087f;
                    eVar12.f24201i = o(typedArray, index, eVar12.f24201i);
                    break;
                case 84:
                    c cVar6 = aVar.f24085d;
                    cVar6.f24183k = typedArray.getInteger(index, cVar6.f24183k);
                    break;
                case 85:
                    c cVar7 = aVar.f24085d;
                    cVar7.f24182j = typedArray.getFloat(index, cVar7.f24182j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f24085d.f24186n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f24085d;
                        if (cVar8.f24186n != -1) {
                            cVar8.f24185m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f24085d.f24184l = typedArray.getString(index);
                        if (aVar.f24085d.f24184l.indexOf("/") > 0) {
                            aVar.f24085d.f24186n = typedArray.getResourceId(index, -1);
                            aVar.f24085d.f24185m = -2;
                            break;
                        } else {
                            aVar.f24085d.f24185m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f24085d;
                        cVar9.f24185m = typedArray.getInteger(index, cVar9.f24186n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f24074h.get(index));
                    break;
                case 88:
                case 89:
                case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f24074h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f24086e;
                    bVar54.f24164s = o(typedArray, index, bVar54.f24164s);
                    break;
                case 92:
                    b bVar55 = aVar.f24086e;
                    bVar55.f24165t = o(typedArray, index, bVar55.f24165t);
                    break;
                case 93:
                    b bVar56 = aVar.f24086e;
                    bVar56.f24116N = typedArray.getDimensionPixelSize(index, bVar56.f24116N);
                    break;
                case 94:
                    b bVar57 = aVar.f24086e;
                    bVar57.f24123U = typedArray.getDimensionPixelSize(index, bVar57.f24123U);
                    break;
                case 95:
                    p(aVar.f24086e, typedArray, index, 0);
                    break;
                case 96:
                    p(aVar.f24086e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f24086e;
                    bVar58.f24162q0 = typedArray.getInt(index, bVar58.f24162q0);
                    break;
            }
        }
        b bVar59 = aVar.f24086e;
        if (bVar59.f24152l0 != null) {
            bVar59.f24150k0 = null;
        }
    }

    private static void t(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0347a c0347a = new a.C0347a();
        aVar.f24089h = c0347a;
        aVar.f24085d.f24173a = false;
        aVar.f24086e.f24131b = false;
        aVar.f24084c.f24187a = false;
        aVar.f24087f.f24193a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f24075i.get(index)) {
                case 2:
                    c0347a.b(2, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24113K));
                    break;
                case 3:
                case 4:
                case 9:
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case 25:
                case 26:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f24074h.get(index));
                    break;
                case 5:
                    c0347a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0347a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f24086e.f24107E));
                    break;
                case 7:
                    c0347a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f24086e.f24108F));
                    break;
                case 8:
                    c0347a.b(8, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24114L));
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    c0347a.b(11, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24120R));
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    c0347a.b(12, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24121S));
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    c0347a.b(13, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24117O));
                    break;
                case 14:
                    c0347a.b(14, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24119Q));
                    break;
                case 15:
                    c0347a.b(15, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24122T));
                    break;
                case 16:
                    c0347a.b(16, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24118P));
                    break;
                case 17:
                    c0347a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f24086e.f24139f));
                    break;
                case 18:
                    c0347a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f24086e.f24141g));
                    break;
                case 19:
                    c0347a.a(19, typedArray.getFloat(index, aVar.f24086e.f24143h));
                    break;
                case 20:
                    c0347a.a(20, typedArray.getFloat(index, aVar.f24086e.f24170y));
                    break;
                case 21:
                    c0347a.b(21, typedArray.getLayoutDimension(index, aVar.f24086e.f24137e));
                    break;
                case 22:
                    c0347a.b(22, f24073g[typedArray.getInt(index, aVar.f24084c.f24188b)]);
                    break;
                case 23:
                    c0347a.b(23, typedArray.getLayoutDimension(index, aVar.f24086e.f24135d));
                    break;
                case 24:
                    c0347a.b(24, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24110H));
                    break;
                case 27:
                    c0347a.b(27, typedArray.getInt(index, aVar.f24086e.f24109G));
                    break;
                case 28:
                    c0347a.b(28, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24111I));
                    break;
                case 31:
                    c0347a.b(31, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24115M));
                    break;
                case 34:
                    c0347a.b(34, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24112J));
                    break;
                case 37:
                    c0347a.a(37, typedArray.getFloat(index, aVar.f24086e.f24171z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f24082a);
                    aVar.f24082a = resourceId;
                    c0347a.b(38, resourceId);
                    break;
                case 39:
                    c0347a.a(39, typedArray.getFloat(index, aVar.f24086e.f24125W));
                    break;
                case 40:
                    c0347a.a(40, typedArray.getFloat(index, aVar.f24086e.f24124V));
                    break;
                case 41:
                    c0347a.b(41, typedArray.getInt(index, aVar.f24086e.f24126X));
                    break;
                case 42:
                    c0347a.b(42, typedArray.getInt(index, aVar.f24086e.f24127Y));
                    break;
                case 43:
                    c0347a.a(43, typedArray.getFloat(index, aVar.f24084c.f24190d));
                    break;
                case 44:
                    c0347a.d(44, true);
                    c0347a.a(44, typedArray.getDimension(index, aVar.f24087f.f24206n));
                    break;
                case 45:
                    c0347a.a(45, typedArray.getFloat(index, aVar.f24087f.f24195c));
                    break;
                case 46:
                    c0347a.a(46, typedArray.getFloat(index, aVar.f24087f.f24196d));
                    break;
                case 47:
                    c0347a.a(47, typedArray.getFloat(index, aVar.f24087f.f24197e));
                    break;
                case 48:
                    c0347a.a(48, typedArray.getFloat(index, aVar.f24087f.f24198f));
                    break;
                case 49:
                    c0347a.a(49, typedArray.getDimension(index, aVar.f24087f.f24199g));
                    break;
                case 50:
                    c0347a.a(50, typedArray.getDimension(index, aVar.f24087f.f24200h));
                    break;
                case 51:
                    c0347a.a(51, typedArray.getDimension(index, aVar.f24087f.f24202j));
                    break;
                case 52:
                    c0347a.a(52, typedArray.getDimension(index, aVar.f24087f.f24203k));
                    break;
                case 53:
                    c0347a.a(53, typedArray.getDimension(index, aVar.f24087f.f24204l));
                    break;
                case 54:
                    c0347a.b(54, typedArray.getInt(index, aVar.f24086e.f24128Z));
                    break;
                case 55:
                    c0347a.b(55, typedArray.getInt(index, aVar.f24086e.f24130a0));
                    break;
                case 56:
                    c0347a.b(56, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24132b0));
                    break;
                case 57:
                    c0347a.b(57, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24134c0));
                    break;
                case 58:
                    c0347a.b(58, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24136d0));
                    break;
                case 59:
                    c0347a.b(59, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24138e0));
                    break;
                case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                    c0347a.a(60, typedArray.getFloat(index, aVar.f24087f.f24194b));
                    break;
                case 62:
                    c0347a.b(62, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24105C));
                    break;
                case 63:
                    c0347a.a(63, typedArray.getFloat(index, aVar.f24086e.f24106D));
                    break;
                case 64:
                    c0347a.b(64, o(typedArray, index, aVar.f24085d.f24174b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0347a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0347a.c(65, Y0.b.f19187c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0347a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0347a.a(67, typedArray.getFloat(index, aVar.f24085d.f24181i));
                    break;
                case 68:
                    c0347a.a(68, typedArray.getFloat(index, aVar.f24084c.f24191e));
                    break;
                case 69:
                    c0347a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0347a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0347a.b(72, typedArray.getInt(index, aVar.f24086e.f24144h0));
                    break;
                case 73:
                    c0347a.b(73, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24146i0));
                    break;
                case 74:
                    c0347a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0347a.d(75, typedArray.getBoolean(index, aVar.f24086e.f24160p0));
                    break;
                case 76:
                    c0347a.b(76, typedArray.getInt(index, aVar.f24085d.f24177e));
                    break;
                case 77:
                    c0347a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0347a.b(78, typedArray.getInt(index, aVar.f24084c.f24189c));
                    break;
                case 79:
                    c0347a.a(79, typedArray.getFloat(index, aVar.f24085d.f24179g));
                    break;
                case 80:
                    c0347a.d(80, typedArray.getBoolean(index, aVar.f24086e.f24156n0));
                    break;
                case 81:
                    c0347a.d(81, typedArray.getBoolean(index, aVar.f24086e.f24158o0));
                    break;
                case 82:
                    c0347a.b(82, typedArray.getInteger(index, aVar.f24085d.f24175c));
                    break;
                case 83:
                    c0347a.b(83, o(typedArray, index, aVar.f24087f.f24201i));
                    break;
                case 84:
                    c0347a.b(84, typedArray.getInteger(index, aVar.f24085d.f24183k));
                    break;
                case 85:
                    c0347a.a(85, typedArray.getFloat(index, aVar.f24085d.f24182j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f24085d.f24186n = typedArray.getResourceId(index, -1);
                        c0347a.b(89, aVar.f24085d.f24186n);
                        c cVar = aVar.f24085d;
                        if (cVar.f24186n != -1) {
                            cVar.f24185m = -2;
                            c0347a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f24085d.f24184l = typedArray.getString(index);
                        c0347a.c(90, aVar.f24085d.f24184l);
                        if (aVar.f24085d.f24184l.indexOf("/") > 0) {
                            aVar.f24085d.f24186n = typedArray.getResourceId(index, -1);
                            c0347a.b(89, aVar.f24085d.f24186n);
                            aVar.f24085d.f24185m = -2;
                            c0347a.b(88, -2);
                            break;
                        } else {
                            aVar.f24085d.f24185m = -1;
                            c0347a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f24085d;
                        cVar2.f24185m = typedArray.getInteger(index, cVar2.f24186n);
                        c0347a.b(88, aVar.f24085d.f24185m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f24074h.get(index));
                    break;
                case 93:
                    c0347a.b(93, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24116N));
                    break;
                case 94:
                    c0347a.b(94, typedArray.getDimensionPixelSize(index, aVar.f24086e.f24123U));
                    break;
                case 95:
                    p(c0347a, typedArray, index, 0);
                    break;
                case 96:
                    p(c0347a, typedArray, index, 1);
                    break;
                case 97:
                    c0347a.b(97, typedArray.getInt(index, aVar.f24086e.f24162q0));
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.j.f23837W0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f24082a);
                        aVar.f24082a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f24083b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f24083b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f24082a = typedArray.getResourceId(index, aVar.f24082a);
                        break;
                    }
                case Temperature.MAX_INTERNAL_PROBE /* 99 */:
                    c0347a.d(99, typedArray.getBoolean(index, aVar.f24086e.f24145i));
                    break;
            }
        }
    }

    private String u(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f24081f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f24081f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else {
                if (this.f24080e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f24081f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f24081f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f24086e.f24148j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f24086e.f24144h0);
                                barrier.setMargin(aVar.f24086e.f24146i0);
                                barrier.setAllowsGoneWidget(aVar.f24086e.f24160p0);
                                b bVar = aVar.f24086e;
                                int[] iArr = bVar.f24150k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f24152l0;
                                    if (str != null) {
                                        bVar.f24150k0 = j(barrier, str);
                                        barrier.setReferencedIds(aVar.f24086e.f24150k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.e(childAt, aVar.f24088g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0348d c0348d = aVar.f24084c;
                            if (c0348d.f24189c == 0) {
                                childAt.setVisibility(c0348d.f24188b);
                            }
                            childAt.setAlpha(aVar.f24084c.f24190d);
                            childAt.setRotation(aVar.f24087f.f24194b);
                            childAt.setRotationX(aVar.f24087f.f24195c);
                            childAt.setRotationY(aVar.f24087f.f24196d);
                            childAt.setScaleX(aVar.f24087f.f24197e);
                            childAt.setScaleY(aVar.f24087f.f24198f);
                            e eVar = aVar.f24087f;
                            if (eVar.f24201i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f24087f.f24201i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f24199g)) {
                                    childAt.setPivotX(aVar.f24087f.f24199g);
                                }
                                if (!Float.isNaN(aVar.f24087f.f24200h)) {
                                    childAt.setPivotY(aVar.f24087f.f24200h);
                                }
                            }
                            childAt.setTranslationX(aVar.f24087f.f24202j);
                            childAt.setTranslationY(aVar.f24087f.f24203k);
                            childAt.setTranslationZ(aVar.f24087f.f24204l);
                            e eVar2 = aVar.f24087f;
                            if (eVar2.f24205m) {
                                childAt.setElevation(eVar2.f24206n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f24081f.get(num);
            if (aVar2 != null) {
                if (aVar2.f24086e.f24148j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f24086e;
                    int[] iArr2 = bVar3.f24150k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f24152l0;
                        if (str2 != null) {
                            bVar3.f24150k0 = j(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f24086e.f24150k0);
                        }
                    }
                    barrier2.setType(aVar2.f24086e.f24144h0);
                    barrier2.setMargin(aVar2.f24086e.f24146i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f24086e.f24129a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f24081f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f24080e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f24081f.containsKey(Integer.valueOf(id2))) {
                this.f24081f.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f24081f.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f24088g = androidx.constraintlayout.widget.a.a(this.f24079d, childAt);
                aVar.f(id2, bVar);
                aVar.f24084c.f24188b = childAt.getVisibility();
                aVar.f24084c.f24190d = childAt.getAlpha();
                aVar.f24087f.f24194b = childAt.getRotation();
                aVar.f24087f.f24195c = childAt.getRotationX();
                aVar.f24087f.f24196d = childAt.getRotationY();
                aVar.f24087f.f24197e = childAt.getScaleX();
                aVar.f24087f.f24198f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f24087f;
                    eVar.f24199g = pivotX;
                    eVar.f24200h = pivotY;
                }
                aVar.f24087f.f24202j = childAt.getTranslationX();
                aVar.f24087f.f24203k = childAt.getTranslationY();
                aVar.f24087f.f24204l = childAt.getTranslationZ();
                e eVar2 = aVar.f24087f;
                if (eVar2.f24205m) {
                    eVar2.f24206n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f24086e.f24160p0 = barrier.getAllowsGoneWidget();
                    aVar.f24086e.f24150k0 = barrier.getReferencedIds();
                    aVar.f24086e.f24144h0 = barrier.getType();
                    aVar.f24086e.f24146i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f24081f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eVar.getChildAt(i10);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f24080e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f24081f.containsKey(Integer.valueOf(id2))) {
                this.f24081f.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f24081f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f24081f.containsKey(Integer.valueOf(i10))) {
            this.f24081f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f24081f.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f24086e;
                    bVar.f24147j = i12;
                    bVar.f24149k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + u(i13) + " undefined");
                    }
                    b bVar2 = aVar.f24086e;
                    bVar2.f24149k = i12;
                    bVar2.f24147j = -1;
                }
                aVar.f24086e.f24110H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f24086e;
                    bVar3.f24151l = i12;
                    bVar3.f24153m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + u(i13) + " undefined");
                    }
                    b bVar4 = aVar.f24086e;
                    bVar4.f24153m = i12;
                    bVar4.f24151l = -1;
                }
                aVar.f24086e.f24111I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f24086e;
                    bVar5.f24155n = i12;
                    bVar5.f24157o = -1;
                    bVar5.f24163r = -1;
                    bVar5.f24164s = -1;
                    bVar5.f24165t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + u(i13) + " undefined");
                    }
                    b bVar6 = aVar.f24086e;
                    bVar6.f24157o = i12;
                    bVar6.f24155n = -1;
                    bVar6.f24163r = -1;
                    bVar6.f24164s = -1;
                    bVar6.f24165t = -1;
                }
                aVar.f24086e.f24112J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f24086e;
                    bVar7.f24161q = i12;
                    bVar7.f24159p = -1;
                    bVar7.f24163r = -1;
                    bVar7.f24164s = -1;
                    bVar7.f24165t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + u(i13) + " undefined");
                    }
                    b bVar8 = aVar.f24086e;
                    bVar8.f24159p = i12;
                    bVar8.f24161q = -1;
                    bVar8.f24163r = -1;
                    bVar8.f24164s = -1;
                    bVar8.f24165t = -1;
                }
                aVar.f24086e.f24113K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f24086e;
                    bVar9.f24163r = i12;
                    bVar9.f24161q = -1;
                    bVar9.f24159p = -1;
                    bVar9.f24155n = -1;
                    bVar9.f24157o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f24086e;
                    bVar10.f24164s = i12;
                    bVar10.f24161q = -1;
                    bVar10.f24159p = -1;
                    bVar10.f24155n = -1;
                    bVar10.f24157o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + u(i13) + " undefined");
                }
                b bVar11 = aVar.f24086e;
                bVar11.f24165t = i12;
                bVar11.f24161q = -1;
                bVar11.f24159p = -1;
                bVar11.f24155n = -1;
                bVar11.f24157o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f24086e;
                    bVar12.f24167v = i12;
                    bVar12.f24166u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + u(i13) + " undefined");
                    }
                    b bVar13 = aVar.f24086e;
                    bVar13.f24166u = i12;
                    bVar13.f24167v = -1;
                }
                aVar.f24086e.f24115M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f24086e;
                    bVar14.f24169x = i12;
                    bVar14.f24168w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + u(i13) + " undefined");
                    }
                    b bVar15 = aVar.f24086e;
                    bVar15.f24168w = i12;
                    bVar15.f24169x = -1;
                }
                aVar.f24086e.f24114L = i14;
                return;
            default:
                throw new IllegalArgumentException(u(i11) + " to " + u(i13) + " unknown");
        }
    }

    public void i(int i10, int i11, int i12, float f10) {
        b bVar = l(i10).f24086e;
        bVar.f24104B = i11;
        bVar.f24105C = i12;
        bVar.f24106D = f10;
    }

    public void m(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarK = k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarK.f24086e.f24129a = true;
                    }
                    this.f24081f.put(Integer.valueOf(aVarK.f24082a), aVarK);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
