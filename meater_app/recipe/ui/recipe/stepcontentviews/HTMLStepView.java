package com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.b;
import i5.StepContent;
import i5.StepContentMeta;
import kotlin.Metadata;
import s7.f;
import s7.g;
import wh.m;

/* compiled from: HTMLStepView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/HTMLStepView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Li5/y;", "content", "Lih/u;", "setData", "Landroid/text/style/BulletSpan;", "x", "Landroid/text/style/BulletSpan;", "bulletSpan", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class HTMLStepView extends AppCompatTextView {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private BulletSpan bulletSpan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTMLStepView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
    }

    public final void setData(StepContent stepContent) {
        String str;
        BulletSpan bulletSpan;
        m.f(stepContent, "content");
        StepContentMeta meta = stepContent.getMeta();
        if (meta != null) {
            str = meta.getHtml();
        } else {
            str = null;
        }
        m.c(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b.a(str, 0));
        for (BulletSpan bulletSpan2 : (BulletSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BulletSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(bulletSpan2);
            int spanEnd = spannableStringBuilder.getSpanEnd(bulletSpan2);
            spannableStringBuilder.removeSpan(bulletSpan2);
            if (Build.VERSION.SDK_INT >= 28) {
                g.a();
                bulletSpan = f.a(20, getContext().getColor(2131099682), 10);
            } else {
                bulletSpan = new BulletSpan(20, getContext().getColor(2131099682));
            }
            this.bulletSpan = bulletSpan;
            spannableStringBuilder.setSpan(bulletSpan, spanStart, spanEnd, 33);
        }
        setText(spannableStringBuilder);
    }
}
