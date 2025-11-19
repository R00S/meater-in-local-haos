package Ub;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R4\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LUb/e;", "LTb/h;", "LHa/f;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Loa/o;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILBa/p;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/lang/CharSequence;", "b", "I", "c", "d", "LBa/p;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class e implements Tb.h<Ha.f> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<CharSequence, Integer, C4170o<Integer, Integer>> getNextMatch;

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u0006%"}, d2 = {"Ub/e$a", "", "LHa/f;", "Loa/F;", "b", "()V", "d", "()LHa/f;", "", "hasNext", "()Z", "", "B", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "C", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "D", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "E", "LHa/f;", "getNextItem", "setNextItem", "(LHa/f;)V", "nextItem", "F", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<Ha.f>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int nextState = -1;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int currentStartIndex;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int nextSearchIndex;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private Ha.f nextItem;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private int counter;

        a() {
            int iK = Ha.g.k(e.this.startIndex, 0, e.this.input.length());
            this.currentStartIndex = iK;
            this.nextSearchIndex = iK;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.nextSearchIndex
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.nextState = r1
                r0 = 0
                r6.nextItem = r0
                goto L9e
            Lc:
                Ub.e r0 = Ub.e.this
                int r0 = Ub.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.counter
                int r0 = r0 + r3
                r6.counter = r0
                Ub.e r4 = Ub.e.this
                int r4 = Ub.e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.nextSearchIndex
                Ub.e r4 = Ub.e.this
                java.lang.CharSequence r4 = Ub.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                Ha.f r0 = new Ha.f
                int r1 = r6.currentStartIndex
                Ub.e r4 = Ub.e.this
                java.lang.CharSequence r4 = Ub.e.c(r4)
                int r4 = Ub.n.S(r4)
                r0.<init>(r1, r4)
                r6.nextItem = r0
                r6.nextSearchIndex = r2
                goto L9c
            L47:
                Ub.e r0 = Ub.e.this
                Ba.p r0 = Ub.e.b(r0)
                Ub.e r4 = Ub.e.this
                java.lang.CharSequence r4 = Ub.e.c(r4)
                int r5 = r6.nextSearchIndex
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                oa.o r0 = (oa.C4170o) r0
                if (r0 != 0) goto L77
                Ha.f r0 = new Ha.f
                int r1 = r6.currentStartIndex
                Ub.e r4 = Ub.e.this
                java.lang.CharSequence r4 = Ub.e.c(r4)
                int r4 = Ub.n.S(r4)
                r0.<init>(r1, r4)
                r6.nextItem = r0
                r6.nextSearchIndex = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.currentStartIndex
                Ha.f r4 = Ha.g.p(r4, r2)
                r6.nextItem = r4
                int r2 = r2 + r0
                r6.currentStartIndex = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.nextSearchIndex = r2
            L9c:
                r6.nextState = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ub.e.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Ha.f next() {
            if (this.nextState == -1) {
                b();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            Ha.f fVar = this.nextItem;
            C3862t.e(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                b();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i10, int i11, Ba.p<? super CharSequence, ? super Integer, C4170o<Integer, Integer>> getNextMatch) {
        C3862t.g(input, "input");
        C3862t.g(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i10;
        this.limit = i11;
        this.getNextMatch = getNextMatch;
    }

    @Override // Tb.h
    public Iterator<Ha.f> iterator() {
        return new a();
    }
}
