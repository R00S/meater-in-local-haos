package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.RoomStoredMinimalAd;
import cm.aptoide.p092pt.database.room.StoredMinimalAdDAO;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p323h.p324a.p326b0.C9065a;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p328y.InterfaceC9098f;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class RoomStoredMinimalAdPersistence implements StoredMinimalAdPersistence {
    private final StoredMinimalAdDAO storedMinimalAdDAO;

    public RoomStoredMinimalAdPersistence(StoredMinimalAdDAO storedMinimalAdDAO) {
        this.storedMinimalAdDAO = storedMinimalAdDAO;
    }

    static /* synthetic */ RoomStoredMinimalAd lambda$get$0(Throwable th) throws Exception {
        return null;
    }

    @Override // cm.aptoide.p092pt.database.StoredMinimalAdPersistence
    public C11234e<RoomStoredMinimalAd> get(String str) {
        return C9059d.m29124b(this.storedMinimalAdDAO.get(str).m29215y(C9065a.m29163b()).m29213w(new InterfaceC9098f() { // from class: cm.aptoide.pt.database.d1
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) throws Exception {
                RoomStoredMinimalAdPersistence.lambda$get$0((Throwable) obj);
                return null;
            }
        }).m29200e(new InterfaceC9097e() { // from class: cm.aptoide.pt.database.p1
            @Override // p323h.p324a.p328y.InterfaceC9097e
            /* renamed from: a */
            public final void mo7420a(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }), EnumC9062a.BUFFER);
    }

    @Override // cm.aptoide.p092pt.database.StoredMinimalAdPersistence
    public void insert(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.storedMinimalAdDAO.insert(roomStoredMinimalAd);
    }

    @Override // cm.aptoide.p092pt.database.StoredMinimalAdPersistence
    public void remove(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.storedMinimalAdDAO.delete(roomStoredMinimalAd);
    }
}
