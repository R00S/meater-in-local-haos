package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10773s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C10801m;
import kotlin.collections.C10803n;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(m32266d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, m32267d2 = {"indices", "Lkotlin/ranges/IntRange;", HttpUrl.FRAGMENT_ENCODE_SET, "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", HttpUrl.FRAGMENT_ENCODE_SET, "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "commonPrefixWith", HttpUrl.FRAGMENT_ENCODE_SET, "other", "ignoreCase", HttpUrl.FRAGMENT_ENCODE_SET, "commonSuffixWith", "contains", "char", HttpUrl.FRAGMENT_ENCODE_SET, "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", HttpUrl.FRAGMENT_ENCODE_SET, "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", HttpUrl.FRAGMENT_ENCODE_SET, "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", HttpUrl.FRAGMENT_ENCODE_SET, "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.h0.v */
/* loaded from: classes3.dex */
public class C10547v extends C10546u {

    /* compiled from: Strings.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "currentIndex", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.h0.v$a */
    static final class a extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ char[] f40686f;

        /* renamed from: g */
        final /* synthetic */ boolean f40687g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z) {
            super(2);
            this.f40686f = cArr;
            this.f40687g = z;
        }

        /* renamed from: b */
        public final Pair<Integer, Integer> m37587b(CharSequence charSequence, int i2) {
            C9801m.m32346f(charSequence, "$this$$receiver");
            int iM37558X = C10547v.m37558X(charSequence, this.f40686f, i2, this.f40687g);
            if (iM37558X < 0) {
                return null;
            }
            return C10773s.m38547a(Integer.valueOf(iM37558X), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m37587b(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "currentIndex", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.h0.v$b */
    static final class b extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List<String> f40688f;

        /* renamed from: g */
        final /* synthetic */ boolean f40689g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z) {
            super(2);
            this.f40688f = list;
            this.f40689g = z;
        }

        /* renamed from: b */
        public final Pair<Integer, Integer> m37588b(CharSequence charSequence, int i2) {
            C9801m.m32346f(charSequence, "$this$$receiver");
            Pair pairM37548O = C10547v.m37548O(charSequence, this.f40688f, i2, this.f40689g, false);
            if (pairM37548O != null) {
                return C10773s.m38547a(pairM37548O.m37648c(), Integer.valueOf(((String) pairM37548O.m37649d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m37588b(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/ranges/IntRange;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.h0.v$c */
    static final class c extends Lambda implements Function1<IntRange, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f40690f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f40690f = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(IntRange intRange) {
            C9801m.m32346f(intRange, "it");
            return C10547v.m37527C0(this.f40690f, intRange);
        }
    }

    /* renamed from: A0 */
    public static /* synthetic */ boolean m37525A0(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m37585y0(charSequence, c2, z);
    }

    /* renamed from: B0 */
    public static /* synthetic */ boolean m37526B0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m37586z0(charSequence, charSequence2, z);
    }

    /* renamed from: C0 */
    public static final String m37527C0(CharSequence charSequence, IntRange intRange) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(intRange, "range");
        return charSequence.subSequence(intRange.m32401r().intValue(), intRange.m32400q().intValue() + 1).toString();
    }

    /* renamed from: D0 */
    public static final String m37528D0(String str, char c2, String str2) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "missingDelimiterValue");
        int iM37556V = m37556V(str, c2, 0, false, 6, null);
        if (iM37556V == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM37556V + 1, str.length());
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: E0 */
    public static String m37529E0(String str, String str2, String str3) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "delimiter");
        C9801m.m32346f(str3, "missingDelimiterValue");
        int iM37557W = m37557W(str, str2, 0, false, 6, null);
        if (iM37557W == -1) {
            return str3;
        }
        String strSubstring = str.substring(iM37557W + str2.length(), str.length());
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: F0 */
    public static /* synthetic */ String m37531F0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return m37528D0(str, c2, str2);
    }

    /* renamed from: G */
    public static final boolean m37532G(CharSequence charSequence, char c2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        return m37556V(charSequence, c2, 0, z, 2, null) >= 0;
    }

    /* renamed from: G0 */
    public static /* synthetic */ String m37533G0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return m37529E0(str, str2, str3);
    }

    /* renamed from: H */
    public static final boolean m37534H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m37557W(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (m37555U(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public static String m37535H0(String str, char c2, String str2) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "missingDelimiterValue");
        int iM37561a0 = m37561a0(str, c2, 0, false, 6, null);
        if (iM37561a0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM37561a0 + 1, str.length());
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m37536I(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m37532G(charSequence, c2, z);
    }

    /* renamed from: I0 */
    public static /* synthetic */ String m37537I0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return m37535H0(str, c2, str2);
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m37538J(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m37534H(charSequence, charSequence2, z);
    }

    /* renamed from: J0 */
    public static final String m37539J0(String str, char c2, String str2) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "missingDelimiterValue");
        int iM37556V = m37556V(str, c2, 0, false, 6, null);
        if (iM37556V == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM37556V);
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: K */
    public static final boolean m37540K(CharSequence charSequence, char c2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        return charSequence.length() > 0 && C10528c.m37415e(charSequence.charAt(m37551Q(charSequence)), c2, z);
    }

    /* renamed from: K0 */
    public static final String m37541K0(String str, String str2, String str3) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "delimiter");
        C9801m.m32346f(str3, "missingDelimiterValue");
        int iM37557W = m37557W(str, str2, 0, false, 6, null);
        if (iM37557W == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iM37557W);
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: L */
    public static final boolean m37542L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C10546u.m37514p((String) charSequence, (String) charSequence2, false, 2, null) : m37572l0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: L0 */
    public static /* synthetic */ String m37543L0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return m37539J0(str, c2, str2);
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m37544M(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m37540K(charSequence, c2, z);
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m37545M0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return m37541K0(str, str2, str3);
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m37546N(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m37542L(charSequence, charSequence2, z);
    }

    /* renamed from: N0 */
    public static String m37547N0(String str, String str2, String str3) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "delimiter");
        C9801m.m32346f(str3, "missingDelimiterValue");
        int iM37562b0 = m37562b0(str, str2, 0, false, 6, null);
        if (iM37562b0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iM37562b0);
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final Pair<Integer, String> m37548O(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        Object next;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) C10813s.m38864r0(collection);
            int iM37557W = !z2 ? m37557W(charSequence, str, i2, false, 4, null) : m37562b0(charSequence, str, i2, false, 4, null);
            if (iM37557W < 0) {
                return null;
            }
            return C10773s.m38547a(Integer.valueOf(iM37557W), str);
        }
        IntProgression intRange = !z2 ? new IntRange(C9848l.m32419b(i2, 0), charSequence.length()) : C9848l.m32425h(C9848l.m32421d(i2, m37551Q(charSequence)), 0);
        if (charSequence instanceof String) {
            int iM32392c = intRange.getF37215g();
            int iM32393f = intRange.getF37216h();
            int iM32394h = intRange.getF37217i();
            if ((iM32394h > 0 && iM32392c <= iM32393f) || (iM32394h < 0 && iM32393f <= iM32392c)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (C10546u.m37519u(str2, 0, (String) charSequence, iM32392c, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (iM32392c == iM32393f) {
                            break;
                        }
                        iM32392c += iM32394h;
                    } else {
                        return C10773s.m38547a(Integer.valueOf(iM32392c), str3);
                    }
                }
            }
        } else {
            int iM32392c2 = intRange.getF37215g();
            int iM32393f2 = intRange.getF37216h();
            int iM32394h2 = intRange.getF37217i();
            if ((iM32394h2 > 0 && iM32392c2 <= iM32393f2) || (iM32394h2 < 0 && iM32393f2 <= iM32392c2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (m37572l0(str4, 0, charSequence, iM32392c2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (iM32392c2 == iM32393f2) {
                            break;
                        }
                        iM32392c2 += iM32394h2;
                    } else {
                        return C10773s.m38547a(Integer.valueOf(iM32392c2), str5);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: O0 */
    public static CharSequence m37549O0(CharSequence charSequence) {
        C9801m.m32346f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean zM37413c = C10527b.m37413c(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!zM37413c) {
                    break;
                }
                length--;
            } else if (zM37413c) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: P */
    public static IntRange m37550P(CharSequence charSequence) {
        C9801m.m32346f(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    /* renamed from: Q */
    public static int m37551Q(CharSequence charSequence) {
        C9801m.m32346f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: R */
    public static final int m37552R(CharSequence charSequence, char c2, int i2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m37558X(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).indexOf(c2, i2);
    }

    /* renamed from: S */
    public static final int m37553S(CharSequence charSequence, String str, int i2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(str, "string");
        return (z || !(charSequence instanceof String)) ? m37555U(charSequence, str, i2, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i2);
    }

    /* renamed from: T */
    private static final int m37554T(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        IntProgression intRange = !z2 ? new IntRange(C9848l.m32419b(i2, 0), C9848l.m32421d(i3, charSequence.length())) : C9848l.m32425h(C9848l.m32421d(i2, m37551Q(charSequence)), C9848l.m32419b(i3, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM32392c = intRange.getF37215g();
            int iM32393f = intRange.getF37216h();
            int iM32394h = intRange.getF37217i();
            if ((iM32394h <= 0 || iM32392c > iM32393f) && (iM32394h >= 0 || iM32393f > iM32392c)) {
                return -1;
            }
            while (!C10546u.m37519u((String) charSequence2, 0, (String) charSequence, iM32392c, charSequence2.length(), z)) {
                if (iM32392c == iM32393f) {
                    return -1;
                }
                iM32392c += iM32394h;
            }
            return iM32392c;
        }
        int iM32392c2 = intRange.getF37215g();
        int iM32393f2 = intRange.getF37216h();
        int iM32394h2 = intRange.getF37217i();
        if ((iM32394h2 <= 0 || iM32392c2 > iM32393f2) && (iM32394h2 >= 0 || iM32393f2 > iM32392c2)) {
            return -1;
        }
        while (!m37572l0(charSequence2, 0, charSequence, iM32392c2, charSequence2.length(), z)) {
            if (iM32392c2 == iM32393f2) {
                return -1;
            }
            iM32392c2 += iM32394h2;
        }
        return iM32392c2;
    }

    /* renamed from: U */
    static /* synthetic */ int m37555U(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return m37554T(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    /* renamed from: V */
    public static /* synthetic */ int m37556V(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m37552R(charSequence, c2, i2, z);
    }

    /* renamed from: W */
    public static /* synthetic */ int m37557W(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m37553S(charSequence, str, i2, z);
    }

    /* renamed from: X */
    public static final int m37558X(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C10803n.m38733M(cArr), i2);
        }
        IntIterator intIteratorM32395i = new IntRange(C9848l.m32419b(i2, 0), m37551Q(charSequence)).iterator();
        while (intIteratorM32395i.hasNext()) {
            int iMo32397b = intIteratorM32395i.mo32397b();
            char cCharAt = charSequence.charAt(iMo32397b);
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                if (C10528c.m37415e(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return iMo32397b;
            }
        }
        return -1;
    }

    /* renamed from: Y */
    public static final int m37559Y(CharSequence charSequence, char c2, int i2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m37563c0(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    /* renamed from: Z */
    public static final int m37560Z(CharSequence charSequence, String str, int i2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(str, "string");
        return (z || !(charSequence instanceof String)) ? m37554T(charSequence, str, i2, 0, z, true) : ((String) charSequence).lastIndexOf(str, i2);
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m37561a0(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = m37551Q(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m37559Y(charSequence, c2, i2, z);
    }

    /* renamed from: b0 */
    public static /* synthetic */ int m37562b0(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = m37551Q(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m37560Z(charSequence, str, i2, z);
    }

    /* renamed from: c0 */
    public static final int m37563c0(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C10803n.m38733M(cArr), i2);
        }
        for (int iM32421d = C9848l.m32421d(i2, m37551Q(charSequence)); -1 < iM32421d; iM32421d--) {
            char cCharAt = charSequence.charAt(iM32421d);
            int length = cArr.length;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (C10528c.m37415e(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return iM32421d;
            }
        }
        return -1;
    }

    /* renamed from: d0 */
    public static final Sequence<String> m37564d0(CharSequence charSequence) {
        C9801m.m32346f(charSequence, "<this>");
        return m37584x0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: e0 */
    public static final List<String> m37565e0(CharSequence charSequence) {
        C9801m.m32346f(charSequence, "<this>");
        return C10522n.m37377A(m37564d0(charSequence));
    }

    /* renamed from: f0 */
    public static final CharSequence m37566f0(CharSequence charSequence, int i2, char c2) {
        C9801m.m32346f(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        }
        if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i2);
        IntIterator intIteratorM32395i = new IntRange(1, i2 - charSequence.length()).iterator();
        while (intIteratorM32395i.hasNext()) {
            intIteratorM32395i.mo32397b();
            sb.append(c2);
        }
        sb.append(charSequence);
        return sb;
    }

    /* renamed from: g0 */
    public static String m37567g0(String str, int i2, char c2) {
        C9801m.m32346f(str, "<this>");
        return m37566f0(str, i2, c2).toString();
    }

    /* renamed from: h0 */
    private static final Sequence<IntRange> m37568h0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3) {
        m37577q0(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new a(cArr, z));
    }

    /* renamed from: i0 */
    private static final Sequence<IntRange> m37569i0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        m37577q0(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new b(C10801m.m38702c(strArr), z));
    }

    /* renamed from: j0 */
    static /* synthetic */ Sequence m37570j0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return m37568h0(charSequence, cArr, i2, z, i3);
    }

    /* renamed from: k0 */
    static /* synthetic */ Sequence m37571k0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return m37569i0(charSequence, strArr, i2, z, i3);
    }

    /* renamed from: l0 */
    public static final boolean m37572l0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!C10528c.m37415e(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m0 */
    public static String m37573m0(String str, CharSequence charSequence) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(charSequence, "prefix");
        if (!m37526B0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* renamed from: n0 */
    public static String m37574n0(String str, CharSequence charSequence) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(charSequence, "suffix");
        if (!m37546N(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: o0 */
    public static String m37575o0(String str, CharSequence charSequence) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(charSequence, "delimiter");
        return m37576p0(str, charSequence, charSequence);
    }

    /* renamed from: p0 */
    public static final String m37576p0(String str, CharSequence charSequence, CharSequence charSequence2) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(charSequence, "prefix");
        C9801m.m32346f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m37526B0(str, charSequence, false, 2, null) || !m37546N(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: q0 */
    public static final void m37577q0(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    /* renamed from: r0 */
    public static final List<String> m37578r0(CharSequence charSequence, char[] cArr, boolean z, int i2) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(cArr, "delimiters");
        if (cArr.length == 1) {
            return m37580t0(charSequence, String.valueOf(cArr[0]), z, i2);
        }
        Iterable iterableM37379i = C10522n.m37379i(m37570j0(charSequence, cArr, 0, z, i2, 2, null));
        ArrayList arrayList = new ArrayList(C10819v.m38911u(iterableM37379i, 10));
        Iterator it = iterableM37379i.iterator();
        while (it.hasNext()) {
            arrayList.add(m37527C0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public static final List<String> m37579s0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return m37580t0(charSequence, str, z, i2);
            }
        }
        Iterable iterableM37379i = C10522n.m37379i(m37571k0(charSequence, strArr, 0, z, i2, 2, null));
        ArrayList arrayList = new ArrayList(C10819v.m38911u(iterableM37379i, 10));
        Iterator it = iterableM37379i.iterator();
        while (it.hasNext()) {
            arrayList.add(m37527C0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    /* renamed from: t0 */
    private static final List<String> m37580t0(CharSequence charSequence, String str, boolean z, int i2) {
        m37577q0(i2);
        int length = 0;
        int iM37553S = m37553S(charSequence, str, 0, z);
        if (iM37553S == -1 || i2 == 1) {
            return C10815t.m38883e(charSequence.toString());
        }
        boolean z2 = i2 > 0;
        ArrayList arrayList = new ArrayList(z2 ? C9848l.m32421d(i2, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM37553S).toString());
            length = str.length() + iM37553S;
            if (z2 && arrayList.size() == i2 - 1) {
                break;
            }
            iM37553S = m37553S(charSequence, str, length, z);
        } while (iM37553S != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: u0 */
    public static /* synthetic */ List m37581u0(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m37578r0(charSequence, cArr, z, i2);
    }

    /* renamed from: v0 */
    public static /* synthetic */ List m37582v0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m37579s0(charSequence, strArr, z, i2);
    }

    /* renamed from: w0 */
    public static final Sequence<String> m37583w0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(strArr, "delimiters");
        return C10522n.m37391u(m37571k0(charSequence, strArr, 0, z, i2, 2, null), new c(charSequence));
    }

    /* renamed from: x0 */
    public static /* synthetic */ Sequence m37584x0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m37583w0(charSequence, strArr, z, i2);
    }

    /* renamed from: y0 */
    public static final boolean m37585y0(CharSequence charSequence, char c2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        return charSequence.length() > 0 && C10528c.m37415e(charSequence.charAt(0), c2, z);
    }

    /* renamed from: z0 */
    public static final boolean m37586z0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C9801m.m32346f(charSequence, "<this>");
        C9801m.m32346f(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C10546u.m37511E((String) charSequence, (String) charSequence2, false, 2, null) : m37572l0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }
}
