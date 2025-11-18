package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.Metadata;

/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/R0;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "Loa/F;", "a", "(Landroid/view/RenderNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final R0 f23001a = new R0();

    private R0() {
    }

    public final void a(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
