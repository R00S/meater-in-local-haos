package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final G1.b f25272a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f25273b;

    /* renamed from: c, reason: collision with root package name */
    private final a f25274c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f25275d;

    /* compiled from: MetadataRepo.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f25276a;

        /* renamed from: b, reason: collision with root package name */
        private p f25277b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray<a> sparseArray = this.f25276a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        final p b() {
            return this.f25277b;
        }

        void c(p pVar, int i10, int i11) {
            a aVarA = a(pVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f25276a.put(pVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(pVar, i10 + 1, i11);
            } else {
                aVarA.f25277b = pVar;
            }
        }

        a(int i10) {
            this.f25276a = new SparseArray<>(i10);
        }
    }

    private n(Typeface typeface, G1.b bVar) {
        this.f25275d = typeface;
        this.f25272a = bVar;
        this.f25273b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(G1.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f25273b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            n1.o.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            n1.o.b();
        }
    }

    public char[] c() {
        return this.f25273b;
    }

    public G1.b d() {
        return this.f25272a;
    }

    int e() {
        return this.f25272a.l();
    }

    a f() {
        return this.f25274c;
    }

    Typeface g() {
        return this.f25275d;
    }

    void h(p pVar) {
        r1.i.h(pVar, "emoji metadata cannot be null");
        r1.i.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f25274c.c(pVar, 0, pVar.c() - 1);
    }
}
