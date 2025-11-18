package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {

    /* renamed from: j */
    private static final C6313a f17036j = new C6313a();

    /* renamed from: k */
    @VisibleForTesting
    private static int f17037k = C6314b.f17038a;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$a */
    private static class C6313a implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private C6313a() {
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        /* renamed from: a */
        public final /* synthetic */ GoogleSignInAccount mo13664a(Result result) {
            return ((GoogleSignInResult) result).m13692a();
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$b */
    enum C6314b {

        /* renamed from: a */
        public static final int f17038a = 1;

        /* renamed from: b */
        private static final /* synthetic */ int[] f17039b = {1, 2, 3, 4};
    }
}
