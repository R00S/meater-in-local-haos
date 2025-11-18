package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.InterfaceC0646e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f */
    int f4230f = 0;

    /* renamed from: g */
    final HashMap<Integer, String> f4231g = new HashMap<>();

    /* renamed from: h */
    final RemoteCallbackList<InterfaceC0645d> f4232h = new RemoteCallbackListC0640a();

    /* renamed from: i */
    private final InterfaceC0646e.a f4233i = new BinderC0641b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class RemoteCallbackListC0640a extends RemoteCallbackList<InterfaceC0645d> {
        RemoteCallbackListC0640a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC0645d interfaceC0645d, Object obj) {
            MultiInstanceInvalidationService.this.f4231g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class BinderC0641b extends InterfaceC0646e.a {
        BinderC0641b() {
        }

        @Override // androidx.room.InterfaceC0646e
        /* renamed from: S6 */
        public void mo4583S6(InterfaceC0645d interfaceC0645d, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f4232h) {
                MultiInstanceInvalidationService.this.f4232h.unregister(interfaceC0645d);
                MultiInstanceInvalidationService.this.f4231g.remove(Integer.valueOf(i2));
            }
        }

        @Override // androidx.room.InterfaceC0646e
        /* renamed from: k2 */
        public int mo4584k2(InterfaceC0645d interfaceC0645d, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4232h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f4230f + 1;
                multiInstanceInvalidationService.f4230f = i2;
                if (multiInstanceInvalidationService.f4232h.register(interfaceC0645d, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f4231g.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4230f--;
                return 0;
            }
        }

        @Override // androidx.room.InterfaceC0646e
        /* renamed from: z6 */
        public void mo4585z6(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4232h) {
                String str = MultiInstanceInvalidationService.this.f4231g.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f4232h.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f4232h.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f4231g.get(Integer.valueOf(iIntValue));
                        if (i2 != iIntValue && str.equals(str2)) {
                            try {
                                ((InterfaceC0645d) MultiInstanceInvalidationService.this.f4232h.getBroadcastItem(i3)).mo4587L1(strArr);
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f4232h.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4233i;
    }
}
