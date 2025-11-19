package I0;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: LayoutHelper.android.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0019J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"LI0/A;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "b", "(IZ)F", "lineEnd", "lineStart", "i", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", "a", "(I)Ljava/text/Bidi;", "upstream", "e", "(IZ)I", "f", "(I)I", "h", "(I)Z", "usePrimaryDirection", "c", "(IZZ)F", "lineIndex", "d", "", "g", "(C)Z", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> paragraphEnds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Bidi> paragraphBidi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean[] bidiProcessedParagraphs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private char[] tmpBuffer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int paragraphCount;

    /* compiled from: LayoutHelper.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LI0/A$a;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Z", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.A$a, reason: from toString */
    public static final /* data */ class BidiRun {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRtl;

        public BidiRun(int i10, int i11, boolean z10) {
            this.start = i10;
            this.end = i11;
            this.isRtl = z10;
        }

        /* renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public A(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iX = Ub.n.X(this.layout.getText(), '\n', length, false, 4, null);
            length = iX < 0 ? this.layout.getText().length() : iX + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float b(int offset, boolean primary) {
        int iG = Ha.g.g(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        return primary ? this.layout.getPrimaryHorizontal(iG) : this.layout.getSecondaryHorizontal(iG);
    }

    private final int i(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && g(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.h(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.A.a(int):java.text.Bidi");
    }

    public final float c(int offset, boolean usePrimaryDirection, boolean upstream) {
        int i10 = offset;
        if (!upstream) {
            return b(offset, usePrimaryDirection);
        }
        int iA = C1188z.a(this.layout, i10, upstream);
        int lineStart = this.layout.getLineStart(iA);
        int lineEnd = this.layout.getLineEnd(iA);
        if (i10 != lineStart && i10 != lineEnd) {
            return b(offset, usePrimaryDirection);
        }
        if (i10 == 0 || i10 == this.layout.getText().length()) {
            return b(offset, usePrimaryDirection);
        }
        int iE = e(i10, upstream);
        boolean zH = h(iE);
        int i11 = i(lineEnd, lineStart);
        int iF = f(iE);
        int i12 = lineStart - iF;
        int i13 = i11 - iF;
        Bidi bidiA = a(iE);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i12, i13) : null;
        boolean z10 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zH == zIsRtlCharAt) {
                zH = !zH;
            }
            if (i10 == lineStart) {
                z10 = zH;
            } else if (!zH) {
                z10 = true;
            }
            Layout layout = this.layout;
            return z10 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            bidiRunArr[i14] = new BidiRun(bidiCreateLineBidi.getRunStart(i14) + lineStart, bidiCreateLineBidi.getRunLimit(i14) + lineStart, bidiCreateLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) bidiCreateLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i16 = -1;
        if (i10 == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    break;
                }
                if (bidiRunArr[i17].getStart() == i10) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            BidiRun bidiRun = bidiRunArr[i16];
            if (usePrimaryDirection || zH == bidiRun.getIsRtl()) {
                zH = !zH;
            }
            return (i16 == 0 && zH) ? this.layout.getLineLeft(iA) : (i16 != C3831l.c0(bidiRunArr) || zH) ? zH ? this.layout.getPrimaryHorizontal(bidiRunArr[i16 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i16 + 1].getStart()) : this.layout.getLineRight(iA);
        }
        if (i10 > i11) {
            i10 = i(i10, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                break;
            }
            if (bidiRunArr[i18].getEnd() == i10) {
                i16 = i18;
                break;
            }
            i18++;
        }
        BidiRun bidiRun2 = bidiRunArr[i16];
        if (!usePrimaryDirection && zH != bidiRun2.getIsRtl()) {
            zH = !zH;
        }
        return (i16 == 0 && zH) ? this.layout.getLineLeft(iA) : (i16 != C3831l.c0(bidiRunArr) || zH) ? zH ? this.layout.getPrimaryHorizontal(bidiRunArr[i16 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i16 + 1].getEnd()) : this.layout.getLineRight(iA);
    }

    public final int d(int lineIndex) {
        return i(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    public final int e(int offset, boolean upstream) {
        int iL = kotlin.collections.r.l(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int i10 = iL < 0 ? -(iL + 1) : iL + 1;
        if (upstream && i10 > 0) {
            int i11 = i10 - 1;
            if (offset == this.paragraphEnds.get(i11).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public final int f(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final boolean g(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == 5760 || (C3862t.i(c10, 8192) >= 0 && C3862t.i(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean h(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(f(paragraphIndex))) == -1;
    }
}
