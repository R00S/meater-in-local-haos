package androidx.compose.ui.platform;

import android.view.View;
import e0.C3110a;
import e0.C3117h;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/D;", "", "<init>", "()V", "Landroid/view/View;", "view", "Le0/h;", "transferData", "Le0/a;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Le0/h;Le0/a;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f22909a = new D();

    private D() {
    }

    public final boolean a(View view, C3117h transferData, C3110a dragShadowBuilder) {
        return view.startDragAndDrop(transferData.getClipData(), dragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }
}
