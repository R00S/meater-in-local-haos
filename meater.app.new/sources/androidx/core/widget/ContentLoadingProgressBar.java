package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: f */
    long f2441f;

    /* renamed from: g */
    boolean f2442g;

    /* renamed from: h */
    boolean f2443h;

    /* renamed from: i */
    boolean f2444i;

    /* renamed from: j */
    private final Runnable f2445j;

    /* renamed from: k */
    private final Runnable f2446k;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2441f = -1L;
        this.f2442g = false;
        this.f2443h = false;
        this.f2444i = false;
        this.f2445j = new Runnable() { // from class: androidx.core.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2476f.m2230b();
            }
        };
        this.f2446k = new Runnable() { // from class: androidx.core.widget.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f2477f.m2231d();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m2230b() {
        this.f2442g = false;
        this.f2441f = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m2231d() {
        this.f2443h = false;
        if (this.f2444i) {
            return;
        }
        this.f2441f = System.currentTimeMillis();
        setVisibility(0);
    }

    /* renamed from: e */
    private void m2229e() {
        removeCallbacks(this.f2445j);
        removeCallbacks(this.f2446k);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2229e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2229e();
    }
}
