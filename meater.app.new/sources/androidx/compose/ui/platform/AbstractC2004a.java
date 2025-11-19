package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.AbstractC1564q;
import kotlin.C1513M0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1562p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: ComposeView.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00109J)\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010<J#\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010?J+\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010@J+\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\bA\u0010BJ3\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020$H\u0014¢\u0006\u0004\bA\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u00101R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR(\u0010P\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010X\u001a\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bU\u0010V\"\u0004\bW\u0010\u0015R$\u0010]\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010\fR0\u0010c\u001a\u00020$2\u0006\u0010K\u001a\u00020$8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\f\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\u0016\u0010e\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010_R\u0016\u0010g\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0018\u0010j\u001a\u00020$*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bk\u00101R\u0011\u0010n\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bm\u00101¨\u0006o"}, d2 = {"Landroidx/compose/ui/platform/a;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Loa/F;", "c", "()V", "LO/q;", "b", "(LO/q;)LO/q;", "j", "()LO/q;", "f", "parent", "setParentCompositionContext", "(LO/q;)V", "Landroidx/compose/ui/platform/e1;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/e1;)V", "a", "(LO/l;I)V", "d", "e", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "h", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "g", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "B", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "C", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "LO/p;", "D", "LO/p;", "composition", "E", "LO/q;", "setParentContext", "parentContext", "Lkotlin/Function0;", "F", "LBa/a;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "G", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "H", "creatingComposition", "I", "isTransitionGroupSet", "i", "(LO/q;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2004a extends ViewGroup {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private WeakReference<AbstractC1564q> cachedViewTreeCompositionContext;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private IBinder previousAttachedWindowToken;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1562p composition;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private AbstractC1564q parentContext;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> disposeViewCompositionStrategy;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean showLayoutBounds;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean creatingComposition;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitionGroupSet;

    /* compiled from: ComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C0325a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {
        C0325a() {
            super(2);
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
            }
            AbstractC2004a.this.a(interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public AbstractC2004a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final AbstractC1564q b(AbstractC1564q abstractC1564q) {
        AbstractC1564q abstractC1564q2 = i(abstractC1564q) ? abstractC1564q : null;
        if (abstractC1564q2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(abstractC1564q2);
        }
        return abstractC1564q;
    }

    private final void c() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = y1.c(this, j(), W.c.b(-656146368, true, new C0325a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean i(AbstractC1564q abstractC1564q) {
        return !(abstractC1564q instanceof C1513M0) || ((C1513M0) abstractC1564q).f0().getValue().compareTo(C1513M0.d.ShuttingDown) > 0;
    }

    private final AbstractC1564q j() {
        AbstractC1564q abstractC1564q;
        AbstractC1564q abstractC1564q2 = this.parentContext;
        if (abstractC1564q2 != null) {
            return abstractC1564q2;
        }
        AbstractC1564q abstractC1564qD = v1.d(this);
        AbstractC1564q abstractC1564q3 = null;
        AbstractC1564q abstractC1564qB = abstractC1564qD != null ? b(abstractC1564qD) : null;
        if (abstractC1564qB != null) {
            return abstractC1564qB;
        }
        WeakReference<AbstractC1564q> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference != null && (abstractC1564q = weakReference.get()) != null && i(abstractC1564q)) {
            abstractC1564q3 = abstractC1564q;
        }
        AbstractC1564q abstractC1564q4 = abstractC1564q3;
        return abstractC1564q4 == null ? b(v1.h(this)) : abstractC1564q4;
    }

    private final void setParentContext(AbstractC1564q abstractC1564q) {
        if (this.parentContext != abstractC1564q) {
            this.parentContext = abstractC1564q;
            if (abstractC1564q != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            InterfaceC1562p interfaceC1562p = this.composition;
            if (interfaceC1562p != null) {
                interfaceC1562p.c();
                this.composition = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void a(InterfaceC1554l interfaceC1554l, int i10);

    @Override // android.view.ViewGroup
    public void addView(View child) {
        c();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        c();
        return super.addViewInLayout(child, index, params);
    }

    public final void d() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        InterfaceC1562p interfaceC1562p = this.composition;
        if (interfaceC1562p != null) {
            interfaceC1562p.c();
        }
        this.composition = null;
        requestLayout();
    }

    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        g(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        f();
        h(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public final void setParentCompositionContext(AbstractC1564q parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((A0.m0) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(e1 strategy) {
        Ba.a<C4153F> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ AbstractC2004a(Context context, AttributeSet attributeSet, int i10, int i11, C3854k c3854k) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public AbstractC2004a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = e1.INSTANCE.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        c();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        c();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        c();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        c();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        c();
        super.addView(child, index, params);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
