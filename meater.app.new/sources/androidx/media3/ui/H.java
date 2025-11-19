package androidx.media3.ui;

import X1.L;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import e3.C3185a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
final class H extends FrameLayout implements SubtitleView.a {

    /* renamed from: B, reason: collision with root package name */
    private final C2156a f28111B;

    /* renamed from: C, reason: collision with root package name */
    private final WebView f28112C;

    /* renamed from: D, reason: collision with root package name */
    private List<W1.a> f28113D;

    /* renamed from: E, reason: collision with root package name */
    private C3185a f28114E;

    /* renamed from: F, reason: collision with root package name */
    private float f28115F;

    /* renamed from: G, reason: collision with root package name */
    private int f28116G;

    /* renamed from: H, reason: collision with root package name */
    private float f28117H;

    /* compiled from: WebViewSubtitleOutput.java */
    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* compiled from: WebViewSubtitleOutput.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28119a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f28119a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28119a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28119a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public H(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f28119a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(C3185a c3185a) {
        int i10 = c3185a.f40406d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : L.G("-0.05em -0.05em 0.15em %s", C2158c.b(c3185a.f40407e)) : L.G("0.06em 0.08em 0.15em %s", C2158c.b(c3185a.f40407e)) : L.G("0.1em 0.12em 0.15em %s", C2158c.b(c3185a.f40407e)) : L.G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C2158c.b(c3185a.f40407e));
    }

    private String e(int i10, float f10) {
        float fH = F.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fH == -3.4028235E38f ? "unset" : L.G("%.2fpx", Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(W1.a aVar) {
        float f10 = aVar.f18315q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = aVar.f18314p;
        return L.G("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.H.i():void");
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<W1.a> list, C3185a c3185a, float f10, int i10, float f11) {
        this.f28114E = c3185a;
        this.f28115F = f10;
        this.f28116G = i10;
        this.f28117H = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            W1.a aVar = list.get(i11);
            if (aVar.f18302d != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f28113D.isEmpty() || !arrayList2.isEmpty()) {
            this.f28113D = arrayList2;
            i();
        }
        this.f28111B.a(arrayList, c3185a, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f28112C.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f28113D.isEmpty()) {
            return;
        }
        i();
    }

    public H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28113D = Collections.emptyList();
        this.f28114E = C3185a.f40402g;
        this.f28115F = 0.0533f;
        this.f28116G = 0;
        this.f28117H = 0.08f;
        C2156a c2156a = new C2156a(context, attributeSet);
        this.f28111B = c2156a;
        a aVar = new a(context, attributeSet);
        this.f28112C = aVar;
        aVar.setBackgroundColor(0);
        addView(c2156a);
        addView(aVar);
    }
}
