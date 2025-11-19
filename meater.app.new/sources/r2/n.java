package r2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import r2.n;

/* compiled from: SlidingPercentile.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f48390h = new Comparator() { // from class: r2.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.g((n.b) obj, (n.b) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f48391i = new Comparator() { // from class: r2.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.h((n.b) obj, (n.b) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f48392a;

    /* renamed from: e, reason: collision with root package name */
    private int f48396e;

    /* renamed from: f, reason: collision with root package name */
    private int f48397f;

    /* renamed from: g, reason: collision with root package name */
    private int f48398g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f48394c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f48393b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f48395d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SlidingPercentile.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f48399a;

        /* renamed from: b, reason: collision with root package name */
        public int f48400b;

        /* renamed from: c, reason: collision with root package name */
        public float f48401c;

        private b() {
        }
    }

    public n(int i10) {
        this.f48392a = i10;
    }

    private void d() {
        if (this.f48395d != 1) {
            Collections.sort(this.f48393b, f48390h);
            this.f48395d = 1;
        }
    }

    private void e() {
        if (this.f48395d != 0) {
            Collections.sort(this.f48393b, f48391i);
            this.f48395d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f48399a - bVar2.f48399a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f48401c, bVar2.f48401c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f48398g;
        if (i11 > 0) {
            b[] bVarArr = this.f48394c;
            int i12 = i11 - 1;
            this.f48398g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f48396e;
        this.f48396e = i13 + 1;
        bVar.f48399a = i13;
        bVar.f48400b = i10;
        bVar.f48401c = f10;
        this.f48393b.add(bVar);
        this.f48397f += i10;
        while (true) {
            int i14 = this.f48397f;
            int i15 = this.f48392a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f48393b.get(0);
            int i17 = bVar2.f48400b;
            if (i17 <= i16) {
                this.f48397f -= i17;
                this.f48393b.remove(0);
                int i18 = this.f48398g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f48394c;
                    this.f48398g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f48400b = i17 - i16;
                this.f48397f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f48397f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48393b.size(); i11++) {
            b bVar = this.f48393b.get(i11);
            i10 += bVar.f48400b;
            if (i10 >= f11) {
                return bVar.f48401c;
            }
        }
        if (this.f48393b.isEmpty()) {
            return Float.NaN;
        }
        return this.f48393b.get(r5.size() - 1).f48401c;
    }

    public void i() {
        this.f48393b.clear();
        this.f48395d = -1;
        this.f48396e = 0;
        this.f48397f = 0;
    }
}
