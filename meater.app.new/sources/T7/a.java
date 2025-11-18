package T7;

import C7.c;
import C7.l;
import C7.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.r;
import androidx.core.widget.d;
import b8.C2272a;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes2.dex */
public class a extends r {

    /* renamed from: H, reason: collision with root package name */
    private static final int f16232H = l.f2588y;

    /* renamed from: I, reason: collision with root package name */
    private static final int[][] f16233I = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f16234F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f16235G;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f2298V);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16234F == null) {
            int iD = M7.a.d(this, c.f2319i);
            int iD2 = M7.a.d(this, c.f2325l);
            int iD3 = M7.a.d(this, c.f2331p);
            int[][] iArr = f16233I;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = M7.a.j(iD3, iD, 1.0f);
            iArr2[1] = M7.a.j(iD3, iD2, 0.54f);
            iArr2[2] = M7.a.j(iD3, iD2, 0.38f);
            iArr2[3] = M7.a.j(iD3, iD2, 0.38f);
            this.f16234F = new ColorStateList(iArr, iArr2);
        }
        return this.f16234F;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16235G && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f16235G = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16232H;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.r.i(context2, attributeSet, m.f2705L4, i10, i11, new int[0]);
        int i12 = m.f2715M4;
        if (typedArrayI.hasValue(i12)) {
            d.d(this, U7.c.a(context2, typedArrayI, i12));
        }
        this.f16235G = typedArrayI.getBoolean(m.f2725N4, false);
        typedArrayI.recycle();
    }
}
