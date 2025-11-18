package R1;

import android.view.Y;
import android.view.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DefaultViewModelProviderFactory.jvm.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LR1/c;", "Landroidx/lifecycle/a0$c;", "<init>", "()V", "Landroidx/lifecycle/Y;", "T", "LIa/d;", "modelClass", "LQ1/a;", "extras", "b", "(LIa/d;LQ1/a;)Landroidx/lifecycle/Y;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements a0.c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f14768b = new c();

    private c() {
    }

    @Override // androidx.lifecycle.a0.c
    public <T extends Y> T b(Ia.d<T> modelClass, Q1.a extras) {
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        return (T) d.f14769a.a(Aa.a.b(modelClass));
    }
}
