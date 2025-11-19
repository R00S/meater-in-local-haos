package a3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l8.C3910c;

/* compiled from: WebvttCssStyle.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private int f20029f;

    /* renamed from: h, reason: collision with root package name */
    private int f20031h;

    /* renamed from: o, reason: collision with root package name */
    private float f20038o;

    /* renamed from: a, reason: collision with root package name */
    private String f20024a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f20025b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f20026c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f20027d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f20028e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20030g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20032i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f20033j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f20034k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f20035l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f20036m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f20037n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f20039p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20040q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f20034k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f20032i) {
            return this.f20031h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f20040q;
    }

    public int c() {
        if (this.f20030g) {
            return this.f20029f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f20028e;
    }

    public float e() {
        return this.f20038o;
    }

    public int f() {
        return this.f20037n;
    }

    public int g() {
        return this.f20039p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f20024a.isEmpty() && this.f20025b.isEmpty() && this.f20026c.isEmpty() && this.f20027d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f20024a, str, 1073741824), this.f20025b, str2, 2), this.f20027d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f20026c)) {
            return 0;
        }
        return iB + (this.f20026c.size() * 4);
    }

    public int i() {
        int i10 = this.f20035l;
        if (i10 == -1 && this.f20036m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f20036m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f20032i;
    }

    public boolean k() {
        return this.f20030g;
    }

    public boolean l() {
        return this.f20033j == 1;
    }

    public boolean m() {
        return this.f20034k == 1;
    }

    public c n(int i10) {
        this.f20031h = i10;
        this.f20032i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f20035l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f20040q = z10;
        return this;
    }

    public c q(int i10) {
        this.f20029f = i10;
        this.f20030g = true;
        return this;
    }

    public c r(String str) {
        this.f20028e = str == null ? null : C3910c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f20038o = f10;
        return this;
    }

    public c t(int i10) {
        this.f20037n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f20036m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f20039p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f20026c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f20024a = str;
    }

    public void y(String str) {
        this.f20025b = str;
    }

    public void z(String str) {
        this.f20027d = str;
    }
}
