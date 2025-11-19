package Zb;

import Xb.C1849m;
import Xb.C1853o;
import Xb.InterfaceC1847l;
import Xb.Z0;
import Zb.g;
import cc.AbstractC2358C;
import cc.AbstractC2374e;
import cc.C2359D;
import cc.C2360E;
import cc.C2373d;
import cc.C2381l;
import cc.C2393x;
import fc.C3365a;
import fc.EnumC3368d;
import fc.InterfaceC3366b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import oa.C4153F;
import oa.C4158c;
import oa.C4172q;
import oa.C4173r;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003º\u00017B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J9\u00100\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b0\u00101J9\u00102\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b2\u00101J)\u00103\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J-\u00108\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J-\u0010:\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u00109J\u0019\u0010<\u001a\u00020\u00062\b\b\u0002\u0010;\u001a\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u00106J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u00106J\u000f\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u00106J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u00106J\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u00106J\u001d\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010C\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0001\u0010DJ\u0017\u0010E\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0011H\u0002¢\u0006\u0004\bE\u0010=J\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010I\u001a\u00020\u00112\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020\u00062\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bK\u0010LJ%\u0010N\u001a\u00020\u00062\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010M\u001a\u00020\u0011H\u0002¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bP\u0010QJ\u0013\u0010R\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bR\u0010QJ\u001b\u0010T\u001a\u00020\u0006*\u00020\u00152\u0006\u0010S\u001a\u00020\u001eH\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010X\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u001eH\u0002¢\u0006\u0004\bX\u0010YJ-\u0010[\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u0011H\u0002¢\u0006\u0004\b[\u00109J-\u0010^\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\\\u001a\u00020\u00112\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b^\u0010_J-\u0010`\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\\\u001a\u00020\u00112\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b`\u0010_J5\u0010b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\\\u001a\u00020\u00112\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010a\u001a\u00020\u0011H\u0002¢\u0006\u0004\bb\u0010cJ%\u0010d\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u00112\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0011H\u0002¢\u0006\u0004\bg\u0010=J\u0017\u0010h\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0011H\u0002¢\u0006\u0004\bh\u0010=J\u0018\u0010i\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\bi\u0010\rJ#\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00060j2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010lJ#\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060j2\u0006\u0010\u000b\u001a\u00028\u0000H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010lJ\u000f\u0010n\u001a\u00020\u0006H\u0014¢\u0006\u0004\bn\u00106J\u000f\u0010o\u001a\u00020\u0006H\u0014¢\u0006\u0004\bo\u00106J\u0010\u0010*\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b*\u0010pJ\u001b\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000jH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u0011H\u0004¢\u0006\u0004\bt\u0010=J\u0017\u0010u\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0011H\u0000¢\u0006\u0004\bu\u0010=J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000vH\u0096\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0006H\u0014¢\u0006\u0004\by\u00106J\u0019\u0010|\u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0004\b|\u0010}J \u0010\u0080\u0001\u001a\u00020\u00062\u000e\u0010{\u001a\n\u0018\u00010~j\u0004\u0018\u0001`\u007f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010zH\u0010¢\u0006\u0005\b\u0082\u0001\u0010}J%\u0010\u0084\u0001\u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010z2\u0007\u0010\u0083\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J)\u0010\u0087\u0001\u001a\u00020\u00062\u0015\u0010\u0086\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010z\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0012\u0010\u0089\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0013\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010bR0\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u008e\u0001RT\u0010\u0094\u0001\u001a9\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0090\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u008f\u0001j\u0005\u0018\u0001`\u0091\u00018\u0002X\u0082\u0004¢\u0006\u000e\n\u0005\bE\u0010\u0092\u0001\u0012\u0005\b\u0093\u0001\u00106R\u0017\u0010\u0097\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u008a\u0001R\u0017\u0010\u009c\u0001\u001a\u00020z8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009e\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010%R\u001a\u0010 \u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010%R\u0016\u0010M\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0096\u0001R\u0017\u0010£\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u0096\u0001R\u0019\u0010¥\u0001\u001a\u0004\u0018\u00010z8DX\u0084\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010\u009b\u0001R\u0017\u0010§\u0001\u001a\u00020z8DX\u0084\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010\u009b\u0001R\u0017\u0010©\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010\u008a\u0001R\u001e\u0010¬\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b«\u0001\u00106\u001a\u0006\bª\u0001\u0010\u008a\u0001R\u001d\u0010W\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b®\u0001\u00106\u001a\u0006\b\u00ad\u0001\u0010\u008a\u0001R\u0015\u0010°\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0¯\u00018\u0002X\u0082\u0004R\r\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004R\u0019\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0¯\u00018\u0002X\u0082\u0004R\u0015\u0010´\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0¯\u00018\u0002X\u0082\u0004R\r\u0010µ\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004R\u0019\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0¯\u00018\u0002X\u0082\u0004R\r\u0010·\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004R\u0019\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0¯\u00018\u0002X\u0082\u0004R\r\u0010¹\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006»\u0001"}, d2 = {"LZb/e;", "E", "LZb/g;", "", "capacity", "Lkotlin/Function1;", "Loa/F;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILBa/l;)V", "element", "s0", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "LZb/m;", "segment", "index", "", "s", "F0", "(LZb/m;ILjava/lang/Object;JLta/d;)Ljava/lang/Object;", "LXb/Z0;", "x0", "(LXb/Z0;LZb/m;I)V", "LXb/l;", "cont", "t0", "(Ljava/lang/Object;LXb/l;)V", "", "waiter", "", "closed", "O0", "(LZb/m;ILjava/lang/Object;JLjava/lang/Object;Z)I", "P0", "curSendersAndCloseStatus", "G0", "(J)Z", "curSenders", "x", "H0", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "z0", "(LZb/m;IJLta/d;)Ljava/lang/Object;", "w0", "r0", "(LXb/l;)V", "M0", "(LZb/m;IJLjava/lang/Object;)Ljava/lang/Object;", "N0", "I0", "(Ljava/lang/Object;LZb/m;I)Z", "H", "()V", "b", "K0", "(LZb/m;IJ)Z", "L0", "nAttempts", "b0", "(J)V", "d0", "o0", "n0", "m0", "F", "sendersCur", "(J)LZb/m;", "D", "B", "()LZb/m;", "lastSegment", "l0", "(LZb/m;)J", "A0", "(LZb/m;)V", "sendersCounter", "z", "(LZb/m;J)V", "B0", "(LXb/Z0;)V", "C0", "receiver", "D0", "(LXb/Z0;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "f0", "(JZ)Z", "globalIndex", "e0", "id", "startFrom", "K", "(JLZb/m;)LZb/m;", "J", "currentBufferEndCounter", "I", "(JLZb/m;J)LZb/m;", "p0", "(JLZb/m;)V", "value", "R0", "Q0", "v", "LZb/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "J0", "v0", "u0", "(Lta/d;)Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "globalCellIndex", "G", "S0", "LZb/i;", "iterator", "()LZb/i;", "q0", "", "cause", "j", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "(Ljava/util/concurrent/CancellationException;)V", "y", "cancel", "C", "(Ljava/lang/Throwable;Z)Z", "handler", "c", "(LBa/l;)V", "a0", "()Z", "", "toString", "()Ljava/lang/String;", "LBa/l;", "Lkotlin/Function3;", "Lfc/b;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "LBa/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "M", "()J", "bufferEndCounter", "k0", "isRendezvousOrUnlimited", "R", "()Ljava/lang/Throwable;", "receiveException", "i0", "isClosedForSend0", "h0", "isClosedForReceive0", "Y", "U", "receiversCounter", "O", "closeCause", "V", "sendException", "j0", "isConflatedDropOldest", "A", "isClosedForSend$annotations", "isClosedForSend", "g0", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class e<E> implements g<E> {

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f19655E = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f19656F = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f19657G = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f19658H = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19659I = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19660J = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19661K = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19662L = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19663M = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final Ba.l<E, C4153F> onUndeliveredElement;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Ba.q<InterfaceC3366b<?>, Object, Object, Ba.l<Throwable, C4153F>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"LZb/e$a;", "LZb/i;", "LXb/Z0;", "<init>", "(LZb/e;)V", "", "g", "()Z", "LZb/m;", "segment", "", "index", "", "r", "f", "(LZb/m;IJLta/d;)Ljava/lang/Object;", "Loa/F;", "h", "()V", "a", "(Lta/d;)Ljava/lang/Object;", "Lcc/C;", "c", "(Lcc/C;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "", "B", "Ljava/lang/Object;", "receiveResult", "LXb/m;", "C", "LXb/m;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a implements i<E>, Z0 {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Object receiveResult = f.f19691p;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private C1849m<? super Boolean> continuation;

        public a() {
        }

        private final Object f(m<E> mVar, int i10, long j10, InterfaceC4588d<? super Boolean> interfaceC4588d) {
            Boolean boolA;
            e<E> eVar = e.this;
            C1849m c1849mB = C1853o.b(C4696b.c(interfaceC4588d));
            try {
                this.continuation = c1849mB;
                Object objM0 = eVar.M0(mVar, i10, j10, this);
                if (objM0 == f.f19688m) {
                    eVar.w0(this, mVar, i10);
                } else {
                    Ba.l<Throwable, C4153F> lVarA = null;
                    if (objM0 == f.f19690o) {
                        if (j10 < eVar.Y()) {
                            mVar.c();
                        }
                        m mVar2 = (m) e.S().get(eVar);
                        while (true) {
                            if (eVar.g0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.T().getAndIncrement(eVar);
                            int i11 = f.f19677b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (mVar2.id != j11) {
                                m mVarJ = eVar.J(j11, mVar2);
                                if (mVarJ != null) {
                                    mVar2 = mVarJ;
                                }
                            }
                            Object objM02 = eVar.M0(mVar2, i12, andIncrement, this);
                            if (objM02 == f.f19688m) {
                                eVar.w0(this, mVar2, i12);
                                break;
                            }
                            if (objM02 == f.f19690o) {
                                if (andIncrement < eVar.Y()) {
                                    mVar2.c();
                                }
                            } else {
                                if (objM02 == f.f19689n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar2.c();
                                this.receiveResult = objM02;
                                this.continuation = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                Ba.l<E, C4153F> lVar = eVar.onUndeliveredElement;
                                if (lVar != null) {
                                    lVarA = C2393x.a(lVar, objM02, c1849mB.getContext());
                                }
                            }
                        }
                    } else {
                        mVar.c();
                        this.receiveResult = objM0;
                        this.continuation = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        Ba.l<E, C4153F> lVar2 = eVar.onUndeliveredElement;
                        if (lVar2 != null) {
                            lVarA = C2393x.a(lVar2, objM0, c1849mB.getContext());
                        }
                    }
                    c1849mB.J(boolA, lVarA);
                }
                Object objR = c1849mB.r();
                if (objR == C4696b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
                }
                return objR;
            } catch (Throwable th) {
                c1849mB.H();
                throw th;
            }
        }

        private final boolean g() throws Throwable {
            this.receiveResult = f.z();
            Throwable thO = e.this.O();
            if (thO == null) {
                return false;
            }
            throw C2360E.a(thO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C1849m<? super Boolean> c1849m = this.continuation;
            C3862t.d(c1849m);
            this.continuation = null;
            this.receiveResult = f.z();
            Throwable thO = e.this.O();
            if (thO == null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                c1849m.resumeWith(C4172q.a(Boolean.FALSE));
            } else {
                C4172q.Companion companion2 = C4172q.INSTANCE;
                c1849m.resumeWith(C4172q.a(C4173r.a(thO)));
            }
        }

        @Override // Zb.i
        public Object a(InterfaceC4588d<? super Boolean> interfaceC4588d) {
            m<E> mVar;
            e<E> eVar = e.this;
            m<E> mVar2 = (m) e.S().get(eVar);
            while (!eVar.g0()) {
                long andIncrement = e.T().getAndIncrement(eVar);
                int i10 = f.f19677b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (mVar2.id != j10) {
                    m<E> mVarJ = eVar.J(j10, mVar2);
                    if (mVarJ == null) {
                        continue;
                    } else {
                        mVar = mVarJ;
                    }
                } else {
                    mVar = mVar2;
                }
                Object objM0 = eVar.M0(mVar, i11, andIncrement, null);
                if (objM0 == f.f19688m) {
                    throw new IllegalStateException("unreachable");
                }
                if (objM0 != f.f19690o) {
                    if (objM0 == f.f19689n) {
                        return f(mVar, i11, andIncrement, interfaceC4588d);
                    }
                    mVar.c();
                    this.receiveResult = objM0;
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
                if (andIncrement < eVar.Y()) {
                    mVar.c();
                }
                mVar2 = mVar;
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        @Override // Xb.Z0
        public void c(AbstractC2358C<?> segment, int index) {
            C1849m<? super Boolean> c1849m = this.continuation;
            if (c1849m != null) {
                c1849m.c(segment, index);
            }
        }

        public final boolean i(E element) {
            C1849m<? super Boolean> c1849m = this.continuation;
            C3862t.d(c1849m);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            Ba.l<E, C4153F> lVar = e.this.onUndeliveredElement;
            return f.B(c1849m, bool, lVar != null ? C2393x.a(lVar, element, c1849m.getContext()) : null);
        }

        public final void j() {
            C1849m<? super Boolean> c1849m = this.continuation;
            C3862t.d(c1849m);
            this.continuation = null;
            this.receiveResult = f.z();
            Throwable thO = e.this.O();
            if (thO == null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                c1849m.resumeWith(C4172q.a(Boolean.FALSE));
            } else {
                C4172q.Companion companion2 = C4172q.INSTANCE;
                c1849m.resumeWith(C4172q.a(C4173r.a(thO)));
            }
        }

        @Override // Zb.i
        public E next() throws Throwable {
            E e10 = (E) this.receiveResult;
            if (e10 == f.f19691p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = f.f19691p;
            if (e10 != f.z()) {
                return e10;
            }
            throw C2360E.a(e.this.R());
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LZb/e$b;", "LXb/Z0;", "Lcc/C;", "segment", "", "index", "Loa/F;", "c", "(Lcc/C;I)V", "LXb/l;", "", "B", "LXb/l;", "a", "()LXb/l;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements Z0 {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1847l<Boolean> cont;

        /* renamed from: C, reason: collision with root package name */
        private final /* synthetic */ C1849m<Boolean> f19671C;

        public final InterfaceC1847l<Boolean> a() {
            return this.cont;
        }

        @Override // Xb.Z0
        public void c(AbstractC2358C<?> segment, int index) {
            this.f19671C.c(segment, index);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"E", "Lfc/b;", "select", "", "<anonymous parameter 1>", "element", "Lkotlin/Function1;", "", "Loa/F;", "a", "(Lfc/b;Ljava/lang/Object;Ljava/lang/Object;)LBa/l;"}, k = 3, mv = {1, 9, 0})
    static final class c extends AbstractC3864v implements Ba.q<InterfaceC3366b<?>, Object, Object, Ba.l<? super Throwable, ? extends C4153F>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ e<E> f19672B;

        /* compiled from: BufferedChannel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Object f19673B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ e<E> f19674C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ InterfaceC3366b<?> f19675D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, e<E> eVar, InterfaceC3366b<?> interfaceC3366b) {
                super(1);
                this.f19673B = obj;
                this.f19674C = eVar;
                this.f19675D = interfaceC3366b;
            }

            public final void a(Throwable th) {
                if (this.f19673B != f.z()) {
                    C2393x.b(this.f19674C.onUndeliveredElement, this.f19673B, this.f19675D.getContext());
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
                a(th);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<E> eVar) {
            super(3);
            this.f19672B = eVar;
        }

        @Override // Ba.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ba.l<Throwable, C4153F> g(InterfaceC3366b<?> interfaceC3366b, Object obj, Object obj2) {
            return new a(obj2, this.f19672B, interfaceC3366b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i10, Ba.l<? super E, C4153F> lVar) {
        this.capacity = i10;
        this.onUndeliveredElement = lVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = M();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (k0()) {
            mVar = f.f19676a;
            C3862t.e(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != 0 ? new c(this) : null;
        this._closeCause$volatile = f.f19694s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (Zb.m) r12.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0(Zb.m<E> r12) {
        /*
            r11 = this;
            Ba.l<E, oa.F> r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = cc.C2381l.b(r1, r2, r1)
        L8:
            int r4 = Zb.f.f19677b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.id
            int r8 = Zb.f.f19677b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.B(r4)
            cc.F r9 = Zb.f.f()
            if (r8 == r9) goto Lbb
            cc.F r9 = Zb.f.f19679d
            if (r8 != r9) goto L48
            long r9 = r11.U()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            cc.F r9 = Zb.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = cc.C2393x.c(r0, r5, r1)
        L40:
            r12.w(r4)
            r12.t()
            goto Laf
        L48:
            cc.F r9 = Zb.f.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof Xb.Z0
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof Zb.WaiterEB
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            cc.F r9 = Zb.f.p()
            if (r8 == r9) goto Lbb
            cc.F r9 = Zb.f.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            cc.F r9 = Zb.f.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.U()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof Zb.WaiterEB
            if (r9 == 0) goto L80
            r9 = r8
            Zb.x r9 = (Zb.WaiterEB) r9
            Xb.Z0 r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            Xb.Z0 r9 = (Xb.Z0) r9
        L83:
            cc.F r10 = Zb.f.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = cc.C2393x.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = cc.C2381l.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto Laf
        La2:
            cc.F r9 = Zb.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            cc.e r12 = r12.h()
            Zb.m r12 = (Zb.m) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            Xb.Z0 r3 = (Xb.Z0) r3
            r11.C0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.C3862t.e(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            Xb.Z0 r0 = (Xb.Z0) r0
            r11.C0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.A0(Zb.m):void");
    }

    private final m<E> B() {
        Object obj = f19661K.get(this);
        m mVar = (m) f19659I.get(this);
        if (mVar.id > ((m) obj).id) {
            obj = mVar;
        }
        m mVar2 = (m) f19660J.get(this);
        if (mVar2.id > ((m) obj).id) {
            obj = mVar2;
        }
        return (m) C2373d.b((AbstractC2374e) obj);
    }

    private final void B0(Z0 z02) {
        D0(z02, true);
    }

    private final void C0(Z0 z02) {
        D0(z02, false);
    }

    private final void D(long sendersCur) {
        A0(E(sendersCur));
    }

    private final void D0(Z0 z02, boolean z10) {
        if (z02 instanceof b) {
            InterfaceC1847l<Boolean> interfaceC1847lA = ((b) z02).a();
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847lA.resumeWith(C4172q.a(Boolean.FALSE));
            return;
        }
        if (z02 instanceof InterfaceC1847l) {
            InterfaceC4588d interfaceC4588d = (InterfaceC4588d) z02;
            C4172q.Companion companion2 = C4172q.INSTANCE;
            interfaceC4588d.resumeWith(C4172q.a(C4173r.a(z10 ? R() : V())));
        } else if (z02 instanceof u) {
            C1849m<k<? extends E>> c1849m = ((u) z02).cont;
            C4172q.Companion companion3 = C4172q.INSTANCE;
            c1849m.resumeWith(C4172q.a(k.b(k.INSTANCE.a(O()))));
        } else if (z02 instanceof a) {
            ((a) z02).j();
        } else {
            if (z02 instanceof InterfaceC3366b) {
                ((InterfaceC3366b) z02).a(this, f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + z02).toString());
        }
    }

    private final m<E> E(long sendersCur) {
        m<E> mVarB = B();
        if (j0()) {
            long jL0 = l0(mVarB);
            if (jL0 != -1) {
                G(jL0);
            }
        }
        z(mVarB, sendersCur);
        return mVarB;
    }

    static /* synthetic */ <E> Object E0(e<E> eVar, E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        m<E> mVar = (m) W().get(eVar);
        while (true) {
            long andIncrement = X().getAndIncrement(eVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zI0 = eVar.i0(andIncrement);
            int i10 = f.f19677b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar.id != j11) {
                m<E> mVarK = eVar.K(j11, mVar);
                if (mVarK != null) {
                    mVar = mVarK;
                } else if (zI0) {
                    Object objS0 = eVar.s0(e10, interfaceC4588d);
                    if (objS0 == C4696b.e()) {
                        return objS0;
                    }
                }
            }
            int iO0 = eVar.O0(mVar, i11, e10, j10, null, zI0);
            if (iO0 == 0) {
                mVar.c();
                break;
            }
            if (iO0 == 1) {
                break;
            }
            if (iO0 != 2) {
                if (iO0 == 3) {
                    Object objF0 = eVar.F0(mVar, i11, e10, j10, interfaceC4588d);
                    if (objF0 == C4696b.e()) {
                        return objF0;
                    }
                } else if (iO0 == 4) {
                    if (j10 < eVar.U()) {
                        mVar.c();
                    }
                    Object objS02 = eVar.s0(e10, interfaceC4588d);
                    if (objS02 == C4696b.e()) {
                        return objS02;
                    }
                } else if (iO0 == 5) {
                    mVar.c();
                }
            } else if (zI0) {
                mVar.t();
                Object objS03 = eVar.s0(e10, interfaceC4588d);
                if (objS03 == C4696b.e()) {
                    return objS03;
                }
            }
        }
        return C4153F.f46609a;
    }

    private final void F() {
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object F0(Zb.m<E> r21, int r22, E r23, long r24, ta.InterfaceC4588d<? super oa.C4153F> r26) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.F0(Zb.m, int, java.lang.Object, long, ta.d):java.lang.Object");
    }

    private final boolean G0(long curSendersAndCloseStatus) {
        if (i0(curSendersAndCloseStatus)) {
            return false;
        }
        return !x(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final void H() {
        if (k0()) {
            return;
        }
        m<E> mVar = (m) f19661K.get(this);
        while (true) {
            long andIncrement = f19657G.getAndIncrement(this);
            int i10 = f.f19677b;
            long j10 = andIncrement / i10;
            if (Y() <= andIncrement) {
                if (mVar.id < j10 && mVar.f() != 0) {
                    p0(j10, mVar);
                }
                c0(this, 0L, 1, null);
                return;
            }
            if (mVar.id != j10) {
                m<E> mVarI = I(j10, mVar, andIncrement);
                if (mVarI == null) {
                    continue;
                } else {
                    mVar = mVarI;
                }
            }
            if (K0(mVar, (int) (andIncrement % i10), andIncrement)) {
                c0(this, 0L, 1, null);
                return;
            }
            c0(this, 0L, 1, null);
        }
    }

    private final boolean H0(Object obj, E e10) {
        if (obj instanceof InterfaceC3366b) {
            return ((InterfaceC3366b) obj).a(this, e10);
        }
        if (obj instanceof u) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            u uVar = (u) obj;
            C1849m<k<? extends E>> c1849m = uVar.cont;
            k kVarB = k.b(k.INSTANCE.c(e10));
            Ba.l<E, C4153F> lVar = this.onUndeliveredElement;
            return f.B(c1849m, kVarB, lVar != null ? C2393x.a(lVar, e10, uVar.cont.getContext()) : null);
        }
        if (obj instanceof a) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof InterfaceC1847l) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1847l interfaceC1847l = (InterfaceC1847l) obj;
            Ba.l<E, C4153F> lVar2 = this.onUndeliveredElement;
            return f.B(interfaceC1847l, e10, lVar2 != null ? C2393x.a(lVar2, e10, interfaceC1847l.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final m<E> I(long id2, m<E> startFrom, long currentBufferEndCounter) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19661K;
        Ba.p pVar = (Ba.p) f.y();
        loop0: while (true) {
            objC = C2373d.c(startFrom, id2, pVar);
            if (!C2359D.c(objC)) {
                AbstractC2358C abstractC2358CB = C2359D.b(objC);
                while (true) {
                    AbstractC2358C abstractC2358C = (AbstractC2358C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2358C.id >= abstractC2358CB.id) {
                        break loop0;
                    }
                    if (!abstractC2358CB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC2358C, abstractC2358CB)) {
                        if (abstractC2358C.p()) {
                            abstractC2358C.n();
                        }
                    } else if (abstractC2358CB.p()) {
                        abstractC2358CB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C2359D.c(objC)) {
            F();
            p0(id2, startFrom);
            c0(this, 0L, 1, null);
            return null;
        }
        m<E> mVar = (m) C2359D.b(objC);
        if (mVar.id <= id2) {
            return mVar;
        }
        long j10 = mVar.id;
        int i10 = f.f19677b;
        if (f19657G.compareAndSet(this, currentBufferEndCounter + 1, j10 * i10)) {
            b0((mVar.id * i10) - currentBufferEndCounter);
            return null;
        }
        c0(this, 0L, 1, null);
        return null;
    }

    private final boolean I0(Object obj, m<E> mVar, int i10) {
        if (obj instanceof InterfaceC1847l) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC1847l) obj, C4153F.f46609a, null, 2, null);
        }
        if (obj instanceof InterfaceC3366b) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            EnumC3368d enumC3368dG = ((C3365a) obj).g(this, C4153F.f46609a);
            if (enumC3368dG == EnumC3368d.f41472C) {
                mVar.w(i10);
            }
            return enumC3368dG == EnumC3368d.f41471B;
        }
        if (obj instanceof b) {
            return f.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> J(long id2, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19660J;
        Ba.p pVar = (Ba.p) f.y();
        loop0: while (true) {
            objC = C2373d.c(startFrom, id2, pVar);
            if (!C2359D.c(objC)) {
                AbstractC2358C abstractC2358CB = C2359D.b(objC);
                while (true) {
                    AbstractC2358C abstractC2358C = (AbstractC2358C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2358C.id >= abstractC2358CB.id) {
                        break loop0;
                    }
                    if (!abstractC2358CB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC2358C, abstractC2358CB)) {
                        if (abstractC2358C.p()) {
                            abstractC2358C.n();
                        }
                    } else if (abstractC2358CB.p()) {
                        abstractC2358CB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C2359D.c(objC)) {
            F();
            if (startFrom.id * f.f19677b >= Y()) {
                return null;
            }
            startFrom.c();
            return null;
        }
        m<E> mVar = (m) C2359D.b(objC);
        if (!k0() && id2 <= M() / f.f19677b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19661K;
            while (true) {
                AbstractC2358C abstractC2358C2 = (AbstractC2358C) atomicReferenceFieldUpdater2.get(this);
                if (abstractC2358C2.id >= mVar.id || !mVar.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, abstractC2358C2, mVar)) {
                    if (abstractC2358C2.p()) {
                        abstractC2358C2.n();
                    }
                } else if (mVar.p()) {
                    mVar.n();
                }
            }
        }
        long j10 = mVar.id;
        if (j10 <= id2) {
            return mVar;
        }
        int i10 = f.f19677b;
        Q0(j10 * i10);
        if (mVar.id * i10 >= Y()) {
            return null;
        }
        mVar.c();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> K(long id2, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19659I;
        Ba.p pVar = (Ba.p) f.y();
        loop0: while (true) {
            objC = C2373d.c(startFrom, id2, pVar);
            if (!C2359D.c(objC)) {
                AbstractC2358C abstractC2358CB = C2359D.b(objC);
                while (true) {
                    AbstractC2358C abstractC2358C = (AbstractC2358C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2358C.id >= abstractC2358CB.id) {
                        break loop0;
                    }
                    if (!abstractC2358CB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC2358C, abstractC2358CB)) {
                        if (abstractC2358C.p()) {
                            abstractC2358C.n();
                        }
                    } else if (abstractC2358CB.p()) {
                        abstractC2358CB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C2359D.c(objC)) {
            F();
            if (startFrom.id * f.f19677b >= U()) {
                return null;
            }
            startFrom.c();
            return null;
        }
        m<E> mVar = (m) C2359D.b(objC);
        long j10 = mVar.id;
        if (j10 <= id2) {
            return mVar;
        }
        int i10 = f.f19677b;
        R0(j10 * i10);
        if (mVar.id * i10 >= U()) {
            return null;
        }
        mVar.c();
        return null;
    }

    private final boolean K0(m<E> segment, int index, long b10) {
        Object objB = segment.B(index);
        if (!(objB instanceof Z0) || b10 < f19656F.get(this) || !segment.v(index, objB, f.f19682g)) {
            return L0(segment, index, b10);
        }
        if (I0(objB, segment, index)) {
            segment.F(index, f.f19679d);
            return true;
        }
        segment.F(index, f.f19685j);
        segment.C(index, false);
        return false;
    }

    private final boolean L0(m<E> segment, int index, long b10) {
        while (true) {
            Object objB = segment.B(index);
            if (objB instanceof Z0) {
                if (b10 < f19656F.get(this)) {
                    if (segment.v(index, objB, new WaiterEB((Z0) objB))) {
                        return true;
                    }
                } else if (segment.v(index, objB, f.f19682g)) {
                    if (I0(objB, segment, index)) {
                        segment.F(index, f.f19679d);
                        return true;
                    }
                    segment.F(index, f.f19685j);
                    segment.C(index, false);
                    return false;
                }
            } else {
                if (objB == f.f19685j) {
                    return false;
                }
                if (objB == null) {
                    if (segment.v(index, objB, f.f19680e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f19679d || objB == f.f19683h || objB == f.f19684i || objB == f.f19686k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f19681f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    private final long M() {
        return f19657G.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M0(m<E> segment, int index, long r10, Object waiter) {
        Object objB = segment.B(index);
        if (objB == null) {
            if (r10 >= (f19655E.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return f.f19689n;
                }
                if (segment.v(index, objB, waiter)) {
                    H();
                    return f.f19688m;
                }
            }
        } else if (objB == f.f19679d && segment.v(index, objB, f.f19684i)) {
            H();
            return segment.D(index);
        }
        return N0(segment, index, r10, waiter);
    }

    private final Object N0(m<E> segment, int index, long r10, Object waiter) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null || objB == f.f19680e) {
                if (r10 < (f19655E.get(this) & 1152921504606846975L)) {
                    if (segment.v(index, objB, f.f19683h)) {
                        H();
                        return f.f19690o;
                    }
                } else {
                    if (waiter == null) {
                        return f.f19689n;
                    }
                    if (segment.v(index, objB, waiter)) {
                        H();
                        return f.f19688m;
                    }
                }
            } else {
                if (objB != f.f19679d) {
                    if (objB != f.f19685j && objB != f.f19683h) {
                        if (objB == f.z()) {
                            H();
                            return f.f19690o;
                        }
                        if (objB != f.f19682g && segment.v(index, objB, f.f19681f)) {
                            boolean z10 = objB instanceof WaiterEB;
                            if (z10) {
                                objB = ((WaiterEB) objB).waiter;
                            }
                            if (I0(objB, segment, index)) {
                                segment.F(index, f.f19684i);
                                H();
                                return segment.D(index);
                            }
                            segment.F(index, f.f19685j);
                            segment.C(index, false);
                            if (z10) {
                                H();
                            }
                            return f.f19690o;
                        }
                    }
                    return f.f19690o;
                }
                if (segment.v(index, objB, f.f19684i)) {
                    H();
                    return segment.D(index);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O0(m<E> segment, int index, E element, long s10, Object waiter, boolean closed) {
        segment.G(index, element);
        if (closed) {
            return P0(segment, index, element, s10, waiter, closed);
        }
        Object objB = segment.B(index);
        if (objB == null) {
            if (x(s10)) {
                if (segment.v(index, null, f.f19679d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objB instanceof Z0) {
            segment.w(index);
            if (H0(objB, element)) {
                segment.F(index, f.f19684i);
                u0();
                return 0;
            }
            if (segment.x(index, f.f19686k) != f.f19686k) {
                segment.C(index, true);
            }
            return 5;
        }
        return P0(segment, index, element, s10, waiter, closed);
    }

    private final int P0(m<E> segment, int index, E element, long s10, Object waiter, boolean closed) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null) {
                if (!x(s10) || closed) {
                    if (closed) {
                        if (segment.v(index, null, f.f19685j)) {
                            segment.C(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.v(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.v(index, null, f.f19679d)) {
                    return 1;
                }
            } else {
                if (objB != f.f19680e) {
                    if (objB == f.f19686k) {
                        segment.w(index);
                        return 5;
                    }
                    if (objB == f.f19683h) {
                        segment.w(index);
                        return 5;
                    }
                    if (objB == f.z()) {
                        segment.w(index);
                        F();
                        return 4;
                    }
                    segment.w(index);
                    if (objB instanceof WaiterEB) {
                        objB = ((WaiterEB) objB).waiter;
                    }
                    if (H0(objB, element)) {
                        segment.F(index, f.f19684i);
                        u0();
                        return 0;
                    }
                    if (segment.x(index, f.f19686k) != f.f19686k) {
                        segment.C(index, true);
                    }
                    return 5;
                }
                if (segment.v(index, objB, f.f19679d)) {
                    return 1;
                }
            }
        }
    }

    private final void Q0(long value) {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19656F;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= value) {
                return;
            }
        } while (!f19656F.compareAndSet(this, j10, value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable R() {
        Throwable thO = O();
        return thO == null ? new ClosedReceiveChannelException("Channel was closed") : thO;
    }

    private final void R0(long value) {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19655E;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = 1152921504606846975L & j10;
            if (j11 >= value) {
                return;
            }
        } while (!f19655E.compareAndSet(this, j10, f.w(j11, (int) (j10 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater S() {
        return f19660J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater T() {
        return f19656F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater W() {
        return f19659I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater X() {
        return f19655E;
    }

    private final void b0(long nAttempts) {
        if ((f19658H.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f19658H.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void c0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.b0(j10);
    }

    private final void d0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19663M;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f19692q : f.f19693r));
        if (obj == null) {
            return;
        }
        ((Ba.l) obj).invoke(O());
    }

    private final boolean e0(m<E> segment, int index, long globalIndex) {
        Object objB;
        do {
            objB = segment.B(index);
            if (objB != null && objB != f.f19680e) {
                if (objB == f.f19679d) {
                    return true;
                }
                if (objB == f.f19685j || objB == f.z() || objB == f.f19684i || objB == f.f19683h) {
                    return false;
                }
                if (objB == f.f19682g) {
                    return true;
                }
                return objB != f.f19681f && globalIndex == U();
            }
        } while (!segment.v(index, objB, f.f19683h));
        H();
        return false;
    }

    private final boolean f0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i10 = (int) (sendersAndCloseStatusCur >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            E(sendersAndCloseStatusCur & 1152921504606846975L);
            if (isClosedForReceive && a0()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            D(sendersAndCloseStatusCur & 1152921504606846975L);
        }
        return true;
    }

    private final boolean h0(long j10) {
        return f0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i0(long j10) {
        return f0(j10, false);
    }

    private final boolean k0() {
        long jM = M();
        return jM == 0 || jM == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (Zb.m) r8.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long l0(Zb.m<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = Zb.f.f19677b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.id
            int r5 = Zb.f.f19677b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.U()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            cc.F r2 = Zb.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            cc.F r2 = Zb.f.f19679d
            if (r1 != r2) goto L39
            return r3
        L2c:
            cc.F r2 = Zb.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            cc.e r8 = r8.h()
            Zb.m r8 = (Zb.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.l0(Zb.m):long");
    }

    private final void m0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19655E;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    private final void n0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19655E;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void o0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19655E;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(j10 & 1152921504606846975L, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(j10 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p0(long r5, Zb.m<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            cc.e r0 = r7.f()
            Zb.m r0 = (Zb.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            cc.e r5 = r7.f()
            Zb.m r5 = (Zb.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = N()
        L26:
            java.lang.Object r6 = r5.get(r4)
            cc.C r6 = (cc.AbstractC2358C) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.p0(long, Zb.m):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(InterfaceC1847l<? super E> cont) {
        C4172q.Companion companion = C4172q.INSTANCE;
        cont.resumeWith(C4172q.a(C4173r.a(R())));
    }

    private final Object s0(E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        UndeliveredElementException undeliveredElementExceptionD;
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        Ba.l<E, C4153F> lVar = this.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionD = C2393x.d(lVar, e10, null, 2, null)) == null) {
            Throwable thV = V();
            C4172q.Companion companion = C4172q.INSTANCE;
            c1849m.resumeWith(C4172q.a(C4173r.a(thV)));
        } else {
            C4158c.a(undeliveredElementExceptionD, V());
            C4172q.Companion companion2 = C4172q.INSTANCE;
            c1849m.resumeWith(C4172q.a(C4173r.a(undeliveredElementExceptionD)));
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(E element, InterfaceC1847l<? super C4153F> cont) {
        Ba.l<E, C4153F> lVar = this.onUndeliveredElement;
        if (lVar != null) {
            C2393x.b(lVar, element, cont.getContext());
        }
        Throwable thV = V();
        C4172q.Companion companion = C4172q.INSTANCE;
        cont.resumeWith(C4172q.a(C4173r.a(thV)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(Z0 z02, m<E> mVar, int i10) {
        v0();
        z02.c(mVar, i10);
    }

    private final boolean x(long curSenders) {
        return curSenders < M() || curSenders < U() + ((long) this.capacity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(Z0 z02, m<E> mVar, int i10) {
        z02.c(mVar, i10 + f.f19677b);
    }

    static /* synthetic */ <E> Object y0(e<E> eVar, InterfaceC4588d<? super E> interfaceC4588d) throws Throwable {
        m<E> mVar = (m) S().get(eVar);
        while (!eVar.g0()) {
            long andIncrement = T().getAndIncrement(eVar);
            int i10 = f.f19677b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar.id != j10) {
                m<E> mVarJ = eVar.J(j10, mVar);
                if (mVarJ == null) {
                    continue;
                } else {
                    mVar = mVarJ;
                }
            }
            Object objM0 = eVar.M0(mVar, i11, andIncrement, null);
            if (objM0 == f.f19688m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM0 != f.f19690o) {
                if (objM0 == f.f19689n) {
                    return eVar.z0(mVar, i11, andIncrement, interfaceC4588d);
                }
                mVar.c();
                return objM0;
            }
            if (andIncrement < eVar.Y()) {
                mVar.c();
            }
        }
        throw C2360E.a(eVar.R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void z(m<E> lastSegment, long sendersCounter) {
        Object objB = C2381l.b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i10 = f.f19677b - 1; -1 < i10; i10--) {
                if ((lastSegment.id * f.f19677b) + i10 < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lastSegment.B(i10);
                    if (objB2 != null && objB2 != f.f19680e) {
                        if (!(objB2 instanceof WaiterEB)) {
                            if (!(objB2 instanceof Z0)) {
                                break;
                            }
                            if (lastSegment.v(i10, objB2, f.z())) {
                                objB = C2381l.c(objB, objB2);
                                lastSegment.C(i10, true);
                                break;
                            }
                        } else {
                            if (lastSegment.v(i10, objB2, f.z())) {
                                objB = C2381l.c(objB, ((WaiterEB) objB2).waiter);
                                lastSegment.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.v(i10, objB2, f.z())) {
                            lastSegment.t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                B0((Z0) objB);
                return;
            }
            C3862t.e(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                B0((Z0) arrayList.get(size));
            }
        }
    }

    private final Object z0(m<E> mVar, int i10, long j10, InterfaceC4588d<? super E> interfaceC4588d) {
        C1849m c1849mB = C1853o.b(C4696b.c(interfaceC4588d));
        try {
            Object objM0 = M0(mVar, i10, j10, c1849mB);
            if (objM0 == f.f19688m) {
                w0(c1849mB, mVar, i10);
            } else {
                Ba.l<Throwable, C4153F> lVarA = null;
                lVarA = null;
                if (objM0 == f.f19690o) {
                    if (j10 < Y()) {
                        mVar.c();
                    }
                    m mVar2 = (m) S().get(this);
                    while (true) {
                        if (g0()) {
                            r0(c1849mB);
                            break;
                        }
                        long andIncrement = T().getAndIncrement(this);
                        int i11 = f.f19677b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (mVar2.id != j11) {
                            m mVarJ = J(j11, mVar2);
                            if (mVarJ != null) {
                                mVar2 = mVarJ;
                            }
                        }
                        objM0 = M0(mVar2, i12, andIncrement, c1849mB);
                        if (objM0 == f.f19688m) {
                            C1849m c1849m = c1849mB != null ? c1849mB : null;
                            if (c1849m != null) {
                                w0(c1849m, mVar2, i12);
                            }
                        } else if (objM0 == f.f19690o) {
                            if (andIncrement < Y()) {
                                mVar2.c();
                            }
                        } else {
                            if (objM0 == f.f19689n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar2.c();
                            Ba.l<E, C4153F> lVar = this.onUndeliveredElement;
                            if (lVar != null) {
                                lVarA = C2393x.a(lVar, objM0, c1849mB.getContext());
                            }
                        }
                    }
                } else {
                    mVar.c();
                    Ba.l<E, C4153F> lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        lVarA = C2393x.a(lVar2, objM0, c1849mB.getContext());
                    }
                }
                c1849mB.J(objM0, lVarA);
            }
            Object objR = c1849mB.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR;
        } catch (Throwable th) {
            c1849mB.H();
            throw th;
        }
    }

    @Override // Zb.w
    public boolean A() {
        return i0(f19655E.get(this));
    }

    protected boolean C(Throwable cause, boolean cancel) {
        if (cancel) {
            m0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f19662L, this, f.f19694s, cause);
        if (cancel) {
            n0();
        } else {
            o0();
        }
        F();
        q0();
        if (zA) {
            d0();
        }
        return zA;
    }

    protected final void G(long globalCellIndex) {
        UndeliveredElementException undeliveredElementExceptionD;
        m<E> mVar = (m) f19660J.get(this);
        while (true) {
            long j10 = f19656F.get(this);
            if (globalCellIndex < Math.max(this.capacity + j10, M())) {
                return;
            }
            if (f19656F.compareAndSet(this, j10, j10 + 1)) {
                int i10 = f.f19677b;
                long j11 = j10 / i10;
                int i11 = (int) (j10 % i10);
                if (mVar.id != j11) {
                    m<E> mVarJ = J(j11, mVar);
                    if (mVarJ == null) {
                        continue;
                    } else {
                        mVar = mVarJ;
                    }
                }
                Object objM0 = M0(mVar, i11, j10, null);
                if (objM0 != f.f19690o) {
                    mVar.c();
                    Ba.l<E, C4153F> lVar = this.onUndeliveredElement;
                    if (lVar != null && (undeliveredElementExceptionD = C2393x.d(lVar, objM0, null, 2, null)) != null) {
                        throw undeliveredElementExceptionD;
                    }
                } else if (j10 < Y()) {
                    mVar.c();
                }
            }
        }
    }

    protected final Object J0(E element) {
        m mVar;
        Object obj = f.f19679d;
        m mVar2 = (m) W().get(this);
        while (true) {
            long andIncrement = X().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zI0 = i0(andIncrement);
            int i10 = f.f19677b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar2.id != j11) {
                m mVarK = K(j11, mVar2);
                if (mVarK != null) {
                    mVar = mVarK;
                } else if (zI0) {
                    return k.INSTANCE.a(V());
                }
            } else {
                mVar = mVar2;
            }
            int iO0 = O0(mVar, i11, element, j10, obj, zI0);
            if (iO0 == 0) {
                mVar.c();
                return k.INSTANCE.c(C4153F.f46609a);
            }
            if (iO0 == 1) {
                return k.INSTANCE.c(C4153F.f46609a);
            }
            if (iO0 == 2) {
                if (zI0) {
                    mVar.t();
                    return k.INSTANCE.a(V());
                }
                Z0 z02 = obj instanceof Z0 ? (Z0) obj : null;
                if (z02 != null) {
                    x0(z02, mVar, i11);
                }
                G((mVar.id * i10) + i11);
                return k.INSTANCE.c(C4153F.f46609a);
            }
            if (iO0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iO0 == 4) {
                if (j10 < U()) {
                    mVar.c();
                }
                return k.INSTANCE.a(V());
            }
            if (iO0 == 5) {
                mVar.c();
            }
            mVar2 = mVar;
        }
    }

    protected final Throwable O() {
        return (Throwable) f19662L.get(this);
    }

    public final void S0(long globalIndex) {
        long j10;
        long j11;
        if (k0()) {
            return;
        }
        while (M() <= globalIndex) {
        }
        int i10 = f.f19678c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jM = M();
            if (jM == (f19658H.get(this) & 4611686018427387903L) && jM == M()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19658H;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.v(j10 & 4611686018427387903L, true)));
        while (true) {
            long jM2 = M();
            long j12 = f19658H.get(this);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jM2 == j13 && jM2 == M()) {
                break;
            } else if (!z10) {
                f19658H.compareAndSet(this, j12, f.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19658H;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, f.v(j11 & 4611686018427387903L, false)));
    }

    public final long U() {
        return f19656F.get(this);
    }

    protected final Throwable V() {
        Throwable thO = O();
        return thO == null ? new ClosedSendChannelException("Channel was closed") : thO;
    }

    public final long Y() {
        return f19655E.get(this) & 1152921504606846975L;
    }

    public final boolean a0() {
        while (true) {
            m<E> mVarJ = (m) f19660J.get(this);
            long jU = U();
            if (Y() <= jU) {
                return false;
            }
            int i10 = f.f19677b;
            long j10 = jU / i10;
            if (mVarJ.id == j10 || (mVarJ = J(j10, mVarJ)) != null) {
                mVarJ.c();
                if (e0(mVarJ, (int) (jU % i10), jU)) {
                    return true;
                }
                f19656F.compareAndSet(this, jU, 1 + jU);
            } else if (((m) f19660J.get(this)).id < j10) {
                return false;
            }
        }
    }

    @Override // Zb.w
    public void c(Ba.l<? super Throwable, C4153F> handler) {
        if (androidx.concurrent.futures.b.a(f19663M, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19663M;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f19692q) {
                if (obj == f.f19693r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f19663M, this, f.f19692q, f.f19693r));
        handler.invoke(O());
    }

    @Override // Zb.v
    public final void e(CancellationException cause) {
        y(cause);
    }

    public boolean g0() {
        return h0(f19655E.get(this));
    }

    @Override // Zb.w
    @InterfaceC4156a
    public boolean h(E e10) {
        return g.a.a(this, e10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Zb.v
    public Object i() {
        m mVar;
        long j10 = f19656F.get(this);
        long j11 = f19655E.get(this);
        if (h0(j11)) {
            return k.INSTANCE.a(O());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.INSTANCE.b();
        }
        Object obj = f.f19686k;
        m mVar2 = (m) S().get(this);
        while (!g0()) {
            long andIncrement = T().getAndIncrement(this);
            int i10 = f.f19677b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.id != j12) {
                m mVarJ = J(j12, mVar2);
                if (mVarJ == null) {
                    continue;
                } else {
                    mVar = mVarJ;
                }
            } else {
                mVar = mVar2;
            }
            Object objM0 = M0(mVar, i11, andIncrement, obj);
            if (objM0 == f.f19688m) {
                Z0 z02 = obj instanceof Z0 ? (Z0) obj : null;
                if (z02 != null) {
                    w0(z02, mVar, i11);
                }
                S0(andIncrement);
                mVar.t();
                return k.INSTANCE.b();
            }
            if (objM0 != f.f19690o) {
                if (objM0 == f.f19689n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.c();
                return k.INSTANCE.c(objM0);
            }
            if (andIncrement < Y()) {
                mVar.c();
            }
            mVar2 = mVar;
        }
        return k.INSTANCE.a(O());
    }

    @Override // Zb.v
    public i<E> iterator() {
        return new a();
    }

    @Override // Zb.w
    public boolean j(Throwable cause) {
        return C(cause, false);
    }

    protected boolean j0() {
        return false;
    }

    @Override // Zb.v
    public Object r(InterfaceC4588d<? super E> interfaceC4588d) {
        return y0(this, interfaceC4588d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e4, code lost:
    
        r3 = (Zb.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01eb, code lost:
    
        if (r3 != null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.toString():java.lang.String");
    }

    @Override // Zb.w
    public Object v(E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return E0(this, e10, interfaceC4588d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return Zb.k.INSTANCE.c(oa.C4153F.f46609a);
     */
    @Override // Zb.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X()
            long r0 = r0.get(r14)
            boolean r0 = r14.G0(r0)
            if (r0 == 0) goto L15
            Zb.k$b r15 = Zb.k.INSTANCE
            java.lang.Object r15 = r15.b()
            return r15
        L15:
            cc.F r8 = Zb.f.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = k()
            java.lang.Object r0 = r0.get(r14)
            Zb.m r0 = (Zb.m) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = l()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = m(r14, r1)
            int r1 = Zb.f.f19677b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            Zb.m r1 = b(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            Zb.k$b r15 = Zb.k.INSTANCE
            java.lang.Throwable r0 = r14.V()
            java.lang.Object r15 = r15.a(r0)
            goto Lbc
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = u(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            r1 = 1
            if (r0 == r1) goto Laf
            r1 = 2
            if (r0 == r1) goto L92
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.c()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.U()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.c()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L92:
            if (r11 == 0) goto L98
            r13.t()
            goto L4d
        L98:
            boolean r15 = r8 instanceof Xb.Z0
            if (r15 == 0) goto L9f
            Xb.Z0 r8 = (Xb.Z0) r8
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto La5
            q(r14, r8, r13, r12)
        La5:
            r13.t()
            Zb.k$b r15 = Zb.k.INSTANCE
            java.lang.Object r15 = r15.b()
            goto Lbc
        Laf:
            Zb.k$b r15 = Zb.k.INSTANCE
            oa.F r0 = oa.C4153F.f46609a
            java.lang.Object r15 = r15.c(r0)
            goto Lbc
        Lb8:
            r13.c()
            goto Laf
        Lbc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.e.w(java.lang.Object):java.lang.Object");
    }

    public boolean y(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return C(cause, true);
    }

    protected void q0() {
    }

    protected void u0() {
    }

    protected void v0() {
    }
}
