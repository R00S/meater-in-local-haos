package androidx.core.view.p004d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: androidx.core.view.d0.a */
/* loaded from: classes.dex */
public final class C0287a extends ClickableSpan {

    /* renamed from: f */
    private final int f2328f;

    /* renamed from: g */
    private final C0289c f2329g;

    /* renamed from: h */
    private final int f2330h;

    public C0287a(int i2, C0289c c0289c, int i3) {
        this.f2328f = i2;
        this.f2329g = c0289c;
        this.f2330h = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2328f);
        this.f2329g.m1962O(this.f2330h, bundle);
    }
}
