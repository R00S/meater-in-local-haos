package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0511g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public abstract class AbstractC0485u {

    /* renamed from: a */
    private final C0473i f3316a;

    /* renamed from: b */
    private final ClassLoader f3317b;

    /* renamed from: d */
    int f3319d;

    /* renamed from: e */
    int f3320e;

    /* renamed from: f */
    int f3321f;

    /* renamed from: g */
    int f3322g;

    /* renamed from: h */
    int f3323h;

    /* renamed from: i */
    boolean f3324i;

    /* renamed from: k */
    String f3326k;

    /* renamed from: l */
    int f3327l;

    /* renamed from: m */
    CharSequence f3328m;

    /* renamed from: n */
    int f3329n;

    /* renamed from: o */
    CharSequence f3330o;

    /* renamed from: p */
    ArrayList<String> f3331p;

    /* renamed from: q */
    ArrayList<String> f3332q;

    /* renamed from: s */
    ArrayList<Runnable> f3334s;

    /* renamed from: c */
    ArrayList<a> f3318c = new ArrayList<>();

    /* renamed from: j */
    boolean f3325j = true;

    /* renamed from: r */
    boolean f3333r = false;

    /* compiled from: FragmentTransaction.java */
    /* renamed from: androidx.fragment.app.u$a */
    static final class a {

        /* renamed from: a */
        int f3335a;

        /* renamed from: b */
        Fragment f3336b;

        /* renamed from: c */
        int f3337c;

        /* renamed from: d */
        int f3338d;

        /* renamed from: e */
        int f3339e;

        /* renamed from: f */
        int f3340f;

        /* renamed from: g */
        AbstractC0511g.c f3341g;

        /* renamed from: h */
        AbstractC0511g.c f3342h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.f3335a = i2;
            this.f3336b = fragment;
            AbstractC0511g.c cVar = AbstractC0511g.c.RESUMED;
            this.f3341g = cVar;
            this.f3342h = cVar;
        }

        a(int i2, Fragment fragment, AbstractC0511g.c cVar) {
            this.f3335a = i2;
            this.f3336b = fragment;
            this.f3341g = fragment.mMaxState;
            this.f3342h = cVar;
        }
    }

    AbstractC0485u(C0473i c0473i, ClassLoader classLoader) {
        this.f3316a = c0473i;
        this.f3317b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0485u m3734b(int i2, Fragment fragment) {
        mo3553o(i2, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0485u m3735c(int i2, Fragment fragment, String str) {
        mo3553o(i2, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    AbstractC0485u m3736d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m3735c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public AbstractC0485u m3737e(Fragment fragment, String str) {
        mo3553o(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    void m3738f(a aVar) {
        this.f3318c.add(aVar);
        aVar.f3337c = this.f3319d;
        aVar.f3338d = this.f3320e;
        aVar.f3339e = this.f3321f;
        aVar.f3340f = this.f3322g;
    }

    /* renamed from: g */
    public AbstractC0485u m3739g(String str) {
        if (!this.f3325j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f3324i = true;
        this.f3326k = str;
        return this;
    }

    /* renamed from: h */
    public AbstractC0485u m3740h(Fragment fragment) {
        m3738f(new a(7, fragment));
        return this;
    }

    /* renamed from: i */
    public abstract int mo3548i();

    /* renamed from: j */
    public abstract int mo3549j();

    /* renamed from: k */
    public abstract void mo3550k();

    /* renamed from: l */
    public abstract void mo3551l();

    /* renamed from: m */
    public AbstractC0485u mo3552m(Fragment fragment) {
        m3738f(new a(6, fragment));
        return this;
    }

    /* renamed from: n */
    public AbstractC0485u m3741n() {
        if (this.f3324i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3325j = false;
        return this;
    }

    /* renamed from: o */
    void mo3553o(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        m3738f(new a(i3, fragment));
    }

    /* renamed from: p */
    public AbstractC0485u mo3554p(Fragment fragment) {
        m3738f(new a(3, fragment));
        return this;
    }

    /* renamed from: q */
    public AbstractC0485u m3742q(int i2, Fragment fragment) {
        return m3743r(i2, fragment, null);
    }

    /* renamed from: r */
    public AbstractC0485u m3743r(int i2, Fragment fragment, String str) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo3553o(i2, fragment, str, 2);
        return this;
    }

    /* renamed from: s */
    public AbstractC0485u m3744s(int i2, int i3, int i4, int i5) {
        this.f3319d = i2;
        this.f3320e = i3;
        this.f3321f = i4;
        this.f3322g = i5;
        return this;
    }

    /* renamed from: t */
    public AbstractC0485u mo3555t(Fragment fragment, AbstractC0511g.c cVar) {
        m3738f(new a(10, fragment, cVar));
        return this;
    }

    /* renamed from: u */
    public AbstractC0485u m3745u(boolean z) {
        this.f3333r = z;
        return this;
    }
}
