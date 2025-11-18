package p5;

import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import p5.C4209C;
import p5.C4234y;

/* compiled from: FirmwareUpdateFactoryProvider.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010$R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006&"}, d2 = {"Lp5/n;", "", "<init>", "()V", "LT4/p;", "b", "()LT4/p;", "", "d", "()Ljava/lang/String;", "c", "Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "f", "()Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "Lp5/l;", "e", "()Lp5/l;", "device", "h", "(LT4/p;)Lp5/n;", "firmwareUrl", "j", "(Ljava/lang/String;)Lp5/n;", "firmwareCRC", "i", "meaterLinkAddress", "k", "(Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;)Lp5/n;", "callback", "g", "(Lp5/l;)Lp5/n;", "Lp5/m;", "a", "()Lp5/m;", "LT4/p;", "Ljava/lang/String;", "Lcom/apptionlabs/meater_app/udp/MEATERLinkAddress;", "Lp5/l;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4223n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private T4.p device;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String firmwareUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String firmwareCRC;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private MEATERLinkAddress meaterLinkAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4221l callback;

    private final T4.p b() {
        T4.p pVar = this.device;
        if (pVar != null) {
            return pVar;
        }
        C3862t.u("device");
        return null;
    }

    /* renamed from: c, reason: from getter */
    private final String getFirmwareCRC() {
        return this.firmwareCRC;
    }

    /* renamed from: d, reason: from getter */
    private final String getFirmwareUrl() {
        return this.firmwareUrl;
    }

    /* renamed from: e, reason: from getter */
    private final InterfaceC4221l getCallback() {
        return this.callback;
    }

    /* renamed from: f, reason: from getter */
    private final MEATERLinkAddress getMeaterLinkAddress() {
        return this.meaterLinkAddress;
    }

    public final InterfaceC4222m a() {
        T4.p pVar = this.device;
        if (pVar == null) {
            C3862t.u("device");
            pVar = null;
        }
        return pVar.getClass().isAssignableFrom(MEATERBlock.class) ? new C4234y.a().g(b()).h(getFirmwareUrl()).i(getMeaterLinkAddress()).f(getCallback()).a() : new C4209C.a().g(b()).i(getFirmwareUrl()).h(getFirmwareCRC()).f(getCallback()).a();
    }

    public final C4223n g(InterfaceC4221l callback) {
        C3862t.g(callback, "callback");
        this.callback = callback;
        return this;
    }

    public final C4223n h(T4.p device) {
        C3862t.g(device, "device");
        this.device = device;
        return this;
    }

    public final C4223n i(String firmwareCRC) {
        this.firmwareCRC = firmwareCRC;
        return this;
    }

    public final C4223n j(String firmwareUrl) {
        this.firmwareUrl = firmwareUrl;
        return this;
    }

    public final C4223n k(MEATERLinkAddress meaterLinkAddress) {
        this.meaterLinkAddress = meaterLinkAddress;
        return this;
    }
}
