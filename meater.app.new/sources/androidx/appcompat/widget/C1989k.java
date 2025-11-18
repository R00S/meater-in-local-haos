package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatEmojiTextHelper.java */
/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1989k {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f21714a;

    /* renamed from: b, reason: collision with root package name */
    private final H1.f f21715b;

    C1989k(TextView textView) {
        this.f21714a = textView;
        this.f21715b = new H1.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f21715b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f21715b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f21714a.getContext().obtainStyledAttributes(attributeSet, i.j.f42715g0, i10, 0);
        try {
            int i11 = i.j.f42785u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z10) {
        this.f21715b.c(z10);
    }

    void e(boolean z10) {
        this.f21715b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f21715b.e(transformationMethod);
    }
}
