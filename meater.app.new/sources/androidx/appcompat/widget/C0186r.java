package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p024c.p052i.p059j.C0959i;

/* compiled from: AppCompatTextClassifierHelper.java */
/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
final class C0186r {

    /* renamed from: a */
    private TextView f1242a;

    /* renamed from: b */
    private TextClassifier f1243b;

    C0186r(TextView textView) {
        this.f1242a = (TextView) C0959i.m6065c(textView);
    }

    /* renamed from: a */
    public TextClassifier m1112a() {
        TextClassifier textClassifier = this.f1243b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1242a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void m1113b(TextClassifier textClassifier) {
        this.f1243b = textClassifier;
    }
}
