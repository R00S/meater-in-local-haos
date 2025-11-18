package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.Metadata;

/* compiled from: SemanticsUtils.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/V0;", "", "LF0/p;", "semanticsNode", "Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(LF0/p;Landroid/graphics/Rect;)V", "a", "LF0/p;", "b", "()LF0/p;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final F0.p semanticsNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Rect adjustedBounds;

    public V0(F0.p pVar, Rect rect) {
        this.semanticsNode = pVar;
        this.adjustedBounds = rect;
    }

    /* renamed from: a, reason: from getter */
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    /* renamed from: b, reason: from getter */
    public final F0.p getSemanticsNode() {
        return this.semanticsNode;
    }
}
