package android.view;

import Q1.a;
import android.os.Bundle;
import android.view.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: AbstractSavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0018\u001a\u00020\u0017H$¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&¨\u0006'"}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/a0$e;", "Landroidx/lifecycle/a0$c;", "Lt3/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lt3/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/Y;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "Landroidx/lifecycle/O;", "handle", "f", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/O;)Landroidx/lifecycle/Y;", "viewModel", "Loa/F;", "d", "(Landroidx/lifecycle/Y;)V", "Lt3/d;", "b", "Lt3/d;", "savedStateRegistry", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "lifecycle", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2093a extends a0.e implements a0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C4547d savedStateRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m lifecycle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    public AbstractC2093a(InterfaceC4549f owner, Bundle bundle) {
        C3862t.g(owner, "owner");
        this.savedStateRegistry = owner.B();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends Y> T e(String key, Class<T> modelClass) {
        C4547d c4547d = this.savedStateRegistry;
        C3862t.d(c4547d);
        AbstractC2106m abstractC2106m = this.lifecycle;
        C3862t.d(abstractC2106m);
        Q qB = C2105l.b(c4547d, abstractC2106m, key, this.defaultArgs);
        T t10 = (T) f(key, modelClass, qB.getHandle());
        t10.d("androidx.lifecycle.savedstate.vm.tag", qB);
        return t10;
    }

    @Override // androidx.lifecycle.a0.c
    public <T extends Y> T a(Class<T> modelClass) {
        C3862t.g(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.lifecycle != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a0.c
    public <T extends Y> T c(Class<T> modelClass, a extras) {
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        String str = (String) extras.a(a0.d.f25937d);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) e(str, modelClass) : (T) f(str, modelClass, S.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.a0.e
    public void d(Y viewModel) {
        C3862t.g(viewModel, "viewModel");
        C4547d c4547d = this.savedStateRegistry;
        if (c4547d != null) {
            C3862t.d(c4547d);
            AbstractC2106m abstractC2106m = this.lifecycle;
            C3862t.d(abstractC2106m);
            C2105l.a(viewModel, c4547d, abstractC2106m);
        }
    }

    protected abstract <T extends Y> T f(String key, Class<T> modelClass, O handle);
}
