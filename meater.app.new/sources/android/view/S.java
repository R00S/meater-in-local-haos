package android.view;

import Q1.a;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lt3/f;", "Landroidx/lifecycle/c0;", "T", "Loa/F;", "c", "(Lt3/f;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/O;", "b", "(Lt3/f;Landroidx/lifecycle/c0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/O;", "LQ1/a;", "a", "(LQ1/a;)Landroidx/lifecycle/O;", "LQ1/a$b;", "LQ1/a$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/U;", "e", "(Landroidx/lifecycle/c0;)Landroidx/lifecycle/U;", "savedStateHandlesVM", "Landroidx/lifecycle/T;", "d", "(Lt3/f;)Landroidx/lifecycle/T;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b<InterfaceC4549f> f25904a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b<c0> f25905b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b<Bundle> f25906c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/S$a", "LQ1/a$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/S$b", "LQ1/a$b;", "Lt3/f;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements a.b<InterfaceC4549f> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/S$c", "LQ1/a$b;", "Landroidx/lifecycle/c0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a.b<c0> {
        c() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/S$d", "Landroidx/lifecycle/a0$c;", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements a0.c {
        d() {
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T c(Class<T> modelClass, Q1.a extras) {
            C3862t.g(modelClass, "modelClass");
            C3862t.g(extras, "extras");
            return new U();
        }
    }

    public static final O a(Q1.a aVar) {
        C3862t.g(aVar, "<this>");
        InterfaceC4549f interfaceC4549f = (InterfaceC4549f) aVar.a(f25904a);
        if (interfaceC4549f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c0 c0Var = (c0) aVar.a(f25905b);
        if (c0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f25906c);
        String str = (String) aVar.a(a0.d.f25937d);
        if (str != null) {
            return b(interfaceC4549f, c0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final O b(InterfaceC4549f interfaceC4549f, c0 c0Var, String str, Bundle bundle) {
        T tD = d(interfaceC4549f);
        U uE = e(c0Var);
        O o10 = uE.h().get(str);
        if (o10 != null) {
            return o10;
        }
        O oA = O.INSTANCE.a(tD.b(str), bundle);
        uE.h().put(str, oA);
        return oA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC4549f & c0> void c(T t10) {
        C3862t.g(t10, "<this>");
        AbstractC2106m.b state = t10.getLifecycle().getState();
        if (state != AbstractC2106m.b.INITIALIZED && state != AbstractC2106m.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t10.B().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            T t11 = new T(t10.B(), t10);
            t10.B().h("androidx.lifecycle.internal.SavedStateHandlesProvider", t11);
            t10.getLifecycle().a(new P(t11));
        }
    }

    public static final T d(InterfaceC4549f interfaceC4549f) {
        C3862t.g(interfaceC4549f, "<this>");
        C4547d.c cVarC = interfaceC4549f.B().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        T t10 = cVarC instanceof T ? (T) cVarC : null;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final U e(c0 c0Var) {
        C3862t.g(c0Var, "<this>");
        return (U) new a0(c0Var, new d()).d("androidx.lifecycle.internal.SavedStateHandlesVM", U.class);
    }
}
