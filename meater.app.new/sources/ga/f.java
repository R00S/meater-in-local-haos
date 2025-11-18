package ga;

import android.view.O;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentLiveDataPublisher.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/O;", "savedStateHandle", "Lja/a;", "defaultState", "", "tag", "Lga/e;", "a", "(Landroidx/lifecycle/O;Lja/a;Ljava/lang/String;)Lga/e;", "uniflow-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    public static final e a(O savedStateHandle, C3756a defaultState, String str) {
        C3862t.g(savedStateHandle, "savedStateHandle");
        C3862t.g(defaultState, "defaultState");
        return new e(defaultState, savedStateHandle, str);
    }
}
