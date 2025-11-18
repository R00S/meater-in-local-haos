package b1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2201f implements InterfaceC2199d {

    /* renamed from: d, reason: collision with root package name */
    p f30024d;

    /* renamed from: f, reason: collision with root package name */
    int f30026f;

    /* renamed from: g, reason: collision with root package name */
    public int f30027g;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2199d f30021a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30022b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30023c = false;

    /* renamed from: e, reason: collision with root package name */
    a f30025e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f30028h = 1;

    /* renamed from: i, reason: collision with root package name */
    C2202g f30029i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30030j = false;

    /* renamed from: k, reason: collision with root package name */
    List<InterfaceC2199d> f30031k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<C2201f> f30032l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* renamed from: b1.f$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C2201f(p pVar) {
        this.f30024d = pVar;
    }

    @Override // b1.InterfaceC2199d
    public void a(InterfaceC2199d interfaceC2199d) {
        Iterator<C2201f> it = this.f30032l.iterator();
        while (it.hasNext()) {
            if (!it.next().f30030j) {
                return;
            }
        }
        this.f30023c = true;
        InterfaceC2199d interfaceC2199d2 = this.f30021a;
        if (interfaceC2199d2 != null) {
            interfaceC2199d2.a(this);
        }
        if (this.f30022b) {
            this.f30024d.a(this);
            return;
        }
        C2201f c2201f = null;
        int i10 = 0;
        for (C2201f c2201f2 : this.f30032l) {
            if (!(c2201f2 instanceof C2202g)) {
                i10++;
                c2201f = c2201f2;
            }
        }
        if (c2201f != null && i10 == 1 && c2201f.f30030j) {
            C2202g c2202g = this.f30029i;
            if (c2202g != null) {
                if (!c2202g.f30030j) {
                    return;
                } else {
                    this.f30026f = this.f30028h * c2202g.f30027g;
                }
            }
            d(c2201f.f30027g + this.f30026f);
        }
        InterfaceC2199d interfaceC2199d3 = this.f30021a;
        if (interfaceC2199d3 != null) {
            interfaceC2199d3.a(this);
        }
    }

    public void b(InterfaceC2199d interfaceC2199d) {
        this.f30031k.add(interfaceC2199d);
        if (this.f30030j) {
            interfaceC2199d.a(interfaceC2199d);
        }
    }

    public void c() {
        this.f30032l.clear();
        this.f30031k.clear();
        this.f30030j = false;
        this.f30027g = 0;
        this.f30023c = false;
        this.f30022b = false;
    }

    public void d(int i10) {
        if (this.f30030j) {
            return;
        }
        this.f30030j = true;
        this.f30027g = i10;
        for (InterfaceC2199d interfaceC2199d : this.f30031k) {
            interfaceC2199d.a(interfaceC2199d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30024d.f30074b.t());
        sb2.append(":");
        sb2.append(this.f30025e);
        sb2.append("(");
        sb2.append(this.f30030j ? Integer.valueOf(this.f30027g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f30032l.size());
        sb2.append(":d=");
        sb2.append(this.f30031k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
