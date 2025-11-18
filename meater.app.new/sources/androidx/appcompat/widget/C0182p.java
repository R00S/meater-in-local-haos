package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0823a;

/* compiled from: AppCompatSeekBar.java */
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public class C0182p extends SeekBar {

    /* renamed from: f */
    private final C0184q f1231f;

    public C0182p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5021J);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1231f.m1086h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1231f.m1087i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1231f.m1085g(canvas);
    }

    public C0182p(Context context, AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0184q c0184q = new C0184q(this);
        this.f1231f = c0184q;
        c0184q.mo1082c(attributeSet, i2);
    }
}
