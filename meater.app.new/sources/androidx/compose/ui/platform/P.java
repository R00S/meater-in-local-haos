package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: AndroidTextToolbar.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/P;", "Landroidx/compose/ui/platform/Z0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "a", "Landroid/view/View;", "Landroid/view/ActionMode;", "b", "Landroid/view/ActionMode;", "actionMode", "LC0/a;", "c", "LC0/a;", "textActionModeCallback", "Landroidx/compose/ui/platform/a1;", "<set-?>", "d", "Landroidx/compose/ui/platform/a1;", "getStatus", "()Landroidx/compose/ui/platform/a1;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P implements Z0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ActionMode actionMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C0.a textActionModeCallback = new C0.a(new a(), null, null, null, null, null, 62, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a1 status = a1.Hidden;

    /* compiled from: AndroidTextToolbar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {
        a() {
            super(0);
        }

        public final void a() {
            P.this.actionMode = null;
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public P(View view) {
        this.view = view;
    }
}
