package p024c.p044g.p048b.p049k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p024c.p044g.p048b.C0880c;
import p024c.p044g.p048b.C0886i;
import p024c.p044g.p048b.p049k.p050m.C0908i;
import p024c.p044g.p048b.p049k.p050m.C0914o;

/* compiled from: ConstraintAnchor.java */
/* renamed from: c.g.b.k.d */
/* loaded from: classes.dex */
public class C0891d {

    /* renamed from: b */
    private int f5920b;

    /* renamed from: c */
    private boolean f5921c;

    /* renamed from: d */
    public final C0892e f5922d;

    /* renamed from: e */
    public final b f5923e;

    /* renamed from: f */
    public C0891d f5924f;

    /* renamed from: i */
    C0886i f5927i;

    /* renamed from: a */
    private HashSet<C0891d> f5919a = null;

    /* renamed from: g */
    public int f5925g = 0;

    /* renamed from: h */
    int f5926h = -1;

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: c.g.b.k.d$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5928a;

        static {
            int[] iArr = new int[b.values().length];
            f5928a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5928a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5928a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5928a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5928a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5928a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5928a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5928a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5928a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: c.g.b.k.d$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0891d(C0892e c0892e, b bVar) {
        this.f5922d = c0892e;
        this.f5923e = bVar;
    }

    /* renamed from: a */
    public boolean m5630a(C0891d c0891d, int i2, int i3, boolean z) {
        if (c0891d == null) {
            m5645p();
            return true;
        }
        if (!z && !m5644o(c0891d)) {
            return false;
        }
        this.f5924f = c0891d;
        if (c0891d.f5919a == null) {
            c0891d.f5919a = new HashSet<>();
        }
        HashSet<C0891d> hashSet = this.f5924f.f5919a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i2 > 0) {
            this.f5925g = i2;
        } else {
            this.f5925g = 0;
        }
        this.f5926h = i3;
        return true;
    }

    /* renamed from: b */
    public void m5631b(int i2, ArrayList<C0914o> arrayList, C0914o c0914o) {
        HashSet<C0891d> hashSet = this.f5919a;
        if (hashSet != null) {
            Iterator<C0891d> it = hashSet.iterator();
            while (it.hasNext()) {
                C0908i.m5840a(it.next().f5922d, i2, arrayList, c0914o);
            }
        }
    }

    /* renamed from: c */
    public HashSet<C0891d> m5632c() {
        return this.f5919a;
    }

    /* renamed from: d */
    public int m5633d() {
        if (this.f5921c) {
            return this.f5920b;
        }
        return 0;
    }

    /* renamed from: e */
    public int m5634e() {
        C0891d c0891d;
        if (this.f5922d.m5684Q() == 8) {
            return 0;
        }
        return (this.f5926h <= -1 || (c0891d = this.f5924f) == null || c0891d.f5922d.m5684Q() != 8) ? this.f5925g : this.f5926h;
    }

    /* renamed from: f */
    public final C0891d m5635f() {
        switch (a.f5928a[this.f5923e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f5922d.f5953K;
            case 3:
                return this.f5922d.f5951I;
            case 4:
                return this.f5922d.f5954L;
            case 5:
                return this.f5922d.f5952J;
            default:
                throw new AssertionError(this.f5923e.name());
        }
    }

    /* renamed from: g */
    public C0892e m5636g() {
        return this.f5922d;
    }

    /* renamed from: h */
    public C0886i m5637h() {
        return this.f5927i;
    }

    /* renamed from: i */
    public C0891d m5638i() {
        return this.f5924f;
    }

    /* renamed from: j */
    public b m5639j() {
        return this.f5923e;
    }

    /* renamed from: k */
    public boolean m5640k() {
        HashSet<C0891d> hashSet = this.f5919a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0891d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m5635f().m5643n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean m5641l() {
        HashSet<C0891d> hashSet = this.f5919a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: m */
    public boolean m5642m() {
        return this.f5921c;
    }

    /* renamed from: n */
    public boolean m5643n() {
        return this.f5924f != null;
    }

    /* renamed from: o */
    public boolean m5644o(C0891d c0891d) {
        if (c0891d == null) {
            return false;
        }
        b bVarM5639j = c0891d.m5639j();
        b bVar = this.f5923e;
        if (bVarM5639j == bVar) {
            return bVar != b.BASELINE || (c0891d.m5636g().m5692U() && m5636g().m5692U());
        }
        switch (a.f5928a[bVar.ordinal()]) {
            case 1:
                return (bVarM5639j == b.BASELINE || bVarM5639j == b.CENTER_X || bVarM5639j == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarM5639j == b.LEFT || bVarM5639j == b.RIGHT;
                if (c0891d.m5636g() instanceof C0894g) {
                    return z || bVarM5639j == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = bVarM5639j == b.TOP || bVarM5639j == b.BOTTOM;
                if (c0891d.m5636g() instanceof C0894g) {
                    return z2 || bVarM5639j == b.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f5923e.name());
        }
    }

    /* renamed from: p */
    public void m5645p() {
        HashSet<C0891d> hashSet;
        C0891d c0891d = this.f5924f;
        if (c0891d != null && (hashSet = c0891d.f5919a) != null) {
            hashSet.remove(this);
            if (this.f5924f.f5919a.size() == 0) {
                this.f5924f.f5919a = null;
            }
        }
        this.f5919a = null;
        this.f5924f = null;
        this.f5925g = 0;
        this.f5926h = -1;
        this.f5921c = false;
        this.f5920b = 0;
    }

    /* renamed from: q */
    public void m5646q() {
        this.f5921c = false;
        this.f5920b = 0;
    }

    /* renamed from: r */
    public void m5647r(C0880c c0880c) {
        C0886i c0886i = this.f5927i;
        if (c0886i == null) {
            this.f5927i = new C0886i(C0886i.a.UNRESTRICTED, null);
        } else {
            c0886i.m5601d();
        }
    }

    /* renamed from: s */
    public void m5648s(int i2) {
        this.f5920b = i2;
        this.f5921c = true;
    }

    public String toString() {
        return this.f5922d.m5728r() + ":" + this.f5923e.toString();
    }
}
