package H4;

import com.apptionlabs.meater_app.model.SavedEventLog;
import java.util.Iterator;
import java.util.List;

/* compiled from: SavedEventLogDAO.java */
/* loaded from: classes.dex */
public abstract class o {
    public abstract List<Long> a(int i10);

    public abstract void b();

    public abstract void c(long j10, long j11);

    public void d(List<Long> list, long j10) {
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            c(it.next().longValue(), j10);
        }
    }

    public abstract void e(long j10);

    public abstract List<SavedEventLog> f(long j10);

    public abstract void g(SavedEventLog savedEventLog);
}
