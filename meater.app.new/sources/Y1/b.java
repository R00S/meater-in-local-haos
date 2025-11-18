package Y1;

import X1.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Mp4Box.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f19216a;

    /* compiled from: Mp4Box.java */
    /* renamed from: Y1.b$b, reason: collision with other inner class name */
    public static final class C0281b extends b {

        /* renamed from: b, reason: collision with root package name */
        public final long f19217b;

        /* renamed from: c, reason: collision with root package name */
        public final List<c> f19218c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C0281b> f19219d;

        public C0281b(int i10, long j10) {
            super(i10);
            this.f19217b = j10;
            this.f19218c = new ArrayList();
            this.f19219d = new ArrayList();
        }

        public void b(C0281b c0281b) {
            this.f19219d.add(c0281b);
        }

        public void c(c cVar) {
            this.f19218c.add(cVar);
        }

        public C0281b d(int i10) {
            int size = this.f19219d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0281b c0281b = this.f19219d.get(i11);
                if (c0281b.f19216a == i10) {
                    return c0281b;
                }
            }
            return null;
        }

        public c e(int i10) {
            int size = this.f19218c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = this.f19218c.get(i11);
                if (cVar.f19216a == i10) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // Y1.b
        public String toString() {
            return b.a(this.f19216a) + " leaves: " + Arrays.toString(this.f19218c.toArray()) + " containers: " + Arrays.toString(this.f19219d.toArray());
        }
    }

    /* compiled from: Mp4Box.java */
    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public final y f19220b;

        public c(int i10, y yVar) {
            super(i10);
            this.f19220b = yVar;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f19216a);
    }

    private b(int i10) {
        this.f19216a = i10;
    }
}
