package N3;

import S3.j;
import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: d, reason: collision with root package name */
    private final String f12446d;

    /* renamed from: f, reason: collision with root package name */
    private final S3.j f12448f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f12443a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f12444b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f12445c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<m> f12447e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12449a;

        static {
            int[] iArr = new int[j.a.values().length];
            f12449a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12449a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12449a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12449a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12449a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(S3.j jVar) {
        this.f12446d = jVar.c();
        this.f12448f = jVar;
    }

    private void a() {
        for (int i10 = 0; i10 < this.f12447e.size(); i10++) {
            this.f12445c.addPath(this.f12447e.get(i10).h());
        }
    }

    @TargetApi(19)
    private void c(Path.Op op) {
        this.f12444b.reset();
        this.f12443a.reset();
        for (int size = this.f12447e.size() - 1; size >= 1; size--) {
            m mVar = this.f12447e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path pathH = listL.get(size2).h();
                    pathH.transform(dVar.m());
                    this.f12444b.addPath(pathH);
                }
            } else {
                this.f12444b.addPath(mVar.h());
            }
        }
        m mVar2 = this.f12447e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> listL2 = dVar2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path pathH2 = listL2.get(i10).h();
                pathH2.transform(dVar2.m());
                this.f12443a.addPath(pathH2);
            }
        } else {
            this.f12443a.set(mVar2.h());
        }
        this.f12445c.op(this.f12443a, this.f12444b, op);
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f12447e.size(); i10++) {
            this.f12447e.get(i10).b(list, list2);
        }
    }

    @Override // N3.j
    public void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.f12447e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // N3.m
    public Path h() {
        this.f12445c.reset();
        if (this.f12448f.d()) {
            return this.f12445c;
        }
        int i10 = a.f12449a[this.f12448f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            c(Path.Op.UNION);
        } else if (i10 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            c(Path.Op.XOR);
        }
        return this.f12445c;
    }
}
