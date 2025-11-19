package Z5;

import W5.b;
import d6.PairedDeviceResponse;
import d6.SafetyManualRequest;
import kotlin.Metadata;
import nd.s;
import oc.E;
import pd.f;
import pd.k;
import pd.o;
import pd.y;
import ta.InterfaceC4588d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ5/a;", "", "Lnd/s;", "Ld6/b;", "a", "(Lta/d;)Ljava/lang/Object;", "", "url", "Ld6/c;", "body", "Loc/E;", "b", "(Ljava/lang/String;Ld6/c;Lta/d;)Ljava/lang/Object;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface a {
    @W5.a(b.f18425C)
    @f("/v2/devices")
    Object a(InterfaceC4588d<? super s<PairedDeviceResponse>> interfaceC4588d);

    @W5.a(b.f18427E)
    @k({"Content-Type: application/json"})
    @o
    Object b(@y String str, @pd.a SafetyManualRequest safetyManualRequest, InterfaceC4588d<? super s<E>> interfaceC4588d);
}
