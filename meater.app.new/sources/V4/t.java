package V4;

import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v1protobuf.V1MasterMessage;
import com.apptionlabs.meater_app.v2protobuf.V2MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.PingPongMessage;

/* compiled from: UDPConnectivityMonitor.java */
/* loaded from: classes2.dex */
public abstract class t {
    abstract void a(MasterMessage masterMessage, int i10, MEATERLinkAddress mEATERLinkAddress);

    abstract void b(V1MasterMessage v1MasterMessage, int i10, MEATERLinkAddress mEATERLinkAddress);

    abstract void c(V2MasterMessage v2MasterMessage, int i10, MEATERLinkAddress mEATERLinkAddress);

    abstract void d(PingPongMessage pingPongMessage, int i10, MEATERLinkAddress mEATERLinkAddress);
}
