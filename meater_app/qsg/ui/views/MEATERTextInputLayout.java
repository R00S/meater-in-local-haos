package com.apptionlabs.meater_app.qsg.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import wh.m;

/* compiled from: MEATERTextInputLayout.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/views/MEATERTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "error", "Lih/u;", "setError", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class MEATERTextInputLayout extends TextInputLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEATERTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.c(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setError(CharSequence charSequence) {
        int i10;
        boolean z10;
        super.setError(charSequence);
        View childAt = getChildAt(1);
        if (childAt != null) {
            if (charSequence != null) {
                String obj = charSequence.toString();
                int length = obj.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    if (!z11) {
                        i10 = i11;
                    } else {
                        i10 = length;
                    }
                    if (m.h(obj.charAt(i10), 32) <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z11) {
                        if (!z10) {
                            z11 = true;
                        } else {
                            i11++;
                        }
                    } else if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (!m.a("", obj.subSequence(i11, length + 1).toString())) {
                    childAt.setVisibility(0);
                    return;
                }
            }
            childAt.setVisibility(8);
        }
    }
}
