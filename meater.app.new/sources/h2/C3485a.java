package h2;

import java.util.Collections;
import java.util.List;

/* compiled from: AdaptationSet.java */
/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3485a {

    /* renamed from: a, reason: collision with root package name */
    public final long f42207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42208b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f42209c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f42210d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f42211e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e> f42212f;

    public C3485a(long j10, int i10, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f42207a = j10;
        this.f42208b = i10;
        this.f42209c = Collections.unmodifiableList(list);
        this.f42210d = Collections.unmodifiableList(list2);
        this.f42211e = Collections.unmodifiableList(list3);
        this.f42212f = Collections.unmodifiableList(list4);
    }
}
