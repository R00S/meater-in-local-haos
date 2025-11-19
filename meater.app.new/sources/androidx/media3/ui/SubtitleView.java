package androidx.media3.ui;

import W1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import e3.C3185a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    private List<W1.a> f28157B;

    /* renamed from: C, reason: collision with root package name */
    private C3185a f28158C;

    /* renamed from: D, reason: collision with root package name */
    private int f28159D;

    /* renamed from: E, reason: collision with root package name */
    private float f28160E;

    /* renamed from: F, reason: collision with root package name */
    private float f28161F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f28162G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f28163H;

    /* renamed from: I, reason: collision with root package name */
    private int f28164I;

    /* renamed from: J, reason: collision with root package name */
    private a f28165J;

    /* renamed from: K, reason: collision with root package name */
    private View f28166K;

    interface a {
        void a(List<W1.a> list, C3185a c3185a, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28157B = Collections.emptyList();
        this.f28158C = C3185a.f40402g;
        this.f28159D = 0;
        this.f28160E = 0.0533f;
        this.f28161F = 0.08f;
        this.f28162G = true;
        this.f28163H = true;
        C2156a c2156a = new C2156a(context);
        this.f28165J = c2156a;
        this.f28166K = c2156a;
        addView(c2156a);
        this.f28164I = 1;
    }

    private W1.a a(W1.a aVar) {
        a.b bVarA = aVar.a();
        if (!this.f28162G) {
            F.e(bVarA);
        } else if (!this.f28163H) {
            F.f(bVarA);
        }
        return bVarA.a();
    }

    private void c(int i10, float f10) {
        this.f28159D = i10;
        this.f28160E = f10;
        f();
    }

    private void f() {
        this.f28165J.a(getCuesWithStylingPreferencesApplied(), this.f28158C, this.f28160E, this.f28159D, this.f28161F);
    }

    private List<W1.a> getCuesWithStylingPreferencesApplied() {
        if (this.f28162G && this.f28163H) {
            return this.f28157B;
        }
        ArrayList arrayList = new ArrayList(this.f28157B.size());
        for (int i10 = 0; i10 < this.f28157B.size(); i10++) {
            arrayList.add(a(this.f28157B.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C3185a getUserCaptionStyle() {
        if (isInEditMode()) {
            return C3185a.f40402g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C3185a.f40402g : C3185a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f28166K);
        View view = this.f28166K;
        if (view instanceof H) {
            ((H) view).g();
        }
        this.f28166K = t10;
        this.f28165J = t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f28163H = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f28162G = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f28161F = f10;
        f();
    }

    public void setCues(List<W1.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f28157B = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(C3185a c3185a) {
        this.f28158C = c3185a;
        f();
    }

    public void setViewType(int i10) {
        if (this.f28164I == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new C2156a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new H(getContext()));
        }
        this.f28164I = i10;
    }
}
