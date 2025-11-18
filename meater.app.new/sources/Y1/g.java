package Y1;

import X1.C1804a;
import X1.L;
import X1.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: ReorderingSeiMessageQueue.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final b f19309a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<y> f19310b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f19311c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f19312d = new PriorityQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private int f19313e = -1;

    /* renamed from: f, reason: collision with root package name */
    private a f19314f;

    /* compiled from: ReorderingSeiMessageQueue.java */
    private static final class a implements Comparable<a> {

        /* renamed from: C, reason: collision with root package name */
        public long f19316C = -9223372036854775807L;

        /* renamed from: B, reason: collision with root package name */
        public final List<y> f19315B = new ArrayList();

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f19316C, aVar.f19316C);
        }

        public void j(long j10, y yVar) {
            C1804a.a(j10 != -9223372036854775807L);
            C1804a.g(this.f19315B.isEmpty());
            this.f19316C = j10;
            this.f19315B.add(yVar);
        }
    }

    /* compiled from: ReorderingSeiMessageQueue.java */
    public interface b {
        void a(long j10, y yVar);
    }

    public g(b bVar) {
        this.f19309a = bVar;
    }

    private y b(y yVar) {
        y yVar2 = this.f19310b.isEmpty() ? new y() : this.f19310b.pop();
        yVar2.S(yVar.a());
        System.arraycopy(yVar.e(), yVar.f(), yVar2.e(), 0, yVar2.a());
        return yVar2;
    }

    private void d(int i10) {
        while (this.f19312d.size() > i10) {
            a aVar = (a) L.i(this.f19312d.poll());
            for (int i11 = 0; i11 < aVar.f19315B.size(); i11++) {
                this.f19309a.a(aVar.f19316C, aVar.f19315B.get(i11));
                this.f19310b.push(aVar.f19315B.get(i11));
            }
            aVar.f19315B.clear();
            a aVar2 = this.f19314f;
            if (aVar2 != null && aVar2.f19316C == aVar.f19316C) {
                this.f19314f = null;
            }
            this.f19311c.push(aVar);
        }
    }

    public void a(long j10, y yVar) {
        int i10 = this.f19313e;
        if (i10 == 0 || (i10 != -1 && this.f19312d.size() >= this.f19313e && j10 < ((a) L.i(this.f19312d.peek())).f19316C)) {
            this.f19309a.a(j10, yVar);
            return;
        }
        y yVarB = b(yVar);
        a aVar = this.f19314f;
        if (aVar != null && j10 == aVar.f19316C) {
            aVar.f19315B.add(yVarB);
            return;
        }
        a aVar2 = this.f19311c.isEmpty() ? new a() : this.f19311c.pop();
        aVar2.j(j10, yVarB);
        this.f19312d.add(aVar2);
        this.f19314f = aVar2;
        int i11 = this.f19313e;
        if (i11 != -1) {
            d(i11);
        }
    }

    public void c() {
        d(0);
    }

    public int e() {
        return this.f19313e;
    }

    public void f(int i10) {
        C1804a.g(i10 >= 0);
        this.f19313e = i10;
        d(i10);
    }
}
