package t1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4537a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f49749a;

    /* renamed from: b, reason: collision with root package name */
    private final t f49750b;

    /* renamed from: c, reason: collision with root package name */
    private final int f49751c;

    public C4537a(int i10, t tVar, int i11) {
        this.f49749a = i10;
        this.f49750b = tVar;
        this.f49751c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f49749a);
        this.f49750b.X(this.f49751c, bundle);
    }
}
