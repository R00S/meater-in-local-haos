package I0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.Metadata;

/* compiled from: LayoutIntrinsics.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\n\u0010\u001eR\u0011\u0010!\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000e\u0010 R\u0011\u0010\"\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\f\u0010 ¨\u0006#"}, d2 = {"LI0/B;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "a", "Ljava/lang/CharSequence;", "b", "Landroid/text/TextPaint;", "c", "I", "", "d", "F", "_maxIntrinsicWidth", "e", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "f", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "g", "Z", "boringMetricsIsInit", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float _maxIntrinsicWidth = Float.NaN;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float _minIntrinsicWidth = Float.NaN;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private BoringLayout.Metrics _boringMetrics;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean boringMetricsIsInit;

    public B(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = C1168e.f6621a.c(this.charSequence, this.textPaint, a0.k(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float b() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        if (fCeil < 0.0f) {
            CharSequence charSequence = this.charSequence;
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.textPaint));
        }
        if (D.e(fCeil, this.charSequence, this.textPaint)) {
            fCeil += 0.5f;
        }
        this._maxIntrinsicWidth = fCeil;
        return fCeil;
    }

    public final float c() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fC = D.c(this.charSequence, this.textPaint);
        this._minIntrinsicWidth = fC;
        return fC;
    }
}
