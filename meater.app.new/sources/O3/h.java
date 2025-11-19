package O3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<S3.o, Path>> f13189a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f13190b;

    /* renamed from: c, reason: collision with root package name */
    private final List<S3.i> f13191c;

    public h(List<S3.i> list) {
        this.f13191c = list;
        this.f13189a = new ArrayList(list.size());
        this.f13190b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f13189a.add(list.get(i10).b().h());
            this.f13190b.add(list.get(i10).c().h());
        }
    }

    public List<a<S3.o, Path>> a() {
        return this.f13189a;
    }

    public List<S3.i> b() {
        return this.f13191c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f13190b;
    }
}
