package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.C5641a0;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;

/* compiled from: InstallReferrerUtil.kt */
/* renamed from: com.facebook.internal.g0 */
/* loaded from: classes2.dex */
public final class C5678g0 {

    /* renamed from: a */
    public static final C5678g0 f14417a = new C5678g0();

    /* compiled from: InstallReferrerUtil.kt */
    /* renamed from: com.facebook.internal.g0$a */
    public interface a {
        /* renamed from: a */
        void mo11440a(String str);
    }

    /* compiled from: InstallReferrerUtil.kt */
    /* renamed from: com.facebook.internal.g0$b */
    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f14418a;

        /* renamed from: b */
        final /* synthetic */ a f14419b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f14418a = installReferrerClient;
            this.f14419b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: a */
        public void mo9906a(int i2) {
            if (i2 == 0) {
                try {
                    ReferrerDetails referrerDetailsMo9903b = this.f14418a.mo9903b();
                    C9801m.m32345e(referrerDetailsMo9903b, "{\n                      referrerClient.installReferrer\n                    }");
                    String strM9908a = referrerDetailsMo9903b.m9908a();
                    if (strM9908a != null && (C10547v.m37538J(strM9908a, "fb", false, 2, null) || C10547v.m37538J(strM9908a, "facebook", false, 2, null))) {
                        this.f14419b.mo11440a(strM9908a);
                    }
                    C5678g0.f14417a.m11439e();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i2 == 2) {
                C5678g0.f14417a.m11439e();
            }
            this.f14418a.mo9902a();
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: b */
        public void mo9907b() {
        }
    }

    private C5678g0() {
    }

    /* renamed from: b */
    private final boolean m11436b() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5641a0.m11284c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    private final void m11437c(a aVar) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        InstallReferrerClient installReferrerClientM9905a = InstallReferrerClient.m9901c(C5641a0.m11284c()).m9905a();
        try {
            installReferrerClientM9905a.mo9904d(new b(installReferrerClientM9905a, aVar));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m11438d(a aVar) {
        C9801m.m32346f(aVar, "callback");
        C5678g0 c5678g0 = f14417a;
        if (c5678g0.m11436b()) {
            return;
        }
        c5678g0.m11437c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m11439e() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11284c().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
