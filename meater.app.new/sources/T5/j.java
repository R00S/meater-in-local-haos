package T5;

import android.app.Application;
import android.view.B;
import android.view.C2094b;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.List;

/* compiled from: MEATERDeviceViewModel.java */
/* loaded from: classes2.dex */
public class j extends C2094b {
    public j(Application application) {
        super(application);
    }

    public B<MEATERDevice> i(long j10) {
        return LocalStorage.sharedStorage().deviceDAO().d(j10);
    }

    public B<List<MEATERDevice>> j() {
        return LocalStorage.sharedStorage().deviceDAO().b();
    }

    public B<List<MEATERDevice>> k() {
        return LocalStorage.sharedStorage().deviceDAO().f();
    }
}
