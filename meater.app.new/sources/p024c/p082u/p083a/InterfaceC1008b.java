package p024c.p082u.p083a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase.java */
/* renamed from: c.u.a.b */
/* loaded from: classes.dex */
public interface InterfaceC1008b extends Closeable {
    /* renamed from: F */
    InterfaceC1012f mo6451F(String str);

    /* renamed from: H0 */
    Cursor mo6452H0(InterfaceC1011e interfaceC1011e);

    /* renamed from: P0 */
    boolean mo6453P0();

    /* renamed from: S */
    Cursor mo6454S(InterfaceC1011e interfaceC1011e, CancellationSignal cancellationSignal);

    /* renamed from: g */
    String mo6455g();

    boolean isOpen();

    /* renamed from: j0 */
    void mo6456j0();

    /* renamed from: l0 */
    void mo6457l0(String str, Object[] objArr) throws SQLException;

    /* renamed from: n */
    void mo6458n();

    /* renamed from: s */
    List<Pair<String, String>> mo6459s();

    /* renamed from: u0 */
    Cursor mo6460u0(String str);

    /* renamed from: v */
    void mo6461v(String str) throws SQLException;

    /* renamed from: z0 */
    void mo6462z0();
}
