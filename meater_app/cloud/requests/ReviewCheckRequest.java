package com.apptionlabs.meater_app.cloud.requests;

import com.apptionlabs.meater_app.versions.DeviceJson;
import kotlin.Metadata;
import wh.g;
import wh.m;

/* compiled from: ReviewCheckRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/requests/ReviewCheckRequest;", "", "device", "Lcom/apptionlabs/meater_app/versions/DeviceJson;", "reason", "", "(Lcom/apptionlabs/meater_app/versions/DeviceJson;Ljava/lang/String;)V", "getDevice", "()Lcom/apptionlabs/meater_app/versions/DeviceJson;", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class ReviewCheckRequest {
    private final DeviceJson device;
    private final String reason;

    public ReviewCheckRequest(DeviceJson deviceJson, String str) {
        m.f(deviceJson, "device");
        m.f(str, "reason");
        this.device = deviceJson;
        this.reason = str;
    }

    public static /* synthetic */ ReviewCheckRequest copy$default(ReviewCheckRequest reviewCheckRequest, DeviceJson deviceJson, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceJson = reviewCheckRequest.device;
        }
        if ((i10 & 2) != 0) {
            str = reviewCheckRequest.reason;
        }
        return reviewCheckRequest.copy(deviceJson, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceJson getDevice() {
        return this.device;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final ReviewCheckRequest copy(DeviceJson device, String reason) {
        m.f(device, "device");
        m.f(reason, "reason");
        return new ReviewCheckRequest(device, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewCheckRequest)) {
            return false;
        }
        ReviewCheckRequest reviewCheckRequest = (ReviewCheckRequest) other;
        if (m.a(this.device, reviewCheckRequest.device) && m.a(this.reason, reviewCheckRequest.reason)) {
            return true;
        }
        return false;
    }

    public final DeviceJson getDevice() {
        return this.device;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (this.device.hashCode() * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "ReviewCheckRequest(device=" + this.device + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ ReviewCheckRequest(DeviceJson deviceJson, String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? new DeviceJson() : deviceJson, str);
    }
}
