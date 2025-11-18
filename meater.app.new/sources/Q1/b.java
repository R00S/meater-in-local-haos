package Q1;

import android.view.Y;
import android.view.a0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: InitializerViewModelFactory.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQ1/b;", "Landroidx/lifecycle/a0$c;", "", "LQ1/f;", "initializers", "<init>", "([LQ1/f;)V", "Landroidx/lifecycle/Y;", "VM", "Ljava/lang/Class;", "modelClass", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "b", "[LQ1/f;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements a0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<?>[] initializers;

    public b(f<?>... initializers) {
        C3862t.g(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.a0.c
    public <VM extends Y> VM c(Class<VM> modelClass, a extras) {
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        R1.g gVar = R1.g.f14774a;
        Ia.d<VM> dVarE = Aa.a.e(modelClass);
        f<?>[] fVarArr = this.initializers;
        return (VM) gVar.b(dVarE, extras, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
