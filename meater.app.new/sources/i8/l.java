package i8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewException;
import j8.t;
import j8.v;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;

/* compiled from: com.google.android.play:review@@2.0.2 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final j8.i f43160c = new j8.i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    t f43161a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43162b;

    /* JADX WARN: Type inference failed for: r7v0, types: [i8.h] */
    public l(Context context) {
        this.f43162b = context.getPackageName();
        if (v.a(context)) {
            this.f43161a = new t(context, f43160c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: i8.h
            }, null);
        }
    }

    public final AbstractC5208j a() {
        String str = this.f43162b;
        j8.i iVar = f43160c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f43161a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return C5211m.d(new ReviewException(-1));
        }
        C5209k c5209k = new C5209k();
        this.f43161a.s(new i(this, c5209k, c5209k), c5209k);
        return c5209k.a();
    }
}
