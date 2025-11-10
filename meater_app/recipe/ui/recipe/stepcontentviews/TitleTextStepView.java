package com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import g6.d;
import kotlin.Metadata;
import wh.m;

/* compiled from: TitleTextStepView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/TitleTextStepView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "stepNumber", "", "title", "Lih/u;", "B", "color", "setColor", "getStepTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "O", "Landroidx/appcompat/widget/AppCompatTextView;", "stepNumberText", "P", "titleText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class TitleTextStepView extends ConstraintLayout {

    /* renamed from: O, reason: from kotlin metadata */
    private AppCompatTextView stepNumberText;

    /* renamed from: P, reason: from kotlin metadata */
    private AppCompatTextView titleText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleTextStepView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        View.inflate(context, 2131558690, this);
        View findViewById = findViewById(2131363363);
        m.e(findViewById, "findViewById(...)");
        this.stepNumberText = (AppCompatTextView) findViewById;
        View findViewById2 = findViewById(2131363504);
        m.e(findViewById2, "findViewById(...)");
        this.titleText = (AppCompatTextView) findViewById2;
    }

    public final void B(int i10, String str) {
        m.f(str, "title");
        this.stepNumberText.setText((i10 + 1) + " ");
        d.c(this.titleText, str);
    }

    public final String getStepTitle() {
        return this.titleText.getText().toString();
    }

    public final void setColor(int i10) {
        this.titleText.setTextColor(i10);
    }
}
