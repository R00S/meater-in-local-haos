package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import t5.a1;
import t5.j;
import t5.y0;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERPlus extends MEATERDevice {
    private y0 otaUpdateInProgress;

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void addChild(MEATERDevice mEATERDevice) {
        if (this.childDevices.size() > 0) {
            MEATERDevice mEATERDevice2 = this.childDevices.get(0);
            if (mEATERDevice2.getDeviceID() == mEATERDevice.getDeviceID()) {
                return;
            } else {
                removeChild(mEATERDevice2);
            }
        }
        super.addChild(mEATERDevice);
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean canBeToldToUnpairChildProbes() {
        if (getMEATERDeviceType() != MEATERDeviceType.PLUS && getMEATERDeviceType() != MEATERDeviceType.PLUS_SE && getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_PLUS) {
            return false;
        }
        return true;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean disconnectAllChildren() {
        a1 a1Var = (a1) this.bleConnection;
        if (a1Var != null) {
            a1Var.p0();
            return true;
        }
        return true;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean disconnectChild() {
        return disconnectAllChildren();
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public DeviceConnectionMethod getDefaultConnectionMethod() {
        return DeviceConnectionMethod.BLUETOOTH;
    }

    public y0 getOtaUpdateInProgress() {
        return this.otaUpdateInProgress;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean isNumberOfDisconnectionsThresholdExceeded() {
        int i10 = this.totalNumberOfDisconnections;
        Config.getInstance();
        if (i10 == 40) {
            return true;
        }
        return false;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public int maximumAmbientTemperature() {
        return Temperature.fromCelsius(60);
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean mustFirmwareUpdate() {
        if (needsFirmwareUpdate() && FirmwareVersion.sharedInstance().needForceUpdate(getMEATERDeviceType(), this.firmwareRevision)) {
            return true;
        }
        return false;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean needsAppUpdate() {
        return FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToDevice(this);
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean needsFirmwareUpdate() {
        j jVar;
        Probe probe;
        if (this.connectionState != DeviceConnectionState.CONNECTED || !this.connectionMethod.isBluetoothConnectionMethod() || this.batteryLevel == 0 || (jVar = this.bleConnection) == null || !((a1) jVar).U()) {
            return false;
        }
        if ((this.childDevices.size() > 0 && (probe = (Probe) this.childDevices.get(0)) != null && probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) || !((a1) this.bleConnection).E() || FirmwareVersion.sharedInstance().getFirmware(getMEATERDeviceType()) == null || !FirmwareVersion.sharedInstance().needsUpdate(getMEATERDeviceType(), this.firmwareRevision)) {
            return false;
        }
        return true;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public Probe relatedProbe() {
        if (this.childDevices.size() > 0) {
            return (Probe) this.childDevices.get(0);
        }
        return null;
    }

    public void setOtaUpdateInProgress(y0 y0Var) {
        this.otaUpdateInProgress = y0Var;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void updateState() {
        showOverheatWarningIfNecessary();
    }
}
