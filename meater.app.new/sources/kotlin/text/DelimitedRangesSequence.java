package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;

/* compiled from: Strings.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m32267d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", HttpUrl.FRAGMENT_ENCODE_SET, "startIndex", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.h0.e, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* renamed from: a */
    private final CharSequence f40659a;

    /* renamed from: b */
    private final int f40660b;

    /* renamed from: c */
    private final int f40661c;

    /* renamed from: d */
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> f40662d;

    /* compiled from: Strings.kt */
    @Metadata(m32266d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, m32267d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ranges/IntRange;", "counter", HttpUrl.FRAGMENT_ENCODE_SET, "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.h0.e$a */
    public static final class a implements Iterator<IntRange>, KMappedMarker {

        /* renamed from: f */
        private int f40663f = -1;

        /* renamed from: g */
        private int f40664g;

        /* renamed from: h */
        private int f40665h;

        /* renamed from: i */
        private IntRange f40666i;

        /* renamed from: j */
        private int f40667j;

        a() {
            int iM32423f = C9848l.m32423f(DelimitedRangesSequence.this.f40660b, 0, DelimitedRangesSequence.this.f40659a.length());
            this.f40664g = iM32423f;
            this.f40665h = iM32423f;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m37422b() {
            /*
                r6 = this;
                int r0 = r6.f40665h
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f40663f = r1
                r0 = 0
                r6.f40666i = r0
                goto L9e
            Lc:
                kotlin.h0.e r0 = kotlin.text.DelimitedRangesSequence.this
                int r0 = kotlin.text.DelimitedRangesSequence.m37420d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f40667j
                int r0 = r0 + r3
                r6.f40667j = r0
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                int r4 = kotlin.text.DelimitedRangesSequence.m37420d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f40665h
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m37419c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.e0.f r0 = new kotlin.e0.f
                int r1 = r6.f40664g
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m37419c(r4)
                int r4 = kotlin.text.C10537l.m37464Q(r4)
                r0.<init>(r1, r4)
                r6.f40666i = r0
                r6.f40665h = r2
                goto L9c
            L47:
                kotlin.h0.e r0 = kotlin.text.DelimitedRangesSequence.this
                kotlin.a0.c.p r0 = kotlin.text.DelimitedRangesSequence.m37418b(r0)
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m37419c(r4)
                int r5 = r6.f40665h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.m r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.e0.f r0 = new kotlin.e0.f
                int r1 = r6.f40664g
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.m37419c(r4)
                int r4 = kotlin.text.C10537l.m37464Q(r4)
                r0.<init>(r1, r4)
                r6.f40666i = r0
                r6.f40665h = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m37646a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m37647b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f40664g
                kotlin.e0.f r4 = kotlin.ranges.C9846j.m32417k(r4, r2)
                r6.f40666i = r4
                int r2 = r2 + r0
                r6.f40664g = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f40665h = r2
            L9c:
                r6.f40663f = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.a.m37422b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f40663f == -1) {
                m37422b();
            }
            if (this.f40663f == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f40666i;
            C9801m.m32344d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f40666i = null;
            this.f40663f = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40663f == -1) {
                m37422b();
            }
            return this.f40663f == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(CharSequence charSequence, int i2, int i3, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        C9801m.m32346f(charSequence, "input");
        C9801m.m32346f(function2, "getNextMatch");
        this.f40659a = charSequence;
        this.f40660b = i2;
        this.f40661c = i3;
        this.f40662d = function2;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<IntRange> iterator() {
        return new a();
    }
}
