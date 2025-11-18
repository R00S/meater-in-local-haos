package I4;

import Fa.c;
import K4.b;
import com.apptionlabs.meater_app.model.MEATERDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: DashboardInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LI4/a;", "", "", "dateTime", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "LK4/b;", "onGoingRecipe", "<init>", "(JLcom/apptionlabs/meater_app/model/MEATERDevice;LK4/b;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getDateTime", "()J", "setDateTime", "(J)V", "b", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "()Lcom/apptionlabs/meater_app/model/MEATERDevice;", "setDevice", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "c", "LK4/b;", "()LK4/b;", "setOnGoingRecipe", "(LK4/b;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I4.a, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class DeviceInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long dateTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private MEATERDevice device;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private b onGoingRecipe;

    public DeviceInfo(long j10, MEATERDevice device, b bVar) {
        C3862t.g(device, "device");
        this.dateTime = j10;
        this.device = device;
        this.onGoingRecipe = bVar;
    }

    /* renamed from: a, reason: from getter */
    public final MEATERDevice getDevice() {
        return this.device;
    }

    /* renamed from: b, reason: from getter */
    public final b getOnGoingRecipe() {
        return this.onGoingRecipe;
    }

    public boolean equals(Object other) {
        return false;
    }

    public int hashCode() {
        return c.INSTANCE.b();
    }

    public String toString() {
        return "DeviceInfo(dateTime=" + this.dateTime + ", device=" + this.device + ", onGoingRecipe=" + this.onGoingRecipe + ")";
    }

    public /* synthetic */ DeviceInfo(long j10, MEATERDevice mEATERDevice, b bVar, int i10, C3854k c3854k) {
        this(j10, mEATERDevice, (i10 & 4) != 0 ? null : bVar);
    }
}
