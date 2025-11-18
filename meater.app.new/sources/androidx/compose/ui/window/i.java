package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractC2004a;
import kotlin.AbstractC1564q;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.r1;
import oa.C4153F;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00158\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R\u0014\u00106\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, d2 = {"Landroidx/compose/ui/window/i;", "Landroidx/compose/ui/platform/a;", "", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "LO/q;", "parent", "Lkotlin/Function0;", "Loa/F;", "content", "m", "(LO/q;LBa/p;)V", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "a", "(LO/l;I)V", "J", "Landroid/view/Window;", "l", "()Landroid/view/Window;", "<set-?>", "K", "LO/p0;", "getContent", "()LBa/p;", "setContent", "(LBa/p;)V", "L", "Z", "k", "()Z", "n", "(Z)V", "usePlatformDefaultWidth", "M", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends AbstractC2004a {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 content;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f23700C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f23700C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            i.this.a(interfaceC1554l, C1509K0.a(this.f23700C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public i(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = r1.c(g.f23689a.a(), null, 2, null);
    }

    private final Ba.p<InterfaceC1554l, Integer, C4153F> getContent() {
        return (Ba.p) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
        this.content.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    public void a(InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1735448596);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(interfaceC1554lR, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(i10));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.g(changed, left, top, right, bottom);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.usePlatformDefaultWidth) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    /* renamed from: k, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    /* renamed from: l, reason: from getter */
    public Window getWindow() {
        return this.window;
    }

    public final void m(AbstractC1564q parent, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        d();
    }

    public final void n(boolean z10) {
        this.usePlatformDefaultWidth = z10;
    }
}
