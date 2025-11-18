package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Set;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.j f25236a;

    /* renamed from: b, reason: collision with root package name */
    private final n f25237b;

    /* renamed from: c, reason: collision with root package name */
    private f.e f25238c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25239d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f25240e;

    /* compiled from: EmojiProcessor.java */
    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* compiled from: EmojiProcessor.java */
    private static class b implements c<r> {

        /* renamed from: a, reason: collision with root package name */
        public r f25241a;

        /* renamed from: b, reason: collision with root package name */
        private final f.j f25242b;

        b(r rVar, f.j jVar) {
            this.f25241a = rVar;
            this.f25242b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f25241a == null) {
                this.f25241a = new r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f25241a.setSpan(this.f25242b.a(pVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public r a() {
            return this.f25241a;
        }
    }

    /* compiled from: EmojiProcessor.java */
    private interface c<T> {
        T a();

        boolean b(CharSequence charSequence, int i10, int i11, p pVar);
    }

    /* compiled from: EmojiProcessor.java */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f25244a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final n.a f25245b;

        /* renamed from: c, reason: collision with root package name */
        private n.a f25246c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f25247d;

        /* renamed from: e, reason: collision with root package name */
        private int f25248e;

        /* renamed from: f, reason: collision with root package name */
        private int f25249f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f25250g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f25251h;

        e(n.a aVar, boolean z10, int[] iArr) {
            this.f25245b = aVar;
            this.f25246c = aVar;
            this.f25250g = z10;
            this.f25251h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f25244a = 1;
            this.f25246c = this.f25245b;
            this.f25249f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f25246c.b().j() || d(this.f25248e)) {
                return true;
            }
            if (this.f25250g) {
                if (this.f25251h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f25251h, this.f25246c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            n.a aVarA = this.f25246c.a(i10);
            int iG = 2;
            if (this.f25244a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f25244a = 2;
                    this.f25246c = aVarA;
                    this.f25249f = 1;
                }
            } else if (aVarA != null) {
                this.f25246c = aVarA;
                this.f25249f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f25246c.b() != null) {
                    iG = 3;
                    if (this.f25249f != 1 || h()) {
                        this.f25247d = this.f25246c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f25248e = i10;
            return iG;
        }

        p b() {
            return this.f25246c.b();
        }

        p c() {
            return this.f25247d.b();
        }

        boolean e() {
            return this.f25244a == 2 && this.f25246c.b() != null && (this.f25249f > 1 || h());
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set<int[]> set) {
        this.f25236a = jVar;
        this.f25237b = nVar;
        this.f25238c = eVar;
        this.f25239d = z10;
        this.f25240e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(iMax, iMin, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f25238c.a(charSequence, i10, i11, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private <T> T i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int iCharCount;
        e eVar = new e(this.f25237b.f(), this.f25239d, this.f25240e);
        int i13 = 0;
        boolean zB = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zB) {
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !d(charSequence, iCharCount, i10, eVar.c())) {
                        zB = cVar.b(charSequence, iCharCount, i10, eVar.c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.e() && i13 < i12 && zB && (z10 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.b(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.a();
    }

    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        r rVar;
        j[] jVarArr;
        boolean z11 = charSequence instanceof o;
        if (z11) {
            ((o) charSequence).a();
        }
        if (!z11) {
            try {
                rVar = charSequence instanceof Spannable ? new r((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, j.class) > i11) ? null : new r(charSequence);
            } finally {
                if (z11) {
                    ((o) charSequence).d();
                }
            }
        }
        if (rVar != null && (jVarArr = (j[]) rVar.getSpans(i10, i11, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = rVar.getSpanStart(jVar);
                int spanEnd = rVar.getSpanEnd(jVar);
                if (spanStart != i11) {
                    rVar.removeSpan(jVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        int i13 = i11;
        if (i10 != i13 && i10 < charSequence.length()) {
            if (i12 != Integer.MAX_VALUE && rVar != null) {
                i12 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
            }
            r rVar2 = (r) i(charSequence, i10, i13, i12, z10, new b(rVar, this.f25236a));
            if (rVar2 == null) {
                if (z11) {
                    ((o) charSequence).d();
                }
                return charSequence;
            }
            Spannable spannableB = rVar2.b();
            if (z11) {
                ((o) charSequence).d();
            }
            return spannableB;
        }
        return charSequence;
    }

    /* compiled from: EmojiProcessor.java */
    private static class d implements c<d> {

        /* renamed from: a, reason: collision with root package name */
        private final String f25243a;

        d(String str) {
            this.f25243a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f25243a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }
}
