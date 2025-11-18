package Z9;

import aa.C1918b;
import aa.C1919c;
import aa.d;
import aa.e;
import aa.f;
import aa.g;
import aa.h;
import aa.i;
import aa.j;
import aa.k;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: Drawer.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private C1918b f19611a;

    /* renamed from: b, reason: collision with root package name */
    private C1919c f19612b;

    /* renamed from: c, reason: collision with root package name */
    private g f19613c;

    /* renamed from: d, reason: collision with root package name */
    private k f19614d;

    /* renamed from: e, reason: collision with root package name */
    private h f19615e;

    /* renamed from: f, reason: collision with root package name */
    private e f19616f;

    /* renamed from: g, reason: collision with root package name */
    private j f19617g;

    /* renamed from: h, reason: collision with root package name */
    private d f19618h;

    /* renamed from: i, reason: collision with root package name */
    private i f19619i;

    /* renamed from: j, reason: collision with root package name */
    private f f19620j;

    /* renamed from: k, reason: collision with root package name */
    private int f19621k;

    /* renamed from: l, reason: collision with root package name */
    private int f19622l;

    /* renamed from: m, reason: collision with root package name */
    private int f19623m;

    public a(Y9.a aVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f19611a = new C1918b(paint, aVar);
        this.f19612b = new C1919c(paint, aVar);
        this.f19613c = new g(paint, aVar);
        this.f19614d = new k(paint, aVar);
        this.f19615e = new h(paint, aVar);
        this.f19616f = new e(paint, aVar);
        this.f19617g = new j(paint, aVar);
        this.f19618h = new d(paint, aVar);
        this.f19619i = new i(paint, aVar);
        this.f19620j = new f(paint, aVar);
    }

    public void a(Canvas canvas, boolean z10) {
        if (this.f19612b != null) {
            this.f19611a.a(canvas, this.f19621k, z10, this.f19622l, this.f19623m);
        }
    }

    public void b(Canvas canvas, T9.a aVar) {
        C1919c c1919c = this.f19612b;
        if (c1919c != null) {
            c1919c.a(canvas, aVar, this.f19621k, this.f19622l, this.f19623m);
        }
    }

    public void c(Canvas canvas, T9.a aVar) {
        d dVar = this.f19618h;
        if (dVar != null) {
            dVar.a(canvas, aVar, this.f19622l, this.f19623m);
        }
    }

    public void d(Canvas canvas, T9.a aVar) {
        e eVar = this.f19616f;
        if (eVar != null) {
            eVar.a(canvas, aVar, this.f19621k, this.f19622l, this.f19623m);
        }
    }

    public void e(Canvas canvas, T9.a aVar) {
        g gVar = this.f19613c;
        if (gVar != null) {
            gVar.a(canvas, aVar, this.f19621k, this.f19622l, this.f19623m);
        }
    }

    public void f(Canvas canvas, T9.a aVar) {
        f fVar = this.f19620j;
        if (fVar != null) {
            fVar.a(canvas, aVar, this.f19621k, this.f19622l, this.f19623m);
        }
    }

    public void g(Canvas canvas, T9.a aVar) {
        h hVar = this.f19615e;
        if (hVar != null) {
            hVar.a(canvas, aVar, this.f19622l, this.f19623m);
        }
    }

    public void h(Canvas canvas, T9.a aVar) {
        i iVar = this.f19619i;
        if (iVar != null) {
            iVar.a(canvas, aVar, this.f19621k, this.f19622l, this.f19623m);
        }
    }

    public void i(Canvas canvas, T9.a aVar) {
        j jVar = this.f19617g;
        if (jVar != null) {
            jVar.a(canvas, aVar, this.f19622l, this.f19623m);
        }
    }

    public void j(Canvas canvas, T9.a aVar) {
        k kVar = this.f19614d;
        if (kVar != null) {
            kVar.a(canvas, aVar, this.f19622l, this.f19623m);
        }
    }

    public void k(int i10, int i11, int i12) {
        this.f19621k = i10;
        this.f19622l = i11;
        this.f19623m = i12;
    }
}
