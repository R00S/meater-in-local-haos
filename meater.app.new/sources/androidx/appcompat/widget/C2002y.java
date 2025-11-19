package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2002y {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f21796l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f21797m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f21798a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21799b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f21800c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f21801d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f21802e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f21803f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f21804g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f21805h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f21806i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f21807j;

    /* renamed from: k, reason: collision with root package name */
    private final d f21808k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.y$a */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.y$b */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.C2002y.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C2002y.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.y$c */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.C2002y.b, androidx.appcompat.widget.C2002y.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C2002y.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* renamed from: androidx.appcompat.widget.y$d */
    private static class d {
        d() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) C2002y.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C2002y(TextView textView) {
        this.f21806i = textView;
        this.f21807j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21808k = new c();
        } else {
            this.f21808k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f21798a = 0;
        this.f21801d = -1.0f;
        this.f21802e = -1.0f;
        this.f21800c = -1.0f;
        this.f21803f = new int[0];
        this.f21799b = false;
    }

    private int e(RectF rectF) {
        int length = this.f21803f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f21803f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f21803f[i12];
    }

    private static Method k(String str) throws SecurityException {
        try {
            Method declaredMethod = f21797m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f21797m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static <T> T m(Object obj, String str, T t10) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private void s(float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f10 != this.f21806i.getPaint().getTextSize()) {
            this.f21806i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f21806i.isInLayout();
            if (this.f21806i.getLayout() != null) {
                this.f21799b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f21806i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f21806i.forceLayout();
                } else {
                    this.f21806i.requestLayout();
                }
                this.f21806i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f21798a == 1) {
            if (!this.f21804g || this.f21803f.length == 0) {
                int iFloor = ((int) Math.floor((this.f21802e - this.f21801d) / this.f21800c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f21801d + (i10 * this.f21800c));
                }
                this.f21803f = b(iArr);
            }
            this.f21799b = true;
        } else {
            this.f21799b = false;
        }
        return this.f21799b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f21803f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f21803f.length > 0;
        this.f21804g = z10;
        if (z10) {
            this.f21798a = 1;
            this.f21801d = r0[0];
            this.f21802e = r0[r1 - 1];
            this.f21800c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f21806i.getText();
        TransformationMethod transformationMethod = this.f21806i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f21806i)) != null) {
            text = transformation;
        }
        int maxLines = this.f21806i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f21806i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f21806i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f21798a = 1;
        this.f21801d = f10;
        this.f21802e = f11;
        this.f21800c = f12;
        this.f21804g = false;
    }

    void a() {
        if (n()) {
            if (this.f21799b) {
                if (this.f21806i.getMeasuredHeight() <= 0 || this.f21806i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f21808k.b(this.f21806i) ? 1048576 : (this.f21806i.getMeasuredWidth() - this.f21806i.getTotalPaddingLeft()) - this.f21806i.getTotalPaddingRight();
                int height = (this.f21806i.getHeight() - this.f21806i.getCompoundPaddingBottom()) - this.f21806i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f21796l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f21806i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f21799b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f21806i, this.f21805h, this.f21808k);
    }

    int f() {
        return Math.round(this.f21802e);
    }

    int g() {
        return Math.round(this.f21801d);
    }

    int h() {
        return Math.round(this.f21800c);
    }

    int[] i() {
        return this.f21803f;
    }

    int j() {
        return this.f21798a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f21805h;
        if (textPaint == null) {
            this.f21805h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f21805h.set(this.f21806i.getPaint());
        this.f21805h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f21798a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f21807j;
        int[] iArr = i.j.f42715g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f21806i;
        s1.X.l0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = i.j.f42740l0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f21798a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = i.j.f42735k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = i.j.f42725i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = i.j.f42720h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = i.j.f42730j0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f21798a = 0;
            return;
        }
        if (this.f21798a == 1) {
            if (!this.f21804g) {
                DisplayMetrics displayMetrics = this.f21807j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f21807j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f21807j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f21803f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f21804g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f21807j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f21807j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
