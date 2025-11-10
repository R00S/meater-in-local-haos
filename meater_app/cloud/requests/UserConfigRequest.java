package com.apptionlabs.meater_app.cloud.requests;

import com.apptionlabs.meater_app.versions.DeviceJson;
import com.apptionlabs.meater_app.versions.SafetyInfoJson;
import kotlin.Metadata;
import wh.g;
import wh.m;

/* compiled from: UserConfigRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/requests/UserConfigRequest;", "", "device", "Lcom/apptionlabs/meater_app/versions/DeviceJson;", "safety_info", "Lcom/apptionlabs/meater_app/versions/SafetyInfoJson;", "(Lcom/apptionlabs/meater_app/versions/DeviceJson;Lcom/apptionlabs/meater_app/versions/SafetyInfoJson;)V", "getDevice", "()Lcom/apptionlabs/meater_app/versions/DeviceJson;", "getSafety_info", "()Lcom/apptionlabs/meater_app/versions/SafetyInfoJson;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class UserConfigRequest {
    private final DeviceJson device;
    private final SafetyInfoJson safety_info;

    /* JADX WARN: Multi-variable type inference failed */
    public UserConfigRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserConfigRequest copy$default(UserConfigRequest userConfigRequest, DeviceJson deviceJson, SafetyInfoJson safetyInfoJson, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceJson = userConfigRequest.device;
        }
        if ((i10 & 2) != 0) {
            safetyInfoJson = userConfigRequest.safety_info;
        }
        return userConfigRequest.copy(deviceJson, safetyInfoJson);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceJson getDevice() {
        return this.device;
    }

    /* renamed from: component2, reason: from getter */
    public final SafetyInfoJson getSafety_info() {
        return this.safety_info;
    }

    public final UserConfigRequest copy(DeviceJson device, SafetyInfoJson safety_info) {
        m.f(device, "device");
        m.f(safety_info, "safety_info");
        return new UserConfigRequest(device, safety_info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserConfigRequest)) {
            return false;
        }
        UserConfigRequest userConfigRequest = (UserConfigRequest) other;
        if (m.a(this.device, userConfigRequest.device) && m.a(this.safety_info, userConfigRequest.safety_info)) {
            return true;
        }
        return false;
    }

    public final DeviceJson getDevice() {
        return this.device;
    }

    public final SafetyInfoJson getSafety_info() {
        return this.safety_info;
    }

    public int hashCode() {
        return (this.device.hashCode() * 31) + this.safety_info.hashCode();
    }

    public String toString() {
        return "UserConfigRequest(device=" + this.device + ", safety_info=" + this.safety_info + ")";
    }

    public UserConfigRequest(DeviceJson deviceJson, SafetyInfoJson safetyInfoJson) {
        m.f(deviceJson, "device");
        m.f(safetyInfoJson, "safety_info");
        this.device = deviceJson;
        this.safety_info = safetyInfoJson;
    }

    public /* synthetic */ UserConfigRequest(DeviceJson deviceJson, SafetyInfoJson safetyInfoJson, int i10, g gVar) {
        this((i10 & 1) != 0 ? new DeviceJson() : deviceJson, (i10 & 2) != 0 ? new SafetyInfoJson() : safetyInfoJson);
    }
}
