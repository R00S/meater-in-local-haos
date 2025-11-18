package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: B, reason: collision with root package name */
    d f24207B;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f24207B == null) {
            this.f24207B = new d();
        }
        this.f24207B.g(this);
        return this.f24207B;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    public static class a extends ConstraintLayout.b {

        /* renamed from: A0, reason: collision with root package name */
        public float f24208A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f24209B0;

        /* renamed from: C0, reason: collision with root package name */
        public float f24210C0;

        /* renamed from: D0, reason: collision with root package name */
        public float f24211D0;

        /* renamed from: E0, reason: collision with root package name */
        public float f24212E0;

        /* renamed from: F0, reason: collision with root package name */
        public float f24213F0;

        /* renamed from: G0, reason: collision with root package name */
        public float f24214G0;

        /* renamed from: H0, reason: collision with root package name */
        public float f24215H0;

        /* renamed from: I0, reason: collision with root package name */
        public float f24216I0;

        /* renamed from: J0, reason: collision with root package name */
        public float f24217J0;

        /* renamed from: x0, reason: collision with root package name */
        public float f24218x0;

        /* renamed from: y0, reason: collision with root package name */
        public boolean f24219y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f24220z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f24218x0 = 1.0f;
            this.f24219y0 = false;
            this.f24220z0 = 0.0f;
            this.f24208A0 = 0.0f;
            this.f24209B0 = 0.0f;
            this.f24210C0 = 0.0f;
            this.f24211D0 = 1.0f;
            this.f24212E0 = 1.0f;
            this.f24213F0 = 0.0f;
            this.f24214G0 = 0.0f;
            this.f24215H0 = 0.0f;
            this.f24216I0 = 0.0f;
            this.f24217J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24218x0 = 1.0f;
            this.f24219y0 = false;
            this.f24220z0 = 0.0f;
            this.f24208A0 = 0.0f;
            this.f24209B0 = 0.0f;
            this.f24210C0 = 0.0f;
            this.f24211D0 = 1.0f;
            this.f24212E0 = 1.0f;
            this.f24213F0 = 0.0f;
            this.f24214G0 = 0.0f;
            this.f24215H0 = 0.0f;
            this.f24216I0 = 0.0f;
            this.f24217J0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24597s4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f24605t4) {
                    this.f24218x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24218x0);
                } else if (index == i.f24261E4) {
                    this.f24220z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24220z0);
                    this.f24219y0 = true;
                } else if (index == i.f24237B4) {
                    this.f24209B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24209B0);
                } else if (index == i.f24245C4) {
                    this.f24210C0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24210C0);
                } else if (index == i.f24229A4) {
                    this.f24208A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24208A0);
                } else if (index == i.f24645y4) {
                    this.f24211D0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24211D0);
                } else if (index == i.f24653z4) {
                    this.f24212E0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24212E0);
                } else if (index == i.f24613u4) {
                    this.f24213F0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24213F0);
                } else if (index == i.f24621v4) {
                    this.f24214G0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24214G0);
                } else if (index == i.f24629w4) {
                    this.f24215H0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24215H0);
                } else if (index == i.f24637x4) {
                    this.f24216I0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24216I0);
                } else if (index == i.f24253D4) {
                    this.f24217J0 = typedArrayObtainStyledAttributes.getFloat(index, this.f24217J0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
