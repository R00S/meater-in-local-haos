package V4;

import android.content.Intent;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.NetworkSettingsObject;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkMessage;
import com.apptionlabs.meater_app.v2protobuf.V2NetworkSettings;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMessage;
import com.apptionlabs.meater_app.v3protobuf.NetworkSettings;

/* compiled from: MEATERLinkManagerNetWorkSettingRequest.java */
/* loaded from: classes2.dex */
public class o {
    public void a(NetworkSettings networkSettings) {
        NetworkSettingsObject networkSettingsObject = new NetworkSettingsObject(networkSettings);
        Intent intent = new Intent(ProtocolParameters.NETWORK_SETTING_NOTIF);
        intent.putExtra(MEATERIntent.EXTRA_NETWORK_SETTING_OBJECT, networkSettingsObject);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().getApplicationContext().sendBroadcast(intent);
    }

    public void b(V2NetworkSettings v2NetworkSettings) {
        NetworkSettingsObject networkSettingsObject = new NetworkSettingsObject(v2NetworkSettings);
        Intent intent = new Intent(ProtocolParameters.NETWORK_SETTING_NOTIF);
        intent.putExtra(MEATERIntent.EXTRA_NETWORK_SETTING_OBJECT, networkSettingsObject);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().getApplicationContext().sendBroadcast(intent);
    }

    public void c(MEATERDevice mEATERDevice, O5.i iVar, int i10, boolean z10) {
        byte[] bArrEncode = z10 ? new V2MeaterLinkMessage.Builder().header(p.N(i10)).networkSettingsRequestMessage(p.O()).build().encode() : new MeaterLinkMessage.Builder().header(p.s(i10)).networkSettingsRequestMessage(p.w()).build().encode();
        if (mEATERDevice.isReachableOverLink()) {
            if (iVar == null) {
                return;
            }
            iVar.f(bArrEncode, mEATERDevice.getMeaterLinkAddress());
            U4.b.n("SENT : NetWorkSettingMessageRequest MeaterLink", new Object[0]);
            return;
        }
        if (E4.i.D().X()) {
            U4.b.n("SENT %s : NETWORK-SETTINGS-REQ ", mEATERDevice.shortDeviceIDString());
            E4.i.D().q0(bArrEncode, mEATERDevice, false);
        }
    }
}
