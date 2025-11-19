package e7;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class i0 extends Fragment implements InterfaceC3219i {

    /* renamed from: C, reason: collision with root package name */
    private static final WeakHashMap f40696C = new WeakHashMap();

    /* renamed from: B, reason: collision with root package name */
    private final k0 f40697B = new k0();

    public static i0 a(Activity activity) {
        i0 i0Var;
        WeakHashMap weakHashMap = f40696C;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (i0Var = (i0) weakReference.get()) != null) {
            return i0Var;
        }
        try {
            i0 i0Var2 = (i0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (i0Var2 == null || i0Var2.isRemoving()) {
                i0Var2 = new i0();
                activity.getFragmentManager().beginTransaction().add(i0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(i0Var2));
            return i0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f40697B.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f40697B.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40697B.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f40697B.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f40697B.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f40697B.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f40697B.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f40697B.l();
    }

    @Override // e7.InterfaceC3219i
    public final <T extends C3218h> T p(String str, Class<T> cls) {
        return (T) this.f40697B.c(str, cls);
    }

    @Override // e7.InterfaceC3219i
    public final Activity r() {
        return getActivity();
    }

    @Override // e7.InterfaceC3219i
    public final void x(String str, C3218h c3218h) {
        this.f40697B.d(str, c3218h);
    }
}
