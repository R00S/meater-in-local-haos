package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.t1;
import kotlin.C1513M0;
import kotlin.Metadata;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/t1;", "", "Landroid/view/View;", "windowRootView", "LO/M0;", "a", "(Landroid/view/View;)LO/M0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f23350a;

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/t1$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/t1;", "b", "Landroidx/compose/ui/platform/t1;", "c", "()Landroidx/compose/ui/platform/t1;", "getLifecycleAware$annotations", "LifecycleAware", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.t1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f23350a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final t1 LifecycleAware = new t1() { // from class: androidx.compose.ui.platform.s1
            @Override // androidx.compose.ui.platform.t1
            public final C1513M0 a(View view) {
                return t1.Companion.b(view);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C1513M0 b(View view) {
            return v1.c(view, null, null, 3, null);
        }

        public final t1 c() {
            return LifecycleAware;
        }
    }

    C1513M0 a(View windowRootView);
}
