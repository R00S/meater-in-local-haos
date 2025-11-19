package H1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import r1.i;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f5470a;

    /* compiled from: EmojiTextViewHelper.java */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f5471a;

        /* renamed from: b, reason: collision with root package name */
        private final d f5472b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5473c = true;

        a(TextView textView) {
            this.f5471a = textView;
            this.f5472b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f5472b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f5472b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f5471a.setFilters(a(this.f5471a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // H1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f5473c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // H1.f.b
        public boolean b() {
            return this.f5473c;
        }

        @Override // H1.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // H1.f.b
        void d(boolean z10) {
            this.f5473c = z10;
            l();
            k();
        }

        @Override // H1.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f5473c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f5473c = z10;
        }

        void l() {
            this.f5471a.setTransformationMethod(e(this.f5471a.getTransformationMethod()));
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }

        void d(boolean z10) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f5474a;

        c(TextView textView) {
            this.f5474a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.i();
        }

        @Override // H1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f5474a.a(inputFilterArr);
        }

        @Override // H1.f.b
        public boolean b() {
            return this.f5474a.b();
        }

        @Override // H1.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f5474a.c(z10);
        }

        @Override // H1.f.b
        void d(boolean z10) {
            if (f()) {
                this.f5474a.i(z10);
            } else {
                this.f5474a.d(z10);
            }
        }

        @Override // H1.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f5474a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        i.h(textView, "textView cannot be null");
        if (z10) {
            this.f5470a = new a(textView);
        } else {
            this.f5470a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f5470a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f5470a.b();
    }

    public void c(boolean z10) {
        this.f5470a.c(z10);
    }

    public void d(boolean z10) {
        this.f5470a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f5470a.e(transformationMethod);
    }
}
