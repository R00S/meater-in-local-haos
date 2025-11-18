package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0172k;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import p024c.p025a.C0823a;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C0172k implements Checkable {

    /* renamed from: h */
    private static final int[] f30307h = {R.attr.state_checked};

    /* renamed from: i */
    private boolean f30308i;

    /* renamed from: j */
    private boolean f30309j;

    /* renamed from: k */
    private boolean f30310k;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8019a();

        /* renamed from: h */
        boolean f30311h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        static class C8019a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8019a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m24581b(Parcel parcel) {
            this.f30311h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f30311h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m24581b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C8020a extends C0280a {
        C8020a() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: f */
        public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1857f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1968W(CheckableImageButton.this.m24580a());
            c0289c.m1969X(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5014C);
    }

    /* renamed from: a */
    public boolean m24580a() {
        return this.f30309j;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30308i;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (!this.f30308i) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f30307h;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        setChecked(savedState.f30311h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30311h = this.f30308i;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f30309j != z) {
            this.f30309j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f30309j || this.f30308i == z) {
            return;
        }
        this.f30308i = z;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.AbstractC0599l.FLAG_MOVED);
    }

    public void setPressable(boolean z) {
        this.f30310k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f30310k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f30308i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f30309j = true;
        this.f30310k = true;
        C0311u.m2131i0(this, new C8020a());
    }
}
