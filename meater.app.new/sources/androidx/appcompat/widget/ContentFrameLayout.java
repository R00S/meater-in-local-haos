package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    private TypedValue f21231B;

    /* renamed from: C, reason: collision with root package name */
    private TypedValue f21232C;

    /* renamed from: D, reason: collision with root package name */
    private TypedValue f21233D;

    /* renamed from: E, reason: collision with root package name */
    private TypedValue f21234E;

    /* renamed from: F, reason: collision with root package name */
    private TypedValue f21235F;

    /* renamed from: G, reason: collision with root package name */
    private TypedValue f21236G;

    /* renamed from: H, reason: collision with root package name */
    private final Rect f21237H;

    /* renamed from: I, reason: collision with root package name */
    private a f21238I;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f21237H.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f21235F == null) {
            this.f21235F = new TypedValue();
        }
        return this.f21235F;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f21236G == null) {
            this.f21236G = new TypedValue();
        }
        return this.f21236G;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f21233D == null) {
            this.f21233D = new TypedValue();
        }
        return this.f21233D;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f21234E == null) {
            this.f21234E = new TypedValue();
        }
        return this.f21234E;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f21231B == null) {
            this.f21231B = new TypedValue();
        }
        return this.f21231B;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f21232C == null) {
            this.f21232C = new TypedValue();
        }
        return this.f21232C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f21238I;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f21238I;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f21238I = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21237H = new Rect();
    }
}
