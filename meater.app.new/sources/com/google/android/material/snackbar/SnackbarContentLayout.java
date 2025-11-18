package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0311u;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p278q.C8937a;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC8059a {

    /* renamed from: f */
    private TextView f30491f;

    /* renamed from: g */
    private Button f30492g;

    /* renamed from: h */
    private int f30493h;

    /* renamed from: i */
    private int f30494i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34242h4);
        this.f30493h = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8918l.f34249i4, -1);
        this.f30494i = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8918l.f34298p4, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private static void m24769d(View view, int i2, int i3) {
        if (C0311u.m2104Q(view)) {
            C0311u.m2159w0(view, C0311u.m2090D(view), i2, C0311u.m2088C(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    /* renamed from: e */
    private boolean m24770e(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f30491f.getPaddingTop() == i3 && this.f30491f.getPaddingBottom() == i4) {
            return z;
        }
        m24769d(this.f30491f, i3, i4);
        return true;
    }

    @Override // com.google.android.material.snackbar.InterfaceC8059a
    /* renamed from: a */
    public void mo24771a(int i2, int i3) {
        this.f30491f.setAlpha(0.0f);
        long j2 = i3;
        long j3 = i2;
        this.f30491f.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f30492g.getVisibility() == 0) {
            this.f30492g.setAlpha(0.0f);
            this.f30492g.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC8059a
    /* renamed from: b */
    public void mo24772b(int i2, int i3) {
        this.f30491f.setAlpha(1.0f);
        long j2 = i3;
        long j3 = i2;
        this.f30491f.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f30492g.getVisibility() == 0) {
            this.f30492g.setAlpha(1.0f);
            this.f30492g.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    /* renamed from: c */
    void m24773c(float f2) {
        if (f2 != 1.0f) {
            this.f30492g.setTextColor(C8937a.m28475f(C8937a.m28472c(this, C8908b.f33825o), this.f30492g.getCurrentTextColor(), f2));
        }
    }

    public Button getActionView() {
        return this.f30492g;
    }

    public TextView getMessageView() {
        return this.f30491f;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f30491f = (TextView) findViewById(C8912f.f33902C);
        this.f30492g = (Button) findViewById(C8912f.f33901B);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f30493h
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f30493h
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p241e.p254e.p256b.p271c.C8910d.f33880o
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p241e.p254e.p256b.p271c.C8910d.f33879n
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f30491f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f30494i
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f30492g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f30494i
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.m24770e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.m24770e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f30494i = i2;
    }
}
