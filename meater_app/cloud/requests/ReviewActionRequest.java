package com.apptionlabs.meater_app.cloud.requests;

import com.apptionlabs.meater_app.versions.DeviceJson;
import kotlin.Metadata;
import wh.g;
import wh.m;

/* compiled from: ReviewActionRequest.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/requests/ReviewActionRequest;", "", "action", "", "status", "reason", "device", "Lcom/apptionlabs/meater_app/versions/DeviceJson;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/apptionlabs/meater_app/versions/DeviceJson;)V", "getAction", "()Ljava/lang/String;", "getDevice", "()Lcom/apptionlabs/meater_app/versions/DeviceJson;", "getReason", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class ReviewActionRequest {
    private final String action;
    private final DeviceJson device;
    private final String reason;
    private final String status;

    public ReviewActionRequest(String str, String str2, String str3, DeviceJson deviceJson) {
        m.f(str, "action");
        m.f(str2, "status");
        m.f(str3, "reason");
        m.f(deviceJson, "device");
        this.action = str;
        this.status = str2;
        this.reason = str3;
        this.device = deviceJson;
    }

    public static /* synthetic */ ReviewActionRequest copy$default(ReviewActionRequest reviewActionRequest, String str, String str2, String str3, DeviceJson deviceJson, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reviewActionRequest.action;
        }
        if ((i10 & 2) != 0) {
            str2 = reviewActionRequest.status;
        }
        if ((i10 & 4) != 0) {
            str3 = reviewActionRequest.reason;
        }
        if ((i10 & 8) != 0) {
            deviceJson = reviewActionRequest.device;
        }
        return reviewActionRequest.copy(str, str2, str3, deviceJson);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final DeviceJson getDevice() {
        return this.device;
    }

    public final ReviewActionRequest copy(String action, String status, String reason, DeviceJson device) {
        m.f(action, "action");
        m.f(status, "status");
        m.f(reason, "reason");
        m.f(device, "device");
        return new ReviewActionRequest(action, status, reason, device);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewActionRequest)) {
            return false;
        }
        ReviewActionRequest reviewActionRequest = (ReviewActionRequest) other;
        if (m.a(this.action, reviewActionRequest.action) && m.a(this.status, reviewActionRequest.status) && m.a(this.reason, reviewActionRequest.reason) && m.a(this.device, reviewActionRequest.device)) {
            return true;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final DeviceJson getDevice() {
        return this.device;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.action.hashCode() * 31) + this.status.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.device.hashCode();
    }

    public String toString() {
        return "ReviewActionRequest(action=" + this.action + ", status=" + this.status + ", reason=" + this.reason + ", device=" + this.device + ")";
    }

    public /* synthetic */ ReviewActionRequest(String str, String str2, String str3, DeviceJson deviceJson, int i10, g gVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? new DeviceJson() : deviceJson);
    }
}
