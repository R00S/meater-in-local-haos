package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Collections.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u001d\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0014\u0010\n\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001d\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a)\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a=\u0010*\u001a\u00028\u0000\"\u0010\b\u0000\u0010(*\n\u0012\u0006\b\u0000\u0012\u00028\u00010'\"\b\b\u0001\u0010\u0000*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+\u001a+\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a+\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b0\u0010\u001d\u001a+\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b1\u0010\u001f\u001a#\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b2\u0010&\u001a-\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010&\u001a?\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00107\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000005j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`6¢\u0006\u0004\b8\u00109\u001a\u0017\u0010<\u001a\u00020;*\b\u0012\u0004\u0012\u00020\u00030:¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010@\u001a\u00020?*\b\u0012\u0004\u0012\u00020>0:¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010C\u001a\u00020B*\b\u0012\u0004\u0012\u00020\r0:¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0:¢\u0006\u0004\bG\u0010H\u001a7\u0010I\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010(*\n\u0012\u0006\b\u0000\u0012\u00028\u00000'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010)\u001a\u00028\u0001¢\u0006\u0004\bI\u0010+\u001a-\u0010L\u001a\u0012\u0012\u0004\u0012\u00028\u00000Jj\b\u0012\u0004\u0012\u00028\u0000`K\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bL\u0010M\u001a#\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bN\u0010&\u001a#\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000O\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bP\u0010&\u001a#\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000O\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000:¢\u0006\u0004\bQ\u0010R\u001a#\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000S\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bT\u0010U\u001aC\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010V*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0086\bø\u0001\u0000¢\u0006\u0004\bX\u0010#\u001a)\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Y0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bZ\u0010[\u001a#\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\\\u0010&\u001a4\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000S\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\b^\u0010_\u001a#\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\ba\u0010U\u001a4\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000S\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010_\u001a7\u0010c\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030 H\u0086\bø\u0001\u0000¢\u0006\u0004\bc\u0010d\u001a\u001d\u0010e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\be\u0010f\u001a\u001b\u0010g\u001a\u0004\u0018\u00010>*\b\u0012\u0004\u0012\u00020>0\u0001H\u0007¢\u0006\u0004\bg\u0010h\u001a+\u0010i\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bi\u0010j\u001a\u001b\u0010k\u001a\u0004\u0018\u00010>*\b\u0012\u0004\u0012\u00020>0\u0001H\u0007¢\u0006\u0004\bk\u0010h\u001a+\u0010l\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bl\u0010j\u001a.\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bm\u0010n\u001a.\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bo\u0010n\u001a.\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bp\u0010q\u001a4\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bs\u0010t\u001a4\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bu\u0010v\u001aF\u0010x\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010w0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010V*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bx\u0010t\u001a\u0083\u0001\u0010\u0083\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010{*\u00060yj\u0002`z*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010|\u001a\u00028\u00012\b\b\u0002\u0010~\u001a\u00020}2\b\b\u0002\u0010\u007f\u001a\u00020}2\t\b\u0002\u0010\u0080\u0001\u001a\u00020}2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\r2\t\b\u0002\u0010\u0082\u0001\u001a\u00020}2\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020}\u0018\u00010 ¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001an\u0010\u0086\u0001\u001a\u00030\u0085\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010~\u001a\u00020}2\b\b\u0002\u0010\u007f\u001a\u00020}2\t\b\u0002\u0010\u0080\u0001\u001a\u00020}2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\r2\t\b\u0002\u0010\u0082\u0001\u001a\u00020}2\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020}\u0018\u00010 ¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a'\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008b\u0001"}, d2 = {"T", "", "element", "", "a0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "i0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "j0", "(Ljava/util/List;)Ljava/lang/Object;", "k0", "l0", "", "index", "m0", "(Ljava/util/List;I)Ljava/lang/Object;", "n0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "t0", "u0", "v0", "w0", "I0", "J0", "K0", "L0", "n", "d0", "(Ljava/lang/Iterable;I)Ljava/util/List;", "e0", "(Ljava/util/List;I)Ljava/util/List;", "Lkotlin/Function1;", "predicate", "f0", "(Ljava/lang/Iterable;LBa/l;)Ljava/util/List;", "", "g0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "h0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "LHa/f;", "indices", "M0", "(Ljava/util/List;LHa/f;)Ljava/util/List;", "P0", "Q0", "H0", "", "N0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "O0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "", "R0", "(Ljava/util/Collection;)[Z", "", "", "T0", "(Ljava/util/Collection;)[F", "", "V0", "(Ljava/util/Collection;)[I", "", "", "X0", "(Ljava/util/Collection;)[J", "S0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "U0", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "W0", "", "Y0", "Z0", "(Ljava/util/Collection;)Ljava/util/List;", "", "b1", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "x0", "Lkotlin/collections/G;", "d1", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "c0", "other", "o0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "", "a1", "c1", "Y", "(Ljava/lang/Iterable;LBa/l;)Z", "b0", "(Ljava/lang/Iterable;)I", "z0", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "y0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "B0", "A0", "C0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "E0", "G0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "D0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "F0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "Loa/o;", "e1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "p0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/Appendable;", "", "r0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/String;", "LTb/h;", "Z", "(Ljava/lang/Iterable;)LTb/h;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class B extends A {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/B$a", "LTb/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements Tb.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f43923a;

        public a(Iterable iterable) {
            this.f43923a = iterable;
        }

        @Override // Tb.h
        public Iterator<T> iterator() {
            return this.f43923a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: _Collections.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
    static final class b<T> extends AbstractC3864v implements Ba.a<Iterator<? extends T>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Iterable<T> f43924B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Iterable<? extends T> iterable) {
            super(0);
            this.f43924B = iterable;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke() {
            return this.f43924B.iterator();
        }
    }

    public static <T extends Comparable<? super T>> T A0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Float B0(Iterable<Float> iterable) {
        C3862t.g(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T> List<T> C0(Iterable<? extends T> iterable, T t10) {
        C3862t.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(r.x(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && C3862t.b(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> List<T> D0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        C3862t.g(iterable, "<this>");
        C3862t.g(elements, "elements");
        if (iterable instanceof Collection) {
            return r.F0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        r.D(arrayList, iterable);
        r.D(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> E0(Iterable<? extends T> iterable, T t10) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return r.G0((Collection) iterable, t10);
        }
        ArrayList arrayList = new ArrayList();
        r.D(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> F0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        C3862t.g(collection, "<this>");
        C3862t.g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            r.D(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> G0(Collection<? extends T> collection, T t10) {
        C3862t.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> H0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return r.W0(iterable);
        }
        List<T> listY0 = Y0(iterable);
        r.X(listY0);
        return listY0;
    }

    public static <T> T I0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r.J0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T J0(List<? extends T> list) {
        C3862t.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T K0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T L0(List<? extends T> list) {
        C3862t.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> M0(List<? extends T> list, Ha.f indices) {
        C3862t.g(list, "<this>");
        C3862t.g(indices, "indices");
        return indices.isEmpty() ? r.m() : r.W0(list.subList(indices.A().intValue(), indices.z().intValue() + 1));
    }

    public static <T extends Comparable<? super T>> List<T> N0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listY0 = Y0(iterable);
            r.B(listY0);
            return listY0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r.W0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C3831l.G((Comparable[]) array);
        return C3831l.e(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> O0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C3862t.g(iterable, "<this>");
        C3862t.g(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listY0 = Y0(iterable);
            r.C(listY0, comparator);
            return listY0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r.W0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C3834o.H(array, comparator);
        return C3831l.e(array);
    }

    public static <T> List<T> P0(Iterable<? extends T> iterable, int i10) {
        C3862t.g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.m();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return r.W0(iterable);
            }
            if (i10 == 1) {
                return r.e(r.i0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return C3838t.t(arrayList);
    }

    public static <T> List<T> Q0(List<? extends T> list, int i10) {
        C3862t.g(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.m();
        }
        int size = list.size();
        if (i10 >= size) {
            return r.W0(list);
        }
        if (i10 == 1) {
            return r.e(r.u0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] R0(Collection<Boolean> collection) {
        C3862t.g(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final <T, C extends Collection<? super T>> C S0(Iterable<? extends T> iterable, C destination) {
        C3862t.g(iterable, "<this>");
        C3862t.g(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static float[] T0(Collection<Float> collection) {
        C3862t.g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    public static <T> HashSet<T> U0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return (HashSet) S0(iterable, new HashSet(M.d(r.x(iterable, 12))));
    }

    public static int[] V0(Collection<Integer> collection) {
        C3862t.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> W0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3838t.t(Y0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.m();
        }
        if (size != 1) {
            return r.Z0(collection);
        }
        return r.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] X0(Collection<Long> collection) {
        C3862t.g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static <T> boolean Y(Iterable<? extends T> iterable, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(iterable, "<this>");
        C3862t.g(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> List<T> Y0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return iterable instanceof Collection ? r.Z0((Collection) iterable) : (List) S0(iterable, new ArrayList());
    }

    public static <T> Tb.h<T> Z(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<T> Z0(Collection<? extends T> collection) {
        C3862t.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> boolean a0(Iterable<? extends T> iterable, T t10) {
        C3862t.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : n0(iterable, t10) >= 0;
    }

    public static <T> Set<T> a1(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) S0(iterable, new LinkedHashSet());
    }

    public static <T> int b0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                r.v();
            }
        }
        return i10;
    }

    public static <T> Set<T> b1(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return X.f((Set) S0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return V.d();
        }
        if (size != 1) {
            return (Set) S0(iterable, new LinkedHashSet(M.d(collection.size())));
        }
        return V.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> List<T> c0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return r.W0(r.a1(iterable));
    }

    public static <T> Set<T> c1(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        C3862t.g(iterable, "<this>");
        C3862t.g(other, "other");
        Set<T> setA1 = r.a1(iterable);
        r.D(setA1, other);
        return setA1;
    }

    public static <T> List<T> d0(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        C3862t.g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.W0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                return r.m();
            }
            if (size == 1) {
                return r.e(r.t0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i10 < size2) {
                        arrayList.add(((List) iterable).get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return C3838t.t(arrayList);
    }

    public static <T> Iterable<IndexedValue<T>> d1(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return new H(new b(iterable));
    }

    public static <T> List<T> e0(List<? extends T> list, int i10) {
        C3862t.g(list, "<this>");
        if (i10 >= 0) {
            return r.P0(list, Ha.g.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T, R> List<C4170o<T, R>> e1(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        C3862t.g(iterable, "<this>");
        C3862t.g(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.x(iterable, 10), r.x(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(oa.v.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> List<T> f0(Iterable<? extends T> iterable, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(iterable, "<this>");
        C3862t.g(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> List<T> g0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        return (List) h0(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C h0(Iterable<? extends T> iterable, C destination) {
        C3862t.g(iterable, "<this>");
        C3862t.g(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T> T i0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r.j0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T j0(List<? extends T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T k0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T l0(List<? extends T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T m0(List<? extends T> list, int i10) {
        C3862t.g(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final <T> int n0(Iterable<? extends T> iterable, T t10) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                r.w();
            }
            if (C3862t.b(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Set<T> o0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        C3862t.g(iterable, "<this>");
        C3862t.g(other, "other");
        Set<T> setA1 = r.a1(iterable);
        C3843y.O(setA1, other);
        return setA1;
    }

    public static final <T, A extends Appendable> A p0(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ba.l<? super T, ? extends CharSequence> lVar) throws IOException {
        C3862t.g(iterable, "<this>");
        C3862t.g(buffer, "buffer");
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
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

    public static final <T> String r0(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Ba.l<? super T, ? extends CharSequence> lVar) {
        C3862t.g(iterable, "<this>");
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        String string = ((StringBuilder) p0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String s0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Ba.l lVar, int i11, Object obj) {
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
        return r0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T> T t0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r.u0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T u0(List<? extends T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(r.o(list));
    }

    public static <T> T v0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T w0(List<? extends T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, R> List<R> x0(Iterable<? extends T> iterable, Ba.l<? super T, ? extends R> transform) {
        C3862t.g(iterable, "<this>");
        C3862t.g(transform, "transform");
        ArrayList arrayList = new ArrayList(r.x(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T y0(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Float z0(Iterable<Float> iterable) {
        C3862t.g(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }
}
