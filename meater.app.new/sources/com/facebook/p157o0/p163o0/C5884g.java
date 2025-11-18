package com.facebook.p157o0.p163o0;

import android.content.Context;
import com.facebook.p157o0.p163o0.C5885h;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;

/* compiled from: InAppPurchaseAutoLogger.kt */
/* renamed from: com.facebook.o0.o0.g */
/* loaded from: classes2.dex */
public final class C5884g {

    /* renamed from: a */
    public static final C5884g f15284a = new C5884g();

    private C5884g() {
    }

    /* renamed from: c */
    private final void m12508c() {
        C5887j c5887j = C5887j.f15319a;
        C5885h.b bVar = C5885h.f15285a;
        C5887j.m12558e(bVar.m12535d(), bVar.m12536e());
        bVar.m12535d().clear();
    }

    /* renamed from: d */
    public static final void m12509d(Context context) throws JSONException, IllegalArgumentException {
        C5885h.b bVar;
        C5885h c5885hM12534c;
        C9801m.m32346f(context, "context");
        C5890m c5890m = C5890m.f15334a;
        if (C5890m.m12574a("com.android.billingclient.api.Purchase") == null || (c5885hM12534c = (bVar = C5885h.f15285a).m12534c(context)) == null || !bVar.m12537f().get()) {
            return;
        }
        C5887j c5887j = C5887j.f15319a;
        if (C5887j.m12557d()) {
            c5885hM12534c.m12531p("inapp", new Runnable() { // from class: com.facebook.o0.o0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5884g.m12510e();
                }
            });
        } else {
            c5885hM12534c.m12530o("inapp", new Runnable() { // from class: com.facebook.o0.o0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5884g.m12511f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m12510e() {
        f15284a.m12508c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12511f() {
        f15284a.m12508c();
    }
}
