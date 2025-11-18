package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.zzd;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class zzk implements SafetyNetApi {

    /* renamed from: com.google.android.gms.internal.safetynet.zzk$a */
    static abstract class AbstractC7639a extends AbstractC7636a<SafetyNetApi.zzb> {

        /* renamed from: s */
        protected final zzg f28422s;

        public AbstractC7639a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.f28422s = new BinderC7638c(this);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: h */
        protected /* synthetic */ Result mo13718h(Status status) {
            return new C7640b(status, null);
        }
    }

    /* renamed from: com.google.android.gms.internal.safetynet.zzk$b */
    static class C7640b implements SafetyNetApi.zzb {

        /* renamed from: f */
        private final Status f28423f;

        /* renamed from: g */
        private final zzd f28424g;

        public C7640b(Status status, zzd zzdVar) {
            this.f28423f = status;
            this.f28424g = zzdVar;
        }

        @Override // com.google.android.gms.safetynet.SafetyNetApi.zzb
        /* renamed from: f */
        public final List<HarmfulAppsData> mo22631f() {
            zzd zzdVar = this.f28424g;
            return zzdVar == null ? Collections.emptyList() : Arrays.asList(zzdVar.f29457g);
        }

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.f28423f;
        }
    }

    public static class zzi implements SafetyNetApi.SafeBrowsingResult {

        /* renamed from: f */
        private Status f28425f;

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.f28425f;
        }
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    /* renamed from: a */
    public PendingResult<SafetyNetApi.zzb> mo22630a(GoogleApiClient googleApiClient) {
        return googleApiClient.mo13874j(new C7637b(this, googleApiClient));
    }
}
