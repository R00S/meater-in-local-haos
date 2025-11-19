package H4;

import com.apptionlabs.meater_app.model.CookNote;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: CookNoteDAO.java */
/* loaded from: classes.dex */
public interface c {
    void a();

    List<CookNote> b(long j10);

    List<CookNote> c();

    void d(CookNote... cookNoteArr);

    List<Long> e();

    List<CookNote> f(long j10);

    void g(CookNote cookNote);

    void h(CookNote cookNote);

    default List<CookNote> i(long j10) {
        ArrayList arrayList = new ArrayList();
        List<CookNote> listF = f(j10);
        Objects.requireNonNull(listF);
        arrayList.addAll(listF);
        List<CookNote> listB = b(j10);
        Objects.requireNonNull(listB);
        arrayList.addAll(listB);
        return arrayList;
    }

    List<CookNote> j();

    CookNote k(long j10);
}
