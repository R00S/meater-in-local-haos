package Q1;

import android.view.Y;
import android.view.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewModelProviderImpl.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Y;", "VM", "Landroidx/lifecycle/a0$c;", "factory", "LIa/d;", "modelClass", "LQ1/a;", "extras", "a", "(Landroidx/lifecycle/a0$c;LIa/d;LQ1/a;)Landroidx/lifecycle/Y;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final <VM extends Y> VM a(a0.c factory, Ia.d<VM> modelClass, a extras) {
        C3862t.g(factory, "factory");
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        try {
            try {
                return (VM) factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.c(Aa.a.b(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.a(Aa.a.b(modelClass));
        }
    }
}
