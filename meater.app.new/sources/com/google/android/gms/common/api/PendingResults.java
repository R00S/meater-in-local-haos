package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public final class PendingResults {

    /* renamed from: com.google.android.gms.common.api.PendingResults$a */
    private static final class C6351a<R extends Result> extends BasePendingResult<R> {

        /* renamed from: q */
        private final R f17284q;

        public C6351a(GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.f17284q = r;
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: h */
        protected final R mo13718h(Status status) {
            return this.f17284q;
        }
    }

    @KeepForSdk
    private PendingResults() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result> PendingResult<R> m13902a(R r, GoogleApiClient googleApiClient) {
        Preconditions.m14373l(r, "Result must not be null");
        Preconditions.m14363b(!r.getStatus().m13915e0(), "Status code must not be SUCCESS");
        C6351a c6351a = new C6351a(googleApiClient, r);
        c6351a.m13940k(r);
        return c6351a;
    }

    @KeepForSdk
    /* renamed from: b */
    public static PendingResult<Status> m13903b(Status status, GoogleApiClient googleApiClient) {
        Preconditions.m14373l(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.m13940k(status);
        return statusPendingResult;
    }
}
