package androidx.fragment.app;

import android.view.AbstractC2106m;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import s1.X;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private final r f25394a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f25395b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f25396c;

    /* renamed from: d, reason: collision with root package name */
    int f25397d;

    /* renamed from: e, reason: collision with root package name */
    int f25398e;

    /* renamed from: f, reason: collision with root package name */
    int f25399f;

    /* renamed from: g, reason: collision with root package name */
    int f25400g;

    /* renamed from: h, reason: collision with root package name */
    int f25401h;

    /* renamed from: i, reason: collision with root package name */
    boolean f25402i;

    /* renamed from: j, reason: collision with root package name */
    boolean f25403j;

    /* renamed from: k, reason: collision with root package name */
    String f25404k;

    /* renamed from: l, reason: collision with root package name */
    int f25405l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f25406m;

    /* renamed from: n, reason: collision with root package name */
    int f25407n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f25408o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f25409p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<String> f25410q;

    /* renamed from: r, reason: collision with root package name */
    boolean f25411r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f25412s;

    /* compiled from: FragmentTransaction.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f25413a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f25414b;

        /* renamed from: c, reason: collision with root package name */
        boolean f25415c;

        /* renamed from: d, reason: collision with root package name */
        int f25416d;

        /* renamed from: e, reason: collision with root package name */
        int f25417e;

        /* renamed from: f, reason: collision with root package name */
        int f25418f;

        /* renamed from: g, reason: collision with root package name */
        int f25419g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC2106m.b f25420h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC2106m.b f25421i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f25413a = i10;
            this.f25414b = fragment;
            this.f25415c = false;
            AbstractC2106m.b bVar = AbstractC2106m.b.RESUMED;
            this.f25420h = bVar;
            this.f25421i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f25413a = i10;
            this.f25414b = fragment;
            this.f25415c = z10;
            AbstractC2106m.b bVar = AbstractC2106m.b.RESUMED;
            this.f25420h = bVar;
            this.f25421i = bVar;
        }

        a(int i10, Fragment fragment, AbstractC2106m.b bVar) {
            this.f25413a = i10;
            this.f25414b = fragment;
            this.f25415c = false;
            this.f25420h = fragment.f25499v0;
            this.f25421i = bVar;
        }

        a(a aVar) {
            this.f25413a = aVar.f25413a;
            this.f25414b = aVar.f25414b;
            this.f25415c = aVar.f25415c;
            this.f25416d = aVar.f25416d;
            this.f25417e = aVar.f25417e;
            this.f25418f = aVar.f25418f;
            this.f25419g = aVar.f25419g;
            this.f25420h = aVar.f25420h;
            this.f25421i = aVar.f25421i;
        }
    }

    C(r rVar, ClassLoader classLoader) {
        this.f25396c = new ArrayList<>();
        this.f25403j = true;
        this.f25411r = false;
        this.f25394a = rVar;
        this.f25395b = classLoader;
    }

    public C A(boolean z10) {
        this.f25411r = z10;
        return this;
    }

    public C B(int i10) {
        this.f25401h = i10;
        return this;
    }

    public C C(Fragment fragment) {
        f(new a(5, fragment));
        return this;
    }

    public C b(int i10, Fragment fragment) {
        p(i10, fragment, null, 1);
        return this;
    }

    public C c(int i10, Fragment fragment, String str) {
        p(i10, fragment, str, 1);
        return this;
    }

    public final C d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f25488k0 = viewGroup;
        fragment.f25470S = true;
        return c(viewGroup.getId(), fragment, str);
    }

    public C e(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f25396c.add(aVar);
        aVar.f25416d = this.f25397d;
        aVar.f25417e = this.f25398e;
        aVar.f25418f = this.f25399f;
        aVar.f25419g = this.f25400g;
    }

    public C g(View view, String str) {
        if (D.f()) {
            String strH = X.H(view);
            if (strH == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f25409p == null) {
                this.f25409p = new ArrayList<>();
                this.f25410q = new ArrayList<>();
            } else {
                if (this.f25410q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f25409p.contains(strH)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strH + "' has already been added to the transaction.");
                }
            }
            this.f25409p.add(strH);
            this.f25410q.add(str);
        }
        return this;
    }

    public C h(String str) {
        if (!this.f25403j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f25402i = true;
        this.f25404k = str;
        return this;
    }

    public C i(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public C n(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public C o() {
        if (this.f25402i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f25403j = false;
        return this;
    }

    void p(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.f25498u0;
        if (str2 != null) {
            K1.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f25480c0;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f25480c0 + " now " + str);
            }
            fragment.f25480c0 = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.f25478a0;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f25478a0 + " now " + i10);
            }
            fragment.f25478a0 = i10;
            fragment.f25479b0 = i10;
        }
        f(new a(i11, fragment));
    }

    public C q(Fragment fragment) {
        f(new a(4, fragment));
        return this;
    }

    public abstract boolean r();

    public C s(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public C t(int i10, Fragment fragment) {
        return u(i10, fragment, null);
    }

    public C u(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        p(i10, fragment, str, 2);
        return this;
    }

    C v(boolean z10, Runnable runnable) {
        if (!z10) {
            o();
        }
        if (this.f25412s == null) {
            this.f25412s = new ArrayList<>();
        }
        this.f25412s.add(runnable);
        return this;
    }

    public C w(int i10, int i11) {
        return x(i10, i11, 0, 0);
    }

    public C x(int i10, int i11, int i12, int i13) {
        this.f25397d = i10;
        this.f25398e = i11;
        this.f25399f = i12;
        this.f25400g = i13;
        return this;
    }

    public C y(Fragment fragment, AbstractC2106m.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public C z(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    C(r rVar, ClassLoader classLoader, C c10) {
        this(rVar, classLoader);
        Iterator<a> it = c10.f25396c.iterator();
        while (it.hasNext()) {
            this.f25396c.add(new a(it.next()));
        }
        this.f25397d = c10.f25397d;
        this.f25398e = c10.f25398e;
        this.f25399f = c10.f25399f;
        this.f25400g = c10.f25400g;
        this.f25401h = c10.f25401h;
        this.f25402i = c10.f25402i;
        this.f25403j = c10.f25403j;
        this.f25404k = c10.f25404k;
        this.f25407n = c10.f25407n;
        this.f25408o = c10.f25408o;
        this.f25405l = c10.f25405l;
        this.f25406m = c10.f25406m;
        if (c10.f25409p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f25409p = arrayList;
            arrayList.addAll(c10.f25409p);
        }
        if (c10.f25410q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f25410q = arrayList2;
            arrayList2.addAll(c10.f25410q);
        }
        this.f25411r = c10.f25411r;
    }
}
