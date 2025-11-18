package H4;

import android.view.B;
import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MEATERDeviceDAO.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0014\"\u00020\u0006H'¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00112\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H'¢\u0006\u0004\b\u001c\u0010\u0003¨\u0006\u001d"}, d2 = {"LH4/e;", "", "<init>", "()V", "Landroidx/lifecycle/B;", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "b", "()Landroidx/lifecycle/B;", "f", "", "deviceID", "d", "(J)Landroidx/lifecycle/B;", "a", "()Ljava/util/List;", "device", "Loa/F;", "e", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "", "h", "([Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "devices", "g", "(Ljava/util/ArrayList;)V", "c", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e {
    public abstract List<MEATERDevice> a();

    public abstract B<List<MEATERDevice>> b();

    public abstract void c();

    public abstract B<MEATERDevice> d(long deviceID);

    public abstract void e(MEATERDevice device);

    public abstract B<List<MEATERDevice>> f();

    public void g(ArrayList<MEATERDevice> devices) {
        C3862t.g(devices, "devices");
        Iterator<MEATERDevice> it = devices.iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            MEATERDevice next = it.next();
            C3862t.f(next, "next(...)");
            MEATERDevice mEATERDevice = next;
            e(mEATERDevice);
            mEATERDevice.setModified(false);
        }
    }

    public abstract void h(MEATERDevice... device);
}
