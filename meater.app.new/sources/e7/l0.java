package e7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class l0 extends Fragment implements InterfaceC3219i {

    /* renamed from: H0, reason: collision with root package name */
    private static final WeakHashMap f40717H0 = new WeakHashMap();

    /* renamed from: G0, reason: collision with root package name */
    private final k0 f40718G0 = new k0();

    public static l0 x2(androidx.fragment.app.o oVar) {
        l0 l0Var;
        WeakHashMap weakHashMap = f40717H0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(oVar);
        if (weakReference != null && (l0Var = (l0) weakReference.get()) != null) {
            return l0Var;
        }
        try {
            l0 l0Var2 = (l0) oVar.w0().n0("SLifecycleFragmentImpl");
            if (l0Var2 == null || l0Var2.P0()) {
                l0Var2 = new l0();
                oVar.w0().r().e(l0Var2, "SLifecycleFragmentImpl").k();
            }
            weakHashMap.put(oVar, new WeakReference(l0Var2));
            return l0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void P(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.P(str, fileDescriptor, printWriter, strArr);
        this.f40718G0.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void V0(int i10, int i11, Intent intent) {
        super.V0(i10, i11, intent);
        this.f40718G0.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void a1(Bundle bundle) {
        super.a1(bundle);
        this.f40718G0.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void f1() {
        super.f1();
        this.f40718G0.h();
    }

    @Override // e7.InterfaceC3219i
    public final <T extends C3218h> T p(String str, Class<T> cls) {
        return (T) this.f40718G0.c(str, cls);
    }

    @Override // e7.InterfaceC3219i
    public final Activity r() {
        return T();
    }

    @Override // androidx.fragment.app.Fragment
    public final void v1() {
        super.v1();
        this.f40718G0.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void w1(Bundle bundle) {
        super.w1(bundle);
        this.f40718G0.j(bundle);
    }

    @Override // e7.InterfaceC3219i
    public final void x(String str, C3218h c3218h) {
        this.f40718G0.d(str, c3218h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void x1() {
        super.x1();
        this.f40718G0.k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void y1() {
        super.y1();
        this.f40718G0.l();
    }
}
