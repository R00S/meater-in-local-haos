package p024c.p044g.p048b.p049k.p050m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.p049k.C0889b;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0893f;

/* compiled from: WidgetGroup.java */
/* renamed from: c.g.b.k.m.o */
/* loaded from: classes.dex */
public class C0914o {

    /* renamed from: a */
    static int f6144a;

    /* renamed from: c */
    int f6146c;

    /* renamed from: e */
    int f6148e;

    /* renamed from: b */
    ArrayList<C0892e> f6145b = new ArrayList<>();

    /* renamed from: d */
    boolean f6147d = false;

    /* renamed from: f */
    ArrayList<a> f6149f = null;

    /* renamed from: g */
    private int f6150g = -1;

    /* compiled from: WidgetGroup.java */
    /* renamed from: c.g.b.k.m.o$a */
    class a {

        /* renamed from: a */
        WeakReference<C0892e> f6151a;

        /* renamed from: b */
        int f6152b;

        /* renamed from: c */
        int f6153c;

        /* renamed from: d */
        int f6154d;

        /* renamed from: e */
        int f6155e;

        /* renamed from: f */
        int f6156f;

        /* renamed from: g */
        int f6157g;

        public a(C0892e c0892e, C0881d c0881d, int i2) {
            this.f6151a = new WeakReference<>(c0892e);
            this.f6152b = c0881d.m5584x(c0892e.f5951I);
            this.f6153c = c0881d.m5584x(c0892e.f5952J);
            this.f6154d = c0881d.m5584x(c0892e.f5953K);
            this.f6155e = c0881d.m5584x(c0892e.f5954L);
            this.f6156f = c0881d.m5584x(c0892e.f5955M);
            this.f6157g = i2;
        }
    }

    public C0914o(int i2) {
        this.f6146c = -1;
        this.f6148e = 0;
        int i3 = f6144a;
        f6144a = i3 + 1;
        this.f6146c = i3;
        this.f6148e = i2;
    }

    /* renamed from: e */
    private String m5853e() {
        int i2 = this.f6148e;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m5854j(C0881d c0881d, ArrayList<C0892e> arrayList, int i2) {
        int iM5584x;
        int iM5584x2;
        C0893f c0893f = (C0893f) arrayList.get(0).m5668I();
        c0881d.m5566D();
        c0893f.mo5618g(c0881d, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).mo5618g(c0881d, false);
        }
        if (i2 == 0 && c0893f.f6037O0 > 0) {
            C0889b.m5626b(c0893f, c0881d, arrayList, 0);
        }
        if (i2 == 1 && c0893f.f6038P0 > 0) {
            C0889b.m5626b(c0893f, c0881d, arrayList, 1);
        }
        try {
            c0881d.m5585z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f6149f = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f6149f.add(new a(arrayList.get(i4), c0881d, i2));
        }
        if (i2 == 0) {
            iM5584x = c0881d.m5584x(c0893f.f5951I);
            iM5584x2 = c0881d.m5584x(c0893f.f5953K);
            c0881d.m5566D();
        } else {
            iM5584x = c0881d.m5584x(c0893f.f5952J);
            iM5584x2 = c0881d.m5584x(c0893f.f5954L);
            c0881d.m5566D();
        }
        return iM5584x2 - iM5584x;
    }

    /* renamed from: a */
    public boolean m5855a(C0892e c0892e) {
        if (this.f6145b.contains(c0892e)) {
            return false;
        }
        this.f6145b.add(c0892e);
        return true;
    }

    /* renamed from: b */
    public void m5856b(ArrayList<C0914o> arrayList) {
        int size = this.f6145b.size();
        if (this.f6150g != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C0914o c0914o = arrayList.get(i2);
                if (this.f6150g == c0914o.f6146c) {
                    m5860g(this.f6148e, c0914o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m5857c() {
        return this.f6146c;
    }

    /* renamed from: d */
    public int m5858d() {
        return this.f6148e;
    }

    /* renamed from: f */
    public int m5859f(C0881d c0881d, int i2) {
        if (this.f6145b.size() == 0) {
            return 0;
        }
        return m5854j(c0881d, this.f6145b, i2);
    }

    /* renamed from: g */
    public void m5860g(int i2, C0914o c0914o) {
        Iterator<C0892e> it = this.f6145b.iterator();
        while (it.hasNext()) {
            C0892e next = it.next();
            c0914o.m5855a(next);
            if (i2 == 0) {
                next.f5943B0 = c0914o.m5857c();
            } else {
                next.f5945C0 = c0914o.m5857c();
            }
        }
        this.f6150g = c0914o.f6146c;
    }

    /* renamed from: h */
    public void m5861h(boolean z) {
        this.f6147d = z;
    }

    /* renamed from: i */
    public void m5862i(int i2) {
        this.f6148e = i2;
    }

    public String toString() {
        String str = m5853e() + " [" + this.f6146c + "] <";
        Iterator<C0892e> it = this.f6145b.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().m5728r();
        }
        return str + " >";
    }
}
