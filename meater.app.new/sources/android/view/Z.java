package android.view;

import R1.a;
import R1.b;
import R1.e;
import Xb.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"LR1/e;", "a", "LR1/e;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/Y;", "LXb/I;", "(Landroidx/lifecycle/Y;)LXb/I;", "viewModelScope", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final e f25922a = new e();

    public static final I a(Y y10) {
        a aVarA;
        C3862t.g(y10, "<this>");
        synchronized (f25922a) {
            aVarA = (a) y10.f("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVarA == null) {
                aVarA = b.a();
                y10.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVarA);
            }
        }
        return aVarA;
    }
}
