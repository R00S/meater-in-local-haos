package androidx.media3.exoplayer.dash;

import U1.H;
import U1.s;
import X1.L;
import a2.n;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.f;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.G;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import d2.I;
import e2.v1;
import g2.C3382b;
import h2.C3485a;
import h2.g;
import h2.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import n2.InterfaceC4057e;
import n2.x;
import o2.C4106h;
import r2.k;

/* compiled from: DashMediaPeriod.java */
/* loaded from: classes.dex */
final class c implements q, G.a<C4106h<androidx.media3.exoplayer.dash.a>>, C4106h.b<androidx.media3.exoplayer.dash.a> {

    /* renamed from: b0, reason: collision with root package name */
    private static final Pattern f26944b0 = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: c0, reason: collision with root package name */
    private static final Pattern f26945c0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: B, reason: collision with root package name */
    final int f26946B;

    /* renamed from: C, reason: collision with root package name */
    private final a.InterfaceC0377a f26947C;

    /* renamed from: D, reason: collision with root package name */
    private final n f26948D;

    /* renamed from: E, reason: collision with root package name */
    private final i f26949E;

    /* renamed from: F, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f26950F;

    /* renamed from: G, reason: collision with root package name */
    private final C3382b f26951G;

    /* renamed from: H, reason: collision with root package name */
    private final long f26952H;

    /* renamed from: I, reason: collision with root package name */
    private final k f26953I;

    /* renamed from: J, reason: collision with root package name */
    private final r2.b f26954J;

    /* renamed from: K, reason: collision with root package name */
    private final x f26955K;

    /* renamed from: L, reason: collision with root package name */
    private final a[] f26956L;

    /* renamed from: M, reason: collision with root package name */
    private final InterfaceC4057e f26957M;

    /* renamed from: N, reason: collision with root package name */
    private final f f26958N;

    /* renamed from: P, reason: collision with root package name */
    private final s.a f26960P;

    /* renamed from: Q, reason: collision with root package name */
    private final h.a f26961Q;

    /* renamed from: R, reason: collision with root package name */
    private final v1 f26962R;

    /* renamed from: S, reason: collision with root package name */
    private q.a f26963S;

    /* renamed from: V, reason: collision with root package name */
    private G f26966V;

    /* renamed from: W, reason: collision with root package name */
    private h2.c f26967W;

    /* renamed from: X, reason: collision with root package name */
    private int f26968X;

    /* renamed from: Y, reason: collision with root package name */
    private List<h2.f> f26969Y;

    /* renamed from: a0, reason: collision with root package name */
    private long f26971a0;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f26970Z = true;

    /* renamed from: T, reason: collision with root package name */
    private C4106h<androidx.media3.exoplayer.dash.a>[] f26964T = G(0);

    /* renamed from: U, reason: collision with root package name */
    private e[] f26965U = new e[0];

    /* renamed from: O, reason: collision with root package name */
    private final IdentityHashMap<C4106h<androidx.media3.exoplayer.dash.a>, f.c> f26959O = new IdentityHashMap<>();

    /* compiled from: DashMediaPeriod.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f26972a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26973b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26974c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26975d;

        /* renamed from: e, reason: collision with root package name */
        public final int f26976e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26977f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26978g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC4009y<U1.s> f26979h;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, AbstractC4009y<U1.s> abstractC4009y) {
            this.f26973b = i10;
            this.f26972a = iArr;
            this.f26974c = i11;
            this.f26976e = i12;
            this.f26977f = i13;
            this.f26978g = i14;
            this.f26975d = i15;
            this.f26979h = abstractC4009y;
        }

        public static a a(int[] iArr, int i10, AbstractC4009y<U1.s> abstractC4009y) {
            return new a(3, 1, iArr, i10, -1, -1, -1, abstractC4009y);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1, AbstractC4009y.G());
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10, AbstractC4009y.G());
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1, AbstractC4009y.G());
        }
    }

    public c(int i10, h2.c cVar, C3382b c3382b, int i11, a.InterfaceC0377a interfaceC0377a, n nVar, r2.e eVar, i iVar, h.a aVar, androidx.media3.exoplayer.upstream.b bVar, s.a aVar2, long j10, k kVar, r2.b bVar2, InterfaceC4057e interfaceC4057e, f.b bVar3, v1 v1Var) {
        this.f26946B = i10;
        this.f26967W = cVar;
        this.f26951G = c3382b;
        this.f26968X = i11;
        this.f26947C = interfaceC0377a;
        this.f26948D = nVar;
        this.f26949E = iVar;
        this.f26961Q = aVar;
        this.f26950F = bVar;
        this.f26960P = aVar2;
        this.f26952H = j10;
        this.f26953I = kVar;
        this.f26954J = bVar2;
        this.f26957M = interfaceC4057e;
        this.f26962R = v1Var;
        this.f26958N = new f(cVar, bVar3, bVar2);
        this.f26966V = interfaceC4057e.b();
        g gVarD = cVar.d(i11);
        List<h2.f> list = gVarD.f42255d;
        this.f26969Y = list;
        Pair<x, a[]> pairT = t(iVar, interfaceC0377a, gVarD.f42254c, list);
        this.f26955K = (x) pairT.first;
        this.f26956L = (a[]) pairT.second;
    }

    private int A(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f26956L[i11].f26976e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f26956L[i14].f26974c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] B(q2.x[] xVarArr) {
        int[] iArr = new int[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            q2.x xVar = xVarArr[i10];
            if (xVar != null) {
                iArr[i10] = this.f26955K.d(xVar.b());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean C(List<C3485a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f42209c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f42270e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int D(int i10, List<C3485a> list, int[][] iArr, boolean[] zArr, U1.s[][] sVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (C(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            U1.s[] sVarArrY = y(list, iArr[i12]);
            sVarArr[i12] = sVarArrY;
            if (sVarArrY.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List E(C4106h c4106h) {
        return AbstractC4009y.H(Integer.valueOf(c4106h.f46357B));
    }

    private static void F(a.InterfaceC0377a interfaceC0377a, U1.s[] sVarArr) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            sVarArr[i10] = interfaceC0377a.c(sVarArr[i10]);
        }
    }

    private static C4106h<androidx.media3.exoplayer.dash.a>[] G(int i10) {
        return new C4106h[i10];
    }

    private static U1.s[] I(h2.e eVar, Pattern pattern, U1.s sVar) throws NumberFormatException {
        String str = eVar.f42245b;
        if (str == null) {
            return new U1.s[]{sVar};
        }
        String[] strArrL1 = L.l1(str, ";");
        U1.s[] sVarArr = new U1.s[strArrL1.length];
        for (int i10 = 0; i10 < strArrL1.length; i10++) {
            Matcher matcher = pattern.matcher(strArrL1[i10]);
            if (!matcher.matches()) {
                return new U1.s[]{sVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            sVarArr[i10] = sVar.b().e0(sVar.f17148a + ":" + i11).N(i11).i0(matcher.group(2)).M();
        }
        return sVarArr;
    }

    private void K(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (xVarArr[i10] == null || !zArr[i10]) {
                n2.s sVar = sVarArr[i10];
                if (sVar instanceof C4106h) {
                    ((C4106h) sVar).R(this);
                } else if (sVar instanceof C4106h.a) {
                    ((C4106h.a) sVar).c();
                }
                sVarArr[i10] = null;
            }
        }
    }

    private void L(q2.x[] xVarArr, n2.s[] sVarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            n2.s sVar = sVarArr[i10];
            if ((sVar instanceof n2.h) || (sVar instanceof C4106h.a)) {
                int iA = A(i10, iArr);
                if (iA == -1) {
                    z10 = sVarArr[i10] instanceof n2.h;
                } else {
                    n2.s sVar2 = sVarArr[i10];
                    z10 = (sVar2 instanceof C4106h.a) && ((C4106h.a) sVar2).f46382B == sVarArr[iA];
                }
                if (!z10) {
                    n2.s sVar3 = sVarArr[i10];
                    if (sVar3 instanceof C4106h.a) {
                        ((C4106h.a) sVar3).c();
                    }
                    sVarArr[i10] = null;
                }
            }
        }
    }

    private void M(q2.x[] xVarArr, n2.s[] sVarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            q2.x xVar = xVarArr[i10];
            if (xVar != null) {
                n2.s sVar = sVarArr[i10];
                if (sVar == null) {
                    zArr[i10] = true;
                    a aVar = this.f26956L[iArr[i10]];
                    int i11 = aVar.f26974c;
                    if (i11 == 0) {
                        sVarArr[i10] = p(aVar, xVar, j10);
                    } else if (i11 == 2) {
                        sVarArr[i10] = new e(this.f26969Y.get(aVar.f26975d), xVar.b().a(0), this.f26967W.f42220d);
                    }
                } else if (sVar instanceof C4106h) {
                    ((androidx.media3.exoplayer.dash.a) ((C4106h) sVar).G()).f(xVar);
                }
            }
        }
        for (int i12 = 0; i12 < xVarArr.length; i12++) {
            if (sVarArr[i12] == null && xVarArr[i12] != null) {
                a aVar2 = this.f26956L[iArr[i12]];
                if (aVar2.f26974c == 1) {
                    int iA = A(i12, iArr);
                    if (iA == -1) {
                        sVarArr[i12] = new n2.h();
                    } else {
                        sVarArr[i12] = ((C4106h) sVarArr[iA]).U(j10, aVar2.f26973b);
                    }
                }
            }
        }
    }

    private static void n(List<h2.f> list, H[] hArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            h2.f fVar = list.get(i11);
            hArr[i10] = new H(fVar.a() + ":" + i11, new s.b().e0(fVar.a()).s0("application/x-emsg").M());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int o(i iVar, a.InterfaceC0377a interfaceC0377a, List<C3485a> list, int[][] iArr, int i10, boolean[] zArr, U1.s[][] sVarArr, H[] hArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f42209c);
            }
            int size = arrayList.size();
            U1.s[] sVarArr2 = new U1.s[size];
            for (int i16 = 0; i16 < size; i16++) {
                U1.s sVar = ((j) arrayList.get(i16)).f42267b;
                sVarArr2[i16] = sVar.b().U(iVar.d(sVar)).M();
            }
            C3485a c3485a = list.get(iArr2[0]);
            long j10 = c3485a.f42207a;
            String string = j10 != -1 ? Long.toString(j10) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i14 + 2;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (sVarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            F(interfaceC0377a, sVarArr2);
            hArr[i14] = new H(string, sVarArr2);
            aVarArr[i14] = a.d(c3485a.f42208b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                String str = string + ":emsg";
                hArr[i17] = new H(str, new s.b().e0(str).s0("application/x-emsg").M());
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                aVarArr[i11] = a.a(iArr2, i14, AbstractC4009y.D(sVarArr[i13]));
                F(interfaceC0377a, sVarArr[i13]);
                hArr[i11] = new H(string + ":cc", sVarArr[i13]);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private C4106h<androidx.media3.exoplayer.dash.a> p(a aVar, q2.x xVar, long j10) {
        int i10;
        H hB;
        int i11;
        int i12 = aVar.f26977f;
        boolean z10 = i12 != -1;
        f.c cVarK = null;
        if (z10) {
            hB = this.f26955K.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            hB = null;
        }
        int i13 = aVar.f26978g;
        AbstractC4009y<U1.s> abstractC4009yG = i13 != -1 ? this.f26956L[i13].f26979h : AbstractC4009y.G();
        int size = i10 + abstractC4009yG.size();
        U1.s[] sVarArr = new U1.s[size];
        int[] iArr = new int[size];
        if (z10) {
            sVarArr[0] = hB.a(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < abstractC4009yG.size(); i14++) {
            U1.s sVar = abstractC4009yG.get(i14);
            sVarArr[i11] = sVar;
            iArr[i11] = 3;
            arrayList.add(sVar);
            i11++;
        }
        if (this.f26967W.f42220d && z10) {
            cVarK = this.f26958N.k();
        }
        f.c cVar = cVarK;
        C4106h<androidx.media3.exoplayer.dash.a> c4106h = new C4106h<>(aVar.f26973b, iArr, sVarArr, this.f26947C.d(this.f26953I, this.f26967W, this.f26951G, this.f26968X, aVar.f26972a, xVar, aVar.f26973b, this.f26952H, z10, arrayList, cVar, this.f26948D, this.f26962R, null), this, this.f26954J, j10, this.f26949E, this.f26961Q, this.f26950F, this.f26960P, this.f26970Z, null);
        synchronized (this) {
            this.f26959O.put(c4106h, cVar);
        }
        return c4106h;
    }

    private static Pair<x, a[]> t(i iVar, a.InterfaceC0377a interfaceC0377a, List<C3485a> list, List<h2.f> list2) {
        int[][] iArrZ = z(list);
        int length = iArrZ.length;
        boolean[] zArr = new boolean[length];
        U1.s[][] sVarArr = new U1.s[length][];
        int iD = D(length, list, iArrZ, zArr, sVarArr) + length + list2.size();
        H[] hArr = new H[iD];
        a[] aVarArr = new a[iD];
        n(list2, hArr, aVarArr, o(iVar, interfaceC0377a, list, iArrZ, length, zArr, sVarArr, hArr, aVarArr));
        return Pair.create(new x(hArr), aVarArr);
    }

    private static h2.e v(List<h2.e> list) {
        return w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static h2.e w(List<h2.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            h2.e eVar = list.get(i10);
            if (str.equals(eVar.f42244a)) {
                return eVar;
            }
        }
        return null;
    }

    private static h2.e x(List<h2.e> list) {
        return w(list, "http://dashif.org/guidelines/trickmode");
    }

    private static U1.s[] y(List<C3485a> list, int[] iArr) {
        for (int i10 : iArr) {
            C3485a c3485a = list.get(i10);
            List<h2.e> list2 = list.get(i10).f42210d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                h2.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f42244a)) {
                    return I(eVar, f26944b0, new s.b().s0("application/cea-608").e0(c3485a.f42207a + ":cea608").M());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f42244a)) {
                    return I(eVar, f26945c0, new s.b().s0("application/cea-708").e0(c3485a.f42207a + ":cea708").M());
                }
            }
        }
        return new U1.s[0];
    }

    private static int[][] z(List<C3485a> list) {
        h2.e eVarV;
        Integer num;
        int size = list.size();
        HashMap mapG = m8.L.g(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            mapG.put(Long.valueOf(list.get(i10).f42207a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            C3485a c3485a = list.get(i11);
            h2.e eVarX = x(c3485a.f42211e);
            if (eVarX == null) {
                eVarX = x(c3485a.f42212f);
            }
            int iIntValue = (eVarX == null || (num = (Integer) mapG.get(Long.valueOf(Long.parseLong(eVarX.f42245b)))) == null) ? i11 : num.intValue();
            if (iIntValue == i11 && (eVarV = v(c3485a.f42212f)) != null) {
                for (String str : L.l1(eVarV.f42245b, ",")) {
                    Integer num2 = (Integer) mapG.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrL = p8.f.l((Collection) arrayList.get(i12));
            iArr[i12] = iArrL;
            Arrays.sort(iArrL);
        }
        return iArr;
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void i(C4106h<androidx.media3.exoplayer.dash.a> c4106h) {
        this.f26963S.i(this);
    }

    public void J() {
        this.f26958N.o();
        for (C4106h<androidx.media3.exoplayer.dash.a> c4106h : this.f26964T) {
            c4106h.R(this);
        }
        this.f26963S = null;
    }

    public void N(h2.c cVar, int i10) {
        this.f26967W = cVar;
        this.f26968X = i10;
        this.f26958N.q(cVar);
        C4106h<androidx.media3.exoplayer.dash.a>[] c4106hArr = this.f26964T;
        if (c4106hArr != null) {
            for (C4106h<androidx.media3.exoplayer.dash.a> c4106h : c4106hArr) {
                ((androidx.media3.exoplayer.dash.a) c4106h.G()).g(cVar, i10);
            }
            this.f26963S.i(this);
        }
        this.f26969Y = cVar.d(i10).f42255d;
        for (e eVar : this.f26965U) {
            Iterator<h2.f> it = this.f26969Y.iterator();
            while (true) {
                if (it.hasNext()) {
                    h2.f next = it.next();
                    if (next.a().equals(eVar.b())) {
                        eVar.d(next, cVar.f42220d && i10 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // o2.C4106h.b
    public synchronized void a(C4106h<androidx.media3.exoplayer.dash.a> c4106h) {
        f.c cVarRemove = this.f26959O.remove(c4106h);
        if (cVarRemove != null) {
            cVarRemove.n();
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        return this.f26966V.b(w10);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return this.f26966V.c();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, I i10) {
        for (C4106h<androidx.media3.exoplayer.dash.a> c4106h : this.f26964T) {
            if (c4106h.f46357B == 2) {
                return c4106h.d(j10, i10);
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f26966V.e();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        return this.f26966V.g();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
        this.f26966V.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        int[] iArrB = B(xVarArr);
        K(xVarArr, zArr, sVarArr);
        L(xVarArr, sVarArr, iArrB);
        M(xVarArr, sVarArr, zArr2, j10, iArrB);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (n2.s sVar : sVarArr) {
            if (sVar instanceof C4106h) {
                arrayList.add((C4106h) sVar);
            } else if (sVar instanceof e) {
                arrayList2.add((e) sVar);
            }
        }
        C4106h<androidx.media3.exoplayer.dash.a>[] c4106hArrG = G(arrayList.size());
        this.f26964T = c4106hArrG;
        arrayList.toArray(c4106hArrG);
        e[] eVarArr = new e[arrayList2.size()];
        this.f26965U = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f26966V = this.f26957M.a(arrayList, m8.H.l(arrayList, new InterfaceC3914g() { // from class: androidx.media3.exoplayer.dash.b
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return c.E((C4106h) obj);
            }
        }));
        if (this.f26970Z) {
            this.f26970Z = false;
            this.f26971a0 = j10;
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() {
        this.f26953I.a();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        for (C4106h<androidx.media3.exoplayer.dash.a> c4106h : this.f26964T) {
            c4106h.T(j10);
        }
        for (e eVar : this.f26965U) {
            eVar.c(j10);
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        for (C4106h<androidx.media3.exoplayer.dash.a> c4106h : this.f26964T) {
            if (c4106h.C()) {
                return this.f26971a0;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        this.f26963S = aVar;
        aVar.f(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public x s() {
        return this.f26955K;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        for (C4106h<androidx.media3.exoplayer.dash.a> c4106h : this.f26964T) {
            c4106h.u(j10, z10);
        }
    }
}
