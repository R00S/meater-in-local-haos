package android.view;

import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import t3.C4547d;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/T;", "Lt3/d$c;", "Lt3/d;", "savedStateRegistry", "Landroidx/lifecycle/c0;", "viewModelStoreOwner", "<init>", "(Lt3/d;Landroidx/lifecycle/c0;)V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "Loa/F;", "d", "()V", "", "key", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lt3/d;", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/U;", "Loa/i;", "()Landroidx/lifecycle/U;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T implements C4547d.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4547d savedStateRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel;

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/U;", "a", "()Landroidx/lifecycle/U;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<U> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c0 f25911B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var) {
            super(0);
            this.f25911B = c0Var;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke() {
            return S.e(this.f25911B);
        }
    }

    public T(C4547d savedStateRegistry, c0 viewModelStoreOwner) {
        C3862t.g(savedStateRegistry, "savedStateRegistry");
        C3862t.g(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = C4165j.a(new a(viewModelStoreOwner));
    }

    private final U c() {
        return (U) this.viewModel.getValue();
    }

    @Override // t3.C4547d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, O> entry : c().h().entrySet()) {
            String key = entry.getKey();
            Bundle bundleA = entry.getValue().getSavedStateProvider().a();
            if (!C3862t.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleA);
            }
        }
        this.restored = false;
        return bundle;
    }

    public final Bundle b(String key) {
        C3862t.g(key, "key");
        d();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.restored) {
            return;
        }
        Bundle bundleB = this.savedStateRegistry.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.restoredState = bundle;
        this.restored = true;
        c();
    }
}
