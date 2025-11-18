package V4;

import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MasterDevice;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v3protobuf.MasterStatus;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMessage;

/* compiled from: MEATERLinkManagerMasterStatusRequest.java */
/* loaded from: classes2.dex */
public class n {
    public void a(MasterDevice masterDevice, MasterStatus masterStatus) {
        U4.b.n("handleMasterStatusMessage", new Object[0]);
        if (masterDevice != null) {
            U4.b.n("addStatusToMaster found " + masterDevice.getDeviceID(), new Object[0]);
            masterDevice.update(masterStatus);
        }
    }

    public void b(MEATERLinkAddress mEATERLinkAddress, O5.i iVar, int i10) {
        DeviceConnectionMethod deviceConnectionMethod = mEATERLinkAddress != null ? DeviceConnectionMethod.MEATER_LINK : DeviceConnectionMethod.MEATER_CLOUD;
        ThisDevice thisDevice = ThisDevice.INSTANCE;
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.t(i10)).masterStatusMessage(p.p(thisDevice, i10)).build();
        if (deviceConnectionMethod != DeviceConnectionMethod.MEATER_LINK) {
            E4.i.D().r0(meaterLinkMessageBuild.encode(), thisDevice, false);
            U4.b.e("REC : MASTER-STATUS-REQUEST (msg:%d)", Integer.valueOf(i10));
            U4.b.e("SENT : MASTER-STATUS (msg:%d)", Integer.valueOf(i10));
        } else {
            if (iVar == null) {
                return;
            }
            iVar.f(meaterLinkMessageBuild.encode(), mEATERLinkAddress);
            U4.b.n("REC %s : MASTER-STATUS-REQUEST (msg:%d)", mEATERLinkAddress, Integer.valueOf(i10));
            U4.b.n("SENT %s : MASTER-STATUS (msg:%d)", mEATERLinkAddress, Integer.valueOf(i10));
        }
    }

    public void c(MasterDevice masterDevice, O5.i iVar, int i10) {
        byte[] bArrEncode = new MeaterLinkMessage.Builder().header(p.s(i10)).masterStatusRequestMessage(p.q(masterDevice, i10)).build().encode();
        MEATERDevice mEATERDeviceO = M4.h.f11978a.o(masterDevice.getDeviceID());
        if ((mEATERDeviceO == null || !mEATERDeviceO.isReachableOverLink()) && masterDevice.getIpAddress() == null) {
            E4.i.D().q0(bArrEncode, masterDevice, false);
            U4.b.n("SENT : MASTER-STATUS-REQUEST Cloud", new Object[0]);
        } else {
            if (iVar == null) {
                return;
            }
            iVar.f(bArrEncode, masterDevice.getMEATERLinkAddress());
            U4.b.n("SENT : MASTER-STATUS-REQUEST MeaterLink", new Object[0]);
        }
    }
}
