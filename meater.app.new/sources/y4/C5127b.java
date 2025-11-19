package y4;

import android.annotation.SuppressLint;
import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ScanDeviceSet.java */
@SuppressLint({"UseSparseArrays"})
/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5127b {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map<Long, C5126a> f53113a = new HashMap();

    private C5126a c(C5126a c5126a) {
        return c5126a.e(true);
    }

    public boolean a(MEATERDevice mEATERDevice) {
        if (mEATERDevice == null) {
            return false;
        }
        Map<Long, C5126a> map = f53113a;
        synchronized (map) {
            try {
                if (map.containsKey(Long.valueOf(mEATERDevice.getDeviceID()))) {
                    return false;
                }
                map.put(Long.valueOf(mEATERDevice.getDeviceID()), new C5126a(mEATERDevice));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C5126a b() {
        Map<Long, C5126a> map = f53113a;
        synchronized (map) {
            try {
                for (C5126a c5126a : map.values()) {
                    if (c5126a.b()) {
                        return c5126a;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C5126a d() {
        Map<Long, C5126a> map = f53113a;
        synchronized (map) {
            try {
                Collection<C5126a> collectionValues = map.values();
                for (C5126a c5126a : collectionValues) {
                    if (c5126a.b()) {
                        return c(c5126a);
                    }
                }
                for (C5126a c5126a2 : collectionValues) {
                    if (c5126a2.c()) {
                        return c(c5126a2);
                    }
                }
                for (C5126a c5126a3 : collectionValues) {
                    if (c5126a3.d()) {
                        U4.b.a("[scan] next found a device %s", c5126a3.f53107b.getDebugLogDescription());
                        return c(c5126a3);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(MEATERDevice mEATERDevice) {
        boolean z10;
        if (mEATERDevice == null) {
            return false;
        }
        C5126a c5126aB = b();
        if (c5126aB != null && c5126aB.f53107b.getDeviceID() == mEATERDevice.getDeviceID()) {
            c5126aB.a();
            d();
        }
        Map<Long, C5126a> map = f53113a;
        synchronized (map) {
            z10 = map.remove(Long.valueOf(mEATERDevice.getDeviceID())) != null;
        }
        return z10;
    }

    public void f() {
        f53113a.clear();
    }
}
