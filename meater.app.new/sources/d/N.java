package d;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Ld/J;", "onBackPressedDispatcherOwner", "Loa/F;", "a", "(Landroid/view/View;Ld/J;)V", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N {
    public static final void a(View view, J onBackPressedDispatcherOwner) {
        C3862t.g(view, "<this>");
        C3862t.g(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(K.f39547b, onBackPressedDispatcherOwner);
    }
}
