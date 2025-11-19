package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0000\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0016\u001a)\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u000e*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001d\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010!\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010#\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b'\u0010\u0016\u001a'\u0010(\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b(\u0010\u001e\u001a\u0019\u0010)\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u000e¢\u0006\u0004\b)\u0010$\u001a!\u0010*\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b*\u0010\u0016\u001a\u001f\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b+\u0010\u0016\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a!\u00100\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b0\u0010\u0016\u001a-\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b3\u00104\u001a+\u00106\u001a\b\u0012\u0004\u0012\u00028\u000002\"\b\b\u0000\u0010\u0000*\u000205*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b6\u00107\u001a?\u0010;\u001a\u00028\u0000\"\u0010\b\u0000\u00109*\n\u0012\u0006\b\u0000\u0012\u00028\u000108\"\b\b\u0001\u0010\u0000*\u000205*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010:\u001a\u00028\u0000¢\u0006\u0004\b;\u0010<\u001a-\u0010=\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b=\u00104\u001a\u001d\u0010?\u001a\u00020>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b?\u0010@\u001aC\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010C\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Aj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`B¢\u0006\u0004\bD\u0010E\u001aA\u0010F\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010C\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Aj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`B¢\u0006\u0004\bF\u0010G\u001a9\u0010H\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u00109*\n\u0012\u0006\b\u0000\u0012\u00028\u000008*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010:\u001a\u00028\u0001¢\u0006\u0004\bH\u0010<\u001a%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bI\u00107\u001a\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000702*\u00020\u0006¢\u0006\u0004\bJ\u0010K\u001a\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b02*\u00020\n¢\u0006\u0004\bL\u0010M\u001a\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e02*\u00020\r¢\u0006\u0004\bN\u0010O\u001a\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001202*\u00020\u0011¢\u0006\u0004\bP\u0010Q\u001a\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020S02*\u00020R¢\u0006\u0004\bT\u0010U\u001a\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020W02*\u00020V¢\u0006\u0004\bX\u0010Y\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000302*\u00020Z¢\u0006\u0004\b[\u0010\\\u001a\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020-02*\u00020,¢\u0006\u0004\b]\u0010^\u001a%\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000_\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b`\u00107\u001a\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070_*\u00020\u0006¢\u0006\u0004\ba\u0010K\u001a\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000b0_*\u00020\n¢\u0006\u0004\bb\u0010M\u001a\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000e0_*\u00020\r¢\u0006\u0004\bc\u0010O\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00120_*\u00020\u0011¢\u0006\u0004\bd\u0010Q\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020S0_*\u00020R¢\u0006\u0004\be\u0010U\u001a\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020W0_*\u00020V¢\u0006\u0004\bf\u0010Y\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00030_*\u00020Z¢\u0006\u0004\bg\u0010\\\u001a\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020-0_*\u00020,¢\u0006\u0004\bh\u0010^\u001a%\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000i\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bj\u0010k\u001aE\u0010n\u001a\b\u0012\u0004\u0012\u00028\u000102\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010lH\u0086\bø\u0001\u0000¢\u0006\u0004\bn\u0010o\u001a+\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000q0p\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\br\u0010s\u001aJ\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010u02\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bv\u0010w\u001aH\u0010x\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010u02\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010pH\u0086\u0004¢\u0006\u0004\bx\u0010y\u001a\u0086\u0001\u0010\u0084\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010|*\u00060zj\u0002`{*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010}\u001a\u00028\u00012\b\b\u0002\u0010\u007f\u001a\u00020~2\t\b\u0002\u0010\u0080\u0001\u001a\u00020~2\t\b\u0002\u0010\u0081\u0001\u001a\u00020~2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u0083\u0001\u001a\u00020~2\u0016\b\u0002\u0010m\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020~\u0018\u00010l¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001aq\u0010\u0087\u0001\u001a\u00030\u0086\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u007f\u001a\u00020~2\t\b\u0002\u0010\u0080\u0001\u001a\u00020~2\t\b\u0002\u0010\u0081\u0001\u001a\u00020~2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u0083\u0001\u001a\u00020~2\u0016\b\u0002\u0010m\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020~\u0018\u00010l¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a'\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000p\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0005\b\u0089\u0001\u0010s\u001a)\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0014\u0010\u008d\u0001\u001a\u00020\u000e*\u00020\r¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0019\u0010\u0092\u0001\u001a\u00030\u008f\u0001*\u00020\r8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"&\u0010\u0095\u0001\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0018\u0010\u0095\u0001\u001a\u00020\u000e*\u00020\r8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u008e\u0001\"\u0018\u0010\u0095\u0001\u001a\u00020\u000e*\u00020\u00118F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0099\u0001"}, d2 = {"T", "", "element", "", "S", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "P", "([BB)Z", "", "", "([SS)Z", "", "", "Q", "([II)Z", "", "", "R", "([JJ)Z", "X", "([Ljava/lang/Object;)Ljava/lang/Object;", "Y", "index", "e0", "([Ljava/lang/Object;I)Ljava/lang/Object;", "d0", "([II)Ljava/lang/Integer;", "i0", "([Ljava/lang/Object;Ljava/lang/Object;)I", "f0", "([BB)I", "j0", "([SS)I", "g0", "([II)I", "h0", "([JJ)I", "o0", "q0", "p0", "r0", "v0", "", "", "u0", "([C)C", "w0", "n", "", "U", "([Ljava/lang/Object;I)Ljava/util/List;", "", "V", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "W", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "A0", "Loa/F;", "t0", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "x0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "y0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "B0", "I0", "C0", "([B)Ljava/util/List;", "J0", "([S)Ljava/util/List;", "G0", "([I)Ljava/util/List;", "H0", "([J)Ljava/util/List;", "", "", "F0", "([F)Ljava/util/List;", "", "", "E0", "([D)Ljava/util/List;", "", "K0", "([Z)Ljava/util/List;", "D0", "([C)Ljava/util/List;", "", "R0", "L0", "S0", "P0", "Q0", "O0", "N0", "T0", "M0", "", "U0", "([Ljava/lang/Object;)Ljava/util/Set;", "Lkotlin/Function1;", "transform", "s0", "([Ljava/lang/Object;LBa/l;)Ljava/util/List;", "", "Lkotlin/collections/G;", "V0", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "other", "Loa/o;", "X0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "W0", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "k0", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/Appendable;", "", "m0", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/String;", "N", "LTb/h;", "O", "([Ljava/lang/Object;)LTb/h;", "z0", "([I)I", "LHa/f;", "Z", "([I)LHa/f;", "indices", "c0", "([Ljava/lang/Object;)I", "lastIndex", "a0", "b0", "([J)I", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3835p extends C3834o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/p$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.p$a */
    public static final class a<T> implements Iterable<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Object[] f43960B;

        public a(Object[] objArr) {
            this.f43960B = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C3846c.a(this.f43960B);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/p$b", "LTb/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.p$b */
    public static final class b<T> implements Tb.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f43961a;

        public b(Object[] objArr) {
            this.f43961a = objArr;
        }

        @Override // Tb.h
        public Iterator<T> iterator() {
            return C3846c.a(this.f43961a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: _Arrays.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.collections.p$c */
    static final class c<T> extends AbstractC3864v implements Ba.a<Iterator<? extends T>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ T[] f43962B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T[] tArr) {
            super(0);
            this.f43962B = tArr;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke() {
            return C3846c.a(this.f43962B);
        }
    }

    public static final <T> List<T> A0(T[] tArr, int i10) {
        C3862t.g(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.m();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return C3831l.I0(tArr);
        }
        if (i10 == 1) {
            return r.e(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C B0(T[] tArr, C destination) {
        C3862t.g(tArr, "<this>");
        C3862t.g(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    public static List<Byte> C0(byte[] bArr) {
        C3862t.g(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? L0(bArr) : r.e(Byte.valueOf(bArr[0])) : r.m();
    }

    public static List<Character> D0(char[] cArr) {
        C3862t.g(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? M0(cArr) : r.e(Character.valueOf(cArr[0])) : r.m();
    }

    public static List<Double> E0(double[] dArr) {
        C3862t.g(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? N0(dArr) : r.e(Double.valueOf(dArr[0])) : r.m();
    }

    public static List<Float> F0(float[] fArr) {
        C3862t.g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? O0(fArr) : r.e(Float.valueOf(fArr[0])) : r.m();
    }

    public static List<Integer> G0(int[] iArr) {
        C3862t.g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? P0(iArr) : r.e(Integer.valueOf(iArr[0])) : r.m();
    }

    public static List<Long> H0(long[] jArr) {
        C3862t.g(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? Q0(jArr) : r.e(Long.valueOf(jArr[0])) : r.m();
    }

    public static <T> List<T> I0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? C3831l.R0(tArr) : r.e(tArr[0]) : r.m();
    }

    public static List<Short> J0(short[] sArr) {
        C3862t.g(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? S0(sArr) : r.e(Short.valueOf(sArr[0])) : r.m();
    }

    public static List<Boolean> K0(boolean[] zArr) {
        C3862t.g(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? T0(zArr) : r.e(Boolean.valueOf(zArr[0])) : r.m();
    }

    public static final List<Byte> L0(byte[] bArr) {
        C3862t.g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List<Character> M0(char[] cArr) {
        C3862t.g(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static <T> Iterable<T> N(T[] tArr) {
        C3862t.g(tArr, "<this>");
        return tArr.length == 0 ? r.m() : new a(tArr);
    }

    public static final List<Double> N0(double[] dArr) {
        C3862t.g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static <T> Tb.h<T> O(T[] tArr) {
        C3862t.g(tArr, "<this>");
        return tArr.length == 0 ? Tb.k.e() : new b(tArr);
    }

    public static final List<Float> O0(float[] fArr) {
        C3862t.g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static boolean P(byte[] bArr, byte b10) {
        C3862t.g(bArr, "<this>");
        return f0(bArr, b10) >= 0;
    }

    public static final List<Integer> P0(int[] iArr) {
        C3862t.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static boolean Q(int[] iArr, int i10) {
        C3862t.g(iArr, "<this>");
        return g0(iArr, i10) >= 0;
    }

    public static final List<Long> Q0(long[] jArr) {
        C3862t.g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean R(long[] jArr, long j10) {
        C3862t.g(jArr, "<this>");
        return h0(jArr, j10) >= 0;
    }

    public static <T> List<T> R0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        return new ArrayList(C3838t.h(tArr));
    }

    public static <T> boolean S(T[] tArr, T t10) {
        C3862t.g(tArr, "<this>");
        return C3831l.i0(tArr, t10) >= 0;
    }

    public static final List<Short> S0(short[] sArr) {
        C3862t.g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static boolean T(short[] sArr, short s10) {
        C3862t.g(sArr, "<this>");
        return j0(sArr, s10) >= 0;
    }

    public static final List<Boolean> T0(boolean[] zArr) {
        C3862t.g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static <T> List<T> U(T[] tArr, int i10) {
        C3862t.g(tArr, "<this>");
        if (i10 >= 0) {
            return A0(tArr, Ha.g.d(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> Set<T> U0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) B0(tArr, new LinkedHashSet(M.d(tArr.length))) : V.c(tArr[0]) : V.d();
    }

    public static <T> List<T> V(T[] tArr) {
        C3862t.g(tArr, "<this>");
        return (List) W(tArr, new ArrayList());
    }

    public static <T> Iterable<IndexedValue<T>> V0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        return new H(new c(tArr));
    }

    public static final <C extends Collection<? super T>, T> C W(T[] tArr, C destination) {
        C3862t.g(tArr, "<this>");
        C3862t.g(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T, R> List<C4170o<T, R>> W0(T[] tArr, Iterable<? extends R> other) {
        C3862t.g(tArr, "<this>");
        C3862t.g(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(r.x(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(oa.v.a(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    public static <T> T X(T[] tArr) {
        C3862t.g(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T, R> List<C4170o<T, R>> X0(T[] tArr, R[] other) {
        C3862t.g(tArr, "<this>");
        C3862t.g(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(oa.v.a(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static <T> T Y(T[] tArr) {
        C3862t.g(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static Ha.f Z(int[] iArr) {
        C3862t.g(iArr, "<this>");
        return new Ha.f(0, C3831l.a0(iArr));
    }

    public static int a0(int[] iArr) {
        C3862t.g(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int b0(long[] jArr) {
        C3862t.g(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int c0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        return tArr.length - 1;
    }

    public static Integer d0(int[] iArr, int i10) {
        C3862t.g(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static <T> T e0(T[] tArr, int i10) {
        C3862t.g(tArr, "<this>");
        if (i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static final int f0(byte[] bArr, byte b10) {
        C3862t.g(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int g0(int[] iArr, int i10) {
        C3862t.g(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int h0(long[] jArr, long j10) {
        C3862t.g(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> int i0(T[] tArr, T t10) {
        C3862t.g(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (C3862t.b(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int j0(short[] sArr, short s10) {
        C3862t.g(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T, A extends Appendable> A k0(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ba.l<? super T, ? extends CharSequence> lVar) throws IOException {
        C3862t.g(tArr, "<this>");
        C3862t.g(buffer, "buffer");
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Ub.n.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String m0(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ba.l<? super T, ? extends CharSequence> lVar) {
        C3862t.g(tArr, "<this>");
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        String string = ((StringBuilder) k0(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String n0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Ba.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return m0(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T> T o0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[C3831l.c0(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int p0(int[] iArr, int i10) {
        C3862t.g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static <T> int q0(T[] tArr, T t10) {
        C3862t.g(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (C3862t.b(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static <T> T r0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static <T, R> List<R> s0(T[] tArr, Ba.l<? super T, ? extends R> transform) {
        C3862t.g(tArr, "<this>");
        C3862t.g(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(transform.invoke(t10));
        }
        return arrayList;
    }

    public static <T> void t0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iC0 = C3831l.c0(tArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[iC0];
            tArr[iC0] = t10;
            iC0--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static char u0(char[] cArr) {
        C3862t.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T v0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T w0(T[] tArr) {
        C3862t.g(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] x0(T[] tArr, Comparator<? super T> comparator) {
        C3862t.g(tArr, "<this>");
        C3862t.g(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C3862t.f(tArr2, "copyOf(...)");
        C3834o.H(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> y0(T[] tArr, Comparator<? super T> comparator) {
        C3862t.g(tArr, "<this>");
        C3862t.g(comparator, "comparator");
        return C3831l.e(x0(tArr, comparator));
    }

    public static int z0(int[] iArr) {
        C3862t.g(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }
}
