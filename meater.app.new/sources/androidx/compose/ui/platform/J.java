package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u0.AndroidPointerIcon;
import u0.InterfaceC4655u;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/J;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lu0/u;", "icon", "Loa/F;", "a", "(Landroid/view/View;Lu0/u;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f22918a = new J();

    private J() {
    }

    public final void a(View view, InterfaceC4655u icon) {
        PointerIcon pointerIcon = icon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) icon).getPointerIcon() : icon instanceof u0.AndroidPointerIcon ? PointerIcon.getSystemIcon(view.getContext(), ((u0.AndroidPointerIcon) icon).getType()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (C3862t.b(view.getPointerIcon(), pointerIcon)) {
            return;
        }
        view.setPointerIcon(pointerIcon);
    }
}
