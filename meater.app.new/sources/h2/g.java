package h2;

import java.util.Collections;
import java.util.List;

/* compiled from: Period.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f42252a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42253b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C3485a> f42254c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f> f42255d;

    /* renamed from: e, reason: collision with root package name */
    public final e f42256e;

    public g(String str, long j10, List<C3485a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f42254c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f42254c.get(i11).f42208b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<C3485a> list, List<f> list2, e eVar) {
        this.f42252a = str;
        this.f42253b = j10;
        this.f42254c = Collections.unmodifiableList(list);
        this.f42255d = Collections.unmodifiableList(list2);
        this.f42256e = eVar;
    }
}
