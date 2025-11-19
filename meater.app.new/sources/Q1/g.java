package Q1;

import R1.g;
import android.view.Y;
import android.view.a0;
import android.view.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewModelProviderImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LQ1/g;", "", "Landroidx/lifecycle/b0;", "store", "Landroidx/lifecycle/a0$c;", "factory", "LQ1/a;", "extras", "<init>", "(Landroidx/lifecycle/b0;Landroidx/lifecycle/a0$c;LQ1/a;)V", "Landroidx/lifecycle/Y;", "T", "LIa/d;", "modelClass", "", "key", "a", "(LIa/d;Ljava/lang/String;)Landroidx/lifecycle/Y;", "Landroidx/lifecycle/b0;", "b", "Landroidx/lifecycle/a0$c;", "c", "LQ1/a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 store;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0.c factory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a extras;

    public g(b0 store, a0.c factory, a extras) {
        C3862t.g(store, "store");
        C3862t.g(factory, "factory");
        C3862t.g(extras, "extras");
        this.store = store;
        this.factory = factory;
        this.extras = extras;
    }

    public static /* synthetic */ Y b(g gVar, Ia.d dVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = R1.g.f14774a.e(dVar);
        }
        return gVar.a(dVar, str);
    }

    public final <T extends Y> T a(Ia.d<T> modelClass, String key) {
        C3862t.g(modelClass, "modelClass");
        C3862t.g(key, "key");
        T t10 = (T) this.store.b(key);
        if (!modelClass.s(t10)) {
            d dVar = new d(this.extras);
            dVar.c(g.a.f14775a, key);
            T t11 = (T) h.a(this.factory, modelClass, dVar);
            this.store.d(key, t11);
            return t11;
        }
        Object obj = this.factory;
        if (obj instanceof a0.e) {
            C3862t.d(t10);
            ((a0.e) obj).d(t10);
        }
        C3862t.e(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return t10;
    }
}
