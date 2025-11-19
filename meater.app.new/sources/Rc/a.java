package Rc;

import Ia.d;
import Vc.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: KoinFragmentFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LRc/a;", "Landroidx/fragment/app/r;", "LVc/a;", "Lfd/a;", "scope", "<init>", "(Lfd/a;)V", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "c", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "b", "Lfd/a;", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends r implements Vc.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fd.a scope;

    public a(fd.a aVar) {
        this.scope = aVar;
    }

    @Override // Vc.a
    public Uc.a b() {
        return a.C0268a.a(this);
    }

    @Override // androidx.fragment.app.r
    public Fragment c(ClassLoader classLoader, String className) throws ClassNotFoundException {
        C3862t.g(classLoader, "classLoader");
        C3862t.g(className, "className");
        Class<?> cls = Class.forName(className);
        C3862t.f(cls, "forName(...)");
        d dVarE = Aa.a.e(cls);
        fd.a aVar = this.scope;
        Fragment fragment = aVar != null ? (Fragment) fd.a.h(aVar, dVarE, null, null, 6, null) : (Fragment) Uc.a.f(b(), dVarE, null, null, 6, null);
        if (fragment != null) {
            return fragment;
        }
        Fragment fragmentC = super.c(classLoader, className);
        C3862t.f(fragmentC, "instantiate(...)");
        return fragmentC;
    }

    public /* synthetic */ a(fd.a aVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : aVar);
    }
}
