package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import f8.l0;
import j6.x;
import j6.y;
import java.util.ArrayList;
import java.util.Locale;
import l6.k;
import l6.s;
import v5.l;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERBlock extends MEATERDevice implements j6.g, y, x {
    public static final int MEATER_BLOCK_EMPTY_BATTERY = 1;
    private s connectivityMonitor;
    private boolean isLegacy;
    private ArrayList<Long> pairedProbeIdentifiers = new ArrayList<>();
    private DeviceConnectionMethod secondaryConnectionMethod;
    private int secondaryConnectionSignalLevel;
    private DeviceConnectionState secondaryConnectionState;
    private boolean supportsBLEKeepAlive;

    private MasterDevice getBlockMasterDevice() {
        return k.e0().q(getDeviceID());
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void attemptToReconnect() {
        if (isSupportsBLEKeepAlive() && isInWiFiSetupMode()) {
            return;
        }
        super.attemptToReconnect();
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public String cannotUpdateFirmwareReason() {
        if (this.meaterLinkAddress == null) {
            return String.format(Locale.US, "No IP address for this device %s", getMEATERDeviceType().getShortName());
        }
        return super.cannotUpdateFirmwareReason();
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void cleanupAfterBLEDisconnection() {
        if (this.supportsBLEKeepAlive) {
            super.cleanupAfterBLEDisconnection();
        }
    }

    @Override // j6.g
    public CloudDisconnectedState getCloudDisconnectedState() {
        MasterDevice blockMasterDevice = getBlockMasterDevice();
        if (blockMasterDevice != null) {
            return blockMasterDevice.getCloudDisconnectedState();
        }
        return CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_ACCOUNT;
    }

    @Override // j6.g
    public String getCloudEmail() {
        MasterDevice blockMasterDevice = getBlockMasterDevice();
        if (blockMasterDevice != null) {
            return blockMasterDevice.getCloudEmail();
        }
        return null;
    }

    public s getConnectivityMonitor() {
        return this.connectivityMonitor;
    }

    @Override // j6.g
    public boolean getHasReceivedMasterStatus() {
        boolean z10;
        MasterDevice blockMasterDevice = getBlockMasterDevice();
        if (l0.d("v.2.0.2.6", this.firmwareRevision) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (blockMasterDevice == null || !blockMasterDevice.getHasReceivedMasterStatus() || !z10) {
            return false;
        }
        return true;
    }

    public ArrayList<Long> getPairedProbeIdentifiers() {
        return this.pairedProbeIdentifiers;
    }

    public DeviceConnectionMethod getSecondaryConnectionMethod() {
        return this.secondaryConnectionMethod;
    }

    public int getSecondaryConnectionSignalLevel() {
        return this.secondaryConnectionSignalLevel;
    }

    public DeviceConnectionState getSecondaryConnectionState() {
        return this.secondaryConnectionState;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice, j6.o
    public boolean getShouldShowAsConnected() {
        if (this.secondaryConnectionState == DeviceConnectionState.CONNECTED && isInWiFiSetupMode()) {
            return true;
        }
        return super.getShouldShowAsConnected();
    }

    public boolean hasBLEKeepAlive() {
        if (this.supportsBLEKeepAlive && this.secondaryConnectionState == DeviceConnectionState.CONNECTED && this.bleConnection != null) {
            return true;
        }
        return false;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean isInWiFiSetupMode() {
        if (this.supportsBLEKeepAlive) {
            t5.g gVar = (t5.g) this.bleConnection;
            if (!hasBLEKeepAlive() || gVar == null || gVar.l0() != l.f.eBlockStatusModeConfiguring) {
                return false;
            }
            return true;
        }
        return appearsToBeAdvertisingBLE();
    }

    public boolean isLegacy() {
        return this.isLegacy;
    }

    public boolean isOnlyConnectedOverSecondaryMethod() {
        if (this.connectionState == DeviceConnectionState.OFFLINE && this.secondaryConnectionState == DeviceConnectionState.CONNECTED) {
            return true;
        }
        return false;
    }

    public boolean isSupportsBLEKeepAlive() {
        return this.supportsBLEKeepAlive;
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
        if (this.connectionMethod == DeviceConnectionMethod.MEATER_LINK && this.connectionState == DeviceConnectionState.CONNECTED && this.meaterLinkAddress != null && this.batteryLevel > 0 && !appearsToHaveCookInProgress() && FirmwareVersion.sharedInstance().getFirmware(getMEATERDeviceType()) != null && FirmwareVersion.sharedInstance().needsUpdate(getMEATERDeviceType(), this.firmwareRevision)) {
            return true;
        }
        return false;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void setBatteryLevel(int i10) {
        boolean z10;
        super.setBatteryLevel(i10);
        if (isPaired() && hasLowBattery()) {
            if (getNormalizedBatteryLevel() == 1.0f && !(z10 = this.haveNotifiedUserOfEmptyBattery)) {
                s6.d.t(this, z10);
                setHaveNotifiedUserOfEmptyBattery(true);
            } else if (!this.haveNotifiedUserOfLowBattery) {
                s6.d.t(this, this.haveNotifiedUserOfEmptyBattery);
                setHaveNotifiedUserOfLowBattery(true);
            }
        }
        if (!hasLowBattery()) {
            setHaveNotifiedUserOfLowBattery(false);
            setHaveNotifiedUserOfEmptyBattery(false);
        }
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void setConnectionMethod(DeviceConnectionMethod deviceConnectionMethod) {
        if (deviceConnectionMethod.isBluetoothConnectionMethod()) {
            return;
        }
        super.setConnectionMethod(deviceConnectionMethod);
    }

    public void setConnectivityMonitor(s sVar) {
        this.connectivityMonitor = sVar;
    }

    public void setLegacy(boolean z10) {
        this.isLegacy = z10;
    }

    public void setPairedProbeIdentifiers(ArrayList<Long> arrayList) {
        this.pairedProbeIdentifiers = arrayList;
    }

    public void setSecondaryConnectionMethod(DeviceConnectionMethod deviceConnectionMethod) {
        this.secondaryConnectionMethod = deviceConnectionMethod;
    }

    public void setSecondaryConnectionSignalLevel(int i10) {
        this.secondaryConnectionSignalLevel = i10;
    }

    public void setSecondaryConnectionState(DeviceConnectionState deviceConnectionState) {
        this.secondaryConnectionState = deviceConnectionState;
    }

    public void setSupportsBLEKeepAlive(boolean z10) {
        this.supportsBLEKeepAlive = z10;
    }

    @Override // j6.x
    public boolean supportKeepAliveFeature() {
        return this.supportsBLEKeepAlive;
    }

    @Override // j6.y
    public boolean supportsNetworkSettingsMessage() {
        if (l0.d("v.2.0.1.6", this.firmwareRevision) <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void updateState() {
        notifyStateUpdatedForSelfAndChildren();
        showOverheatWarningIfNecessary();
    }
}
