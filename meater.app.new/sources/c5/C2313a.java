package c5;

import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LiveNotification.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\"\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0019\u0010&\"\u0004\b'\u0010(R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b$\u0010\u000e\"\u0004\b*\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,¨\u0006-"}, d2 = {"Lc5/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "displayName", "Loa/F;", "k", "(Ljava/lang/String;)V", "", "I", "g", "()I", "n", "(I)V", "remainingTime", "b", "e", "l", "internalTemperature", "c", "h", "ambientTemperature", "d", "getTargetInternalTemperature", "o", "targetInternalTemperature", "Lcom/apptionlabs/meater_app/model/DeviceConnectionState;", "Lcom/apptionlabs/meater_app/model/DeviceConnectionState;", "()Lcom/apptionlabs/meater_app/model/DeviceConnectionState;", "i", "(Lcom/apptionlabs/meater_app/model/DeviceConnectionState;)V", "connectionState", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "f", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "()Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "j", "(Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;)V", "cookState", "m", "internalTemperatureTextLength", "Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2313a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int remainingTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int internalTemperature;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int ambientTemperature;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int targetInternalTemperature;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private DeviceConnectionState connectionState = DeviceConnectionState.OFFLINE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private DeviceCookState cookState = DeviceCookState.COOK_STATE_NOT_STARTED;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int internalTemperatureTextLength;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String displayName;

    /* renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: b, reason: from getter */
    public final int getAmbientTemperature() {
        return this.ambientTemperature;
    }

    /* renamed from: c, reason: from getter */
    public final DeviceConnectionState getConnectionState() {
        return this.connectionState;
    }

    /* renamed from: d, reason: from getter */
    public final DeviceCookState getCookState() {
        return this.cookState;
    }

    /* renamed from: e, reason: from getter */
    public final int getInternalTemperature() {
        return this.internalTemperature;
    }

    /* renamed from: f, reason: from getter */
    public final int getInternalTemperatureTextLength() {
        return this.internalTemperatureTextLength;
    }

    /* renamed from: g, reason: from getter */
    public final int getRemainingTime() {
        return this.remainingTime;
    }

    public final void h(int i10) {
        this.ambientTemperature = i10;
    }

    public final void i(DeviceConnectionState deviceConnectionState) {
        C3862t.g(deviceConnectionState, "<set-?>");
        this.connectionState = deviceConnectionState;
    }

    public final void j(DeviceCookState deviceCookState) {
        C3862t.g(deviceCookState, "<set-?>");
        this.cookState = deviceCookState;
    }

    public final void k(String displayName) {
        this.displayName = displayName;
    }

    public final void l(int i10) {
        this.internalTemperature = i10;
    }

    public final void m(int i10) {
        this.internalTemperatureTextLength = i10;
    }

    public final void n(int i10) {
        this.remainingTime = i10;
    }

    public final void o(int i10) {
        this.targetInternalTemperature = i10;
    }
}
