package androidx.activity.result.p002d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: ActivityResultContracts.java */
/* renamed from: androidx.activity.result.d.c */
/* loaded from: classes.dex */
public final class C0055c extends AbstractC0053a<Intent, ActivityResult> {
    @Override // androidx.activity.result.p002d.AbstractC0053a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo173a(Context context, Intent intent) {
        return intent;
    }

    @Override // androidx.activity.result.p002d.AbstractC0053a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo175c(int i2, Intent intent) {
        return new ActivityResult(i2, intent);
    }
}
