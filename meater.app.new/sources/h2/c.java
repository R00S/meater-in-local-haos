package h2;

import U1.E;
import X1.L;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import m2.InterfaceC3947a;

/* compiled from: DashManifest.java */
/* loaded from: classes.dex */
public class c implements InterfaceC3947a<c> {

    /* renamed from: a, reason: collision with root package name */
    public final long f42217a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42218b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42219c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42220d;

    /* renamed from: e, reason: collision with root package name */
    public final long f42221e;

    /* renamed from: f, reason: collision with root package name */
    public final long f42222f;

    /* renamed from: g, reason: collision with root package name */
    public final long f42223g;

    /* renamed from: h, reason: collision with root package name */
    public final long f42224h;

    /* renamed from: i, reason: collision with root package name */
    public final o f42225i;

    /* renamed from: j, reason: collision with root package name */
    public final l f42226j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f42227k;

    /* renamed from: l, reason: collision with root package name */
    public final h f42228l;

    /* renamed from: m, reason: collision with root package name */
    private final List<g> f42229m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f42217a = j10;
        this.f42218b = j11;
        this.f42219c = j12;
        this.f42220d = z10;
        this.f42221e = j13;
        this.f42222f = j14;
        this.f42223g = j15;
        this.f42224h = j16;
        this.f42228l = hVar;
        this.f42225i = oVar;
        this.f42227k = uri;
        this.f42226j = lVar;
        this.f42229m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<C3485a> c(List<C3485a> list, LinkedList<E> linkedList) {
        E ePoll = linkedList.poll();
        int i10 = ePoll.f16804B;
        ArrayList<C3485a> arrayList = new ArrayList<>();
        do {
            int i11 = ePoll.f16805C;
            C3485a c3485a = list.get(i11);
            List<j> list2 = c3485a.f42209c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(ePoll.f16806D));
                ePoll = linkedList.poll();
                if (ePoll.f16804B != i10) {
                    break;
                }
            } while (ePoll.f16805C == i11);
            arrayList.add(new C3485a(c3485a.f42207a, c3485a.f42208b, arrayList2, c3485a.f42210d, c3485a.f42211e, c3485a.f42212f));
        } while (ePoll.f16804B == i10);
        linkedList.addFirst(ePoll);
        return arrayList;
    }

    @Override // m2.InterfaceC3947a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<E> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new E(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((E) linkedList.peek()).f16804B != i10) {
                long jF = f(i10);
                if (jF != -9223372036854775807L) {
                    j10 += jF;
                }
            } else {
                g gVarD = d(i10);
                arrayList.add(new g(gVarD.f42252a, gVarD.f42253b - j10, c(gVarD.f42254c, linkedList), gVarD.f42255d));
            }
            i10++;
        }
        long j11 = this.f42218b;
        return new c(this.f42217a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f42219c, this.f42220d, this.f42221e, this.f42222f, this.f42223g, this.f42224h, this.f42228l, this.f42225i, this.f42226j, this.f42227k, arrayList);
    }

    public final g d(int i10) {
        return this.f42229m.get(i10);
    }

    public final int e() {
        return this.f42229m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f42229m.size() - 1) {
            j10 = this.f42218b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = this.f42229m.get(i10).f42253b;
        } else {
            j10 = this.f42229m.get(i10 + 1).f42253b;
            j11 = this.f42229m.get(i10).f42253b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return L.Q0(f(i10));
    }
}
