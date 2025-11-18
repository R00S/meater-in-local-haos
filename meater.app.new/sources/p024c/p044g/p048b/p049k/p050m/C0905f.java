package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* renamed from: c.g.b.k.m.f */
/* loaded from: classes.dex */
public class C0905f implements InterfaceC0903d {

    /* renamed from: d */
    AbstractC0915p f6111d;

    /* renamed from: f */
    int f6113f;

    /* renamed from: g */
    public int f6114g;

    /* renamed from: a */
    public InterfaceC0903d f6108a = null;

    /* renamed from: b */
    public boolean f6109b = false;

    /* renamed from: c */
    public boolean f6110c = false;

    /* renamed from: e */
    a f6112e = a.UNKNOWN;

    /* renamed from: h */
    int f6115h = 1;

    /* renamed from: i */
    C0906g f6116i = null;

    /* renamed from: j */
    public boolean f6117j = false;

    /* renamed from: k */
    List<InterfaceC0903d> f6118k = new ArrayList();

    /* renamed from: l */
    List<C0905f> f6119l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* renamed from: c.g.b.k.m.f$a */
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

    public C0905f(AbstractC0915p abstractC0915p) {
        this.f6111d = abstractC0915p;
    }

    @Override // p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    public void mo5808a(InterfaceC0903d interfaceC0903d) {
        Iterator<C0905f> it = this.f6119l.iterator();
        while (it.hasNext()) {
            if (!it.next().f6117j) {
                return;
            }
        }
        this.f6110c = true;
        InterfaceC0903d interfaceC0903d2 = this.f6108a;
        if (interfaceC0903d2 != null) {
            interfaceC0903d2.mo5808a(this);
        }
        if (this.f6109b) {
            this.f6111d.mo5808a(this);
            return;
        }
        C0905f c0905f = null;
        int i2 = 0;
        for (C0905f c0905f2 : this.f6119l) {
            if (!(c0905f2 instanceof C0906g)) {
                i2++;
                c0905f = c0905f2;
            }
        }
        if (c0905f != null && i2 == 1 && c0905f.f6117j) {
            C0906g c0906g = this.f6116i;
            if (c0906g != null) {
                if (!c0906g.f6117j) {
                    return;
                } else {
                    this.f6113f = this.f6115h * c0906g.f6114g;
                }
            }
            mo5830d(c0905f.f6114g + this.f6113f);
        }
        InterfaceC0903d interfaceC0903d3 = this.f6108a;
        if (interfaceC0903d3 != null) {
            interfaceC0903d3.mo5808a(this);
        }
    }

    /* renamed from: b */
    public void m5828b(InterfaceC0903d interfaceC0903d) {
        this.f6118k.add(interfaceC0903d);
        if (this.f6117j) {
            interfaceC0903d.mo5808a(interfaceC0903d);
        }
    }

    /* renamed from: c */
    public void m5829c() {
        this.f6119l.clear();
        this.f6118k.clear();
        this.f6117j = false;
        this.f6114g = 0;
        this.f6110c = false;
        this.f6109b = false;
    }

    /* renamed from: d */
    public void mo5830d(int i2) {
        if (this.f6117j) {
            return;
        }
        this.f6117j = true;
        this.f6114g = i2;
        for (InterfaceC0903d interfaceC0903d : this.f6118k) {
            interfaceC0903d.mo5808a(interfaceC0903d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6111d.f6160b.m5728r());
        sb.append(":");
        sb.append(this.f6112e);
        sb.append("(");
        sb.append(this.f6117j ? Integer.valueOf(this.f6114g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6119l.size());
        sb.append(":d=");
        sb.append(this.f6118k.size());
        sb.append(">");
        return sb.toString();
    }
}
