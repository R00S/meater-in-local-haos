package d;

import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EdgeToEdge.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld/v;", "Ld/t;", "<init>", "()V", "Landroid/view/Window;", "window", "Loa/F;", "b", "(Landroid/view/Window;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
class v extends t {
    @Override // d.C2989A, d.InterfaceC2990B
    public void b(Window window) {
        C3862t.g(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
