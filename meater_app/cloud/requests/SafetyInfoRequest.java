package com.apptionlabs.meater_app.cloud.requests;

import com.apptionlabs.meater_app.versions.DeviceJson;
import kotlin.Metadata;
import wh.g;
import wh.m;

/* compiled from: SafetyInfoRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/requests/SafetyInfoRequest;", "", "device", "Lcom/apptionlabs/meater_app/versions/DeviceJson;", "(Lcom/apptionlabs/meater_app/versions/DeviceJson;)V", "getDevice", "()Lcom/apptionlabs/meater_app/versions/DeviceJson;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class SafetyInfoRequest {
    private final DeviceJson device;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SafetyInfoRequest() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.cloud.requests.SafetyInfoRequest.<init>():void");
    }

    public static /* synthetic */ SafetyInfoRequest copy$default(SafetyInfoRequest safetyInfoRequest, DeviceJson deviceJson, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceJson = safetyInfoRequest.device;
        }
        return safetyInfoRequest.copy(deviceJson);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceJson getDevice() {
        return this.device;
    }

    public final SafetyInfoRequest copy(DeviceJson device) {
        m.f(device, "device");
        return new SafetyInfoRequest(device);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof SafetyInfoRequest) && m.a(this.device, ((SafetyInfoRequest) other).device)) {
            return true;
        }
        return false;
    }

    public final DeviceJson getDevice() {
        return this.device;
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    public String toString() {
        return "SafetyInfoRequest(device=" + this.device + ")";
    }

    public SafetyInfoRequest(DeviceJson deviceJson) {
        m.f(deviceJson, "device");
        this.device = deviceJson;
    }

    public /* synthetic */ SafetyInfoRequest(DeviceJson deviceJson, int i10, g gVar) {
        this((i10 & 1) != 0 ? new DeviceJson() : deviceJson);
    }
}
