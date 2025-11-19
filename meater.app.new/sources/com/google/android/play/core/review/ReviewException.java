package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import k8.C3805a;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), C3805a.a(i10))));
    }
}
