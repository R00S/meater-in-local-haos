package Ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0016\u001a#\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u0016\u001a#\u0010\u001c\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0018\u001a#\u0010\u001d\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0016\u001a#\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0018\u001a!\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010#\u001a\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b'\u0010%\u001a;\u0010,\u001a\u00020\f*\u00020\u00002\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\fH\u0000¢\u0006\u0004\b,\u0010-\u001a#\u0010/\u001a\u00020\f*\u00020\u00002\u0006\u0010.\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b/\u00100\u001a#\u00101\u001a\u00020\f*\u00020\u00002\u0006\u0010.\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b1\u00100\u001a#\u00102\u001a\u00020\f*\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b2\u00103\u001a#\u00104\u001a\u00020\f*\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b4\u00103\u001a-\u00107\u001a\u00020\u0003*\u00020\u00002\u0006\u00106\u001a\u0002052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b7\u00108\u001a-\u00109\u001a\u00020\u0003*\u00020\u00002\u0006\u00106\u001a\u0002052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b9\u00108\u001a=\u0010;\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010+\u001a\u00020\f2\b\b\u0002\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010<\u001aG\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010?*\u00020\u00002\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0=2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\f2\u0006\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010A\u001a-\u0010B\u001a\u00020\u0003*\u00020\u00002\u0006\u0010.\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\bB\u0010C\u001a-\u0010E\u001a\u00020\u0003*\u00020\u00002\u0006\u0010D\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00020\u0003*\u00020\u00002\u0006\u0010.\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\bG\u0010C\u001a-\u0010H\u001a\u00020\u0003*\u00020\u00002\u0006\u0010D\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\bH\u0010F\u001a&\u0010I\u001a\u00020\f*\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\bI\u00103\u001a&\u0010J\u001a\u00020\f*\u00020\u00002\u0006\u0010.\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\bJ\u00100\u001a?\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000f0M*\u00020\u00002\u0006\u0010K\u001a\u0002052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bN\u0010O\u001aG\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f0M*\u00020\u00002\u000e\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0P2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010T\u001a\u00020S2\u0006\u0010L\u001a\u00020\u0003H\u0000¢\u0006\u0004\bT\u0010U\u001a?\u0010V\u001a\b\u0012\u0004\u0012\u00020\t0M*\u00020\u00002\u0012\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0P\"\u00020\t2\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\u0003¢\u0006\u0004\bV\u0010W\u001a?\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0X*\u00020\u00002\u0012\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0P\"\u00020\t2\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\u0003¢\u0006\u0004\bY\u0010Z\u001a7\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0X*\u00020\u00002\n\u0010K\u001a\u000205\"\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\u0003¢\u0006\u0004\b[\u0010\\\u001a1\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0X*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010+\u001a\u00020\f2\u0006\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\b]\u0010^\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\t0M*\u00020\u0000¢\u0006\u0004\b_\u0010`\u001a\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0X*\u00020\u0000¢\u0006\u0004\ba\u0010b\"\u0015\u0010e\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bc\u0010d\"\u0015\u0010h\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006i"}, d2 = {"", "U0", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "", "padChar", "i0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "", "j0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "a0", "(Ljava/lang/CharSequence;)Z", "LHa/f;", "range", "E0", "(Ljava/lang/CharSequence;LHa/f;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "N0", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "O0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "F0", "G0", "R0", "S0", "J0", "K0", "startIndex", "endIndex", "q0", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "prefix", "p0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "r0", "thisOffset", "other", "otherOffset", "ignoreCase", "o0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "A0", "(Ljava/lang/CharSequence;CZ)Z", "M", "B0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "N", "", "chars", "Z", "(Ljava/lang/CharSequence;[CIZ)I", "f0", "last", "V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Loa/o;", "Q", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Loa/o;", "T", "(Ljava/lang/CharSequence;CIZ)I", "string", "U", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "b0", "c0", "J", "I", "delimiters", "limit", "LTb/h;", "k0", "(Ljava/lang/CharSequence;[CIZI)LTb/h;", "", "l0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)LTb/h;", "Loa/F;", "s0", "(I)V", "y0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)LTb/h;", "", "u0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "t0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "v0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "g0", "(Ljava/lang/CharSequence;)LTb/h;", "h0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "R", "(Ljava/lang/CharSequence;)LHa/f;", "indices", "S", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class x extends w {

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Loa/o;", "a", "(Ljava/lang/CharSequence;I)Loa/o;"}, k = 3, mv = {1, 9, 0})
    static final class a extends AbstractC3864v implements Ba.p<CharSequence, Integer, C4170o<? extends Integer, ? extends Integer>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ char[] f17975B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f17976C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f17975B = cArr;
            this.f17976C = z10;
        }

        public final C4170o<Integer, Integer> a(CharSequence $receiver, int i10) {
            C3862t.g($receiver, "$this$$receiver");
            int iZ = x.Z($receiver, this.f17975B, i10, this.f17976C);
            if (iZ < 0) {
                return null;
            }
            return oa.v.a(Integer.valueOf(iZ), 1);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4170o<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Loa/o;", "a", "(Ljava/lang/CharSequence;I)Loa/o;"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements Ba.p<CharSequence, Integer, C4170o<? extends Integer, ? extends Integer>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<String> f17977B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f17978C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f17977B = list;
            this.f17978C = z10;
        }

        public final C4170o<Integer, Integer> a(CharSequence $receiver, int i10) {
            C3862t.g($receiver, "$this$$receiver");
            C4170o c4170oQ = x.Q($receiver, this.f17977B, i10, this.f17978C, false);
            if (c4170oQ != null) {
                return oa.v.a(c4170oQ.c(), Integer.valueOf(((String) c4170oQ.d()).length()));
            }
            return null;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4170o<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHa/f;", "it", "", "a", "(LHa/f;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends AbstractC3864v implements Ba.l<Ha.f, String> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ CharSequence f17979B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f17979B = charSequence;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Ha.f it) {
            C3862t.g(it, "it");
            return x.E0(this.f17979B, it);
        }
    }

    public static final boolean A0(CharSequence charSequence, char c10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        return charSequence.length() > 0 && Ub.c.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean B0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? n.G((String) charSequence, (String) prefix, false, 2, null) : o0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean C0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean D0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B0(charSequence, charSequence2, z10);
    }

    public static final String E0(CharSequence charSequence, Ha.f range) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(range, "range");
        return charSequence.subSequence(range.A().intValue(), range.z().intValue() + 1).toString();
    }

    public static final String F0(String str, char c10, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iX = n.X(str, c10, 0, false, 6, null);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iX + 1, str.length());
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String G0(String str, String delimiter, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(delimiter, "delimiter");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iY = n.Y(str, delimiter, 0, false, 6, null);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iY + delimiter.length(), str.length());
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String H0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return F0(str, c10, str2);
    }

    public static final boolean I(CharSequence charSequence, char c10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        return n.X(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ String I0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return G0(str, str2, str3);
    }

    public static boolean J(CharSequence charSequence, CharSequence other, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(other, "other");
        if (other instanceof String) {
            if (n.Y(charSequence, (String) other, 0, z10, 2, null) < 0) {
                return false;
            }
        } else if (W(charSequence, other, 0, charSequence.length(), z10, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static String J0(String str, char c10, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iD0 = n.d0(str, c10, 0, false, 6, null);
        if (iD0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iD0 + 1, str.length());
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(charSequence, c10, z10);
    }

    public static final String K0(String str, String delimiter, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(delimiter, "delimiter");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = n.e0(str, delimiter, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iE0 + delimiter.length(), str.length());
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n.J(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String L0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return n.J0(str, c10, str2);
    }

    public static final boolean M(CharSequence charSequence, char c10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        return charSequence.length() > 0 && Ub.c.d(charSequence.charAt(n.S(charSequence)), c10, z10);
    }

    public static /* synthetic */ String M0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return K0(str, str2, str3);
    }

    public static final boolean N(CharSequence charSequence, CharSequence suffix, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? n.s((String) charSequence, (String) suffix, false, 2, null) : o0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static final String N0(String str, char c10, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iX = n.X(str, c10, 0, false, 6, null);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iX);
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, c10, z10);
    }

    public static final String O0(String str, String delimiter, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(delimiter, "delimiter");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iY = n.Y(str, delimiter, 0, false, 6, null);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iY);
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String P0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return N0(str, c10, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4170o<Integer, String> Q(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object next;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) kotlin.collections.r.I0(collection);
            int iY = !z11 ? n.Y(charSequence, str, i10, false, 4, null) : n.e0(charSequence, str, i10, false, 4, null);
            if (iY < 0) {
                return null;
            }
            return oa.v.a(Integer.valueOf(iY), str);
        }
        Ha.d fVar = !z11 ? new Ha.f(Ha.g.d(i10, 0), charSequence.length()) : Ha.g.m(Ha.g.g(i10, n.S(charSequence)), 0);
        if (charSequence instanceof String) {
            int i11 = fVar.getFirst();
            int iJ = fVar.getLast();
            int iW = fVar.getStep();
            if ((iW > 0 && i11 <= iJ) || (iW < 0 && iJ <= i11)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (w.w(str2, 0, (String) charSequence, i11, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iJ) {
                            break;
                        }
                        i11 += iW;
                    } else {
                        return oa.v.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            int i12 = fVar.getFirst();
            int iJ2 = fVar.getLast();
            int iW2 = fVar.getStep();
            if ((iW2 > 0 && i12 <= iJ2) || (iW2 < 0 && iJ2 <= i12)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (o0(str4, 0, charSequence, i12, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iJ2) {
                            break;
                        }
                        i12 += iW2;
                    } else {
                        return oa.v.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String Q0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return O0(str, str2, str3);
    }

    public static Ha.f R(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        return new Ha.f(0, charSequence.length() - 1);
    }

    public static final String R0(String str, char c10, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iD0 = n.d0(str, c10, 0, false, 6, null);
        if (iD0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iD0);
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int S(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String S0(String str, String delimiter, String missingDelimiterValue) {
        C3862t.g(str, "<this>");
        C3862t.g(delimiter, "delimiter");
        C3862t.g(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = n.e0(str, delimiter, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iE0);
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int T(CharSequence charSequence, char c10, int i10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? Z(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ String T0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return R0(str, c10, str2);
    }

    public static final int U(CharSequence charSequence, String string, int i10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? W(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static CharSequence U0(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = C1786a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    private static final int V(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        Ha.d fVar = !z11 ? new Ha.f(Ha.g.d(i10, 0), Ha.g.g(i11, charSequence.length())) : Ha.g.m(Ha.g.g(i10, n.S(charSequence)), Ha.g.d(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i12 = fVar.getFirst();
            int iJ = fVar.getLast();
            int iW = fVar.getStep();
            if ((iW <= 0 || i12 > iJ) && (iW >= 0 || iJ > i12)) {
                return -1;
            }
            while (!w.w((String) charSequence2, 0, (String) charSequence, i12, charSequence2.length(), z10)) {
                if (i12 == iJ) {
                    return -1;
                }
                i12 += iW;
            }
            return i12;
        }
        int i13 = fVar.getFirst();
        int iJ2 = fVar.getLast();
        int iW2 = fVar.getStep();
        if ((iW2 <= 0 || i13 > iJ2) && (iW2 >= 0 || iJ2 > i13)) {
            return -1;
        }
        while (!o0(charSequence2, 0, charSequence, i13, charSequence2.length(), z10)) {
            if (i13 == iJ2) {
                return -1;
            }
            i13 += iW2;
        }
        return i13;
    }

    static /* synthetic */ int W(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return V(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int X(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return T(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return U(charSequence, str, i10, z10);
    }

    public static final int Z(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C3831l.u0(chars), i10);
        }
        int iD = Ha.g.d(i10, 0);
        int iS = n.S(charSequence);
        if (iD > iS) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c10 : chars) {
                if (Ub.c.d(c10, cCharAt, z10)) {
                    return iD;
                }
            }
            if (iD == iS) {
                return -1;
            }
            iD++;
        }
    }

    public static boolean a0(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!C1786a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int b0(CharSequence charSequence, char c10, int i10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? f0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int c0(CharSequence charSequence, String string, int i10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(string, "string");
        return (z10 || !(charSequence instanceof String)) ? V(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = n.S(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = n.S(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c0(charSequence, str, i10, z10);
    }

    public static final int f0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C3831l.u0(chars), i10);
        }
        for (int iG = Ha.g.g(i10, n.S(charSequence)); -1 < iG; iG--) {
            char cCharAt = charSequence.charAt(iG);
            for (char c10 : chars) {
                if (Ub.c.d(c10, cCharAt, z10)) {
                    return iG;
                }
            }
        }
        return -1;
    }

    public static final Tb.h<String> g0(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        return z0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> h0(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        return Tb.k.H(g0(charSequence));
    }

    public static final CharSequence i0(CharSequence charSequence, int i10, char c10) {
        C3862t.g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String j0(String str, int i10, char c10) {
        C3862t.g(str, "<this>");
        return i0(str, i10, c10).toString();
    }

    private static final Tb.h<Ha.f> k0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        s0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final Tb.h<Ha.f> l0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        s0(i11);
        return new e(charSequence, i10, i11, new b(C3831l.e(strArr), z10));
    }

    static /* synthetic */ Tb.h m0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return k0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ Tb.h n0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return l0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean o0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!Ub.c.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String p0(String str, CharSequence prefix) {
        C3862t.g(str, "<this>");
        C3862t.g(prefix, "prefix");
        if (!D0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence q0(CharSequence charSequence, int i10, int i11) {
        C3862t.g(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
        }
        if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
        sb2.append(charSequence, 0, i10);
        C3862t.f(sb2, "append(...)");
        sb2.append(charSequence, i11, charSequence.length());
        C3862t.f(sb2, "append(...)");
        return sb2;
    }

    public static String r0(String str, CharSequence suffix) {
        C3862t.g(str, "<this>");
        C3862t.g(suffix, "suffix");
        if (!n.P(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void s0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> t0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return v0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableK = Tb.k.k(m0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(iterableK, 10));
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (Ha.f) it.next()));
        }
        return arrayList;
    }

    public static final List<String> u0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return v0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableK = Tb.k.k(n0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(iterableK, 10));
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (Ha.f) it.next()));
        }
        return arrayList;
    }

    private static final List<String> v0(CharSequence charSequence, String str, boolean z10, int i10) {
        s0(i10);
        int length = 0;
        int iU = U(charSequence, str, 0, z10);
        if (iU == -1 || i10 == 1) {
            return kotlin.collections.r.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? Ha.g.g(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iU).toString());
            length = str.length() + iU;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iU = U(charSequence, str, length, z10);
        } while (iU != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List w0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return t0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List x0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return u0(charSequence, strArr, z10, i10);
    }

    public static final Tb.h<String> y0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        C3862t.g(charSequence, "<this>");
        C3862t.g(delimiters, "delimiters");
        return Tb.k.A(n0(charSequence, delimiters, 0, z10, i10, 2, null), new c(charSequence));
    }

    public static /* synthetic */ Tb.h z0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return y0(charSequence, strArr, z10, i10);
    }
}
