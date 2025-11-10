package com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import g6.d;
import i5.StepContent;
import i5.StepContentMeta;
import kotlin.Metadata;
import wh.m;

/* compiled from: TextStepView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/TextStepView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Li5/y;", "content", "Lih/u;", "setData", "", "text", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class TextStepView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStepView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
    }

    public final void setData(StepContent stepContent) {
        String text;
        m.f(stepContent, "content");
        StepContentMeta meta = stepContent.getMeta();
        if (meta == null || (text = meta.getText()) == null) {
            return;
        }
        d.c(this, text);
    }

    public final void setData(String str) {
        if (str != null) {
            d.c(this, str);
        }
    }
}
