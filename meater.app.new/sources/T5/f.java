package T5;

import android.view.B;
import android.view.Y;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DevicesListActivityViewModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u000e2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LT5/f;", "Landroidx/lifecycle/Y;", "LR5/c;", "videoTutorialViewModel", "LG5/a;", "preference", "<init>", "(LR5/c;LG5/a;)V", "", "i", "()Z", "", "k", "()I", "Loa/F;", "h", "()V", "Landroidx/lifecycle/B;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "m", "()Landroidx/lifecycle/B;", "l", "j", "()Ljava/util/ArrayList;", "strings", "n", "(Ljava/util/ArrayList;)V", "b", "LR5/c;", "c", "LG5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final R5.c videoTutorialViewModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    public f(R5.c videoTutorialViewModel, G5.a preference) {
        C3862t.g(videoTutorialViewModel, "videoTutorialViewModel");
        C3862t.g(preference, "preference");
        this.videoTutorialViewModel = videoTutorialViewModel;
        this.preference = preference;
    }

    public final void h() {
        this.videoTutorialViewModel.p();
    }

    public final boolean i() {
        return this.videoTutorialViewModel.n();
    }

    public final ArrayList<String> j() {
        return this.videoTutorialViewModel.l();
    }

    public final int k() {
        return this.videoTutorialViewModel.t();
    }

    public final B<String> l() {
        return this.videoTutorialViewModel.v();
    }

    public final B<ArrayList<String>> m() {
        return this.videoTutorialViewModel.u();
    }

    public final void n(ArrayList<String> strings) {
        C3862t.g(strings, "strings");
        this.videoTutorialViewModel.w(strings);
    }
}
