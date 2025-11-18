package p241e.p254e.p256b.p271c.p275o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0160e;
import androidx.core.widget.C0324e;
import com.google.android.material.internal.C8032j;
import com.google.android.material.theme.p178a.C8079a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p278q.C8937a;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* compiled from: MaterialCheckBox.java */
/* renamed from: e.e.b.c.o.a */
/* loaded from: classes2.dex */
public class C8931a extends C0160e {

    /* renamed from: i */
    private static final int f34393i = C8917k.f33995t;

    /* renamed from: j */
    private static final int[][] f34394j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: k */
    private ColorStateList f34395k;

    /* renamed from: l */
    private boolean f34396l;

    public C8931a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33817g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f34395k == null) {
            int[][] iArr = f34394j;
            int[] iArr2 = new int[iArr.length];
            int iM28472c = C8937a.m28472c(this, C8908b.f33820j);
            int iM28472c2 = C8937a.m28472c(this, C8908b.f33825o);
            int iM28472c3 = C8937a.m28472c(this, C8908b.f33822l);
            iArr2[0] = C8937a.m28475f(iM28472c2, iM28472c, 1.0f);
            iArr2[1] = C8937a.m28475f(iM28472c2, iM28472c3, 0.54f);
            iArr2[2] = C8937a.m28475f(iM28472c2, iM28472c3, 0.38f);
            iArr2[3] = C8937a.m28475f(iM28472c2, iM28472c3, 0.38f);
            this.f34395k = new ColorStateList(iArr, iArr2);
        }
        return this.f34395k;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34396l && C0324e.m2307b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f34396l = z;
        if (z) {
            C0324e.m2308c(this, getMaterialThemeColorsTintList());
        } else {
            C0324e.m2308c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8931a(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f34393i;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayM24694h = C8032j.m24694h(context2, attributeSet, C8918l.f34304q3, i2, i3, new int[0]);
        int i4 = C8918l.f34311r3;
        if (typedArrayM24694h.hasValue(i4)) {
            C0324e.m2308c(this, C8947c.m28499a(context2, typedArrayM24694h, i4));
        }
        this.f34396l = typedArrayM24694h.getBoolean(C8918l.f34318s3, false);
        typedArrayM24694h.recycle();
    }
}
