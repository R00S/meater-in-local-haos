package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2000w {

    /* renamed from: a, reason: collision with root package name */
    private TextView f21773a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f21774b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* renamed from: androidx.appcompat.widget.w$a */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C2000w(TextView textView) {
        this.f21773a = (TextView) r1.i.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f21774b;
        return textClassifier == null ? a.a(this.f21773a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f21774b = textClassifier;
    }
}
