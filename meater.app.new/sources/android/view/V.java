package android.view;

import Q1.a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import android.view.a0;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/lifecycle/V;", "Landroidx/lifecycle/a0$e;", "Landroidx/lifecycle/a0$c;", "<init>", "()V", "Landroid/app/Application;", "application", "Lt3/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Lt3/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "", "key", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/Y;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "viewModel", "Loa/F;", "d", "(Landroidx/lifecycle/Y;)V", "b", "Landroid/app/Application;", "Landroidx/lifecycle/a0$c;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "lifecycle", "Lt3/d;", "f", "Lt3/d;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V extends a0.e implements a0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a0.c factory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m lifecycle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C4547d savedStateRegistry;

    public V() {
        this.factory = new a0.a();
    }

    @Override // androidx.lifecycle.a0.c
    public <T extends Y> T a(Class<T> modelClass) {
        C3862t.g(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.a0.c
    public <T extends Y> T c(Class<T> modelClass, a extras) {
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        String str = (String) extras.a(a0.d.f25937d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(S.f25904a) == null || extras.a(S.f25905b) == null) {
            if (this.lifecycle != null) {
                return (T) e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(a0.a.f25931h);
        boolean zIsAssignableFrom = C2094b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? W.c(modelClass, W.f25919b) : W.c(modelClass, W.f25918a);
        return constructorC == null ? (T) this.factory.c(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) W.d(modelClass, constructorC, S.a(extras)) : (T) W.d(modelClass, constructorC, application, S.a(extras));
    }

    @Override // androidx.lifecycle.a0.e
    public void d(Y viewModel) {
        C3862t.g(viewModel, "viewModel");
        if (this.lifecycle != null) {
            C4547d c4547d = this.savedStateRegistry;
            C3862t.d(c4547d);
            AbstractC2106m abstractC2106m = this.lifecycle;
            C3862t.d(abstractC2106m);
            C2105l.a(viewModel, c4547d, abstractC2106m);
        }
    }

    public final <T extends Y> T e(String key, Class<T> modelClass) {
        T t10;
        Application application;
        C3862t.g(key, "key");
        C3862t.g(modelClass, "modelClass");
        AbstractC2106m abstractC2106m = this.lifecycle;
        if (abstractC2106m == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C2094b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.application == null) ? W.c(modelClass, W.f25919b) : W.c(modelClass, W.f25918a);
        if (constructorC == null) {
            return this.application != null ? (T) this.factory.a(modelClass) : (T) a0.d.INSTANCE.a().a(modelClass);
        }
        C4547d c4547d = this.savedStateRegistry;
        C3862t.d(c4547d);
        Q qB = C2105l.b(c4547d, abstractC2106m, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t10 = (T) W.d(modelClass, constructorC, qB.getHandle());
        } else {
            C3862t.d(application);
            t10 = (T) W.d(modelClass, constructorC, application, qB.getHandle());
        }
        t10.d("androidx.lifecycle.savedstate.vm.tag", qB);
        return t10;
    }

    @SuppressLint({"LambdaLast"})
    public V(Application application, InterfaceC4549f owner, Bundle bundle) {
        a0.a aVar;
        C3862t.g(owner, "owner");
        this.savedStateRegistry = owner.B();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = a0.a.INSTANCE.a(application);
        } else {
            aVar = new a0.a();
        }
        this.factory = aVar;
    }
}
