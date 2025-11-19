package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C1991m;
import s1.C4421a;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C1991m implements Checkable {

    /* renamed from: H, reason: collision with root package name */
    private static final int[] f36651H = {R.attr.state_checked};

    /* renamed from: E, reason: collision with root package name */
    private boolean f36652E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f36653F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f36654G;

    class a extends C4421a {
        a() {
        }

        @Override // s1.C4421a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // s1.C4421a
        public void g(View view, t1.t tVar) {
            super.g(view, tVar);
            tVar.f0(CheckableImageButton.this.a());
            tVar.g0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends AbstractC5121a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        boolean f36656D;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f36656D = parcel.readInt() == 1;
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f36656D ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42381D);
    }

    public boolean a() {
        return this.f36653F;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f36652E;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f36652E) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f36651H;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f36656D);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f36656D = this.f36652E;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f36653F != z10) {
            this.f36653F = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f36653F || this.f36652E == z10) {
            return;
        }
        this.f36652E = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f36654G = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f36654G) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f36652E);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36653F = true;
        this.f36654G = true;
        X.n0(this, new a());
    }
}
