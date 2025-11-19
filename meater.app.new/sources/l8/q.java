package l8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Splitter.java */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3911d f44455a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44456b;

    /* renamed from: c, reason: collision with root package name */
    private final c f44457c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44458d;

    /* compiled from: Splitter.java */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3911d f44459a;

        /* compiled from: Splitter.java */
        /* renamed from: l8.q$a$a, reason: collision with other inner class name */
        class C0594a extends b {
            C0594a(q qVar, CharSequence charSequence) {
                super(qVar, charSequence);
            }

            @Override // l8.q.b
            int g(int i10) {
                return i10 + 1;
            }

            @Override // l8.q.b
            int h(int i10) {
                return a.this.f44459a.c(this.f44461D, i10);
            }
        }

        a(AbstractC3911d abstractC3911d) {
            this.f44459a = abstractC3911d;
        }

        @Override // l8.q.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(q qVar, CharSequence charSequence) {
            return new C0594a(qVar, charSequence);
        }
    }

    /* compiled from: Splitter.java */
    private static abstract class b extends AbstractC3909b<String> {

        /* renamed from: D, reason: collision with root package name */
        final CharSequence f44461D;

        /* renamed from: E, reason: collision with root package name */
        final AbstractC3911d f44462E;

        /* renamed from: F, reason: collision with root package name */
        final boolean f44463F;

        /* renamed from: G, reason: collision with root package name */
        int f44464G = 0;

        /* renamed from: H, reason: collision with root package name */
        int f44465H;

        protected b(q qVar, CharSequence charSequence) {
            this.f44462E = qVar.f44455a;
            this.f44463F = qVar.f44456b;
            this.f44465H = qVar.f44458d;
            this.f44461D = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.AbstractC3909b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String b() {
            int iH;
            int i10 = this.f44464G;
            while (true) {
                int i11 = this.f44464G;
                if (i11 == -1) {
                    return d();
                }
                iH = h(i11);
                if (iH == -1) {
                    iH = this.f44461D.length();
                    this.f44464G = -1;
                } else {
                    this.f44464G = g(iH);
                }
                int i12 = this.f44464G;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f44464G = i13;
                    if (i13 > this.f44461D.length()) {
                        this.f44464G = -1;
                    }
                } else {
                    while (i10 < iH && this.f44462E.e(this.f44461D.charAt(i10))) {
                        i10++;
                    }
                    while (iH > i10 && this.f44462E.e(this.f44461D.charAt(iH - 1))) {
                        iH--;
                    }
                    if (!this.f44463F || i10 != iH) {
                        break;
                    }
                    i10 = this.f44464G;
                }
            }
            int i14 = this.f44465H;
            if (i14 == 1) {
                iH = this.f44461D.length();
                this.f44464G = -1;
                while (iH > i10 && this.f44462E.e(this.f44461D.charAt(iH - 1))) {
                    iH--;
                }
            } else {
                this.f44465H = i14 - 1;
            }
            return this.f44461D.subSequence(i10, iH).toString();
        }

        abstract int g(int i10);

        abstract int h(int i10);
    }

    /* compiled from: Splitter.java */
    private interface c {
        Iterator<String> a(q qVar, CharSequence charSequence);
    }

    private q(c cVar) {
        this(cVar, false, AbstractC3911d.f(), Integer.MAX_VALUE);
    }

    public static q d(char c10) {
        return e(AbstractC3911d.d(c10));
    }

    public static q e(AbstractC3911d abstractC3911d) {
        m.l(abstractC3911d);
        return new q(new a(abstractC3911d));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f44457c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        m.l(charSequence);
        Iterator<String> itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add(itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private q(c cVar, boolean z10, AbstractC3911d abstractC3911d, int i10) {
        this.f44457c = cVar;
        this.f44456b = z10;
        this.f44455a = abstractC3911d;
        this.f44458d = i10;
    }
}
