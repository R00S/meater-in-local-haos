package h4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import n4.DevicesData;
import n4.PairedDeviceListRequestInput;
import q4.InterfaceC4285a;
import r4.InterfaceC4345b;
import ta.InterfaceC4588d;

/* compiled from: PairedDevicesListUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lh4/a;", "Lr4/b;", "Lq4/a;", "deviceRepository", "<init>", "(Lq4/a;)V", "Ln4/c;", "input", "Ll4/b;", "Ln4/b;", "a", "(Ln4/c;Lta/d;)Ljava/lang/Object;", "Lq4/a;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3488a implements InterfaceC4345b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4285a deviceRepository;

    public C3488a(InterfaceC4285a deviceRepository) {
        C3862t.g(deviceRepository, "deviceRepository");
        this.deviceRepository = deviceRepository;
    }

    @Override // r4.InterfaceC4345b
    public Object a(PairedDeviceListRequestInput pairedDeviceListRequestInput, InterfaceC4588d<? super AbstractC3900b<DevicesData>> interfaceC4588d) {
        return this.deviceRepository.b(pairedDeviceListRequestInput, interfaceC4588d);
    }
}
