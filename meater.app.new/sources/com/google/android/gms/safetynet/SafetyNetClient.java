package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public class SafetyNetClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    SafetyNetClient(Context context) {
        super(context, SafetyNet.f29452c, (Api.ApiOptions) null, new ApiExceptionMapper());
    }

    /* renamed from: m */
    public Task<SafetyNetApi.HarmfulAppsResponse> m23603m() {
        return PendingResultUtil.m14359a(SafetyNet.f29453d.mo22630a(m13851a()), new SafetyNetApi.HarmfulAppsResponse());
    }
}
