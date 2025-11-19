package T4;

import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceType;
import kotlin.Metadata;

/* compiled from: IDevice.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0014\u0010#\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010%\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0014\u0010'\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\fR\u0014\u0010)\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\b¨\u0006*"}, d2 = {"LT4/p;", "", "", "getDeviceID", "()J", "deviceID", "", "getDeviceIDString", "()Ljava/lang/String;", "deviceIDString", "", "getBatteryLevel", "()I", "batteryLevel", "", "getNormalizedBatteryLevel", "()F", "normalizedBatteryLevel", "", "getShouldShowAsConnected", "()Z", "shouldShowAsConnected", "getDeviceName", "deviceName", "Lcom/apptionlabs/meater_app/model/DeviceType;", "getDeviceType", "()Lcom/apptionlabs/meater_app/model/DeviceType;", "deviceType", "Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "getConnectionMethod", "()Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "connectionMethod", "getMediumImage", "mediumImage", "getSmallImage", "smallImage", "getMiniImageDisconnected", "miniImageDisconnected", "getMiniImageConnected", "miniImageConnected", "getDebugLogDescription", "debugLogDescription", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface p {
    int getBatteryLevel();

    DeviceConnectionMethod getConnectionMethod();

    String getDebugLogDescription();

    long getDeviceID();

    String getDeviceIDString();

    String getDeviceName();

    DeviceType getDeviceType();

    int getMediumImage();

    int getMiniImageConnected();

    int getMiniImageDisconnected();

    float getNormalizedBatteryLevel();

    boolean getShouldShowAsConnected();

    int getSmallImage();
}
