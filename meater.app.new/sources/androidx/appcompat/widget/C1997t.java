package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar.java */
/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1997t extends SeekBar {

    /* renamed from: B, reason: collision with root package name */
    private final C1998u f21737B;

    public C1997t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42388K);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f21737B.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f21737B.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f21737B.g(canvas);
    }

    public C1997t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        V.a(this, getContext());
        C1998u c1998u = new C1998u(this);
        this.f21737B = c1998u;
        c1998u.c(attributeSet, i10);
    }
}
